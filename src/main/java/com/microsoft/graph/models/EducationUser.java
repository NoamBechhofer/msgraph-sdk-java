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
import com.microsoft.graph.models.RelatedContact;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.AssignedPlan;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.EducationExternalSource;
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.EducationOnPremisesInfo;
import com.microsoft.graph.models.PasswordProfile;
import com.microsoft.graph.models.EducationUserRole;
import com.microsoft.graph.models.ProvisionedPlan;
import com.microsoft.graph.models.EducationStudent;
import com.microsoft.graph.models.EducationTeacher;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EducationAssignmentCollectionPage;
import com.microsoft.graph.requests.EducationRubricCollectionPage;
import com.microsoft.graph.requests.EducationSchoolCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User.
 */
public class EducationUser extends Entity implements IJsonBackedObject {


    /**
     * The Related Contacts.
     * Related records associated with the user. Read-only.
     */
    @SerializedName(value = "relatedContacts", alternate = {"RelatedContacts"})
    @Expose
	@Nullable
    public java.util.List<RelatedContact> relatedContacts;

    /**
     * The Account Enabled.
     * True if the account is enabled; otherwise, false. This property is required when a user is created. Supports $filter.
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
	@Nullable
    public Boolean accountEnabled;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the user. Not nullable.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
	@Nullable
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Assigned Plans.
     * The plans that are assigned to the user. Read-only. Not nullable.
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
	@Nullable
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * The telephone numbers for the user. Note: Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
	@Nullable
    public java.util.List<String> businessPhones;

    /**
     * The Created By.
     * The entity who created the user.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Department.
     * The name for the department in which the user works. Supports $filter.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
	@Nullable
    public String department;

    /**
     * The Display Name.
     * The name displayed in the address book for the user. This is usually the combination of the user's first name, middle initial, and last name. This property is required when a user is created and it cannot be cleared during updates. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The External Source.
     * Where this user was created from. Possible values are: sis, manual.
     */
    @SerializedName(value = "externalSource", alternate = {"ExternalSource"})
    @Expose
	@Nullable
    public EducationExternalSource externalSource;

    /**
     * The External Source Detail.
     * The name of the external source this resource was generated from.
     */
    @SerializedName(value = "externalSourceDetail", alternate = {"ExternalSourceDetail"})
    @Expose
	@Nullable
    public String externalSourceDetail;

    /**
     * The Given Name.
     * The given name (first name) of the user. Supports $filter.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
	@Nullable
    public String givenName;

    /**
     * The Mail.
     * The SMTP address for the user, for example, jeff@contoso.onmicrosoft.com. Read-Only. Supports $filter.
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
	@Nullable
    public String mail;

    /**
     * The Mailing Address.
     * The mail address of the user.
     */
    @SerializedName(value = "mailingAddress", alternate = {"MailingAddress"})
    @Expose
	@Nullable
    public PhysicalAddress mailingAddress;

    /**
     * The Mail Nickname.
     * The mail alias for the user. This property must be specified when a user is created. Supports $filter.
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The Middle Name.
     * The middle name of the user.
     */
    @SerializedName(value = "middleName", alternate = {"MiddleName"})
    @Expose
	@Nullable
    public String middleName;

    /**
     * The Mobile Phone.
     * The primary cellular telephone number for the user.
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
	@Nullable
    public String mobilePhone;

    /**
     * The Office Location.
     * 
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
	@Nullable
    public String officeLocation;

    /**
     * The On Premises Info.
     * Additional information used to associate the Azure Active Directory user with its Active Directory counterpart.
     */
    @SerializedName(value = "onPremisesInfo", alternate = {"OnPremisesInfo"})
    @Expose
	@Nullable
    public EducationOnPremisesInfo onPremisesInfo;

    /**
     * The Password Policies.
     * Specifies password policies for the user. This value is an enumeration with one possible value being DisableStrongPassword, which allows weaker passwords than the default policy to be specified. DisablePasswordExpiration can also be specified. The two can be specified together; for example: DisablePasswordExpiration, DisableStrongPassword.
     */
    @SerializedName(value = "passwordPolicies", alternate = {"PasswordPolicies"})
    @Expose
	@Nullable
    public String passwordPolicies;

    /**
     * The Password Profile.
     * Specifies the password profile for the user. The profile contains the user's password. This property is required when a user is created. The password in the profile must satisfy minimum requirements as specified by the passwordPolicies property. By default, a strong password is required.
     */
    @SerializedName(value = "passwordProfile", alternate = {"PasswordProfile"})
    @Expose
	@Nullable
    public PasswordProfile passwordProfile;

    /**
     * The Preferred Language.
     * The preferred language for the user that should follow the ISO 639-1 code, for example, en-US.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Primary Role.
     * Default role for a user. The user's role might be different in an individual class. Possible values are: student, teacher, none, unknownFutureValue.
     */
    @SerializedName(value = "primaryRole", alternate = {"PrimaryRole"})
    @Expose
	@Nullable
    public EducationUserRole primaryRole;

    /**
     * The Provisioned Plans.
     * The plans that are provisioned for the user. Read-only. Not nullable.
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
	@Nullable
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Refresh Tokens Valid From Date Time.
     * 
     */
    @SerializedName(value = "refreshTokensValidFromDateTime", alternate = {"RefreshTokensValidFromDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime refreshTokensValidFromDateTime;

    /**
     * The Residence Address.
     * The address where the user lives.
     */
    @SerializedName(value = "residenceAddress", alternate = {"ResidenceAddress"})
    @Expose
	@Nullable
    public PhysicalAddress residenceAddress;

    /**
     * The Show In Address List.
     * True if the Outlook Global Address List should contain this user; otherwise, false. If not set, this will be treated as true. For users invited through the invitation manager, this property will be set to false.
     */
    @SerializedName(value = "showInAddressList", alternate = {"ShowInAddressList"})
    @Expose
	@Nullable
    public Boolean showInAddressList;

    /**
     * The Student.
     * If the primary role is student, this block will contain student specific data.
     */
    @SerializedName(value = "student", alternate = {"Student"})
    @Expose
	@Nullable
    public EducationStudent student;

    /**
     * The Surname.
     * The user's surname (family name or last name). Supports $filter.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
	@Nullable
    public String surname;

    /**
     * The Teacher.
     * If the primary role is teacher, this block will contain teacher specific data.
     */
    @SerializedName(value = "teacher", alternate = {"Teacher"})
    @Expose
	@Nullable
    public EducationTeacher teacher;

    /**
     * The Usage Location.
     * A two-letter country code (ISO standard 3166). Required for users who will be assigned licenses due to a legal requirement to check for availability of services in countries or regions. Examples include: US, JP, and GB. Not nullable. Supports $filter.
     */
    @SerializedName(value = "usageLocation", alternate = {"UsageLocation"})
    @Expose
	@Nullable
    public String usageLocation;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user. The UPN is an internet-style login name for the user based on the internet standard RFC 822. By convention, this should map to the user's email name. The general format is alias@domain, where domain must be present in the tenant's collection of verified domains. This property is required when a user is created. The verified domains for the tenant can be accessed from the verifiedDomains property of the organization. Supports $filter and $orderby.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The User Type.
     * A string value that can be used to classify user types in your directory, such as Member and Guest. Supports $filter.
     */
    @SerializedName(value = "userType", alternate = {"UserType"})
    @Expose
	@Nullable
    public String userType;

    /**
     * The Assignments.
     * Assignments belonging to the user.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EducationAssignmentCollectionPage assignments;

    /**
     * The Rubrics.
     * When set, the grading rubric attached to the assignment.
     */
    @SerializedName(value = "rubrics", alternate = {"Rubrics"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EducationRubricCollectionPage rubrics;

    /**
     * The Classes.
     * Classes to which the user belongs. Nullable.
     */
	@Nullable
    public com.microsoft.graph.requests.EducationClassCollectionPage classes;

    /**
     * The Schools.
     * Schools to which the user belongs. Nullable.
     */
	@Nullable
    public com.microsoft.graph.requests.EducationSchoolCollectionPage schools;

    /**
     * The Taught Classes.
     * Classes for which the user is a teacher.
     */
	@Nullable
    public com.microsoft.graph.requests.EducationClassCollectionPage taughtClasses;

    /**
     * The User.
     * The directory user that corresponds to this user.
     */
    @SerializedName(value = "user", alternate = {"User"})
    @Expose
	@Nullable
    public User user;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), com.microsoft.graph.requests.EducationAssignmentCollectionPage.class);
        }

        if (json.has("rubrics")) {
            rubrics = serializer.deserializeObject(json.get("rubrics"), com.microsoft.graph.requests.EducationRubricCollectionPage.class);
        }

        if (json.has("classes")) {
            classes = serializer.deserializeObject(json.get("classes"), com.microsoft.graph.requests.EducationClassCollectionPage.class);
        }

        if (json.has("schools")) {
            schools = serializer.deserializeObject(json.get("schools"), com.microsoft.graph.requests.EducationSchoolCollectionPage.class);
        }

        if (json.has("taughtClasses")) {
            taughtClasses = serializer.deserializeObject(json.get("taughtClasses"), com.microsoft.graph.requests.EducationClassCollectionPage.class);
        }
    }
}
