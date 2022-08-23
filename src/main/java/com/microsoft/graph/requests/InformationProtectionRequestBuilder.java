// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.InformationProtection;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Request Builder.
 */
public class InformationProtectionRequestBuilder extends BaseRequestBuilder<InformationProtection> {

    /**
     * The request builder for the InformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the InformationProtectionRequest instance
     */
    @Nonnull
    public InformationProtectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the InformationProtectionRequest instance
     */
    @Nonnull
    public InformationProtectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.InformationProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Bitlocker
     *
     * @return the BitlockerRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.BitlockerRequestBuilder bitlocker() {
        return new com.microsoft.graph.requests.BitlockerRequestBuilder(getRequestUrlWithAdditionalSegment("bitlocker"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ThreatAssessmentRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ThreatAssessmentRequestCollectionRequestBuilder threatAssessmentRequests() {
        return new com.microsoft.graph.requests.ThreatAssessmentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("threatAssessmentRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the ThreatAssessmentRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ThreatAssessmentRequestRequestBuilder threatAssessmentRequests(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ThreatAssessmentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("threatAssessmentRequests") + "/" + id, getClient(), null);
    }
}
