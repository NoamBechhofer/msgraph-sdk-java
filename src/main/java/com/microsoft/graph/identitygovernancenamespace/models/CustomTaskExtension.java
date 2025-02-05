// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CustomExtensionCallbackConfiguration;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.CustomCalloutExtension;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Task Extension.
 */
public class CustomTaskExtension extends CustomCalloutExtension implements IJsonBackedObject {


    /**
     * The Callback Configuration.
     * The callback configuration for a custom task extension.
     */
    @SerializedName(value = "callbackConfiguration", alternate = {"CallbackConfiguration"})
    @Expose
	@Nullable
    public CustomExtensionCallbackConfiguration callbackConfiguration;

    /**
     * The Created Date Time.
     * When the custom task extension was created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Last Modified Date Time.
     * When the custom extension was last modified.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Created By.
     * The unique identifier of the Azure AD user that created the custom task extension.Supports $filter(eq, ne) and $expand.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public User createdBy;

    /**
     * The Last Modified By.
     * The unique identifier of the Azure AD user that modified the custom task extension last.Supports $filter(eq, ne) and $expand.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public User lastModifiedBy;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
