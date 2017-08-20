package com.github.lake54.groupsio.api.resource;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.github.lake54.groupsio.api.GroupsIOApiClient;
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
     * Gets a user's {@link Subscription} for the specified group ID
     * 
     * @return the user's {@link Subscription} for the specified group ID
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public Subscription getSubscription(final Integer groupId) throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getsub");
        uri.setParameter("group_id", groupId.toString());
        final HttpGet request = new HttpGet();
        request.setURI(uri.build());
        
        return callApi(request, Subscription.class);
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
        final HttpGet request = new HttpGet();
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
    
    public User updateUser(final User user) throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "updateuser");
        final HttpPost request = new HttpPost();
        final Map<String, Object> map = OM.convertValue(user, Map.class);
        final List<BasicNameValuePair> postParameters = new ArrayList<>();
        for (final Entry<String, Object> entry : map.entrySet())
        {
            postParameters.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            System.out.println("Adding " + entry.getKey() + " with " + entry.getValue().toString());
        }
        request.setEntity(new UrlEncodedFormEntity(postParameters));
        
        request.setURI(uri.build());
        
        return callApi(request, User.class);
    }
    
    public Subscription updateSubscription(final Subscription subscription)
    {
        throw new UnsupportedOperationException("Not available in API");
    }
    
    public void deleteSubscription(final Subscription subscription)
    {
        throw new UnsupportedOperationException("Not available in API");
    }
    
    public void joinGroup(final Integer groupId)
    {
        throw new UnsupportedOperationException("Not available in API");
    }
    
}
