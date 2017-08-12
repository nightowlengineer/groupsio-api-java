package com.github.lake54.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User
{
    private Integer id;
    private String object;
    private String created;
    private String updated;
    private String email;
    private String fullName;
    private String userName;
    private String timezone;
    private String status;
    private String profilePhotoId;
    private Boolean hasProfilePhoto;
    private String postPref;
    private String prePagePref;
    private Boolean allowFacebookLogin;
    private Boolean allowGoogleLogin;
    private Boolean twoFactorEnabled;
    private String recoveryCodes;
    private Boolean dontMungeMessageId;
    private String aboutMe;
    private String aboutFormat;
    private String location;
    private String website;
    private String timePref;
    private String profilePrivacy;
    private String defaultMessageView;
    private String topicsSortDir;
    private String topicSortDir;
    private String messagesSortDir;
    private String expandedMessagesSortDir;
    private String searchSort;
    private String searchSortDir;
    
    /**
     * No args constructor for use in serialization
     */
    public User()
    {
    }
    
    /**
     * @param profilePrivacy
     * @param location
     * @param searchSort
     * @param topicsSortDir
     * @param object
     * @param allowGoogleLogin
     * @param aboutMe
     * @param defaultMessageView
     * @param id
     * @param recoveryCodes
     * @param messagesSortDir
     * @param profilePhotoId
     * @param timezone
     * @param allowFacebookLogin
     * @param updated
     * @param created
     * @param userName
     * @param aboutFormat
     * @param searchSortDir
     * @param postPref
     * @param status
     * @param website
     * @param timePref
     * @param topicSortDir
     * @param email
     * @param hasProfilePhoto
     * @param expandedMessagesSortDir
     * @param fullName
     * @param dontMungeMessageId
     * @param twoFactorEnabled
     * @param prePagePref
     */
    public User(final Integer id, final String object, final String created, final String updated, final String email,
            final String fullName, final String userName, final String timezone, final String status, final String profilePhotoId,
            final Boolean hasProfilePhoto, final String postPref, final String prePagePref, final Boolean allowFacebookLogin,
            final Boolean allowGoogleLogin, final Boolean twoFactorEnabled, final String recoveryCodes, final Boolean dontMungeMessageId,
            final String aboutMe, final String aboutFormat, final String location, final String website, final String timePref,
            final String profilePrivacy, final String defaultMessageView, final String topicsSortDir, final String topicSortDir,
            final String messagesSortDir, final String expandedMessagesSortDir, final String searchSort, final String searchSortDir)
    {
        super();
        this.id = id;
        this.object = object;
        this.created = created;
        this.updated = updated;
        this.email = email;
        this.fullName = fullName;
        this.userName = userName;
        this.timezone = timezone;
        this.status = status;
        this.profilePhotoId = profilePhotoId;
        this.hasProfilePhoto = hasProfilePhoto;
        this.postPref = postPref;
        this.prePagePref = prePagePref;
        this.allowFacebookLogin = allowFacebookLogin;
        this.allowGoogleLogin = allowGoogleLogin;
        this.twoFactorEnabled = twoFactorEnabled;
        this.recoveryCodes = recoveryCodes;
        this.dontMungeMessageId = dontMungeMessageId;
        this.aboutMe = aboutMe;
        this.aboutFormat = aboutFormat;
        this.location = location;
        this.website = website;
        this.timePref = timePref;
        this.profilePrivacy = profilePrivacy;
        this.defaultMessageView = defaultMessageView;
        this.topicsSortDir = topicsSortDir;
        this.topicSortDir = topicSortDir;
        this.messagesSortDir = messagesSortDir;
        this.expandedMessagesSortDir = expandedMessagesSortDir;
        this.searchSort = searchSort;
        this.searchSortDir = searchSortDir;
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(final Integer id)
    {
        this.id = id;
    }
    
    public User withId(final Integer id)
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
    
    public User withObject(final String object)
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
    
    public User withCreated(final String created)
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
    
    public User withUpdated(final String updated)
    {
        this.updated = updated;
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
    
    public User withEmail(final String email)
    {
        this.email = email;
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
    
    public User withFullName(final String fullName)
    {
        this.fullName = fullName;
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
    
    public User withUserName(final String userName)
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
    
    public User withTimezone(final String timezone)
    {
        this.timezone = timezone;
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
    
    public User withStatus(final String status)
    {
        this.status = status;
        return this;
    }
    
    public String getProfilePhotoId()
    {
        return profilePhotoId;
    }
    
    public void setProfilePhotoId(final String profilePhotoId)
    {
        this.profilePhotoId = profilePhotoId;
    }
    
    public User withProfilePhotoId(final String profilePhotoId)
    {
        this.profilePhotoId = profilePhotoId;
        return this;
    }
    
    public Boolean getHasProfilePhoto()
    {
        return hasProfilePhoto;
    }
    
    public void setHasProfilePhoto(final Boolean hasProfilePhoto)
    {
        this.hasProfilePhoto = hasProfilePhoto;
    }
    
    public User withHasProfilePhoto(final Boolean hasProfilePhoto)
    {
        this.hasProfilePhoto = hasProfilePhoto;
        return this;
    }
    
    public String getPostPref()
    {
        return postPref;
    }
    
    public void setPostPref(final String postPref)
    {
        this.postPref = postPref;
    }
    
    public User withPostPref(final String postPref)
    {
        this.postPref = postPref;
        return this;
    }
    
    public String getPrePagePref()
    {
        return prePagePref;
    }
    
    public void setPrePagePref(final String prePagePref)
    {
        this.prePagePref = prePagePref;
    }
    
    public User withPrePagePref(final String prePagePref)
    {
        this.prePagePref = prePagePref;
        return this;
    }
    
    public Boolean getAllowFacebookLogin()
    {
        return allowFacebookLogin;
    }
    
    public void setAllowFacebookLogin(final Boolean allowFacebookLogin)
    {
        this.allowFacebookLogin = allowFacebookLogin;
    }
    
    public User withAllowFacebookLogin(final Boolean allowFacebookLogin)
    {
        this.allowFacebookLogin = allowFacebookLogin;
        return this;
    }
    
    public Boolean getAllowGoogleLogin()
    {
        return allowGoogleLogin;
    }
    
    public void setAllowGoogleLogin(final Boolean allowGoogleLogin)
    {
        this.allowGoogleLogin = allowGoogleLogin;
    }
    
    public User withAllowGoogleLogin(final Boolean allowGoogleLogin)
    {
        this.allowGoogleLogin = allowGoogleLogin;
        return this;
    }
    
    public Boolean getTwoFactorEnabled()
    {
        return twoFactorEnabled;
    }
    
    public void setTwoFactorEnabled(final Boolean twoFactorEnabled)
    {
        this.twoFactorEnabled = twoFactorEnabled;
    }
    
    public User withTwoFactorEnabled(final Boolean twoFactorEnabled)
    {
        this.twoFactorEnabled = twoFactorEnabled;
        return this;
    }
    
    public String getRecoveryCodes()
    {
        return recoveryCodes;
    }
    
    public void setRecoveryCodes(final String recoveryCodes)
    {
        this.recoveryCodes = recoveryCodes;
    }
    
    public User withRecoveryCodes(final String recoveryCodes)
    {
        this.recoveryCodes = recoveryCodes;
        return this;
    }
    
    public Boolean getDontMungeMessageId()
    {
        return dontMungeMessageId;
    }
    
    public void setDontMungeMessageId(final Boolean dontMungeMessageId)
    {
        this.dontMungeMessageId = dontMungeMessageId;
    }
    
    public User withDontMungeMessageId(final Boolean dontMungeMessageId)
    {
        this.dontMungeMessageId = dontMungeMessageId;
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
    
    public User withAboutMe(final String aboutMe)
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
    
    public User withAboutFormat(final String aboutFormat)
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
    
    public User withLocation(final String location)
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
    
    public User withWebsite(final String website)
    {
        this.website = website;
        return this;
    }
    
    public String getTimePref()
    {
        return timePref;
    }
    
    public void setTimePref(final String timePref)
    {
        this.timePref = timePref;
    }
    
    public User withTimePref(final String timePref)
    {
        this.timePref = timePref;
        return this;
    }
    
    public String getProfilePrivacy()
    {
        return profilePrivacy;
    }
    
    public void setProfilePrivacy(final String profilePrivacy)
    {
        this.profilePrivacy = profilePrivacy;
    }
    
    public User withProfilePrivacy(final String profilePrivacy)
    {
        this.profilePrivacy = profilePrivacy;
        return this;
    }
    
    public String getDefaultMessageView()
    {
        return defaultMessageView;
    }
    
    public void setDefaultMessageView(final String defaultMessageView)
    {
        this.defaultMessageView = defaultMessageView;
    }
    
    public User withDefaultMessageView(final String defaultMessageView)
    {
        this.defaultMessageView = defaultMessageView;
        return this;
    }
    
    public String getTopicsSortDir()
    {
        return topicsSortDir;
    }
    
    public void setTopicsSortDir(final String topicsSortDir)
    {
        this.topicsSortDir = topicsSortDir;
    }
    
    public User withTopicsSortDir(final String topicsSortDir)
    {
        this.topicsSortDir = topicsSortDir;
        return this;
    }
    
    public String getTopicSortDir()
    {
        return topicSortDir;
    }
    
    public void setTopicSortDir(final String topicSortDir)
    {
        this.topicSortDir = topicSortDir;
    }
    
    public User withTopicSortDir(final String topicSortDir)
    {
        this.topicSortDir = topicSortDir;
        return this;
    }
    
    public String getMessagesSortDir()
    {
        return messagesSortDir;
    }
    
    public void setMessagesSortDir(final String messagesSortDir)
    {
        this.messagesSortDir = messagesSortDir;
    }
    
    public User withMessagesSortDir(final String messagesSortDir)
    {
        this.messagesSortDir = messagesSortDir;
        return this;
    }
    
    public String getExpandedMessagesSortDir()
    {
        return expandedMessagesSortDir;
    }
    
    public void setExpandedMessagesSortDir(final String expandedMessagesSortDir)
    {
        this.expandedMessagesSortDir = expandedMessagesSortDir;
    }
    
    public User withExpandedMessagesSortDir(final String expandedMessagesSortDir)
    {
        this.expandedMessagesSortDir = expandedMessagesSortDir;
        return this;
    }
    
    public String getSearchSort()
    {
        return searchSort;
    }
    
    public void setSearchSort(final String searchSort)
    {
        this.searchSort = searchSort;
    }
    
    public User withSearchSort(final String searchSort)
    {
        this.searchSort = searchSort;
        return this;
    }
    
    public String getSearchSortDir()
    {
        return searchSortDir;
    }
    
    public void setSearchSortDir(final String searchSortDir)
    {
        this.searchSortDir = searchSortDir;
    }
    
    public User withSearchSortDir(final String searchSortDir)
    {
        this.searchSortDir = searchSortDir;
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
        return new HashCodeBuilder().append(id).append(object).append(created).append(updated).append(email).append(fullName)
                .append(userName).append(timezone).append(status).append(profilePhotoId).append(hasProfilePhoto).append(postPref)
                .append(prePagePref).append(allowFacebookLogin).append(allowGoogleLogin).append(twoFactorEnabled).append(recoveryCodes)
                .append(dontMungeMessageId).append(aboutMe).append(aboutFormat).append(location).append(website).append(timePref)
                .append(profilePrivacy).append(defaultMessageView).append(topicsSortDir).append(topicSortDir).append(messagesSortDir)
                .append(expandedMessagesSortDir).append(searchSort).append(searchSortDir).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof User) == false)
        {
            return false;
        }
        final User rhs = ((User) other);
        return new EqualsBuilder().append(id, rhs.id).append(object, rhs.object).append(created, rhs.created).append(updated, rhs.updated)
                .append(email, rhs.email).append(fullName, rhs.fullName).append(userName, rhs.userName).append(timezone, rhs.timezone)
                .append(status, rhs.status).append(profilePhotoId, rhs.profilePhotoId).append(hasProfilePhoto, rhs.hasProfilePhoto)
                .append(postPref, rhs.postPref).append(prePagePref, rhs.prePagePref).append(allowFacebookLogin, rhs.allowFacebookLogin)
                .append(allowGoogleLogin, rhs.allowGoogleLogin).append(twoFactorEnabled, rhs.twoFactorEnabled)
                .append(recoveryCodes, rhs.recoveryCodes).append(dontMungeMessageId, rhs.dontMungeMessageId).append(aboutMe, rhs.aboutMe)
                .append(aboutFormat, rhs.aboutFormat).append(location, rhs.location).append(website, rhs.website)
                .append(timePref, rhs.timePref).append(profilePrivacy, rhs.profilePrivacy)
                .append(defaultMessageView, rhs.defaultMessageView).append(topicsSortDir, rhs.topicsSortDir)
                .append(topicSortDir, rhs.topicSortDir).append(messagesSortDir, rhs.messagesSortDir)
                .append(expandedMessagesSortDir, rhs.expandedMessagesSortDir).append(searchSort, rhs.searchSort)
                .append(searchSortDir, rhs.searchSortDir).isEquals();
    }
    
}