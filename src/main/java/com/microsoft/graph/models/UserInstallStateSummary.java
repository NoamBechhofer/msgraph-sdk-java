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
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DeviceInstallStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary.
 */
public class UserInstallStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Failed Device Count.
     * Failed Device Count.
     */
    @SerializedName(value = "failedDeviceCount", alternate = {"FailedDeviceCount"})
    @Expose
	@Nullable
    public Integer failedDeviceCount;

    /**
     * The Installed Device Count.
     * Installed Device Count.
     */
    @SerializedName(value = "installedDeviceCount", alternate = {"InstalledDeviceCount"})
    @Expose
	@Nullable
    public Integer installedDeviceCount;

    /**
     * The Not Installed Device Count.
     * Not installed device count.
     */
    @SerializedName(value = "notInstalledDeviceCount", alternate = {"NotInstalledDeviceCount"})
    @Expose
	@Nullable
    public Integer notInstalledDeviceCount;

    /**
     * The User Name.
     * User name.
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
	@Nullable
    public String userName;

    /**
     * The Device States.
     * The install state of the eBook.
     */
    @SerializedName(value = "deviceStates", alternate = {"DeviceStates"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceInstallStateCollectionPage deviceStates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("deviceStates")) {
            deviceStates = serializer.deserializeObject(json.get("deviceStates"), com.microsoft.graph.requests.DeviceInstallStateCollectionPage.class);
        }
    }
}
