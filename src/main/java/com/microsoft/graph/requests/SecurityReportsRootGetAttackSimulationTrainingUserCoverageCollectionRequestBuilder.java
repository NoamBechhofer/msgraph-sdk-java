// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationTrainingUserCoverage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequest;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Reports Root Get Attack Simulation Training User Coverage Collection Request Builder.
 */
public class SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AttackSimulationTrainingUserCoverage, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionResponse, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionPage, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequest> {

    /**
     * The request builder for this collection of SecurityReportsRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequestBuilder.class, SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequest instance
     */
    @Override
    @Nonnull
    public SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SecurityReportsRootGetAttackSimulationTrainingUserCoverageCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
