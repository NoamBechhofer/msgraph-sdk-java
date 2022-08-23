// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BaseItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Request.
 */
public class BaseItemRequest extends BaseRequest<BaseItem> {
	
    /**
     * The request for the BaseItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseItemRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends BaseItem> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the BaseItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseItem.class);
    }

    /**
     * Gets the BaseItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BaseItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the BaseItem from the service
     *
     * @return the BaseItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BaseItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BaseItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public BaseItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this BaseItem with a source
     *
     * @param sourceBaseItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BaseItem> patchAsync(@Nonnull final BaseItem sourceBaseItem) {
        return sendAsync(HttpMethod.PATCH, sourceBaseItem);
    }

    /**
     * Patches this BaseItem with a source
     *
     * @param sourceBaseItem the source object with updates
     * @return the updated BaseItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BaseItem patch(@Nonnull final BaseItem sourceBaseItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceBaseItem);
    }

    /**
     * Creates a BaseItem with a new object
     *
     * @param newBaseItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BaseItem> postAsync(@Nonnull final BaseItem newBaseItem) {
        return sendAsync(HttpMethod.POST, newBaseItem);
    }

    /**
     * Creates a BaseItem with a new object
     *
     * @param newBaseItem the new object to create
     * @return the created BaseItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BaseItem post(@Nonnull final BaseItem newBaseItem) throws ClientException {
        return send(HttpMethod.POST, newBaseItem);
    }

    /**
     * Creates a BaseItem with a new object
     *
     * @param newBaseItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BaseItem> putAsync(@Nonnull final BaseItem newBaseItem) {
        return sendAsync(HttpMethod.PUT, newBaseItem);
    }

    /**
     * Creates a BaseItem with a new object
     *
     * @param newBaseItem the object to create/update
     * @return the created BaseItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BaseItem put(@Nonnull final BaseItem newBaseItem) throws ClientException {
        return send(HttpMethod.PUT, newBaseItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public BaseItemRequest select(@Nonnull final String value) {
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
     public BaseItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

