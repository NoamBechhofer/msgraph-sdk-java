// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EndpointType;
import com.microsoft.graph.models.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Info.
 */
public class ParticipantInfo implements IJsonBackedObject {

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
     * The Country Code.
     * The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call. Read-only.
     */
    @SerializedName(value = "countryCode", alternate = {"CountryCode"})
    @Expose
	@Nullable
    public String countryCode;

    /**
     * The Endpoint Type.
     * The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or skypeForBusinessVoipPhone. Read-only.
     */
    @SerializedName(value = "endpointType", alternate = {"EndpointType"})
    @Expose
	@Nullable
    public EndpointType endpointType;

    /**
     * The Identity.
     * The identitySet associated with this participant. Read-only.
     */
    @SerializedName(value = "identity", alternate = {"Identity"})
    @Expose
	@Nullable
    public IdentitySet identity;

    /**
     * The Language Id.
     * The language culture string. Read-only.
     */
    @SerializedName(value = "languageId", alternate = {"LanguageId"})
    @Expose
	@Nullable
    public String languageId;

    /**
     * The Participant Id.
     * The participant ID of the participant. Read-only.
     */
    @SerializedName(value = "participantId", alternate = {"ParticipantId"})
    @Expose
	@Nullable
    public String participantId;

    /**
     * The Region.
     * The home region of the participant. This can be a country, a continent, or a larger geographic region. This does not change based on the participant's current physical location. Read-only.
     */
    @SerializedName(value = "region", alternate = {"Region"})
    @Expose
	@Nullable
    public String region;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
