// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CloudAppSecuritySessionControlType;
import com.microsoft.graph.models.ConditionalAccessSessionControl;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud App Security Session Control.
 */
public class CloudAppSecuritySessionControl extends ConditionalAccessSessionControl implements IJsonBackedObject {


    /**
     * The Cloud App Security Type.
     * Possible values are: mcasConfigured, monitorOnly, blockDownloads. Learn more about these values here: https://docs.microsoft.com/cloud-app-security/proxy-deployment-aad#step-1-create-an-azure-ad-conditional-access-test-policy-
     */
    @SerializedName(value = "cloudAppSecurityType", alternate = {"CloudAppSecurityType"})
    @Expose
	@Nullable
    public CloudAppSecuritySessionControlType cloudAppSecurityType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
