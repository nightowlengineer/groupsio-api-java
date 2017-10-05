package com.github.lake54.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class DirectAdd
{

    private String object;
    private Integer totalEmails;
    private List<Error> errors;
    private List<Subscription> addedMembers;

    /**
     * No args constructor for use in serialization
     */
    public DirectAdd()
    {
    }

    public DirectAdd(final String object, final Integer totalEmails, final List<Error> errors, final List<Subscription> addedMembers)
    {
        super();
        this.object = object;
        this.totalEmails = totalEmails;
        this.errors = errors;
        this.addedMembers = addedMembers;
    }

    
    public String getObject()
    {
        return object;
    }
    
    public void setObject(final String object)
    {
        this.object = object;
    }
    
    public DirectAdd withObject(final String object)
    {
        this.object = object;
        return this;
    }
    
    public Integer getTotalEmails()
    {
        return totalEmails;
    }
    
    public void setTotalEmails(final Integer totalEmails)
    {
        this.totalEmails = totalEmails;
    }
    
    public DirectAdd withTotalEmails(final Integer totalEmails)
    {
        this.totalEmails = totalEmails;
        return this;
    }
    
    public List<Error> getErrors()
    {
        return errors;
    }
    
    public void setErrors(final List<Error> errors)
    {
        this.errors = errors;
    }
    
    public DirectAdd withErrors(final List<Error> errors)
    {
        this.errors = errors;
        return this;
    }
    
    public List<Subscription> getAddedMembers()
    {
        return addedMembers;
    }
    
    public void setAddedMembers(final List<Subscription> addedMembers)
    {
        this.addedMembers = addedMembers;
    }
    
    public DirectAdd withAddedMembers(final List<Subscription> addedMembers)
    {
        this.addedMembers = addedMembers;
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
        return new HashCodeBuilder().append(object).append(totalEmails).append(errors).append(addedMembers).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if (!(other instanceof DirectAdd))
        {
            return false;
        }
        final DirectAdd rhs = ((DirectAdd) other);
        return new EqualsBuilder().append(object, rhs.object).append(totalEmails, rhs.totalEmails).append(errors, rhs.errors)
                .append(addedMembers, rhs.addedMembers).isEquals();
    }
    
}