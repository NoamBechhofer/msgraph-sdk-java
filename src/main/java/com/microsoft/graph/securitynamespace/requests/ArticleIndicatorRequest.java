// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.ArticleIndicator;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Article Indicator Request.
 */
public class ArticleIndicatorRequest extends BaseRequest<ArticleIndicator> {
	
    /**
     * The request for the ArticleIndicator
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ArticleIndicatorRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ArticleIndicator.class);
    }

    /**
     * Gets the ArticleIndicator from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ArticleIndicator> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ArticleIndicator from the service
     *
     * @return the ArticleIndicator from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ArticleIndicator get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ArticleIndicator> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ArticleIndicator delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ArticleIndicator with a source
     *
     * @param sourceArticleIndicator the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ArticleIndicator> patchAsync(@Nonnull final ArticleIndicator sourceArticleIndicator) {
        return sendAsync(HttpMethod.PATCH, sourceArticleIndicator);
    }

    /**
     * Patches this ArticleIndicator with a source
     *
     * @param sourceArticleIndicator the source object with updates
     * @return the updated ArticleIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ArticleIndicator patch(@Nonnull final ArticleIndicator sourceArticleIndicator) throws ClientException {
        return send(HttpMethod.PATCH, sourceArticleIndicator);
    }

    /**
     * Creates a ArticleIndicator with a new object
     *
     * @param newArticleIndicator the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ArticleIndicator> postAsync(@Nonnull final ArticleIndicator newArticleIndicator) {
        return sendAsync(HttpMethod.POST, newArticleIndicator);
    }

    /**
     * Creates a ArticleIndicator with a new object
     *
     * @param newArticleIndicator the new object to create
     * @return the created ArticleIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ArticleIndicator post(@Nonnull final ArticleIndicator newArticleIndicator) throws ClientException {
        return send(HttpMethod.POST, newArticleIndicator);
    }

    /**
     * Creates a ArticleIndicator with a new object
     *
     * @param newArticleIndicator the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ArticleIndicator> putAsync(@Nonnull final ArticleIndicator newArticleIndicator) {
        return sendAsync(HttpMethod.PUT, newArticleIndicator);
    }

    /**
     * Creates a ArticleIndicator with a new object
     *
     * @param newArticleIndicator the object to create/update
     * @return the created ArticleIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ArticleIndicator put(@Nonnull final ArticleIndicator newArticleIndicator) throws ClientException {
        return send(HttpMethod.PUT, newArticleIndicator);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ArticleIndicatorRequest select(@Nonnull final String value) {
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
     public ArticleIndicatorRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

