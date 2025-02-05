// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AddLargeGalleryViewOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add Large Gallery View Operation Request.
 */
public class AddLargeGalleryViewOperationRequest extends BaseRequest<AddLargeGalleryViewOperation> {
	
    /**
     * The request for the AddLargeGalleryViewOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AddLargeGalleryViewOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AddLargeGalleryViewOperation.class);
    }

    /**
     * Gets the AddLargeGalleryViewOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AddLargeGalleryViewOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AddLargeGalleryViewOperation from the service
     *
     * @return the AddLargeGalleryViewOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AddLargeGalleryViewOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AddLargeGalleryViewOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AddLargeGalleryViewOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AddLargeGalleryViewOperation with a source
     *
     * @param sourceAddLargeGalleryViewOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AddLargeGalleryViewOperation> patchAsync(@Nonnull final AddLargeGalleryViewOperation sourceAddLargeGalleryViewOperation) {
        return sendAsync(HttpMethod.PATCH, sourceAddLargeGalleryViewOperation);
    }

    /**
     * Patches this AddLargeGalleryViewOperation with a source
     *
     * @param sourceAddLargeGalleryViewOperation the source object with updates
     * @return the updated AddLargeGalleryViewOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AddLargeGalleryViewOperation patch(@Nonnull final AddLargeGalleryViewOperation sourceAddLargeGalleryViewOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceAddLargeGalleryViewOperation);
    }

    /**
     * Creates a AddLargeGalleryViewOperation with a new object
     *
     * @param newAddLargeGalleryViewOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AddLargeGalleryViewOperation> postAsync(@Nonnull final AddLargeGalleryViewOperation newAddLargeGalleryViewOperation) {
        return sendAsync(HttpMethod.POST, newAddLargeGalleryViewOperation);
    }

    /**
     * Creates a AddLargeGalleryViewOperation with a new object
     *
     * @param newAddLargeGalleryViewOperation the new object to create
     * @return the created AddLargeGalleryViewOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AddLargeGalleryViewOperation post(@Nonnull final AddLargeGalleryViewOperation newAddLargeGalleryViewOperation) throws ClientException {
        return send(HttpMethod.POST, newAddLargeGalleryViewOperation);
    }

    /**
     * Creates a AddLargeGalleryViewOperation with a new object
     *
     * @param newAddLargeGalleryViewOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AddLargeGalleryViewOperation> putAsync(@Nonnull final AddLargeGalleryViewOperation newAddLargeGalleryViewOperation) {
        return sendAsync(HttpMethod.PUT, newAddLargeGalleryViewOperation);
    }

    /**
     * Creates a AddLargeGalleryViewOperation with a new object
     *
     * @param newAddLargeGalleryViewOperation the object to create/update
     * @return the created AddLargeGalleryViewOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AddLargeGalleryViewOperation put(@Nonnull final AddLargeGalleryViewOperation newAddLargeGalleryViewOperation) throws ClientException {
        return send(HttpMethod.PUT, newAddLargeGalleryViewOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AddLargeGalleryViewOperationRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AddLargeGalleryViewOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

