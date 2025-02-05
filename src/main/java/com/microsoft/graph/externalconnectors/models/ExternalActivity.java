// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.externalconnectors.models.ExternalActivityType;
import com.microsoft.graph.externalconnectors.models.Identity;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Activity.
 */
public class ExternalActivity extends Entity implements IJsonBackedObject {


    /**
     * The Start Date Time.
     * The date and time when the particular activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Type.
     * The type of activity performed. The possible values are: viewed, modified, created, commented, unknownFutureValue.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public ExternalActivityType type;

    /**
     * The Performed By.
     * Represents an identity used to identify who is responsible for the activity.
     */
    @SerializedName(value = "performedBy", alternate = {"PerformedBy"})
    @Expose
	@Nullable
    public Identity performedBy;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
