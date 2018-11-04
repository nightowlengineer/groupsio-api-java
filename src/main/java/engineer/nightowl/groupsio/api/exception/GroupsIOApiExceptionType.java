package engineer.nightowl.groupsio.api.exception;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum GroupsIOApiExceptionType
{
    UNKNOWN, UNAUTHORIZED, BAD_REQUEST, AUTHENTICATION, EXPIRED, RATE_LIMIT, INADEQUATE_PERMISSIONS, INVALID_VALUE, SERVER;
    
    @JsonCreator
    public static GroupsIOApiExceptionType fromString(final String key)
    {
        for (final GroupsIOApiExceptionType type : GroupsIOApiExceptionType.values())
        {
            if (type.name().equalsIgnoreCase(key))
            {
                return type;
            }
        }
        return UNKNOWN;
    }
}