package com.github.lake54.groupsio.api.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Permissions
{
    
    private String object;
    private Boolean manageSubgroups;
    private Boolean deleteGroup;
    private Boolean viewArchives;
    private Boolean downloadMembers;
    private Boolean viewActivity;
    private Boolean manageHashtags;
    private Boolean manageIntegrations;
    private Boolean manageGroupSettings;
    private Boolean manageGroupBilling;
    private Boolean editArchives;
    private Boolean managePendingMessages;
    private Boolean inviteMembers;
    private Boolean viewDatabases;
    private Boolean canPost;
    private Boolean managePolls;
    private Boolean viewPhotos;
    private Boolean managePhotos;
    private Boolean manageMembers;
    private Boolean viewCalendar;
    private Boolean manageCalendar;
    private Boolean viewChats;
    private Boolean manageChats;
    private Boolean viewMemberDirectory;
    private Boolean viewFiles;
    private Boolean manageFiles;
    private Boolean viewMembers;
    private Boolean viewWiki;
    private Boolean manageWiki;
    private Boolean manageSubscription;
    
    /**
     * No args constructor for use in serialization
     */
    public Permissions()
    {
    }
    
    /**
     * @param manageFiles
     * @param managePolls
     * @param manageMembers
     * @param manageSubgroups
     * @param manageGroupBilling
     * @param object
     * @param manageIntegrations
     * @param canPost
     * @param manageHashtags
     * @param manageGroupSettings
     * @param viewArchives
     * @param deleteGroup
     * @param managePhotos
     * @param inviteMembers
     * @param managePendingMessages
     * @param manageChats
     * @param viewMemberDirectory
     * @param manageSubscription
     * @param viewFiles
     * @param viewActivity
     * @param viewWiki
     * @param viewPhotos
     * @param viewDatabases
     * @param manageCalendar
     * @param downloadMembers
     * @param manageWiki
     * @param editArchives
     * @param viewChats
     * @param viewMembers
     * @param viewCalendar
     */
    public Permissions(final String object, final Boolean manageSubgroups, final Boolean deleteGroup, final Boolean viewArchives,
            final Boolean downloadMembers, final Boolean viewActivity, final Boolean manageHashtags, final Boolean manageIntegrations,
            final Boolean manageGroupSettings, final Boolean manageGroupBilling, final Boolean editArchives,
            final Boolean managePendingMessages, final Boolean inviteMembers, final Boolean viewDatabases, final Boolean canPost,
            final Boolean managePolls, final Boolean viewPhotos, final Boolean managePhotos, final Boolean manageMembers,
            final Boolean viewCalendar, final Boolean manageCalendar, final Boolean viewChats, final Boolean manageChats,
            final Boolean viewMemberDirectory, final Boolean viewFiles, final Boolean manageFiles, final Boolean viewMembers,
            final Boolean viewWiki, final Boolean manageWiki, final Boolean manageSubscription)
    {
        super();
        this.object = object;
        this.manageSubgroups = manageSubgroups;
        this.deleteGroup = deleteGroup;
        this.viewArchives = viewArchives;
        this.downloadMembers = downloadMembers;
        this.viewActivity = viewActivity;
        this.manageHashtags = manageHashtags;
        this.manageIntegrations = manageIntegrations;
        this.manageGroupSettings = manageGroupSettings;
        this.manageGroupBilling = manageGroupBilling;
        this.editArchives = editArchives;
        this.managePendingMessages = managePendingMessages;
        this.inviteMembers = inviteMembers;
        this.viewDatabases = viewDatabases;
        this.canPost = canPost;
        this.managePolls = managePolls;
        this.viewPhotos = viewPhotos;
        this.managePhotos = managePhotos;
        this.manageMembers = manageMembers;
        this.viewCalendar = viewCalendar;
        this.manageCalendar = manageCalendar;
        this.viewChats = viewChats;
        this.manageChats = manageChats;
        this.viewMemberDirectory = viewMemberDirectory;
        this.viewFiles = viewFiles;
        this.manageFiles = manageFiles;
        this.viewMembers = viewMembers;
        this.viewWiki = viewWiki;
        this.manageWiki = manageWiki;
        this.manageSubscription = manageSubscription;
    }
    
    public String getObject()
    {
        return object;
    }
    
    public void setObject(final String object)
    {
        this.object = object;
    }
    
    public Permissions withObject(final String object)
    {
        this.object = object;
        return this;
    }
    
    public Boolean getManageSubgroups()
    {
        return manageSubgroups;
    }
    
    public void setManageSubgroups(final Boolean manageSubgroups)
    {
        this.manageSubgroups = manageSubgroups;
    }
    
    public Permissions withManageSubgroups(final Boolean manageSubgroups)
    {
        this.manageSubgroups = manageSubgroups;
        return this;
    }
    
    public Boolean getDeleteGroup()
    {
        return deleteGroup;
    }
    
    public void setDeleteGroup(final Boolean deleteGroup)
    {
        this.deleteGroup = deleteGroup;
    }
    
    public Permissions withDeleteGroup(final Boolean deleteGroup)
    {
        this.deleteGroup = deleteGroup;
        return this;
    }
    
    public Boolean getViewArchives()
    {
        return viewArchives;
    }
    
    public void setViewArchives(final Boolean viewArchives)
    {
        this.viewArchives = viewArchives;
    }
    
    public Permissions withViewArchives(final Boolean viewArchives)
    {
        this.viewArchives = viewArchives;
        return this;
    }
    
    public Boolean getDownloadMembers()
    {
        return downloadMembers;
    }
    
    public void setDownloadMembers(final Boolean downloadMembers)
    {
        this.downloadMembers = downloadMembers;
    }
    
    public Permissions withDownloadMembers(final Boolean downloadMembers)
    {
        this.downloadMembers = downloadMembers;
        return this;
    }
    
    public Boolean getViewActivity()
    {
        return viewActivity;
    }
    
    public void setViewActivity(final Boolean viewActivity)
    {
        this.viewActivity = viewActivity;
    }
    
    public Permissions withViewActivity(final Boolean viewActivity)
    {
        this.viewActivity = viewActivity;
        return this;
    }
    
    public Boolean getManageHashtags()
    {
        return manageHashtags;
    }
    
    public void setManageHashtags(final Boolean manageHashtags)
    {
        this.manageHashtags = manageHashtags;
    }
    
    public Permissions withManageHashtags(final Boolean manageHashtags)
    {
        this.manageHashtags = manageHashtags;
        return this;
    }
    
    public Boolean getManageIntegrations()
    {
        return manageIntegrations;
    }
    
    public void setManageIntegrations(final Boolean manageIntegrations)
    {
        this.manageIntegrations = manageIntegrations;
    }
    
    public Permissions withManageIntegrations(final Boolean manageIntegrations)
    {
        this.manageIntegrations = manageIntegrations;
        return this;
    }
    
    public Boolean getManageGroupSettings()
    {
        return manageGroupSettings;
    }
    
    public void setManageGroupSettings(final Boolean manageGroupSettings)
    {
        this.manageGroupSettings = manageGroupSettings;
    }
    
    public Permissions withManageGroupSettings(final Boolean manageGroupSettings)
    {
        this.manageGroupSettings = manageGroupSettings;
        return this;
    }
    
    public Boolean getManageGroupBilling()
    {
        return manageGroupBilling;
    }
    
    public void setManageGroupBilling(final Boolean manageGroupBilling)
    {
        this.manageGroupBilling = manageGroupBilling;
    }
    
    public Permissions withManageGroupBilling(final Boolean manageGroupBilling)
    {
        this.manageGroupBilling = manageGroupBilling;
        return this;
    }
    
    public Boolean getEditArchives()
    {
        return editArchives;
    }
    
    public void setEditArchives(final Boolean editArchives)
    {
        this.editArchives = editArchives;
    }
    
    public Permissions withEditArchives(final Boolean editArchives)
    {
        this.editArchives = editArchives;
        return this;
    }
    
    public Boolean getManagePendingMessages()
    {
        return managePendingMessages;
    }
    
    public void setManagePendingMessages(final Boolean managePendingMessages)
    {
        this.managePendingMessages = managePendingMessages;
    }
    
    public Permissions withManagePendingMessages(final Boolean managePendingMessages)
    {
        this.managePendingMessages = managePendingMessages;
        return this;
    }
    
    public Boolean getInviteMembers()
    {
        return inviteMembers;
    }
    
    public void setInviteMembers(final Boolean inviteMembers)
    {
        this.inviteMembers = inviteMembers;
    }
    
    public Permissions withInviteMembers(final Boolean inviteMembers)
    {
        this.inviteMembers = inviteMembers;
        return this;
    }
    
    public Boolean getViewDatabases()
    {
        return viewDatabases;
    }
    
    public void setViewDatabases(final Boolean viewDatabases)
    {
        this.viewDatabases = viewDatabases;
    }
    
    public Permissions withViewDatabases(final Boolean viewDatabases)
    {
        this.viewDatabases = viewDatabases;
        return this;
    }
    
    public Boolean getCanPost()
    {
        return canPost;
    }
    
    public void setCanPost(final Boolean canPost)
    {
        this.canPost = canPost;
    }
    
    public Permissions withCanPost(final Boolean canPost)
    {
        this.canPost = canPost;
        return this;
    }
    
    public Boolean getManagePolls()
    {
        return managePolls;
    }
    
    public void setManagePolls(final Boolean managePolls)
    {
        this.managePolls = managePolls;
    }
    
    public Permissions withManagePolls(final Boolean managePolls)
    {
        this.managePolls = managePolls;
        return this;
    }
    
    public Boolean getViewPhotos()
    {
        return viewPhotos;
    }
    
    public void setViewPhotos(final Boolean viewPhotos)
    {
        this.viewPhotos = viewPhotos;
    }
    
    public Permissions withViewPhotos(final Boolean viewPhotos)
    {
        this.viewPhotos = viewPhotos;
        return this;
    }
    
    public Boolean getManagePhotos()
    {
        return managePhotos;
    }
    
    public void setManagePhotos(final Boolean managePhotos)
    {
        this.managePhotos = managePhotos;
    }
    
    public Permissions withManagePhotos(final Boolean managePhotos)
    {
        this.managePhotos = managePhotos;
        return this;
    }
    
    public Boolean getManageMembers()
    {
        return manageMembers;
    }
    
    public void setManageMembers(final Boolean manageMembers)
    {
        this.manageMembers = manageMembers;
    }
    
    public Permissions withManageMembers(final Boolean manageMembers)
    {
        this.manageMembers = manageMembers;
        return this;
    }
    
    public Boolean getViewCalendar()
    {
        return viewCalendar;
    }
    
    public void setViewCalendar(final Boolean viewCalendar)
    {
        this.viewCalendar = viewCalendar;
    }
    
    public Permissions withViewCalendar(final Boolean viewCalendar)
    {
        this.viewCalendar = viewCalendar;
        return this;
    }
    
    public Boolean getManageCalendar()
    {
        return manageCalendar;
    }
    
    public void setManageCalendar(final Boolean manageCalendar)
    {
        this.manageCalendar = manageCalendar;
    }
    
    public Permissions withManageCalendar(final Boolean manageCalendar)
    {
        this.manageCalendar = manageCalendar;
        return this;
    }
    
    public Boolean getViewChats()
    {
        return viewChats;
    }
    
    public void setViewChats(final Boolean viewChats)
    {
        this.viewChats = viewChats;
    }
    
    public Permissions withViewChats(final Boolean viewChats)
    {
        this.viewChats = viewChats;
        return this;
    }
    
    public Boolean getManageChats()
    {
        return manageChats;
    }
    
    public void setManageChats(final Boolean manageChats)
    {
        this.manageChats = manageChats;
    }
    
    public Permissions withManageChats(final Boolean manageChats)
    {
        this.manageChats = manageChats;
        return this;
    }
    
    public Boolean getViewMemberDirectory()
    {
        return viewMemberDirectory;
    }
    
    public void setViewMemberDirectory(final Boolean viewMemberDirectory)
    {
        this.viewMemberDirectory = viewMemberDirectory;
    }
    
    public Permissions withViewMemberDirectory(final Boolean viewMemberDirectory)
    {
        this.viewMemberDirectory = viewMemberDirectory;
        return this;
    }
    
    public Boolean getViewFiles()
    {
        return viewFiles;
    }
    
    public void setViewFiles(final Boolean viewFiles)
    {
        this.viewFiles = viewFiles;
    }
    
    public Permissions withViewFiles(final Boolean viewFiles)
    {
        this.viewFiles = viewFiles;
        return this;
    }
    
    public Boolean getManageFiles()
    {
        return manageFiles;
    }
    
    public void setManageFiles(final Boolean manageFiles)
    {
        this.manageFiles = manageFiles;
    }
    
    public Permissions withManageFiles(final Boolean manageFiles)
    {
        this.manageFiles = manageFiles;
        return this;
    }
    
    public Boolean getViewMembers()
    {
        return viewMembers;
    }
    
    public void setViewMembers(final Boolean viewMembers)
    {
        this.viewMembers = viewMembers;
    }
    
    public Permissions withViewMembers(final Boolean viewMembers)
    {
        this.viewMembers = viewMembers;
        return this;
    }
    
    public Boolean getViewWiki()
    {
        return viewWiki;
    }
    
    public void setViewWiki(final Boolean viewWiki)
    {
        this.viewWiki = viewWiki;
    }
    
    public Permissions withViewWiki(final Boolean viewWiki)
    {
        this.viewWiki = viewWiki;
        return this;
    }
    
    public Boolean getManageWiki()
    {
        return manageWiki;
    }
    
    public void setManageWiki(final Boolean manageWiki)
    {
        this.manageWiki = manageWiki;
    }
    
    public Permissions withManageWiki(final Boolean manageWiki)
    {
        this.manageWiki = manageWiki;
        return this;
    }
    
    public Boolean getManageSubscription()
    {
        return manageSubscription;
    }
    
    public void setManageSubscription(final Boolean manageSubscription)
    {
        this.manageSubscription = manageSubscription;
    }
    
    public Permissions withManageSubscription(final Boolean manageSubscription)
    {
        this.manageSubscription = manageSubscription;
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
        return new HashCodeBuilder().append(object).append(manageSubgroups).append(deleteGroup).append(viewArchives).append(downloadMembers)
                .append(viewActivity).append(manageHashtags).append(manageIntegrations).append(manageGroupSettings)
                .append(manageGroupBilling).append(editArchives).append(managePendingMessages).append(inviteMembers).append(viewDatabases)
                .append(canPost).append(managePolls).append(viewPhotos).append(managePhotos).append(manageMembers).append(viewCalendar)
                .append(manageCalendar).append(viewChats).append(manageChats).append(viewMemberDirectory).append(viewFiles)
                .append(manageFiles).append(viewMembers).append(viewWiki).append(manageWiki).append(manageSubscription).toHashCode();
    }
    
    @Override
    public boolean equals(final Object other)
    {
        if (other == this)
        {
            return true;
        }
        if ((other instanceof Permissions) == false)
        {
            return false;
        }
        final Permissions rhs = ((Permissions) other);
        return new EqualsBuilder().append(object, rhs.object).append(manageSubgroups, rhs.manageSubgroups)
                .append(deleteGroup, rhs.deleteGroup).append(viewArchives, rhs.viewArchives).append(downloadMembers, rhs.downloadMembers)
                .append(viewActivity, rhs.viewActivity).append(manageHashtags, rhs.manageHashtags)
                .append(manageIntegrations, rhs.manageIntegrations).append(manageGroupSettings, rhs.manageGroupSettings)
                .append(manageGroupBilling, rhs.manageGroupBilling).append(editArchives, rhs.editArchives)
                .append(managePendingMessages, rhs.managePendingMessages).append(inviteMembers, rhs.inviteMembers)
                .append(viewDatabases, rhs.viewDatabases).append(canPost, rhs.canPost).append(managePolls, rhs.managePolls)
                .append(viewPhotos, rhs.viewPhotos).append(managePhotos, rhs.managePhotos).append(manageMembers, rhs.manageMembers)
                .append(viewCalendar, rhs.viewCalendar).append(manageCalendar, rhs.manageCalendar).append(viewChats, rhs.viewChats)
                .append(manageChats, rhs.manageChats).append(viewMemberDirectory, rhs.viewMemberDirectory).append(viewFiles, rhs.viewFiles)
                .append(manageFiles, rhs.manageFiles).append(viewMembers, rhs.viewMembers).append(viewWiki, rhs.viewWiki)
                .append(manageWiki, rhs.manageWiki).append(manageSubscription, rhs.manageSubscription).isEquals();
    }
    
}