package com.github.lake54.groupsio.api.domain;

import com.github.lake54.groupsio.api.exception.GroupsIOApiExceptionType;

public class Error
{
    private GroupsIOApiExceptionType type;
    private String extra;
    
    public Error()
    {
        // Serialisation
    }
    
    /**
     * @return the type
     */
    public GroupsIOApiExceptionType getType()
    {
        return type;
    }
    
    /**
     * @param type
     *            the type to set
     */
    public void setType(final GroupsIOApiExceptionType type)
    {
        this.type = type;
    }
    
    /**
     * @return the extra
     */
    public String getExtra()
    {
        return extra;
    }
    
    /**
     * @param extra
     *            the extra to set
     */
    public void setExtra(final String extra)
    {
        this.extra = extra;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        String output = type.toString();
        if (extra != null && extra.length() > 0)
        {
            output += ": " + extra;
        }
        return output;
    }
    
}
