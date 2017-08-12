package com.github.lake54.groupsio.api.exception;

import com.github.lake54.groupsio.api.domain.Error;

public class GroupsIOApiException extends Exception
{
    private static final long serialVersionUID = 1L;
    
    public GroupsIOApiException(final Error error)
    {
        super(error.getType().toString());
    }
}
