package com.github.lake54.groupsio.api;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;

import com.github.lake54.groupsio.api.domain.Group;
import com.github.lake54.groupsio.api.domain.Permissions;
import com.github.lake54.groupsio.api.exception.GroupsIOApiException;

public class GroupResource extends BaseResource
{
    
    public GroupResource(final GroupsIOApiClient apiClient, final String baseUrl)
    {
        super(apiClient, baseUrl);
    }
    
    /**
     * Gets a user's {@link Permissions} for the specified group ID
     * 
     * @return the user's {@link Permissions} for the specified group ID
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public Permissions getPermissions(final Integer groupId) throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getperms");
        uri.setParameter("group_id", groupId.toString());
        final HttpRequestBase request = new HttpGet();
        request.setURI(uri.build());
        
        return callApi(request, Permissions.class);
    }
    
    /**
     * Gets a {@link Group} for the specified group ID
     * 
     * @return the {@link Group} for the specified group ID
     * @throws URISyntaxException
     * @throws IOException
     * @throws GroupsIOApiException
     */
    public Group getGroup(final Integer groupId) throws URISyntaxException, IOException, GroupsIOApiException
    {
        final URIBuilder uri = new URIBuilder().setPath(baseUrl + "getgroup");
        uri.setParameter("group_id", groupId.toString());
        final HttpRequestBase request = new HttpGet();
        request.setURI(uri.build());
        
        return callApi(request, Group.class);
    }
    
    public void createSubGroup(final Integer groupId, final String name, final String description, final String privacy)
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
    public Group updateGroup(final Group group)
    {
        throw new NotImplementedException("Not implemented in client");
    }
    
    public void deleteGroup(final Integer groupId)
    {
        throw new UnsupportedOperationException("Not implemented in API");
    }
    
}
