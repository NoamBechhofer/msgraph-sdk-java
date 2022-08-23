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
import com.microsoft.graph.models.PolicyBase;
import com.microsoft.graph.requests.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sts Policy.
 */
public class StsPolicy extends PolicyBase implements IJsonBackedObject {


    /**
     * The Definition.
     * A string collection containing a JSON string that defines the rules and settings for a policy. The syntax for the definition differs for each derived policy type. Required.
     */
    @SerializedName(value = "definition", alternate = {"Definition"})
    @Expose
	@Nullable
    public java.util.List<String> definition;

    /**
     * The Is Organization Default.
     * If set to true, activates this policy. There can be many policies for the same policy type, but only one can be activated as the organization default. Optional, default value is false.
     */
    @SerializedName(value = "isOrganizationDefault", alternate = {"IsOrganizationDefault"})
    @Expose
	@Nullable
    public Boolean isOrganizationDefault;

    /**
     * The Applies To.
     * 
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage appliesTo;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appliesTo")) {
            appliesTo = serializer.deserializeObject(json.get("appliesTo"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }
    }
}
