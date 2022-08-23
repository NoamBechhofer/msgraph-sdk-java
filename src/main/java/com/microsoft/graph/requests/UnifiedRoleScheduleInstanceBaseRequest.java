// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleScheduleInstanceBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Schedule Instance Base Request.
 */
public class UnifiedRoleScheduleInstanceBaseRequest extends BaseRequest<UnifiedRoleScheduleInstanceBase> {
	
    /**
     * The request for the UnifiedRoleScheduleInstanceBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public UnifiedRoleScheduleInstanceBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends UnifiedRoleScheduleInstanceBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the UnifiedRoleScheduleInstanceBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleScheduleInstanceBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleScheduleInstanceBase.class);
    }

    /**
     * Gets the UnifiedRoleScheduleInstanceBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleInstanceBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleScheduleInstanceBase from the service
     *
     * @return the UnifiedRoleScheduleInstanceBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleInstanceBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleInstanceBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleScheduleInstanceBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleScheduleInstanceBase with a source
     *
     * @param sourceUnifiedRoleScheduleInstanceBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleInstanceBase> patchAsync(@Nonnull final UnifiedRoleScheduleInstanceBase sourceUnifiedRoleScheduleInstanceBase) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleScheduleInstanceBase);
    }

    /**
     * Patches this UnifiedRoleScheduleInstanceBase with a source
     *
     * @param sourceUnifiedRoleScheduleInstanceBase the source object with updates
     * @return the updated UnifiedRoleScheduleInstanceBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleInstanceBase patch(@Nonnull final UnifiedRoleScheduleInstanceBase sourceUnifiedRoleScheduleInstanceBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleScheduleInstanceBase);
    }

    /**
     * Creates a UnifiedRoleScheduleInstanceBase with a new object
     *
     * @param newUnifiedRoleScheduleInstanceBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleInstanceBase> postAsync(@Nonnull final UnifiedRoleScheduleInstanceBase newUnifiedRoleScheduleInstanceBase) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleScheduleInstanceBase);
    }

    /**
     * Creates a UnifiedRoleScheduleInstanceBase with a new object
     *
     * @param newUnifiedRoleScheduleInstanceBase the new object to create
     * @return the created UnifiedRoleScheduleInstanceBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleInstanceBase post(@Nonnull final UnifiedRoleScheduleInstanceBase newUnifiedRoleScheduleInstanceBase) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleScheduleInstanceBase);
    }

    /**
     * Creates a UnifiedRoleScheduleInstanceBase with a new object
     *
     * @param newUnifiedRoleScheduleInstanceBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleInstanceBase> putAsync(@Nonnull final UnifiedRoleScheduleInstanceBase newUnifiedRoleScheduleInstanceBase) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleScheduleInstanceBase);
    }

    /**
     * Creates a UnifiedRoleScheduleInstanceBase with a new object
     *
     * @param newUnifiedRoleScheduleInstanceBase the object to create/update
     * @return the created UnifiedRoleScheduleInstanceBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleInstanceBase put(@Nonnull final UnifiedRoleScheduleInstanceBase newUnifiedRoleScheduleInstanceBase) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleScheduleInstanceBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleScheduleInstanceBaseRequest select(@Nonnull final String value) {
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
     public UnifiedRoleScheduleInstanceBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

