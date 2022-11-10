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
import com.microsoft.graph.models.AssignedLabel;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.LicenseProcessingState;
import com.microsoft.graph.models.OnPremisesProvisioningError;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.PlannerGroup;
import com.microsoft.graph.models.Onenote;
import com.microsoft.graph.models.ProfilePhoto;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionPage;
import com.microsoft.graph.requests.GroupSettingCollectionPage;
import com.microsoft.graph.requests.ConversationCollectionPage;
import com.microsoft.graph.requests.ConversationThreadCollectionPage;
import com.microsoft.graph.requests.SiteCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.GroupLifecyclePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group.
 */
public class Group extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Labels.
     * The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on $select. Read-only.
     */
    @SerializedName(value = "assignedLabels", alternate = {"AssignedLabels"})
    @Expose
	@Nullable
    public java.util.List<AssignedLabel> assignedLabels;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq).Read-only.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
	@Nullable
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Classification.
     * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
	@Nullable
    public String classification;

    /**
     * The Created Date Time.
     * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name for the group. This property is required when a group is created and cannot be cleared during updates. Maximum length is 256 characters. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Expiration Date Time.
     * Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Group Types.
     * Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default. Supports $filter (eq, not).
     */
    @SerializedName(value = "groupTypes", alternate = {"GroupTypes"})
    @Expose
	@Nullable
    public java.util.List<String> groupTypes;

    /**
     * The Has Members With License Errors.
     * Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true). See an example. Supports $filter (eq).
     */
    @SerializedName(value = "hasMembersWithLicenseErrors", alternate = {"HasMembersWithLicenseErrors"})
    @Expose
	@Nullable
    public Boolean hasMembersWithLicenseErrors;

    /**
     * The Is Assignable To Role.
     * Indicates whether this group can be assigned to an Azure Active Directory role or not. Optional. This property can only be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true and the group cannot be a dynamic group (that is, groupTypes cannot contain DynamicMembership). Only callers in Global Administrator and Privileged Role Administrator roles can set this property. The caller must also be assigned the RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more, see Using a group to manage Azure AD role assignmentsReturned by default. Supports $filter (eq, ne, not).
     */
    @SerializedName(value = "isAssignableToRole", alternate = {"IsAssignableToRole"})
    @Expose
	@Nullable
    public Boolean isAssignableToRole;

    /**
     * The License Processing State.
     * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
     */
    @SerializedName(value = "licenseProcessingState", alternate = {"LicenseProcessingState"})
    @Expose
	@Nullable
    public LicenseProcessingState licenseProcessingState;

    /**
     * The Mail.
     * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
	@Nullable
    public String mail;

    /**
     * The Mail Enabled.
     * Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not).
     */
    @SerializedName(value = "mailEnabled", alternate = {"MailEnabled"})
    @Expose
	@Nullable
    public Boolean mailEnabled;

    /**
     * The Mail Nickname.
     * The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters. This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] ' ; : &amp;lt;&amp;gt; , SPACE. Required. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The Membership Rule.
     * The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     */
    @SerializedName(value = "membershipRule", alternate = {"MembershipRule"})
    @Expose
	@Nullable
    public String membershipRule;

    /**
     * The Membership Rule Processing State.
     * Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by default. Supports $filter (eq, ne, not, in).
     */
    @SerializedName(value = "membershipRuleProcessingState", alternate = {"MembershipRuleProcessingState"})
    @Expose
	@Nullable
    public String membershipRuleProcessingState;

    /**
     * The On Premises Domain Name.
     * 
     */
    @SerializedName(value = "onPremisesDomainName", alternate = {"OnPremisesDomainName"})
    @Expose
	@Nullable
    public String onPremisesDomainName;

    /**
     * The On Premises Last Sync Date Time.
     * Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in).
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime onPremisesLastSyncDateTime;

    /**
     * The On Premises Net Bios Name.
     * 
     */
    @SerializedName(value = "onPremisesNetBiosName", alternate = {"OnPremisesNetBiosName"})
    @Expose
	@Nullable
    public String onPremisesNetBiosName;

    /**
     * The On Premises Provisioning Errors.
     * Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq, not).
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
	@Nullable
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only.
     */
    @SerializedName(value = "onPremisesSamAccountName", alternate = {"OnPremisesSamAccountName"})
    @Expose
	@Nullable
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Supports $filter (eq including on null values). Read-only.
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
	@Nullable
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The Preferred Data Location.
     * The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator's preferred data location. To set this property, the calling user must be assigned one of the following Azure AD roles:  Global Administrator  User Account Administrator Directory Writer  Exchange Administrator  SharePoint Administrator  For more information about this property, see OneDrive Online Multi-Geo. Nullable. Returned by default.
     */
    @SerializedName(value = "preferredDataLocation", alternate = {"PreferredDataLocation"})
    @Expose
	@Nullable
    public String preferredDataLocation;

    /**
     * The Preferred Language.
     * The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Proxy Addresses.
     * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, endsWith, and counting empty collections).
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
	@Nullable
    public java.util.List<String> proxyAddresses;

    /**
     * The Renewed Date Time.
     * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     */
    @SerializedName(value = "renewedDateTime", alternate = {"RenewedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime renewedDateTime;

    /**
     * The Security Enabled.
     * Specifies whether the group is a security group. Required. Returned by default. Supports $filter (eq, ne, not, in).
     */
    @SerializedName(value = "securityEnabled", alternate = {"SecurityEnabled"})
    @Expose
	@Nullable
    public Boolean securityEnabled;

    /**
     * The Security Identifier.
     * Security identifier of the group, used in Windows scenarios. Returned by default.
     */
    @SerializedName(value = "securityIdentifier", alternate = {"SecurityIdentifier"})
    @Expose
	@Nullable
    public String securityIdentifier;

    /**
     * The Theme.
     * Specifies a Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     */
    @SerializedName(value = "theme", alternate = {"Theme"})
    @Expose
	@Nullable
    public String theme;

    /**
     * The Visibility.
     * Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or HiddenMembership. HiddenMembership can be set only for Microsoft 365 groups, when the groups are created. It can't be updated later. Other values of visibility can be updated after group creation. If visibility value is not specified during group creation on Microsoft Graph, a security group is created as Private by default and Microsoft 365 group is Public. Groups assignable to roles are always Private. See group visibility options to learn more. Returned by default. Nullable.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
	@Nullable
    public String visibility;

    /**
     * The Allow External Senders.
     * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     */
    @SerializedName(value = "allowExternalSenders", alternate = {"AllowExternalSenders"})
    @Expose
	@Nullable
    public Boolean allowExternalSenders;

    /**
     * The Auto Subscribe New Members.
     * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     */
    @SerializedName(value = "autoSubscribeNewMembers", alternate = {"AutoSubscribeNewMembers"})
    @Expose
	@Nullable
    public Boolean autoSubscribeNewMembers;

    /**
     * The Hide From Address Lists.
     * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     */
    @SerializedName(value = "hideFromAddressLists", alternate = {"HideFromAddressLists"})
    @Expose
	@Nullable
    public Boolean hideFromAddressLists;

    /**
     * The Hide From Outlook Clients.
     * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise, false. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     */
    @SerializedName(value = "hideFromOutlookClients", alternate = {"HideFromOutlookClients"})
    @Expose
	@Nullable
    public Boolean hideFromOutlookClients;

    /**
     * The Is Subscribed By Mail.
     * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     */
    @SerializedName(value = "isSubscribedByMail", alternate = {"IsSubscribedByMail"})
    @Expose
	@Nullable
    public Boolean isSubscribedByMail;

    /**
     * The Unseen Count.
     * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     */
    @SerializedName(value = "unseenCount", alternate = {"UnseenCount"})
    @Expose
	@Nullable
    public Integer unseenCount;

    /**
     * The Is Archived.
     * When a group is associated with a team this property determines whether the team is in read-only mode.To read this property, use the /group/{groupId}/team endpoint or the Get team API. To update this property, use the archiveTeam and unarchiveTeam APIs.
     */
    @SerializedName(value = "isArchived", alternate = {"IsArchived"})
    @Expose
	@Nullable
    public Boolean isArchived;

    /**
     * The App Role Assignments.
     * Represents the app roles a group has been granted for an application. Supports $expand.
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Created On Behalf Of.
     * The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
     */
    @SerializedName(value = "createdOnBehalfOf", alternate = {"CreatedOnBehalfOf"})
    @Expose
	@Nullable
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Member Of.
     * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports $expand.
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage memberOf;

    /**
     * The Members.
     * The members of this group, who can be users, devices, other groups, or service principals. Supports the List members, Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&amp;$select=id,displayName&amp;$expand=members($select=id,userPrincipalName,displayName).
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage members;

    /**
     * The Members With License Errors.
     * A list of group members with license errors from this group-based license assignment. Read-only.
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage membersWithLicenseErrors;

    /**
     * The Owners.
     * The owners of the group. Limited to 100 owners. Nullable. If this property is not specified when creating a Microsoft 365 group, the calling user is automatically assigned as the group owner. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&amp;$select=id,displayName&amp;$expand=owners($select=id,userPrincipalName,displayName).
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage owners;

    /**
     * The Permission Grants.
     * The permission that has been granted for a group to a specific application. Supports $expand.
     */
    @SerializedName(value = "permissionGrants", alternate = {"PermissionGrants"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionPage permissionGrants;

    /**
     * The Settings.
     * Settings that can govern this group's behavior, like whether members can invite guest users to the group. Nullable.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.GroupSettingCollectionPage settings;

    /**
     * The Transitive Member Of.
     * The groups that a group is a member of, either directly and through nested membership. Nullable.
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Transitive Members.
     * The direct and transitive members of a group. Nullable.
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage transitiveMembers;

    /**
     * The Accepted Senders.
     * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post.
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage acceptedSenders;

    /**
     * The Calendar.
     * The group's calendar. Read-only.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public Calendar calendar;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Read-only.
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EventCollectionPage calendarView;

    /**
     * The Conversations.
     * The group's conversations.
     */
    @SerializedName(value = "conversations", alternate = {"Conversations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ConversationCollectionPage conversations;

    /**
     * The Events.
     * The group's calendar events.
     */
    @SerializedName(value = "events", alternate = {"Events"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EventCollectionPage events;

    /**
     * The Rejected Senders.
     * The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage rejectedSenders;

    /**
     * The Threads.
     * The group's conversation threads. Nullable.
     */
    @SerializedName(value = "threads", alternate = {"Threads"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ConversationThreadCollectionPage threads;

    /**
     * The Drive.
     * The group's default drive. Read-only.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
	@Nullable
    public Drive drive;

    /**
     * The Drives.
     * The group's drives. Read-only.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DriveCollectionPage drives;

    /**
     * The Sites.
     * The list of SharePoint sites in this group. Access the default site with /sites/root.
     */
    @SerializedName(value = "sites", alternate = {"Sites"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SiteCollectionPage sites;

    /**
     * The Extensions.
     * The collection of open extensions defined for the group. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ExtensionCollectionPage extensions;

    /**
     * The Group Lifecycle Policies.
     * The collection of lifecycle policies for this group. Read-only. Nullable.
     */
    @SerializedName(value = "groupLifecyclePolicies", alternate = {"GroupLifecyclePolicies"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.GroupLifecyclePolicyCollectionPage groupLifecyclePolicies;

    /**
     * The Planner.
     * Entry-point to Planner resource that might exist for a Unified Group.
     */
    @SerializedName(value = "planner", alternate = {"Planner"})
    @Expose
	@Nullable
    public PlannerGroup planner;

    /**
     * The Onenote.
     * 
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
	@Nullable
    public Onenote onenote;

    /**
     * The Photo.
     * The group's profile photo
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
	@Nullable
    public ProfilePhoto photo;

    /**
     * The Photos.
     * The profile photos owned by the group. Read-only. Nullable.
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ProfilePhotoCollectionPage photos;

    /**
     * The Team.
     * The team associated with this group.
     */
    @SerializedName(value = "team", alternate = {"Team"})
    @Expose
	@Nullable
    public Team team;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments"), com.microsoft.graph.requests.AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("membersWithLicenseErrors")) {
            membersWithLicenseErrors = serializer.deserializeObject(json.get("membersWithLicenseErrors"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("owners")) {
            owners = serializer.deserializeObject(json.get("owners"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("permissionGrants")) {
            permissionGrants = serializer.deserializeObject(json.get("permissionGrants"), com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionPage.class);
        }

        if (json.has("settings")) {
            settings = serializer.deserializeObject(json.get("settings"), com.microsoft.graph.requests.GroupSettingCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveMembers")) {
            transitiveMembers = serializer.deserializeObject(json.get("transitiveMembers"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("acceptedSenders")) {
            acceptedSenders = serializer.deserializeObject(json.get("acceptedSenders"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView"), com.microsoft.graph.requests.EventCollectionPage.class);
        }

        if (json.has("conversations")) {
            conversations = serializer.deserializeObject(json.get("conversations"), com.microsoft.graph.requests.ConversationCollectionPage.class);
        }

        if (json.has("events")) {
            events = serializer.deserializeObject(json.get("events"), com.microsoft.graph.requests.EventCollectionPage.class);
        }

        if (json.has("rejectedSenders")) {
            rejectedSenders = serializer.deserializeObject(json.get("rejectedSenders"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("threads")) {
            threads = serializer.deserializeObject(json.get("threads"), com.microsoft.graph.requests.ConversationThreadCollectionPage.class);
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives"), com.microsoft.graph.requests.DriveCollectionPage.class);
        }

        if (json.has("sites")) {
            sites = serializer.deserializeObject(json.get("sites"), com.microsoft.graph.requests.SiteCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), com.microsoft.graph.requests.ExtensionCollectionPage.class);
        }

        if (json.has("groupLifecyclePolicies")) {
            groupLifecyclePolicies = serializer.deserializeObject(json.get("groupLifecyclePolicies"), com.microsoft.graph.requests.GroupLifecyclePolicyCollectionPage.class);
        }

        if (json.has("photos")) {
            photos = serializer.deserializeObject(json.get("photos"), com.microsoft.graph.requests.ProfilePhotoCollectionPage.class);
        }
    }
}
