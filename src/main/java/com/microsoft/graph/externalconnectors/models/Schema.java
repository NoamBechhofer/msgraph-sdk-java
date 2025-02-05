// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.externalconnectors.models.Property;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schema.
 */
public class Schema extends Entity implements IJsonBackedObject {


    /**
     * The Base Type.
     * Must be set to microsoft.graph.externalConnector.externalItem. Required.
     */
    @SerializedName(value = "baseType", alternate = {"BaseType"})
    @Expose
	@Nullable
    public String baseType;

    /**
     * The Properties.
     * The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128.
     */
    @SerializedName(value = "properties", alternate = {"Properties"})
    @Expose
	@Nullable
    public java.util.List<Property> properties;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
