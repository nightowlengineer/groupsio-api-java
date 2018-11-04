package engineer.nightowl.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Login
{
    
    private String token;
    private String name;
    
    /**
     * No args constructor for use in serialization
     */
    public Login()
    {
    }

    public Login(final String token, final String name)
    {
        super();
        this.token = token;
        this.name = name;
    }
    
    public String getToken()
    {
        return token;
    }
    
    public void setToken(final String token)
    {
        this.token = token;
    }
    
    public Login withToken(final String token)
    {
        this.token = token;
        return this;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(final String name)
    {
        this.name = name;
    }
    
    public Login withName(final String name)
    {
        this.name = name;
        return this;
    }
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
    
    @Override
    public int hashCode()
    {
        return new HashCodeBuilder().append(token).append(name).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Login) == false)
        {
            return false;
        }
        final Login rhs = ((Login) other);
        return new EqualsBuilder().append(token, rhs.token).append(name, rhs.name).isEquals();
    }
    
}