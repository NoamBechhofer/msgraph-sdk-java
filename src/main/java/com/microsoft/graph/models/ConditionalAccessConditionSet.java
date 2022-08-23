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
import com.microsoft.graph.models.ConditionalAccessApplications;
import com.microsoft.graph.models.ConditionalAccessClientApplications;
import com.microsoft.graph.models.ConditionalAccessClientApp;
import com.microsoft.graph.models.ConditionalAccessDevices;
import com.microsoft.graph.models.ConditionalAccessLocations;
import com.microsoft.graph.models.ConditionalAccessPlatforms;
import com.microsoft.graph.models.RiskLevel;
import com.microsoft.graph.models.ConditionalAccessUsers;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Condition Set.
 */
public class ConditionalAccessConditionSet implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Applications.
     * Applications and user actions included in and excluded from the policy. Required.
     */
    @SerializedName(value = "applications", alternate = {"Applications"})
    @Expose
	@Nullable
    public ConditionalAccessApplications applications;

    /**
     * The Client Applications.
     * Client applications (service principals and workload identities) included in and excluded from the policy. Either users or clientApplications is required.
     */
    @SerializedName(value = "clientApplications", alternate = {"ClientApplications"})
    @Expose
	@Nullable
    public ConditionalAccessClientApplications clientApplications;

    /**
     * The Client App Types.
     * Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients, exchangeActiveSync, easSupported, other. Required.
     */
    @SerializedName(value = "clientAppTypes", alternate = {"ClientAppTypes"})
    @Expose
	@Nullable
    public java.util.List<ConditionalAccessClientApp> clientAppTypes;

    /**
     * The Devices.
     * Devices in the policy.
     */
    @SerializedName(value = "devices", alternate = {"Devices"})
    @Expose
	@Nullable
    public ConditionalAccessDevices devices;

    /**
     * The Locations.
     * Locations included in and excluded from the policy.
     */
    @SerializedName(value = "locations", alternate = {"Locations"})
    @Expose
	@Nullable
    public ConditionalAccessLocations locations;

    /**
     * The Platforms.
     * Platforms included in and excluded from the policy.
     */
    @SerializedName(value = "platforms", alternate = {"Platforms"})
    @Expose
	@Nullable
    public ConditionalAccessPlatforms platforms;

    /**
     * The Service Principal Risk Levels.
     * 
     */
    @SerializedName(value = "servicePrincipalRiskLevels", alternate = {"ServicePrincipalRiskLevels"})
    @Expose
	@Nullable
    public java.util.List<RiskLevel> servicePrincipalRiskLevels;

    /**
     * The Sign In Risk Levels.
     * Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     */
    @SerializedName(value = "signInRiskLevels", alternate = {"SignInRiskLevels"})
    @Expose
	@Nullable
    public java.util.List<RiskLevel> signInRiskLevels;

    /**
     * The User Risk Levels.
     * User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue. Required.
     */
    @SerializedName(value = "userRiskLevels", alternate = {"UserRiskLevels"})
    @Expose
	@Nullable
    public java.util.List<RiskLevel> userRiskLevels;

    /**
     * The Users.
     * Users, groups, and roles included in and excluded from the policy. Required.
     */
    @SerializedName(value = "users", alternate = {"Users"})
    @Expose
	@Nullable
    public ConditionalAccessUsers users;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
