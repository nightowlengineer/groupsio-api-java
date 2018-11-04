package engineer.nightowl.groupsio.api.resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

import engineer.nightowl.groupsio.api.GroupsIOApiClient;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import engineer.nightowl.groupsio.api.domain.Error;
import engineer.nightowl.groupsio.api.domain.Login;
import engineer.nightowl.groupsio.api.exception.GroupsIOApiException;

/**
 * Base class for Groups.io resources.
 * Contains common methods to call into the API.
 * Only one method is public, {@link BaseResource#login(String)}, which can be
 * called by any child class (rather than creating a BaseResource instance).
 */
public class BaseResource
{
    protected final GroupsIOApiClient apiClient;
    protected final String baseUrl;
    protected static final String MAX_RESULTS = "100";
    public static final ObjectMapper OM = new ObjectMapper().setPropertyNamingStrategy(
            PropertyNamingStrategy.SNAKE_CASE).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(Include.NON_NULL);
    
    public BaseResource(final GroupsIOApiClient client, final String baseUrl)
    {
        this.apiClient = client;
        this.baseUrl = baseUrl;
    }
    
    /**
     * Carry out initial login to the Groups.io API and set the API token.
     * 
     * @return API token for the configured user as a {@link String}
     * @throws URISyntaxException
     * @throws GroupsIOApiException
     * @throws IOException
     */
    public String login(final String password) throws URISyntaxException, GroupsIOApiException, IOException
    {
        final URIBuilder uri = new URIBuilder().setPath(GroupsIOApiClient.DEFAULT_VERSIONED_API_BASE + "login");
        uri.setParameter("email", apiClient.getEmail());
        uri.setParameter("password", password);
        final HttpGet request = new HttpGet();
        request.setURI(uri.build());
        
        final Login login = callApi(request, Login.class, true);
        final String apiToken = login.getToken();
        apiClient.setApiToken(apiToken);
        return apiToken;
    }
    
    /**
     * Main API call method. Takes in a {@link HttpUriRequest} comprising of a
     * URI and method
     * 
     * @param request
     *            with the relevant URI and method (with associated data is
     *            appropriate)
     * @param type
     * @return the type requested
     * @throws IOException
     *             if it's not possible to get a valid response from the API
     * @throws GroupsIOApiException
     *             if the API returns an error, or an error is experienced
     *             during deserialisation
     */
    protected <T> T callApi(final HttpUriRequest request, final Class<T> type) throws IOException, GroupsIOApiException
    {
        return callApi(request, type, false);
    }
    
    /**
     * Main API call method. Takes in a {@link HttpUriRequest} comprising of a
     * URI and method
     * 
     * @param request
     *            with the relevant URI and method (with associated data is
     *            appropriate)
     * @param type
     *            what the response should interpreted as
     * @param login
     *            whether this is a call specifically to login
     * @return the type requested
     * @throws IOException
     *             if it's not possible to get a valid response from the API
     * @throws GroupsIOApiException
     *             if the API returns an error, or an error is experienced
     *             during deserialisation
     */
    protected <T> T callApi(final HttpUriRequest request, final Class<T> type, final Boolean login) throws IOException, GroupsIOApiException
    {
        try (final CloseableHttpClient client = getHttpClient(login, request))
        {
            final HttpResponse response = client.execute(request);
            final InputStream stream = response.getEntity().getContent();
            final byte[] bytes = IOUtils.toByteArray(stream);
            if (response.getStatusLine().getStatusCode() != 200)
            {
                throw new GroupsIOApiException(mapToError(bytes));
            }
            try
            {
                return type.cast(OM.readValue(bytes, Class.forName(type.getName())));
            }
            catch (final JsonMappingException | ClassNotFoundException jme)
            {
                throw new GroupsIOApiException(mapToError(bytes));
            }
        }
    }
    
    /**
     * Given an error response, return an {@link Error} object.
     * 
     * @param bytes
     *            from the API response
     * @return an {@link Error} representing the API's response.
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    private Error mapToError(final byte[] bytes) throws JsonParseException, JsonMappingException, IOException
    {
        return OM.readValue(bytes, Error.class);
    }
    
    /**
     * Get a valid {@link HttpClient} to use, with a valid token.
     * 
     * @param login
     * @return
     */
    private CloseableHttpClient getHttpClient(final Boolean login, final HttpUriRequest request)
    {
        final HttpClientBuilder builder = HttpClientBuilder.create();
        String key;
        // if (apiClient.getApiToken() == null || apiClient.getApiToken())
        if (login)
        {
            key = apiClient.getApiKey();
        }
        else
        {
            key = apiClient.getApiToken();
        }
        key += ":";
        final byte[] credentials = Base64.encodeBase64(key.getBytes(StandardCharsets.UTF_8));
        final BasicHeader authHeader = new BasicHeader("Authorization", "Basic " + new String(credentials, StandardCharsets.UTF_8));
        request.addHeader(authHeader);
        return builder.build();
    }
}
