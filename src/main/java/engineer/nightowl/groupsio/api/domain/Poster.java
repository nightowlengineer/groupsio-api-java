package engineer.nightowl.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Poster
{
    
    private String name;
    private Integer userId;
    
    /**
     * No args constructor for use in serialization
     */
    public Poster()
    {
    }

    public Poster(final String name, final Integer userId)
    {
        super();
        this.name = name;
        this.userId = userId;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(final String name)
    {
        this.name = name;
    }
    
    public Poster withName(final String name)
    {
        this.name = name;
        return this;
    }
    
    public Integer getUserId()
    {
        return userId;
    }
    
    public void setUserId(final Integer userId)
    {
        this.userId = userId;
    }
    
    public Poster withUserId(final Integer userId)
    {
        this.userId = userId;
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
        return new HashCodeBuilder().append(name).append(userId).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Poster) == false)
        {
            return false;
        }
        final Poster rhs = ((Poster) other);
        return new EqualsBuilder().append(name, rhs.name).append(userId, rhs.userId).isEquals();
    }
    
}