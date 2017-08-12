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
import com.github.lake54.groupsio.api.domain.User;
import com.github.lake54.groupsio.api.exception.GroupsIOApiException;

public class UserResource extends BaseResource
{
    
    public UserResource(final GroupsIOApiClient apiClient, final String baseUrl)
    {
        super(apiClient, baseUrl);
    }
    
    /**
     * Get the user information associated with the currently-logged in user.
     * 
     * @return {@link User} representing the current user
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public User getUser() throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getuser");
        final HttpRequestBase request = new HttpGet();
        request.setURI(uri.build());
        
        return callApi(request, User.class);
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
    public List<Subscription> getSubscriptions() throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getsubs");
        uri.setParameter("limit", MAX_RESULTS);
        final HttpRequestBase request = new HttpGet();
        request.setURI(uri.build());
        
        Page page = callApi(request, Page.class);
        
        final List<Subscription> subscriptions = Arrays.asList(OM.convertValue(page.getData(), Subscription[].class));
        
        while (page.getHasMore())
        {
            uri.setParameter("page_token", page.getNextPageToken().toString());
            request.setURI(uri.build());
            page = callApi(request, Page.class);
            subscriptions.addAll(Arrays.asList(OM.convertValue(page.getData(), Subscription[].class)));
        }
        
        return subscriptions;
    }
    
}
