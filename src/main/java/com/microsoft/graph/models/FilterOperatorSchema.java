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
import com.microsoft.graph.models.ScopeOperatorType;
import com.microsoft.graph.models.ScopeOperatorMultiValuedComparisonType;
import com.microsoft.graph.models.AttributeType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Filter Operator Schema.
 */
public class FilterOperatorSchema extends Entity implements IJsonBackedObject {


    /**
     * The Arity.
     * Arity of the operator. Possible values are: Binary, Unary. The default is Binary.
     */
    @SerializedName(value = "arity", alternate = {"Arity"})
    @Expose
	@Nullable
    public ScopeOperatorType arity;

    /**
     * The Multivalued Comparison Type.
     * Possible values are: All, Any. Applies only to multivalued attributes. All means that all values must satisfy the condition. Any means that at least one value has to satisfy the condition. The default is All.
     */
    @SerializedName(value = "multivaluedComparisonType", alternate = {"MultivaluedComparisonType"})
    @Expose
	@Nullable
    public ScopeOperatorMultiValuedComparisonType multivaluedComparisonType;

    /**
     * The Supported Attribute Types.
     * Attribute types supported by the operator. Possible values are: Boolean, Binary, Reference, Integer, String.
     */
    @SerializedName(value = "supportedAttributeTypes", alternate = {"SupportedAttributeTypes"})
    @Expose
	@Nullable
    public java.util.List<AttributeType> supportedAttributeTypes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
