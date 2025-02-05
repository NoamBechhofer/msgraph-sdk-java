// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ApiAuthenticationConfigurationBase;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Api Connector.
 */
public class IdentityApiConnector extends Entity implements IJsonBackedObject {


    /**
     * The Authentication Configuration.
     * The object which describes the authentication configuration details for calling the API. Basic and PKCS 12 client certificate are supported.
     */
    @SerializedName(value = "authenticationConfiguration", alternate = {"AuthenticationConfiguration"})
    @Expose
	@Nullable
    public ApiAuthenticationConfigurationBase authenticationConfiguration;

    /**
     * The Display Name.
     * The name of the API connector.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Target Url.
     * The URL of the API endpoint to call.
     */
    @SerializedName(value = "targetUrl", alternate = {"TargetUrl"})
    @Expose
	@Nullable
    public String targetUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
