package engineer.nightowl.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Hashtag
{
    
    private Integer id;
    private String name;
    private String color;
    
    /**
     * No args constructor for use in serialization
     */
    public Hashtag()
    {
    }

    public Hashtag(final Integer id, final String name, final String color)
    {
        super();
        this.id = id;
        this.name = name;
        this.color = color;
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(final Integer id)
    {
        this.id = id;
    }
    
    public Hashtag withId(final Integer id)
    {
        this.id = id;
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
    
    public Hashtag withName(final String name)
    {
        this.name = name;
        return this;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(final String color)
    {
        this.color = color;
    }
    
    public Hashtag withColor(final String color)
    {
        this.color = color;
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
        return new HashCodeBuilder().append(id).append(name).append(color).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Hashtag) == false)
        {
            return false;
        }
        final Hashtag rhs = ((Hashtag) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(color, rhs.color).isEquals();
    }
    
}