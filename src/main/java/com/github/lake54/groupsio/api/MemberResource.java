package com.github.lake54.groupsio.api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;

import com.github.lake54.groupsio.api.domain.Page;
import com.github.lake54.groupsio.api.domain.Subscription;
import com.github.lake54.groupsio.api.exception.GroupsIOApiException;

public class MemberResource extends BaseResource
{
    public MemberResource(final GroupsIOApiClient apiClient, final String baseUrl)
    {
        super(apiClient, baseUrl);
    }
    
    /**
     * Gets a user's {@link Subscription} for the specified group and member IDs
     * 
     * @return the user's {@link Subscription} for the specified group ID
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public Subscription getMemberInGroup(final Integer groupId, final Integer memberId)
            throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getmember");
        uri.setParameter("group_id", groupId.toString());
        uri.setParameter("sub_id", memberId.toString());
        final HttpRequestBase request = new HttpGet();
        request.setURI(uri.build());
        
        return callApi(request, Subscription.class);
    }
    
    /**
     * Gets a list of members (represented by {@link Subscription}) subscribed
     * to a particular group.
     * 
     * @param groupId
     *            - which group to get members from
     * @return {@link List}<{@link Subscription}> representing the subscribed
     *         members
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public List<Subscription> getMembersInGroup(final Integer groupId) throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getmembers");
        uri.setParameter("group_id", groupId.toString());
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
    
    public void updateMember(final Subscription subscription)
    {
        throw new NotImplementedException("Not implemented in client");
    }
    
    public void banMember()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public void approveMember()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public void directAddMember()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public void inviteMember()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public void deleteMember()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public void sendBounceProbe()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public void sendConfirmationEmail()
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
}
