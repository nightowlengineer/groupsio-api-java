package com.github.lake54.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Subscription
{
    
    private Integer id;
    private String object;
    private String created;
    private String updated;
    private Integer userId;
    private Integer groupId;
    private String status;
    private String postStatus;
    private String emailDelivery;
    private String messageSelection;
    private Boolean autoFollowReplies;
    private String maxAttachmentSize;
    private Integer approvedPosts;
    private String modStatus;
    private String pendingMsgNotify;
    private String pendingSubNotify;
    private String subNotify;
    private String storageNotify;
    private String subGroupNotify;
    private String messageReportNotify;
    private String modPermissions;
    private String ownerMsgNotify;
    private String email;
    private String userStatus;
    private String userName;
    private String timezone;
    private String fullName;
    private String aboutMe;
    private String aboutFormat;
    private String location;
    private String website;
    
    /**
     * No args constructor for use in serialization
     */
    public Subscription()
    {
    }
    
    /**
     * @param emailDelivery
     * @param modPermissions
     * @param location
     * @param pendingMsgNotify
     * @param subGroupNotify
     * @param object
     * @param aboutMe
     * @param id
     * @param approvedPosts
     * @param timezone
     * @param messageSelection
     * @param updated
     * @param created
     * @param userId
     * @param aboutFormat
     * @param userName
     * @param ownerMsgNotify
     * @param website
     * @param status
     * @param modStatus
     * @param maxAttachmentSize
     * @param groupId
     * @param pendingSubNotify
     * @param email
     * @param subNotify
     * @param messageReportNotify
     * @param userStatus
     * @param storageNotify
     * @param autoFollowReplies
     * @param fullName
     * @param postStatus
     */
    public Subscription(final Integer id, final String object, final String created, final String updated, final Integer userId,
            final Integer groupId, final String status, final String postStatus, final String emailDelivery, final String messageSelection,
            final Boolean autoFollowReplies, final String maxAttachmentSize, final Integer approvedPosts, final String modStatus,
            final String pendingMsgNotify, final String pendingSubNotify, final String subNotify, final String storageNotify,
            final String subGroupNotify, final String messageReportNotify, final String modPermissions, final String ownerMsgNotify,
            final String email, final String userStatus, final String userName, final String timezone, final String fullName,
            final String aboutMe, final String aboutFormat, final String location, final String website)
    {
        super();
        this.id = id;
        this.object = object;
        this.created = created;
        this.updated = updated;
        this.userId = userId;
        this.groupId = groupId;
        this.status = status;
        this.postStatus = postStatus;
        this.emailDelivery = emailDelivery;
        this.messageSelection = messageSelection;
        this.autoFollowReplies = autoFollowReplies;
        this.maxAttachmentSize = maxAttachmentSize;
        this.approvedPosts = approvedPosts;
        this.modStatus = modStatus;
        this.pendingMsgNotify = pendingMsgNotify;
        this.pendingSubNotify = pendingSubNotify;
        this.subNotify = subNotify;
        this.storageNotify = storageNotify;
        this.subGroupNotify = subGroupNotify;
        this.messageReportNotify = messageReportNotify;
        this.modPermissions = modPermissions;
        this.ownerMsgNotify = ownerMsgNotify;
        this.email = email;
        this.userStatus = userStatus;
        this.userName = userName;
        this.timezone = timezone;
        this.fullName = fullName;
        this.aboutMe = aboutMe;
        this.aboutFormat = aboutFormat;
        this.location = location;
        this.website = website;
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(final Integer id)
    {
        this.id = id;
    }
    
    public Subscription withId(final Integer id)
    {
        this.id = id;
        return this;
    }
    
    public String getObject()
    {
        return object;
    }
    
    public void setObject(final String object)
    {
        this.object = object;
    }
    
    public Subscription withObject(final String object)
    {
        this.object = object;
        return this;
    }
    
    public String getCreated()
    {
        return created;
    }
    
    public void setCreated(final String created)
    {
        this.created = created;
    }
    
    public Subscription withCreated(final String created)
    {
        this.created = created;
        return this;
    }
    
    public String getUpdated()
    {
        return updated;
    }
    
    public void setUpdated(final String updated)
    {
        this.updated = updated;
    }
    
    public Subscription withUpdated(final String updated)
    {
        this.updated = updated;
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
    
    public Subscription withUserId(final Integer userId)
    {
        this.userId = userId;
        return this;
    }
    
    public Integer getGroupId()
    {
        return groupId;
    }
    
    public void setGroupId(final Integer groupId)
    {
        this.groupId = groupId;
    }
    
    public Subscription withGroupId(final Integer groupId)
    {
        this.groupId = groupId;
        return this;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(final String status)
    {
        this.status = status;
    }
    
    public Subscription withStatus(final String status)
    {
        this.status = status;
        return this;
    }
    
    public String getPostStatus()
    {
        return postStatus;
    }
    
    public void setPostStatus(final String postStatus)
    {
        this.postStatus = postStatus;
    }
    
    public Subscription withPostStatus(final String postStatus)
    {
        this.postStatus = postStatus;
        return this;
    }
    
    public String getEmailDelivery()
    {
        return emailDelivery;
    }
    
    public void setEmailDelivery(final String emailDelivery)
    {
        this.emailDelivery = emailDelivery;
    }
    
    public Subscription withEmailDelivery(final String emailDelivery)
    {
        this.emailDelivery = emailDelivery;
        return this;
    }
    
    public String getMessageSelection()
    {
        return messageSelection;
    }
    
    public void setMessageSelection(final String messageSelection)
    {
        this.messageSelection = messageSelection;
    }
    
    public Subscription withMessageSelection(final String messageSelection)
    {
        this.messageSelection = messageSelection;
        return this;
    }
    
    public Boolean getAutoFollowReplies()
    {
        return autoFollowReplies;
    }
    
    public void setAutoFollowReplies(final Boolean autoFollowReplies)
    {
        this.autoFollowReplies = autoFollowReplies;
    }
    
    public Subscription withAutoFollowReplies(final Boolean autoFollowReplies)
    {
        this.autoFollowReplies = autoFollowReplies;
        return this;
    }
    
    public String getMaxAttachmentSize()
    {
        return maxAttachmentSize;
    }
    
    public void setMaxAttachmentSize(final String maxAttachmentSize)
    {
        this.maxAttachmentSize = maxAttachmentSize;
    }
    
    public Subscription withMaxAttachmentSize(final String maxAttachmentSize)
    {
        this.maxAttachmentSize = maxAttachmentSize;
        return this;
    }
    
    public Integer getApprovedPosts()
    {
        return approvedPosts;
    }
    
    public void setApprovedPosts(final Integer approvedPosts)
    {
        this.approvedPosts = approvedPosts;
    }
    
    public Subscription withApprovedPosts(final Integer approvedPosts)
    {
        this.approvedPosts = approvedPosts;
        return this;
    }
    
    public String getModStatus()
    {
        return modStatus;
    }
    
    public void setModStatus(final String modStatus)
    {
        this.modStatus = modStatus;
    }
    
    public Subscription withModStatus(final String modStatus)
    {
        this.modStatus = modStatus;
        return this;
    }
    
    public String getPendingMsgNotify()
    {
        return pendingMsgNotify;
    }
    
    public void setPendingMsgNotify(final String pendingMsgNotify)
    {
        this.pendingMsgNotify = pendingMsgNotify;
    }
    
    public Subscription withPendingMsgNotify(final String pendingMsgNotify)
    {
        this.pendingMsgNotify = pendingMsgNotify;
        return this;
    }
    
    public String getPendingSubNotify()
    {
        return pendingSubNotify;
    }
    
    public void setPendingSubNotify(final String pendingSubNotify)
    {
        this.pendingSubNotify = pendingSubNotify;
    }
    
    public Subscription withPendingSubNotify(final String pendingSubNotify)
    {
        this.pendingSubNotify = pendingSubNotify;
        return this;
    }
    
    public String getSubNotify()
    {
        return subNotify;
    }
    
    public void setSubNotify(final String subNotify)
    {
        this.subNotify = subNotify;
    }
    
    public Subscription withSubNotify(final String subNotify)
    {
        this.subNotify = subNotify;
        return this;
    }
    
    public String getStorageNotify()
    {
        return storageNotify;
    }
    
    public void setStorageNotify(final String storageNotify)
    {
        this.storageNotify = storageNotify;
    }
    
    public Subscription withStorageNotify(final String storageNotify)
    {
        this.storageNotify = storageNotify;
        return this;
    }
    
    public String getSubGroupNotify()
    {
        return subGroupNotify;
    }
    
    public void setSubGroupNotify(final String subGroupNotify)
    {
        this.subGroupNotify = subGroupNotify;
    }
    
    public Subscription withSubGroupNotify(final String subGroupNotify)
    {
        this.subGroupNotify = subGroupNotify;
        return this;
    }
    
    public String getMessageReportNotify()
    {
        return messageReportNotify;
    }
    
    public void setMessageReportNotify(final String messageReportNotify)
    {
        this.messageReportNotify = messageReportNotify;
    }
    
    public Subscription withMessageReportNotify(final String messageReportNotify)
    {
        this.messageReportNotify = messageReportNotify;
        return this;
    }
    
    public String getModPermissions()
    {
        return modPermissions;
    }
    
    public void setModPermissions(final String modPermissions)
    {
        this.modPermissions = modPermissions;
    }
    
    public Subscription withModPermissions(final String modPermissions)
    {
        this.modPermissions = modPermissions;
        return this;
    }
    
    public String getOwnerMsgNotify()
    {
        return ownerMsgNotify;
    }
    
    public void setOwnerMsgNotify(final String ownerMsgNotify)
    {
        this.ownerMsgNotify = ownerMsgNotify;
    }
    
    public Subscription withOwnerMsgNotify(final String ownerMsgNotify)
    {
        this.ownerMsgNotify = ownerMsgNotify;
        return this;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(final String email)
    {
        this.email = email;
    }
    
    public Subscription withEmail(final String email)
    {
        this.email = email;
        return this;
    }
    
    public String getUserStatus()
    {
        return userStatus;
    }
    
    public void setUserStatus(final String userStatus)
    {
        this.userStatus = userStatus;
    }
    
    public Subscription withUserStatus(final String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(final String userName)
    {
        this.userName = userName;
    }
    
    public Subscription withUserName(final String userName)
    {
        this.userName = userName;
        return this;
    }
    
    public String getTimezone()
    {
        return timezone;
    }
    
    public void setTimezone(final String timezone)
    {
        this.timezone = timezone;
    }
    
    public Subscription withTimezone(final String timezone)
    {
        this.timezone = timezone;
        return this;
    }
    
    public String getFullName()
    {
        return fullName;
    }
    
    public void setFullName(final String fullName)
    {
        this.fullName = fullName;
    }
    
    public Subscription withFullName(final String fullName)
    {
        this.fullName = fullName;
        return this;
    }
    
    public String getAboutMe()
    {
        return aboutMe;
    }
    
    public void setAboutMe(final String aboutMe)
    {
        this.aboutMe = aboutMe;
    }
    
    public Subscription withAboutMe(final String aboutMe)
    {
        this.aboutMe = aboutMe;
        return this;
    }
    
    public String getAboutFormat()
    {
        return aboutFormat;
    }
    
    public void setAboutFormat(final String aboutFormat)
    {
        this.aboutFormat = aboutFormat;
    }
    
    public Subscription withAboutFormat(final String aboutFormat)
    {
        this.aboutFormat = aboutFormat;
        return this;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public void setLocation(final String location)
    {
        this.location = location;
    }
    
    public Subscription withLocation(final String location)
    {
        this.location = location;
        return this;
    }
    
    public String getWebsite()
    {
        return website;
    }
    
    public void setWebsite(final String website)
    {
        this.website = website;
    }
    
    public Subscription withWebsite(final String website)
    {
        this.website = website;
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
        return new HashCodeBuilder().append(id).append(object).append(created).append(updated).append(userId).append(groupId).append(status)
                .append(postStatus).append(emailDelivery).append(messageSelection).append(autoFollowReplies).append(maxAttachmentSize)
                .append(approvedPosts).append(modStatus).append(pendingMsgNotify).append(pendingSubNotify).append(subNotify)
                .append(storageNotify).append(subGroupNotify).append(messageReportNotify).append(modPermissions).append(ownerMsgNotify)
                .append(email).append(userStatus).append(userName).append(timezone).append(fullName).append(aboutMe).append(aboutFormat)
                .append(location).append(website).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Subscription) == false)
        {
            return false;
        }
        final Subscription rhs = ((Subscription) other);
        return new EqualsBuilder().append(id, rhs.id).append(object, rhs.object).append(created, rhs.created).append(updated, rhs.updated)
                .append(userId, rhs.userId).append(groupId, rhs.groupId).append(status, rhs.status).append(postStatus, rhs.postStatus)
                .append(emailDelivery, rhs.emailDelivery).append(messageSelection, rhs.messageSelection)
                .append(autoFollowReplies, rhs.autoFollowReplies).append(maxAttachmentSize, rhs.maxAttachmentSize)
                .append(approvedPosts, rhs.approvedPosts).append(modStatus, rhs.modStatus).append(pendingMsgNotify, rhs.pendingMsgNotify)
                .append(pendingSubNotify, rhs.pendingSubNotify).append(subNotify, rhs.subNotify).append(storageNotify, rhs.storageNotify)
                .append(subGroupNotify, rhs.subGroupNotify).append(messageReportNotify, rhs.messageReportNotify)
                .append(modPermissions, rhs.modPermissions).append(ownerMsgNotify, rhs.ownerMsgNotify).append(email, rhs.email)
                .append(userStatus, rhs.userStatus).append(userName, rhs.userName).append(timezone, rhs.timezone)
                .append(fullName, rhs.fullName).append(aboutMe, rhs.aboutMe).append(aboutFormat, rhs.aboutFormat)
                .append(location, rhs.location).append(website, rhs.website).isEquals();
    }
    
}