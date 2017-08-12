package com.github.lake54.groupsio.api.domain;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Page
{
    
    private String object;
    private Integer totalCount;
    private Integer startItem;
    private Integer endItem;
    private Boolean hasMore;
    private Integer nextPageToken;
    private List<Object> data = null;
    
    /**
     * No args constructor for use in serialization
     */
    public Page()
    {
    }
    
    /**
     * @param hasMore
     * @param startItem
     * @param totalCount
     * @param endItem
     * @param data
     * @param nextPageToken
     * @param object
     */
    public Page(final String object, final Integer totalCount, final Integer startItem, final Integer endItem, final Boolean hasMore,
            final Integer nextPageToken, final List<Object> data)
    {
        super();
        this.object = object;
        this.totalCount = totalCount;
        this.startItem = startItem;
        this.endItem = endItem;
        this.hasMore = hasMore;
        this.nextPageToken = nextPageToken;
        this.data = data;
    }
    
    public String getObject()
    {
        return object;
    }
    
    public void setObject(final String object)
    {
        this.object = object;
    }
    
    public Page withObject(final String object)
    {
        this.object = object;
        return this;
    }
    
    public Integer getTotalCount()
    {
        return totalCount;
    }
    
    public void setTotalCount(final Integer totalCount)
    {
        this.totalCount = totalCount;
    }
    
    public Page withTotalCount(final Integer totalCount)
    {
        this.totalCount = totalCount;
        return this;
    }
    
    public Integer getStartItem()
    {
        return startItem;
    }
    
    public void setStartItem(final Integer startItem)
    {
        this.startItem = startItem;
    }
    
    public Page withStartItem(final Integer startItem)
    {
        this.startItem = startItem;
        return this;
    }
    
    public Integer getEndItem()
    {
        return endItem;
    }
    
    public void setEndItem(final Integer endItem)
    {
        this.endItem = endItem;
    }
    
    public Page withEndItem(final Integer endItem)
    {
        this.endItem = endItem;
        return this;
    }
    
    public Boolean getHasMore()
    {
        return hasMore;
    }
    
    public void setHasMore(final Boolean hasMore)
    {
        this.hasMore = hasMore;
    }
    
    public Page withHasMore(final Boolean hasMore)
    {
        this.hasMore = hasMore;
        return this;
    }
    
    public Integer getNextPageToken()
    {
        return nextPageToken;
    }
    
    public void setNextPageToken(final Integer nextPageToken)
    {
        this.nextPageToken = nextPageToken;
    }
    
    public Page withNextPageToken(final Integer nextPageToken)
    {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    public List<Object> getData()
    {
        return data;
    }
    
    public void setData(final List<Object> data)
    {
        this.data = data;
    }
    
    public Page withData(final List<Object> data)
    {
        this.data = data;
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
        return new HashCodeBuilder().append(object).append(totalCount).append(startItem).append(endItem).append(hasMore)
                .append(nextPageToken).append(data).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Page) == false)
        {
            return false;
        }
        final Page rhs = ((Page) other);
        return new EqualsBuilder().append(object, rhs.object).append(totalCount, rhs.totalCount).append(startItem, rhs.startItem)
                .append(endItem, rhs.endItem).append(hasMore, rhs.hasMore).append(nextPageToken, rhs.nextPageToken).append(data, rhs.data)
                .isEquals();
    }
    
}