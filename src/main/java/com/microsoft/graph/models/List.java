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
import com.microsoft.graph.models.ListInfo;
import com.microsoft.graph.models.SharepointIds;
import com.microsoft.graph.models.SystemFacet;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.BaseItem;
import com.microsoft.graph.requests.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.ContentTypeCollectionPage;
import com.microsoft.graph.requests.ListItemCollectionPage;
import com.microsoft.graph.requests.RichLongRunningOperationCollectionPage;
import com.microsoft.graph.requests.SubscriptionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List.
 */
public class List extends BaseItem implements IJsonBackedObject {


    /**
     * The Display Name.
     * The displayable title of the list.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The List.
     * Provides additional details about the list.
     */
    @SerializedName(value = "list", alternate = {"List"})
    @Expose
	@Nullable
    public ListInfo list;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
	@Nullable
    public SharepointIds sharepointIds;

    /**
     * The System.
     * If present, indicates that this is a system-managed list. Read-only.
     */
    @SerializedName(value = "system", alternate = {"System"})
    @Expose
	@Nullable
    public SystemFacet system;

    /**
     * The Columns.
     * The collection of field definitions for this list.
     */
    @SerializedName(value = "columns", alternate = {"Columns"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ColumnDefinitionCollectionPage columns;

    /**
     * The Content Types.
     * The collection of content types present in this list.
     */
    @SerializedName(value = "contentTypes", alternate = {"ContentTypes"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ContentTypeCollectionPage contentTypes;

    /**
     * The Drive.
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
	@Nullable
    public Drive drive;

    /**
     * The Items.
     * All items contained in the list.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ListItemCollectionPage items;

    /**
     * The Operations.
     * The collection of long-running operations on the list.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.RichLongRunningOperationCollectionPage operations;

    /**
     * The Subscriptions.
     * The set of subscriptions on the list.
     */
    @SerializedName(value = "subscriptions", alternate = {"Subscriptions"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SubscriptionCollectionPage subscriptions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("columns")) {
            columns = serializer.deserializeObject(json.get("columns"), com.microsoft.graph.requests.ColumnDefinitionCollectionPage.class);
        }

        if (json.has("contentTypes")) {
            contentTypes = serializer.deserializeObject(json.get("contentTypes"), com.microsoft.graph.requests.ContentTypeCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items"), com.microsoft.graph.requests.ListItemCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), com.microsoft.graph.requests.RichLongRunningOperationCollectionPage.class);
        }

        if (json.has("subscriptions")) {
            subscriptions = serializer.deserializeObject(json.get("subscriptions"), com.microsoft.graph.requests.SubscriptionCollectionPage.class);
        }
    }
}
