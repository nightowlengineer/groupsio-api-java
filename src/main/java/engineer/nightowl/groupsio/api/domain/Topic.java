package engineer.nightowl.groupsio.api.domain;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Topic
{
    
    private Integer id;
    private String subject;
    private String snippet;
    private Poster poster;
    private Integer numMsgs;
    private String mostRecentMessage;
    private Boolean isSticky;
    private Boolean isModerated;
    private Boolean isClosed;
    private List<Hashtag> hashtags = null;
    
    /**
     * No args constructor for use in serialization
     */
    public Topic()
    {
    }

    public Topic(final Integer id, final String subject, final String snippet, final Poster poster, final Integer numMsgs,
            final String mostRecentMessage, final Boolean isSticky, final Boolean isModerated, final Boolean isClosed,
            final List<Hashtag> hashtags)
    {
        super();
        this.id = id;
        this.subject = subject;
        this.snippet = snippet;
        this.poster = poster;
        this.numMsgs = numMsgs;
        this.mostRecentMessage = mostRecentMessage;
        this.isSticky = isSticky;
        this.isModerated = isModerated;
        this.isClosed = isClosed;
        this.hashtags = hashtags;
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(final Integer id)
    {
        this.id = id;
    }
    
    public Topic withId(final Integer id)
    {
        this.id = id;
        return this;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public void setSubject(final String subject)
    {
        this.subject = subject;
    }
    
    public Topic withSubject(final String subject)
    {
        this.subject = subject;
        return this;
    }
    
    public String getSnippet()
    {
        return snippet;
    }
    
    public void setSnippet(final String snippet)
    {
        this.snippet = snippet;
    }
    
    public Topic withSnippet(final String snippet)
    {
        this.snippet = snippet;
        return this;
    }
    
    public Poster getPoster()
    {
        return poster;
    }
    
    public void setPoster(final Poster poster)
    {
        this.poster = poster;
    }
    
    public Topic withPoster(final Poster poster)
    {
        this.poster = poster;
        return this;
    }
    
    public Integer getNumMsgs()
    {
        return numMsgs;
    }
    
    public void setNumMsgs(final Integer numMsgs)
    {
        this.numMsgs = numMsgs;
    }
    
    public Topic withNumMsgs(final Integer numMsgs)
    {
        this.numMsgs = numMsgs;
        return this;
    }
    
    public String getMostRecentMessage()
    {
        return mostRecentMessage;
    }
    
    public void setMostRecentMessage(final String mostRecentMessage)
    {
        this.mostRecentMessage = mostRecentMessage;
    }
    
    public Topic withMostRecentMessage(final String mostRecentMessage)
    {
        this.mostRecentMessage = mostRecentMessage;
        return this;
    }
    
    public Boolean getIsSticky()
    {
        return isSticky;
    }
    
    public void setIsSticky(final Boolean isSticky)
    {
        this.isSticky = isSticky;
    }
    
    public Topic withIsSticky(final Boolean isSticky)
    {
        this.isSticky = isSticky;
        return this;
    }
    
    public Boolean getIsModerated()
    {
        return isModerated;
    }
    
    public void setIsModerated(final Boolean isModerated)
    {
        this.isModerated = isModerated;
    }
    
    public Topic withIsModerated(final Boolean isModerated)
    {
        this.isModerated = isModerated;
        return this;
    }
    
    public Boolean getIsClosed()
    {
        return isClosed;
    }
    
    public void setIsClosed(final Boolean isClosed)
    {
        this.isClosed = isClosed;
    }
    
    public Topic withIsClosed(final Boolean isClosed)
    {
        this.isClosed = isClosed;
        return this;
    }
    
    public List<Hashtag> getHashtags()
    {
        return hashtags;
    }
    
    public void setHashtags(final List<Hashtag> hashtags)
    {
        this.hashtags = hashtags;
    }
    
    public Topic withHashtags(final List<Hashtag> hashtags)
    {
        this.hashtags = hashtags;
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
        return new HashCodeBuilder().append(id).append(subject).append(snippet).append(poster).append(numMsgs).append(mostRecentMessage)
                .append(isSticky).append(isModerated).append(isClosed).append(hashtags).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Topic) == false)
        {
            return false;
        }
        final Topic rhs = ((Topic) other);
        return new EqualsBuilder().append(id, rhs.id).append(subject, rhs.subject).append(snippet, rhs.snippet).append(poster, rhs.poster)
                .append(numMsgs, rhs.numMsgs).append(mostRecentMessage, rhs.mostRecentMessage).append(isSticky, rhs.isSticky)
                .append(isModerated, rhs.isModerated).append(isClosed, rhs.isClosed).append(hashtags, rhs.hashtags).isEquals();
    }
    
}