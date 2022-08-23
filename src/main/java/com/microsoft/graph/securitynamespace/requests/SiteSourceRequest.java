// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.SiteSource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Source Request.
 */
public class SiteSourceRequest extends BaseRequest<SiteSource> {
	
    /**
     * The request for the SiteSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteSourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteSource.class);
    }

    /**
     * Gets the SiteSource from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SiteSource> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SiteSource from the service
     *
     * @return the SiteSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteSource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SiteSource> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SiteSource delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SiteSource with a source
     *
     * @param sourceSiteSource the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SiteSource> patchAsync(@Nonnull final SiteSource sourceSiteSource) {
        return sendAsync(HttpMethod.PATCH, sourceSiteSource);
    }

    /**
     * Patches this SiteSource with a source
     *
     * @param sourceSiteSource the source object with updates
     * @return the updated SiteSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteSource patch(@Nonnull final SiteSource sourceSiteSource) throws ClientException {
        return send(HttpMethod.PATCH, sourceSiteSource);
    }

    /**
     * Creates a SiteSource with a new object
     *
     * @param newSiteSource the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SiteSource> postAsync(@Nonnull final SiteSource newSiteSource) {
        return sendAsync(HttpMethod.POST, newSiteSource);
    }

    /**
     * Creates a SiteSource with a new object
     *
     * @param newSiteSource the new object to create
     * @return the created SiteSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteSource post(@Nonnull final SiteSource newSiteSource) throws ClientException {
        return send(HttpMethod.POST, newSiteSource);
    }

    /**
     * Creates a SiteSource with a new object
     *
     * @param newSiteSource the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SiteSource> putAsync(@Nonnull final SiteSource newSiteSource) {
        return sendAsync(HttpMethod.PUT, newSiteSource);
    }

    /**
     * Creates a SiteSource with a new object
     *
     * @param newSiteSource the object to create/update
     * @return the created SiteSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SiteSource put(@Nonnull final SiteSource newSiteSource) throws ClientException {
        return send(HttpMethod.PUT, newSiteSource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SiteSourceRequest select(@Nonnull final String value) {
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
     public SiteSourceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

