// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.IdleSessionSignOut;
import com.microsoft.graph.models.ImageTaggingChoice;
import com.microsoft.graph.models.SharingCapabilities;
import com.microsoft.graph.models.SharingDomainRestrictionMode;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sharepoint Settings.
 */
public class SharepointSettings extends Entity implements IJsonBackedObject {


    /**
     * The Allowed Domain Guids For Sync App.
     * Collection of trusted domain GUIDs for the OneDrive sync app.
     */
    @SerializedName(value = "allowedDomainGuidsForSyncApp", alternate = {"AllowedDomainGuidsForSyncApp"})
    @Expose
	@Nullable
    public java.util.List<java.util.UUID> allowedDomainGuidsForSyncApp;

    /**
     * The Available Managed Paths For Site Creation.
     * Collection of managed paths available for site creation. Read-only.
     */
    @SerializedName(value = "availableManagedPathsForSiteCreation", alternate = {"AvailableManagedPathsForSiteCreation"})
    @Expose
	@Nullable
    public java.util.List<String> availableManagedPathsForSiteCreation;

    /**
     * The Deleted User Personal Site Retention Period In Days.
     * The number of days for preserving a deleted user's OneDrive.
     */
    @SerializedName(value = "deletedUserPersonalSiteRetentionPeriodInDays", alternate = {"DeletedUserPersonalSiteRetentionPeriodInDays"})
    @Expose
	@Nullable
    public Integer deletedUserPersonalSiteRetentionPeriodInDays;

    /**
     * The Excluded File Extensions For Sync App.
     * Collection of file extensions not uploaded by the OneDrive sync app.
     */
    @SerializedName(value = "excludedFileExtensionsForSyncApp", alternate = {"ExcludedFileExtensionsForSyncApp"})
    @Expose
	@Nullable
    public java.util.List<String> excludedFileExtensionsForSyncApp;

    /**
     * The Idle Session Sign Out.
     * Specifies the idle session sign-out policies for the tenant.
     */
    @SerializedName(value = "idleSessionSignOut", alternate = {"IdleSessionSignOut"})
    @Expose
	@Nullable
    public IdleSessionSignOut idleSessionSignOut;

    /**
     * The Image Tagging Option.
     * Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     */
    @SerializedName(value = "imageTaggingOption", alternate = {"ImageTaggingOption"})
    @Expose
	@Nullable
    public ImageTaggingChoice imageTaggingOption;

    /**
     * The Is Commenting On Site Pages Enabled.
     * Indicates whether comments are allowed on modern site pages in SharePoint.
     */
    @SerializedName(value = "isCommentingOnSitePagesEnabled", alternate = {"IsCommentingOnSitePagesEnabled"})
    @Expose
	@Nullable
    public Boolean isCommentingOnSitePagesEnabled;

    /**
     * The Is File Activity Notification Enabled.
     * Indicates whether push notifications are enabled for OneDrive events.
     */
    @SerializedName(value = "isFileActivityNotificationEnabled", alternate = {"IsFileActivityNotificationEnabled"})
    @Expose
	@Nullable
    public Boolean isFileActivityNotificationEnabled;

    /**
     * The Is Legacy Auth Protocols Enabled.
     * Indicates whether legacy authentication protocols are enabled for the tenant.
     */
    @SerializedName(value = "isLegacyAuthProtocolsEnabled", alternate = {"IsLegacyAuthProtocolsEnabled"})
    @Expose
	@Nullable
    public Boolean isLegacyAuthProtocolsEnabled;

    /**
     * The Is Loop Enabled.
     * Indicates whether if Fluid Framework is allowed on SharePoint sites.
     */
    @SerializedName(value = "isLoopEnabled", alternate = {"IsLoopEnabled"})
    @Expose
	@Nullable
    public Boolean isLoopEnabled;

    /**
     * The Is Mac Sync App Enabled.
     * Indicates whether files can be synced using the OneDrive sync app for Mac.
     */
    @SerializedName(value = "isMacSyncAppEnabled", alternate = {"IsMacSyncAppEnabled"})
    @Expose
	@Nullable
    public Boolean isMacSyncAppEnabled;

    /**
     * The Is Require Accepting User To Match Invited User Enabled.
     * Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     */
    @SerializedName(value = "isRequireAcceptingUserToMatchInvitedUserEnabled", alternate = {"IsRequireAcceptingUserToMatchInvitedUserEnabled"})
    @Expose
	@Nullable
    public Boolean isRequireAcceptingUserToMatchInvitedUserEnabled;

    /**
     * The Is Resharing By External Users Enabled.
     * Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     */
    @SerializedName(value = "isResharingByExternalUsersEnabled", alternate = {"IsResharingByExternalUsersEnabled"})
    @Expose
	@Nullable
    public Boolean isResharingByExternalUsersEnabled;

    /**
     * The Is Share Point Mobile Notification Enabled.
     * Indicates whether mobile push notifications are enabled for SharePoint.
     */
    @SerializedName(value = "isSharePointMobileNotificationEnabled", alternate = {"IsSharePointMobileNotificationEnabled"})
    @Expose
	@Nullable
    public Boolean isSharePointMobileNotificationEnabled;

    /**
     * The Is Share Point Newsfeed Enabled.
     * Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     */
    @SerializedName(value = "isSharePointNewsfeedEnabled", alternate = {"IsSharePointNewsfeedEnabled"})
    @Expose
	@Nullable
    public Boolean isSharePointNewsfeedEnabled;

    /**
     * The Is Site Creation Enabled.
     * Indicates whether users are allowed to create sites.
     */
    @SerializedName(value = "isSiteCreationEnabled", alternate = {"IsSiteCreationEnabled"})
    @Expose
	@Nullable
    public Boolean isSiteCreationEnabled;

    /**
     * The Is Site Creation UIEnabled.
     * Indicates whether the UI commands for creating sites are shown.
     */
    @SerializedName(value = "isSiteCreationUIEnabled", alternate = {"IsSiteCreationUIEnabled"})
    @Expose
	@Nullable
    public Boolean isSiteCreationUIEnabled;

    /**
     * The Is Site Pages Creation Enabled.
     * Indicates whether creating new modern pages is allowed on SharePoint sites.
     */
    @SerializedName(value = "isSitePagesCreationEnabled", alternate = {"IsSitePagesCreationEnabled"})
    @Expose
	@Nullable
    public Boolean isSitePagesCreationEnabled;

    /**
     * The Is Sites Storage Limit Automatic.
     * Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     */
    @SerializedName(value = "isSitesStorageLimitAutomatic", alternate = {"IsSitesStorageLimitAutomatic"})
    @Expose
	@Nullable
    public Boolean isSitesStorageLimitAutomatic;

    /**
     * The Is Sync Button Hidden On Personal Site.
     * Indicates whether the sync button in OneDrive is hidden.
     */
    @SerializedName(value = "isSyncButtonHiddenOnPersonalSite", alternate = {"IsSyncButtonHiddenOnPersonalSite"})
    @Expose
	@Nullable
    public Boolean isSyncButtonHiddenOnPersonalSite;

    /**
     * The Is Unmanaged Sync App For Tenant Restricted.
     * Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     */
    @SerializedName(value = "isUnmanagedSyncAppForTenantRestricted", alternate = {"IsUnmanagedSyncAppForTenantRestricted"})
    @Expose
	@Nullable
    public Boolean isUnmanagedSyncAppForTenantRestricted;

    /**
     * The Personal Site Default Storage Limit In MB.
     * The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     */
    @SerializedName(value = "personalSiteDefaultStorageLimitInMB", alternate = {"PersonalSiteDefaultStorageLimitInMB"})
    @Expose
	@Nullable
    public Long personalSiteDefaultStorageLimitInMB;

    /**
     * The Sharing Allowed Domain List.
     * Collection of email domains that are allowed for sharing outside the organization.
     */
    @SerializedName(value = "sharingAllowedDomainList", alternate = {"SharingAllowedDomainList"})
    @Expose
	@Nullable
    public java.util.List<String> sharingAllowedDomainList;

    /**
     * The Sharing Blocked Domain List.
     * Collection of email domains that are blocked for sharing outside the organization.
     */
    @SerializedName(value = "sharingBlockedDomainList", alternate = {"SharingBlockedDomainList"})
    @Expose
	@Nullable
    public java.util.List<String> sharingBlockedDomainList;

    /**
     * The Sharing Capability.
     * Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     */
    @SerializedName(value = "sharingCapability", alternate = {"SharingCapability"})
    @Expose
	@Nullable
    public SharingCapabilities sharingCapability;

    /**
     * The Sharing Domain Restriction Mode.
     * Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     */
    @SerializedName(value = "sharingDomainRestrictionMode", alternate = {"SharingDomainRestrictionMode"})
    @Expose
	@Nullable
    public SharingDomainRestrictionMode sharingDomainRestrictionMode;

    /**
     * The Site Creation Default Managed Path.
     * The value of the team site managed path. This is the path under which new team sites will be created.
     */
    @SerializedName(value = "siteCreationDefaultManagedPath", alternate = {"SiteCreationDefaultManagedPath"})
    @Expose
	@Nullable
    public String siteCreationDefaultManagedPath;

    /**
     * The Site Creation Default Storage Limit In MB.
     * The default storage quota for a new site upon creation. Measured in megabytes (MB).
     */
    @SerializedName(value = "siteCreationDefaultStorageLimitInMB", alternate = {"SiteCreationDefaultStorageLimitInMB"})
    @Expose
	@Nullable
    public Integer siteCreationDefaultStorageLimitInMB;

    /**
     * The Tenant Default Timezone.
     * The default timezone of a tenant for newly created sites. For a list of possible values, see SPRegionalSettings.TimeZones property.
     */
    @SerializedName(value = "tenantDefaultTimezone", alternate = {"TenantDefaultTimezone"})
    @Expose
	@Nullable
    public String tenantDefaultTimezone;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
