package engineer.nightowl.groupsio.api;

import org.apache.http.HttpHost;
import org.apache.http.util.Asserts;

import engineer.nightowl.groupsio.api.resource.ArchiveResource;
import engineer.nightowl.groupsio.api.resource.GroupResource;
import engineer.nightowl.groupsio.api.resource.MemberResource;
import engineer.nightowl.groupsio.api.resource.UserResource;

/**
 * Main interface with Groups.io.
 * Actions will be carried out in the context of the user you login with. If you
 * receive an GroupsIOApiExceptionType.INADEQUATE_PERMISSIONS error, you need to
 * use a user who mods/owns a group. If you are integrating to manage one or
 * more groups rather than creating a generic application for use by any user,
 * consider creating a 'processing' user with mod/owner permissions just for use
 * with the API.
 */
public class GroupsIOApiClient
{
    private final String apiKey;
    private final String email;
    private final String domain;
    private final Integer twoFactor;
    private String apiToken;
    private final String version;
    private final String hostname;
    
    public static final String DEFAULT_HOSTNAME = "api.groups.io";
    public static final String DEFAULT_SCHEME = "https";
    public static final HttpHost DEFAULT_HOST = new HttpHost(DEFAULT_HOSTNAME, -1, DEFAULT_SCHEME);
    public static final String DEFAULT_API_BASE = DEFAULT_HOST.toURI();
    
    public static final String DEFAULT_VERSION = "v1";
    public static final String DEFAULT_VERSIONED_API_BASE = DEFAULT_API_BASE + "/" + DEFAULT_VERSION + "/";
    public static final String DEFAULT_DOMAIN = "groups.io";
    
    /**
     * Common client initialisation. Provide your API key and email.
     * 
     * @param apiKey
     *            - TODO: Update with details once published.
     * @param email
     *            - the email of the user to log in as
     */
    public GroupsIOApiClient(
            final String apiKey,
            final String email)
    {
        this(DEFAULT_HOSTNAME, DEFAULT_VERSION, apiKey, email, DEFAULT_DOMAIN, null);
    }
    
    /**
     * More in-depth constructor to override the defaults.
     * 
     * @param hostname
     *            - the base hostname (e.g. api.groups.io) to use
     * @param version
     *            - the API version (e.g. v1) to use
     * @param apiKey
     *            - TODO: Update with details once published.
     * @param email
     *            - the email of the user to log in as
     * @param domain
     *            - the domain name to connect with
     * @param twoFactor
     *            - the appropriate two-factor code to use
     */
    public GroupsIOApiClient(
            final String hostname,
            final String version,
            final String apiKey,
            final String email,
            final String domain,
            final Integer twoFactor)
    {
        Asserts.notBlank(apiKey, "apiKey");
        Asserts.notBlank(email, "email");
        this.hostname = hostname;
        this.version = version;
        this.apiKey = apiKey;
        this.email = email;
        this.domain = domain;
        this.twoFactor = twoFactor;
    }
    
    /**
     * Actions involving the currently authenticated user.
     * 
     * @return {@link UserResource}
     */
    public UserResource user()
    {
        return new UserResource(this, DEFAULT_VERSIONED_API_BASE);
    }
    
    /**
     * Actions involving the members of a group.
     * 
     * @return {@link MemberResource}
     */
    public MemberResource member()
    {
        return new MemberResource(this, DEFAULT_VERSIONED_API_BASE);
    }
    
    /**
     * Actions involving a specific group.
     * 
     * @return {@link GroupResource}
     */
    public GroupResource group()
    {
        return new GroupResource(this, DEFAULT_VERSIONED_API_BASE);
    }
    
    /**
     * Actions involving message archives.
     * 
     * @return {@link ArchiveResource}
     */
    public ArchiveResource archive()
    {
        return new ArchiveResource(this, DEFAULT_VERSIONED_API_BASE);
    }
    
    /**
     * @param apiToken
     *            set the apiToken
     */
    public void setApiToken(final String apiToken)
    {
        this.apiToken = apiToken;
    }
    
    /**
     * @return the apiKey
     */
    public String getApiKey()
    {
        return apiKey;
    }
    
    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * @return the domain
     */
    public String getDomain()
    {
        return domain;
    }
    
    /**
     * @return the twoFactor
     */
    public Integer getTwoFactor()
    {
        return twoFactor;
    }
    
    /**
     * @return the apiToken
     */
    public String getApiToken()
    {
        return apiToken;
    }
}
