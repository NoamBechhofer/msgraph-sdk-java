// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Request.
 */
public class TeamsAppRequest extends BaseRequest<TeamsApp> {
	
    /**
     * The request for the TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsApp.class);
    }

    /**
     * Gets the TeamsApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsApp from the service
     *
     * @return the TeamsApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsApp with a source
     *
     * @param sourceTeamsApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsApp> patchAsync(@Nonnull final TeamsApp sourceTeamsApp) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsApp);
    }

    /**
     * Patches this TeamsApp with a source
     *
     * @param sourceTeamsApp the source object with updates
     * @return the updated TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsApp patch(@Nonnull final TeamsApp sourceTeamsApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsApp);
    }

    /**
     * Creates a TeamsApp with a new object
     *
     * @param newTeamsApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsApp> postAsync(@Nonnull final TeamsApp newTeamsApp) {
        return sendAsync(HttpMethod.POST, newTeamsApp);
    }

    /**
     * Creates a TeamsApp with a new object
     *
     * @param newTeamsApp the new object to create
     * @return the created TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsApp post(@Nonnull final TeamsApp newTeamsApp) throws ClientException {
        return send(HttpMethod.POST, newTeamsApp);
    }

    /**
     * Creates a TeamsApp with a new object
     *
     * @param newTeamsApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsApp> putAsync(@Nonnull final TeamsApp newTeamsApp) {
        return sendAsync(HttpMethod.PUT, newTeamsApp);
    }

    /**
     * Creates a TeamsApp with a new object
     *
     * @param newTeamsApp the object to create/update
     * @return the created TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsApp put(@Nonnull final TeamsApp newTeamsApp) throws ClientException {
        return send(HttpMethod.PUT, newTeamsApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsAppRequest select(@Nonnull final String value) {
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
     public TeamsAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

