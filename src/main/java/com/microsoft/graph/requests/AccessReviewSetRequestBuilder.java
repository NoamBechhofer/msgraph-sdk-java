// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewSet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Set Request Builder.
 */
public class AccessReviewSetRequestBuilder extends BaseRequestBuilder<AccessReviewSet> {

    /**
     * The request builder for the AccessReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewSetRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewSetRequest instance
     */
    @Nonnull
    public AccessReviewSetRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewSetRequest instance
     */
    @Nonnull
    public AccessReviewSetRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessReviewSetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AccessReviewScheduleDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessReviewScheduleDefinitionCollectionRequestBuilder definitions() {
        return new com.microsoft.graph.requests.AccessReviewScheduleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("definitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewScheduleDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessReviewScheduleDefinitionRequestBuilder definitions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AccessReviewScheduleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("definitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessReviewHistoryDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessReviewHistoryDefinitionCollectionRequestBuilder historyDefinitions() {
        return new com.microsoft.graph.requests.AccessReviewHistoryDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("historyDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewHistoryDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessReviewHistoryDefinitionRequestBuilder historyDefinitions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AccessReviewHistoryDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("historyDefinitions") + "/" + id, getClient(), null);
    }
}
