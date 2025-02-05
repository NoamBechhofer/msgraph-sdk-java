// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy.
 */
public class GroupLifecyclePolicy extends Entity implements IJsonBackedObject {


    /**
     * The Alternate Notification Emails.
     * List of email address to send notifications for groups without owners. Multiple email address can be defined by separating email address with a semicolon.
     */
    @SerializedName(value = "alternateNotificationEmails", alternate = {"AlternateNotificationEmails"})
    @Expose
	@Nullable
    public String alternateNotificationEmails;

    /**
     * The Group Lifetime In Days.
     * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the number of days defined.
     */
    @SerializedName(value = "groupLifetimeInDays", alternate = {"GroupLifetimeInDays"})
    @Expose
	@Nullable
    public Integer groupLifetimeInDays;

    /**
     * The Managed Group Types.
     * The group type for which the expiration policy applies. Possible values are All, Selected or None.
     */
    @SerializedName(value = "managedGroupTypes", alternate = {"ManagedGroupTypes"})
    @Expose
	@Nullable
    public String managedGroupTypes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
