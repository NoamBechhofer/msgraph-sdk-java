// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ListItem;
import com.microsoft.graph.models.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ListItemGetActivitiesByIntervalParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Request Builder.
 */
public class ListItemRequestBuilder extends BaseRequestBuilder<ListItem> {

    /**
     * The request builder for the ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ListItemRequest instance
     */
    @Nonnull
    public ListItemRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ListItemRequest instance
     */
    @Nonnull
    public ListItemRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ListItemRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder createdByUser() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the ItemAnalyticsWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new com.microsoft.graph.requests.ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DocumentSetVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DocumentSetVersionCollectionRequestBuilder documentSetVersions() {
        return new com.microsoft.graph.requests.DocumentSetVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("documentSetVersions"), getClient(), null);
    }

    /**
     * Gets a request builder for the DocumentSetVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DocumentSetVersionRequestBuilder documentSetVersions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DocumentSetVersionRequestBuilder(getRequestUrlWithAdditionalSegment("documentSetVersions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem
     *
     * @return the DriveItemRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder driveItem() {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("driveItem"), getClient(), null);
    }

    /**
     * Gets the request builder for FieldValueSet
     *
     * @return the FieldValueSetRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.FieldValueSetRequestBuilder fields() {
        return new com.microsoft.graph.requests.FieldValueSetRequestBuilder(getRequestUrlWithAdditionalSegment("fields"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ListItemVersion collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ListItemVersionCollectionRequestBuilder versions() {
        return new com.microsoft.graph.requests.ListItemVersionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("versions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ListItemVersion item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ListItemVersionRequestBuilder versions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ListItemVersionRequestBuilder(getRequestUrlWithAdditionalSegment("versions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ListItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval() {
        return new ListItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ListItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(@Nonnull final ListItemGetActivitiesByIntervalParameterSet parameters) {
        return new ListItemGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, parameters);
    }
}
