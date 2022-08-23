// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewStage;
import com.microsoft.graph.models.AccessReviewStageFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Stage Request Builder.
 */
public class AccessReviewStageRequestBuilder extends BaseRequestBuilder<AccessReviewStage> {

    /**
     * The request builder for the AccessReviewStage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewStageRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewStageRequest instance
     */
    @Nonnull
    public AccessReviewStageRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewStageRequest instance
     */
    @Nonnull
    public AccessReviewStageRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessReviewStageRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AccessReviewInstanceDecisionItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder decisions() {
        return new com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("decisions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewInstanceDecisionItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRequestBuilder decisions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRequestBuilder(getRequestUrlWithAdditionalSegment("decisions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AccessReviewStageStopRequestBuilder stop() {
        return new AccessReviewStageStopRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stop"), getClient(), null);
    }
}
