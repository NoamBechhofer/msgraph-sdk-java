// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OfferShiftRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Offer Shift Request Request.
 */
public class OfferShiftRequestRequest extends BaseRequest<OfferShiftRequest> {
	
    /**
     * The request for the OfferShiftRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OfferShiftRequestRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends OfferShiftRequest> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the OfferShiftRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfferShiftRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfferShiftRequest.class);
    }

    /**
     * Gets the OfferShiftRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfferShiftRequest> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OfferShiftRequest from the service
     *
     * @return the OfferShiftRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfferShiftRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfferShiftRequest> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OfferShiftRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OfferShiftRequest with a source
     *
     * @param sourceOfferShiftRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfferShiftRequest> patchAsync(@Nonnull final OfferShiftRequest sourceOfferShiftRequest) {
        return sendAsync(HttpMethod.PATCH, sourceOfferShiftRequest);
    }

    /**
     * Patches this OfferShiftRequest with a source
     *
     * @param sourceOfferShiftRequest the source object with updates
     * @return the updated OfferShiftRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfferShiftRequest patch(@Nonnull final OfferShiftRequest sourceOfferShiftRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceOfferShiftRequest);
    }

    /**
     * Creates a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfferShiftRequest> postAsync(@Nonnull final OfferShiftRequest newOfferShiftRequest) {
        return sendAsync(HttpMethod.POST, newOfferShiftRequest);
    }

    /**
     * Creates a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the new object to create
     * @return the created OfferShiftRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfferShiftRequest post(@Nonnull final OfferShiftRequest newOfferShiftRequest) throws ClientException {
        return send(HttpMethod.POST, newOfferShiftRequest);
    }

    /**
     * Creates a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OfferShiftRequest> putAsync(@Nonnull final OfferShiftRequest newOfferShiftRequest) {
        return sendAsync(HttpMethod.PUT, newOfferShiftRequest);
    }

    /**
     * Creates a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the object to create/update
     * @return the created OfferShiftRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OfferShiftRequest put(@Nonnull final OfferShiftRequest newOfferShiftRequest) throws ClientException {
        return send(HttpMethod.PUT, newOfferShiftRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OfferShiftRequestRequest select(@Nonnull final String value) {
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
     public OfferShiftRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

