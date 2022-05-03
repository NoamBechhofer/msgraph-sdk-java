// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.callrecords.models.Endpoint;
import com.microsoft.graph.callrecords.models.FailureInfo;
import com.microsoft.graph.callrecords.models.Modality;
import com.microsoft.graph.callrecords.models.Segment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.callrecords.requests.SegmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Session.
 */
public class Session extends Entity implements IJsonBackedObject {


    /**
     * The Callee.
     * Endpoint that answered the session.
     */
    @SerializedName(value = "callee", alternate = {"Callee"})
    @Expose
	@Nullable
    public Endpoint callee;

    /**
     * The Caller.
     * Endpoint that initiated the session.
     */
    @SerializedName(value = "caller", alternate = {"Caller"})
    @Expose
	@Nullable
    public Endpoint caller;

    /**
     * The End Date Time.
     * UTC time when the last user left the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Failure Info.
     * Failure information associated with the session if the session failed.
     */
    @SerializedName(value = "failureInfo", alternate = {"FailureInfo"})
    @Expose
	@Nullable
    public FailureInfo failureInfo;

    /**
     * The Modalities.
     * List of modalities present in the session. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     */
    @SerializedName(value = "modalities", alternate = {"Modalities"})
    @Expose
	@Nullable
    public java.util.List<Modality> modalities;

    /**
     * The Start Date Time.
     * UTC fime when the first user joined the session. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Segments.
     * The list of segments involved in the session. Read-only. Nullable.
     */
    @SerializedName(value = "segments", alternate = {"Segments"})
    @Expose
	@Nullable
    public SegmentCollectionPage segments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("segments")) {
            segments = serializer.deserializeObject(json.get("segments"), SegmentCollectionPage.class);
        }
    }
}
