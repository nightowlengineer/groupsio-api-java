package com.github.lake54.groupsio.api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;

import com.github.lake54.groupsio.api.domain.Page;
import com.github.lake54.groupsio.api.domain.Subscription;
import com.github.lake54.groupsio.api.domain.Topic;
import com.github.lake54.groupsio.api.exception.GroupsIOApiException;

public class ArchiveResource extends BaseResource
{
    
    public ArchiveResource(final GroupsIOApiClient apiClient, final String baseUrl)
    {
        super(apiClient, baseUrl);
    }
    
    /**
     * Gets a list of {@link Subscription}s that the current user is subscribed
     * to.
     * 
     * @return {@link List}<{@link Subscription}> representing the subscriptions
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public List<Topic> getTopics(final Integer groupId) throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "gettopics");
        uri.setParameter("group_id", groupId.toString());
        uri.setParameter("limit", MAX_RESULTS);
        final HttpRequestBase request = new HttpGet();
        request.setURI(uri.build());
        
        Page page = callApi(request, Page.class);
        
        final List<Topic> topics = Arrays.asList(OM.convertValue(page.getData(), Topic[].class));
        
        while (page.getHasMore())
        {
            uri.setParameter("page_token", page.getNextPageToken().toString());
            request.setURI(uri.build());
            page = callApi(request, Page.class);
            topics.addAll(Arrays.asList(OM.convertValue(page.getData(), Topic[].class)));
        }
        
        return topics;
    }
    
}
