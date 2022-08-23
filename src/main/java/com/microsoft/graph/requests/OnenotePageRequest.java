// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OnenotePage;
import com.microsoft.graph.models.OnenoteOperation;
import com.microsoft.graph.models.OnenotePatchContentCommand;
import com.microsoft.graph.models.OnenotePagePreview;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Request.
 */
public class OnenotePageRequest extends BaseRequest<OnenotePage> {
	
    /**
     * The request for the OnenotePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenotePageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenotePage.class);
    }

    /**
     * Gets the OnenotePage from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OnenotePage from the service
     *
     * @return the OnenotePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OnenotePage delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> patchAsync(@Nonnull final OnenotePage sourceOnenotePage) {
        return sendAsync(HttpMethod.PATCH, sourceOnenotePage);
    }

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @return the updated OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage patch(@Nonnull final OnenotePage sourceOnenotePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> postAsync(@Nonnull final byte[] newOnenotePage) {
        return sendAsync(HttpMethod.POST, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage post(@Nonnull final byte[] newOnenotePage) throws ClientException {
        return send(HttpMethod.POST, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenotePage> putAsync(@Nonnull final OnenotePage newOnenotePage) {
        return sendAsync(HttpMethod.PUT, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenotePage put(@Nonnull final OnenotePage newOnenotePage) throws ClientException {
        return send(HttpMethod.PUT, newOnenotePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenotePageRequest select(@Nonnull final String value) {
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
     public OnenotePageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

