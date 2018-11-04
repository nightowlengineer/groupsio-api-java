package engineer.nightowl.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Group
{
    
    private Integer id;
    private String object;
    private String created;
    private String updated;
    private String title;
    private String name;
    private String alias;
    private String desc;
    private String subjectTag;
    private String footer;
    private String website;
    private Boolean announce;
    private Boolean moderated;
    private Boolean newUsersModerated;
    private Integer unmoderateUsersAfter;
    private Boolean restricted;
    private Boolean allowNonSubsToPost;
    private Boolean forceHtmlEmails;
    private Boolean normalizeHtmlEmails;
    private String replyTo;
    private Boolean removeOtherReplyOptions;
    private String privacy;
    private String membersVisible;
    private String subgroupAccess;
    private String calendarAccess;
    private String filesAccess;
    private String databaseAccess;
    private String wikiAccess;
    private String photosAccess;
    private String memberDirectoryAccess;
    private String pollsAccess;
    private String chatAccess;
    private String handleAttachments;
    private Boolean plainTextOnly;
    private String maxPhotoSizeEmail;
    private String maxPhotoSizePhotos;
    private String maxPhotoSizeDatabases;
    private String maxPhotoSizeWikiImages;
    private Boolean hashTagsRequired;
    private Boolean restrictCreateHashTags;
    private Boolean bounceAttachments;
    private Boolean allowPhotosInFiles;
    private String emailDeliveryDefault;
    private String messageSelectionDefault;
    private Boolean autoFollowRepliesDefault;
    private String maxAttachmentSizeDefault;
    private Boolean disableEdits;
    private Boolean disableNoEmail;
    private Boolean autoCloseThreads;
    private Integer closeThreadsAfter;
    private Boolean autoModerateThreads;
    private Integer moderateThreadsAfter;
    
    /**
     * No args constructor for use in serialization
     */
    public Group()
    {
    }

    public Group(final Integer id, final String object, final String created, final String updated, final String title, final String name,
            final String alias, final String desc, final String subjectTag, final String footer, final String website,
            final Boolean announce, final Boolean moderated, final Boolean newUsersModerated, final Integer unmoderateUsersAfter,
            final Boolean restricted, final Boolean allowNonSubsToPost, final Boolean forceHtmlEmails, final Boolean normalizeHtmlEmails,
            final String replyTo, final Boolean removeOtherReplyOptions, final String privacy, final String membersVisible,
            final String subgroupAccess, final String calendarAccess, final String filesAccess, final String databaseAccess,
            final String wikiAccess, final String photosAccess, final String memberDirectoryAccess, final String pollsAccess,
            final String chatAccess, final String handleAttachments, final Boolean plainTextOnly, final String maxPhotoSizeEmail,
            final String maxPhotoSizePhotos, final String maxPhotoSizeDatabases, final String maxPhotoSizeWikiImages,
            final Boolean hashTagsRequired, final Boolean restrictCreateHashTags, final Boolean bounceAttachments,
            final Boolean allowPhotosInFiles, final String emailDeliveryDefault, final String messageSelectionDefault,
            final Boolean autoFollowRepliesDefault, final String maxAttachmentSizeDefault, final Boolean disableEdits,
            final Boolean disableNoEmail, final Boolean autoCloseThreads, final Integer closeThreadsAfter,
            final Boolean autoModerateThreads, final Integer moderateThreadsAfter)
    {
        super();
        this.id = id;
        this.object = object;
        this.created = created;
        this.updated = updated;
        this.title = title;
        this.name = name;
        this.alias = alias;
        this.desc = desc;
        this.subjectTag = subjectTag;
        this.footer = footer;
        this.website = website;
        this.announce = announce;
        this.moderated = moderated;
        this.newUsersModerated = newUsersModerated;
        this.unmoderateUsersAfter = unmoderateUsersAfter;
        this.restricted = restricted;
        this.allowNonSubsToPost = allowNonSubsToPost;
        this.forceHtmlEmails = forceHtmlEmails;
        this.normalizeHtmlEmails = normalizeHtmlEmails;
        this.replyTo = replyTo;
        this.removeOtherReplyOptions = removeOtherReplyOptions;
        this.privacy = privacy;
        this.membersVisible = membersVisible;
        this.subgroupAccess = subgroupAccess;
        this.calendarAccess = calendarAccess;
        this.filesAccess = filesAccess;
        this.databaseAccess = databaseAccess;
        this.wikiAccess = wikiAccess;
        this.photosAccess = photosAccess;
        this.memberDirectoryAccess = memberDirectoryAccess;
        this.pollsAccess = pollsAccess;
        this.chatAccess = chatAccess;
        this.handleAttachments = handleAttachments;
        this.plainTextOnly = plainTextOnly;
        this.maxPhotoSizeEmail = maxPhotoSizeEmail;
        this.maxPhotoSizePhotos = maxPhotoSizePhotos;
        this.maxPhotoSizeDatabases = maxPhotoSizeDatabases;
        this.maxPhotoSizeWikiImages = maxPhotoSizeWikiImages;
        this.hashTagsRequired = hashTagsRequired;
        this.restrictCreateHashTags = restrictCreateHashTags;
        this.bounceAttachments = bounceAttachments;
        this.allowPhotosInFiles = allowPhotosInFiles;
        this.emailDeliveryDefault = emailDeliveryDefault;
        this.messageSelectionDefault = messageSelectionDefault;
        this.autoFollowRepliesDefault = autoFollowRepliesDefault;
        this.maxAttachmentSizeDefault = maxAttachmentSizeDefault;
        this.disableEdits = disableEdits;
        this.disableNoEmail = disableNoEmail;
        this.autoCloseThreads = autoCloseThreads;
        this.closeThreadsAfter = closeThreadsAfter;
        this.autoModerateThreads = autoModerateThreads;
        this.moderateThreadsAfter = moderateThreadsAfter;
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(final Integer id)
    {
        this.id = id;
    }
    
    public Group withId(final Integer id)
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
    
    public Group withObject(final String object)
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
    
    public Group withCreated(final String created)
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
    
    public Group withUpdated(final String updated)
    {
        this.updated = updated;
        return this;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(final String title)
    {
        this.title = title;
    }
    
    public Group withTitle(final String title)
    {
        this.title = title;
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
    
    public Group withName(final String name)
    {
        this.name = name;
        return this;
    }
    
    public String getAlias()
    {
        return alias;
    }
    
    public void setAlias(final String alias)
    {
        this.alias = alias;
    }
    
    public Group withAlias(final String alias)
    {
        this.alias = alias;
        return this;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public void setDesc(final String desc)
    {
        this.desc = desc;
    }
    
    public Group withDesc(final String desc)
    {
        this.desc = desc;
        return this;
    }
    
    public String getSubjectTag()
    {
        return subjectTag;
    }
    
    public void setSubjectTag(final String subjectTag)
    {
        this.subjectTag = subjectTag;
    }
    
    public Group withSubjectTag(final String subjectTag)
    {
        this.subjectTag = subjectTag;
        return this;
    }
    
    public String getFooter()
    {
        return footer;
    }
    
    public void setFooter(final String footer)
    {
        this.footer = footer;
    }
    
    public Group withFooter(final String footer)
    {
        this.footer = footer;
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
    
    public Group withWebsite(final String website)
    {
        this.website = website;
        return this;
    }
    
    public Boolean getAnnounce()
    {
        return announce;
    }
    
    public void setAnnounce(final Boolean announce)
    {
        this.announce = announce;
    }
    
    public Group withAnnounce(final Boolean announce)
    {
        this.announce = announce;
        return this;
    }
    
    public Boolean getModerated()
    {
        return moderated;
    }
    
    public void setModerated(final Boolean moderated)
    {
        this.moderated = moderated;
    }
    
    public Group withModerated(final Boolean moderated)
    {
        this.moderated = moderated;
        return this;
    }
    
    public Boolean getNewUsersModerated()
    {
        return newUsersModerated;
    }
    
    public void setNewUsersModerated(final Boolean newUsersModerated)
    {
        this.newUsersModerated = newUsersModerated;
    }
    
    public Group withNewUsersModerated(final Boolean newUsersModerated)
    {
        this.newUsersModerated = newUsersModerated;
        return this;
    }
    
    public Integer getUnmoderateUsersAfter()
    {
        return unmoderateUsersAfter;
    }
    
    public void setUnmoderateUsersAfter(final Integer unmoderateUsersAfter)
    {
        this.unmoderateUsersAfter = unmoderateUsersAfter;
    }
    
    public Group withUnmoderateUsersAfter(final Integer unmoderateUsersAfter)
    {
        this.unmoderateUsersAfter = unmoderateUsersAfter;
        return this;
    }
    
    public Boolean getRestricted()
    {
        return restricted;
    }
    
    public void setRestricted(final Boolean restricted)
    {
        this.restricted = restricted;
    }
    
    public Group withRestricted(final Boolean restricted)
    {
        this.restricted = restricted;
        return this;
    }
    
    public Boolean getAllowNonSubsToPost()
    {
        return allowNonSubsToPost;
    }
    
    public void setAllowNonSubsToPost(final Boolean allowNonSubsToPost)
    {
        this.allowNonSubsToPost = allowNonSubsToPost;
    }
    
    public Group withAllowNonSubsToPost(final Boolean allowNonSubsToPost)
    {
        this.allowNonSubsToPost = allowNonSubsToPost;
        return this;
    }
    
    public Boolean getForceHtmlEmails()
    {
        return forceHtmlEmails;
    }
    
    public void setForceHtmlEmails(final Boolean forceHtmlEmails)
    {
        this.forceHtmlEmails = forceHtmlEmails;
    }
    
    public Group withForceHtmlEmails(final Boolean forceHtmlEmails)
    {
        this.forceHtmlEmails = forceHtmlEmails;
        return this;
    }
    
    public Boolean getNormalizeHtmlEmails()
    {
        return normalizeHtmlEmails;
    }
    
    public void setNormalizeHtmlEmails(final Boolean normalizeHtmlEmails)
    {
        this.normalizeHtmlEmails = normalizeHtmlEmails;
    }
    
    public Group withNormalizeHtmlEmails(final Boolean normalizeHtmlEmails)
    {
        this.normalizeHtmlEmails = normalizeHtmlEmails;
        return this;
    }
    
    public String getReplyTo()
    {
        return replyTo;
    }
    
    public void setReplyTo(final String replyTo)
    {
        this.replyTo = replyTo;
    }
    
    public Group withReplyTo(final String replyTo)
    {
        this.replyTo = replyTo;
        return this;
    }
    
    public Boolean getRemoveOtherReplyOptions()
    {
        return removeOtherReplyOptions;
    }
    
    public void setRemoveOtherReplyOptions(final Boolean removeOtherReplyOptions)
    {
        this.removeOtherReplyOptions = removeOtherReplyOptions;
    }
    
    public Group withRemoveOtherReplyOptions(final Boolean removeOtherReplyOptions)
    {
        this.removeOtherReplyOptions = removeOtherReplyOptions;
        return this;
    }
    
    public String getPrivacy()
    {
        return privacy;
    }
    
    public void setPrivacy(final String privacy)
    {
        this.privacy = privacy;
    }
    
    public Group withPrivacy(final String privacy)
    {
        this.privacy = privacy;
        return this;
    }
    
    public String getMembersVisible()
    {
        return membersVisible;
    }
    
    public void setMembersVisible(final String membersVisible)
    {
        this.membersVisible = membersVisible;
    }
    
    public Group withMembersVisible(final String membersVisible)
    {
        this.membersVisible = membersVisible;
        return this;
    }
    
    public String getSubgroupAccess()
    {
        return subgroupAccess;
    }
    
    public void setSubgroupAccess(final String subgroupAccess)
    {
        this.subgroupAccess = subgroupAccess;
    }
    
    public Group withSubgroupAccess(final String subgroupAccess)
    {
        this.subgroupAccess = subgroupAccess;
        return this;
    }
    
    public String getCalendarAccess()
    {
        return calendarAccess;
    }
    
    public void setCalendarAccess(final String calendarAccess)
    {
        this.calendarAccess = calendarAccess;
    }
    
    public Group withCalendarAccess(final String calendarAccess)
    {
        this.calendarAccess = calendarAccess;
        return this;
    }
    
    public String getFilesAccess()
    {
        return filesAccess;
    }
    
    public void setFilesAccess(final String filesAccess)
    {
        this.filesAccess = filesAccess;
    }
    
    public Group withFilesAccess(final String filesAccess)
    {
        this.filesAccess = filesAccess;
        return this;
    }
    
    public String getDatabaseAccess()
    {
        return databaseAccess;
    }
    
    public void setDatabaseAccess(final String databaseAccess)
    {
        this.databaseAccess = databaseAccess;
    }
    
    public Group withDatabaseAccess(final String databaseAccess)
    {
        this.databaseAccess = databaseAccess;
        return this;
    }
    
    public String getWikiAccess()
    {
        return wikiAccess;
    }
    
    public void setWikiAccess(final String wikiAccess)
    {
        this.wikiAccess = wikiAccess;
    }
    
    public Group withWikiAccess(final String wikiAccess)
    {
        this.wikiAccess = wikiAccess;
        return this;
    }
    
    public String getPhotosAccess()
    {
        return photosAccess;
    }
    
    public void setPhotosAccess(final String photosAccess)
    {
        this.photosAccess = photosAccess;
    }
    
    public Group withPhotosAccess(final String photosAccess)
    {
        this.photosAccess = photosAccess;
        return this;
    }
    
    public String getMemberDirectoryAccess()
    {
        return memberDirectoryAccess;
    }
    
    public void setMemberDirectoryAccess(final String memberDirectoryAccess)
    {
        this.memberDirectoryAccess = memberDirectoryAccess;
    }
    
    public Group withMemberDirectoryAccess(final String memberDirectoryAccess)
    {
        this.memberDirectoryAccess = memberDirectoryAccess;
        return this;
    }
    
    public String getPollsAccess()
    {
        return pollsAccess;
    }
    
    public void setPollsAccess(final String pollsAccess)
    {
        this.pollsAccess = pollsAccess;
    }
    
    public Group withPollsAccess(final String pollsAccess)
    {
        this.pollsAccess = pollsAccess;
        return this;
    }
    
    public String getChatAccess()
    {
        return chatAccess;
    }
    
    public void setChatAccess(final String chatAccess)
    {
        this.chatAccess = chatAccess;
    }
    
    public Group withChatAccess(final String chatAccess)
    {
        this.chatAccess = chatAccess;
        return this;
    }
    
    public String getHandleAttachments()
    {
        return handleAttachments;
    }
    
    public void setHandleAttachments(final String handleAttachments)
    {
        this.handleAttachments = handleAttachments;
    }
    
    public Group withHandleAttachments(final String handleAttachments)
    {
        this.handleAttachments = handleAttachments;
        return this;
    }
    
    public Boolean getPlainTextOnly()
    {
        return plainTextOnly;
    }
    
    public void setPlainTextOnly(final Boolean plainTextOnly)
    {
        this.plainTextOnly = plainTextOnly;
    }
    
    public Group withPlainTextOnly(final Boolean plainTextOnly)
    {
        this.plainTextOnly = plainTextOnly;
        return this;
    }
    
    public String getMaxPhotoSizeEmail()
    {
        return maxPhotoSizeEmail;
    }
    
    public void setMaxPhotoSizeEmail(final String maxPhotoSizeEmail)
    {
        this.maxPhotoSizeEmail = maxPhotoSizeEmail;
    }
    
    public Group withMaxPhotoSizeEmail(final String maxPhotoSizeEmail)
    {
        this.maxPhotoSizeEmail = maxPhotoSizeEmail;
        return this;
    }
    
    public String getMaxPhotoSizePhotos()
    {
        return maxPhotoSizePhotos;
    }
    
    public void setMaxPhotoSizePhotos(final String maxPhotoSizePhotos)
    {
        this.maxPhotoSizePhotos = maxPhotoSizePhotos;
    }
    
    public Group withMaxPhotoSizePhotos(final String maxPhotoSizePhotos)
    {
        this.maxPhotoSizePhotos = maxPhotoSizePhotos;
        return this;
    }
    
    public String getMaxPhotoSizeDatabases()
    {
        return maxPhotoSizeDatabases;
    }
    
    public void setMaxPhotoSizeDatabases(final String maxPhotoSizeDatabases)
    {
        this.maxPhotoSizeDatabases = maxPhotoSizeDatabases;
    }
    
    public Group withMaxPhotoSizeDatabases(final String maxPhotoSizeDatabases)
    {
        this.maxPhotoSizeDatabases = maxPhotoSizeDatabases;
        return this;
    }
    
    public String getMaxPhotoSizeWikiImages()
    {
        return maxPhotoSizeWikiImages;
    }
    
    public void setMaxPhotoSizeWikiImages(final String maxPhotoSizeWikiImages)
    {
        this.maxPhotoSizeWikiImages = maxPhotoSizeWikiImages;
    }
    
    public Group withMaxPhotoSizeWikiImages(final String maxPhotoSizeWikiImages)
    {
        this.maxPhotoSizeWikiImages = maxPhotoSizeWikiImages;
        return this;
    }
    
    public Boolean getHashTagsRequired()
    {
        return hashTagsRequired;
    }
    
    public void setHashTagsRequired(final Boolean hashTagsRequired)
    {
        this.hashTagsRequired = hashTagsRequired;
    }
    
    public Group withHashTagsRequired(final Boolean hashTagsRequired)
    {
        this.hashTagsRequired = hashTagsRequired;
        return this;
    }
    
    public Boolean getRestrictCreateHashTags()
    {
        return restrictCreateHashTags;
    }
    
    public void setRestrictCreateHashTags(final Boolean restrictCreateHashTags)
    {
        this.restrictCreateHashTags = restrictCreateHashTags;
    }
    
    public Group withRestrictCreateHashTags(final Boolean restrictCreateHashTags)
    {
        this.restrictCreateHashTags = restrictCreateHashTags;
        return this;
    }
    
    public Boolean getBounceAttachments()
    {
        return bounceAttachments;
    }
    
    public void setBounceAttachments(final Boolean bounceAttachments)
    {
        this.bounceAttachments = bounceAttachments;
    }
    
    public Group withBounceAttachments(final Boolean bounceAttachments)
    {
        this.bounceAttachments = bounceAttachments;
        return this;
    }
    
    public Boolean getAllowPhotosInFiles()
    {
        return allowPhotosInFiles;
    }
    
    public void setAllowPhotosInFiles(final Boolean allowPhotosInFiles)
    {
        this.allowPhotosInFiles = allowPhotosInFiles;
    }
    
    public Group withAllowPhotosInFiles(final Boolean allowPhotosInFiles)
    {
        this.allowPhotosInFiles = allowPhotosInFiles;
        return this;
    }
    
    public String getEmailDeliveryDefault()
    {
        return emailDeliveryDefault;
    }
    
    public void setEmailDeliveryDefault(final String emailDeliveryDefault)
    {
        this.emailDeliveryDefault = emailDeliveryDefault;
    }
    
    public Group withEmailDeliveryDefault(final String emailDeliveryDefault)
    {
        this.emailDeliveryDefault = emailDeliveryDefault;
        return this;
    }
    
    public String getMessageSelectionDefault()
    {
        return messageSelectionDefault;
    }
    
    public void setMessageSelectionDefault(final String messageSelectionDefault)
    {
        this.messageSelectionDefault = messageSelectionDefault;
    }
    
    public Group withMessageSelectionDefault(final String messageSelectionDefault)
    {
        this.messageSelectionDefault = messageSelectionDefault;
        return this;
    }
    
    public Boolean getAutoFollowRepliesDefault()
    {
        return autoFollowRepliesDefault;
    }
    
    public void setAutoFollowRepliesDefault(final Boolean autoFollowRepliesDefault)
    {
        this.autoFollowRepliesDefault = autoFollowRepliesDefault;
    }
    
    public Group withAutoFollowRepliesDefault(final Boolean autoFollowRepliesDefault)
    {
        this.autoFollowRepliesDefault = autoFollowRepliesDefault;
        return this;
    }
    
    public String getMaxAttachmentSizeDefault()
    {
        return maxAttachmentSizeDefault;
    }
    
    public void setMaxAttachmentSizeDefault(final String maxAttachmentSizeDefault)
    {
        this.maxAttachmentSizeDefault = maxAttachmentSizeDefault;
    }
    
    public Group withMaxAttachmentSizeDefault(final String maxAttachmentSizeDefault)
    {
        this.maxAttachmentSizeDefault = maxAttachmentSizeDefault;
        return this;
    }
    
    public Boolean getDisableEdits()
    {
        return disableEdits;
    }
    
    public void setDisableEdits(final Boolean disableEdits)
    {
        this.disableEdits = disableEdits;
    }
    
    public Group withDisableEdits(final Boolean disableEdits)
    {
        this.disableEdits = disableEdits;
        return this;
    }
    
    public Boolean getDisableNoEmail()
    {
        return disableNoEmail;
    }
    
    public void setDisableNoEmail(final Boolean disableNoEmail)
    {
        this.disableNoEmail = disableNoEmail;
    }
    
    public Group withDisableNoEmail(final Boolean disableNoEmail)
    {
        this.disableNoEmail = disableNoEmail;
        return this;
    }
    
    public Boolean getAutoCloseThreads()
    {
        return autoCloseThreads;
    }
    
    public void setAutoCloseThreads(final Boolean autoCloseThreads)
    {
        this.autoCloseThreads = autoCloseThreads;
    }
    
    public Group withAutoCloseThreads(final Boolean autoCloseThreads)
    {
        this.autoCloseThreads = autoCloseThreads;
        return this;
    }
    
    public Integer getCloseThreadsAfter()
    {
        return closeThreadsAfter;
    }
    
    public void setCloseThreadsAfter(final Integer closeThreadsAfter)
    {
        this.closeThreadsAfter = closeThreadsAfter;
    }
    
    public Group withCloseThreadsAfter(final Integer closeThreadsAfter)
    {
        this.closeThreadsAfter = closeThreadsAfter;
        return this;
    }
    
    public Boolean getAutoModerateThreads()
    {
        return autoModerateThreads;
    }
    
    public void setAutoModerateThreads(final Boolean autoModerateThreads)
    {
        this.autoModerateThreads = autoModerateThreads;
    }
    
    public Group withAutoModerateThreads(final Boolean autoModerateThreads)
    {
        this.autoModerateThreads = autoModerateThreads;
        return this;
    }
    
    public Integer getModerateThreadsAfter()
    {
        return moderateThreadsAfter;
    }
    
    public void setModerateThreadsAfter(final Integer moderateThreadsAfter)
    {
        this.moderateThreadsAfter = moderateThreadsAfter;
    }
    
    public Group withModerateThreadsAfter(final Integer moderateThreadsAfter)
    {
        this.moderateThreadsAfter = moderateThreadsAfter;
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
        return new HashCodeBuilder().append(id).append(object).append(created).append(updated).append(title).append(name).append(alias)
                .append(desc).append(subjectTag).append(footer).append(website).append(announce).append(moderated).append(newUsersModerated)
                .append(unmoderateUsersAfter).append(restricted).append(allowNonSubsToPost).append(forceHtmlEmails)
                .append(normalizeHtmlEmails).append(replyTo).append(removeOtherReplyOptions).append(privacy).append(membersVisible)
                .append(subgroupAccess).append(calendarAccess).append(filesAccess).append(databaseAccess).append(wikiAccess)
                .append(photosAccess).append(memberDirectoryAccess).append(pollsAccess).append(chatAccess).append(handleAttachments)
                .append(plainTextOnly).append(maxPhotoSizeEmail).append(maxPhotoSizePhotos).append(maxPhotoSizeDatabases)
                .append(maxPhotoSizeWikiImages).append(hashTagsRequired).append(restrictCreateHashTags).append(bounceAttachments)
                .append(allowPhotosInFiles).append(emailDeliveryDefault).append(messageSelectionDefault).append(autoFollowRepliesDefault)
                .append(maxAttachmentSizeDefault).append(disableEdits).append(disableNoEmail).append(autoCloseThreads)
                .append(closeThreadsAfter).append(autoModerateThreads).append(moderateThreadsAfter).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Group) == false)
        {
            return false;
        }
        final Group rhs = ((Group) other);
        return new EqualsBuilder().append(id, rhs.id).append(object, rhs.object).append(created, rhs.created).append(updated, rhs.updated)
                .append(title, rhs.title).append(name, rhs.name).append(alias, rhs.alias).append(desc, rhs.desc)
                .append(subjectTag, rhs.subjectTag).append(footer, rhs.footer).append(website, rhs.website).append(announce, rhs.announce)
                .append(moderated, rhs.moderated).append(newUsersModerated, rhs.newUsersModerated)
                .append(unmoderateUsersAfter, rhs.unmoderateUsersAfter).append(restricted, rhs.restricted)
                .append(allowNonSubsToPost, rhs.allowNonSubsToPost).append(forceHtmlEmails, rhs.forceHtmlEmails)
                .append(normalizeHtmlEmails, rhs.normalizeHtmlEmails).append(replyTo, rhs.replyTo)
                .append(removeOtherReplyOptions, rhs.removeOtherReplyOptions).append(privacy, rhs.privacy)
                .append(membersVisible, rhs.membersVisible).append(subgroupAccess, rhs.subgroupAccess)
                .append(calendarAccess, rhs.calendarAccess).append(filesAccess, rhs.filesAccess).append(databaseAccess, rhs.databaseAccess)
                .append(wikiAccess, rhs.wikiAccess).append(photosAccess, rhs.photosAccess)
                .append(memberDirectoryAccess, rhs.memberDirectoryAccess).append(pollsAccess, rhs.pollsAccess)
                .append(chatAccess, rhs.chatAccess).append(handleAttachments, rhs.handleAttachments)
                .append(plainTextOnly, rhs.plainTextOnly).append(maxPhotoSizeEmail, rhs.maxPhotoSizeEmail)
                .append(maxPhotoSizePhotos, rhs.maxPhotoSizePhotos).append(maxPhotoSizeDatabases, rhs.maxPhotoSizeDatabases)
                .append(maxPhotoSizeWikiImages, rhs.maxPhotoSizeWikiImages).append(hashTagsRequired, rhs.hashTagsRequired)
                .append(restrictCreateHashTags, rhs.restrictCreateHashTags).append(bounceAttachments, rhs.bounceAttachments)
                .append(allowPhotosInFiles, rhs.allowPhotosInFiles).append(emailDeliveryDefault, rhs.emailDeliveryDefault)
                .append(messageSelectionDefault, rhs.messageSelectionDefault).append(autoFollowRepliesDefault, rhs.autoFollowRepliesDefault)
                .append(maxAttachmentSizeDefault, rhs.maxAttachmentSizeDefault).append(disableEdits, rhs.disableEdits)
                .append(disableNoEmail, rhs.disableNoEmail).append(autoCloseThreads, rhs.autoCloseThreads)
                .append(closeThreadsAfter, rhs.closeThreadsAfter).append(autoModerateThreads, rhs.autoModerateThreads)
                .append(moderateThreadsAfter, rhs.moderateThreadsAfter).isEquals();
    }
    
}