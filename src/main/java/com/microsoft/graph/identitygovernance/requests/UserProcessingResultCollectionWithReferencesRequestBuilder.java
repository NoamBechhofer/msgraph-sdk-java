// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.Workflow;
import com.microsoft.graph.identitygovernance.models.UserProcessingResult;
import com.microsoft.graph.identitygovernance.models.UserSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Processing Result Collection With References Request Builder.
 */
public class UserProcessingResultCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<UserProcessingResult, UserProcessingResultWithReferenceRequest, UserProcessingResultReferenceRequestBuilder, UserProcessingResultWithReferenceRequestBuilder, UserProcessingResultCollectionResponse, UserProcessingResultCollectionWithReferencesPage, UserProcessingResultCollectionReferenceRequest, UserProcessingResultCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of Workflow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserProcessingResultCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserProcessingResultReferenceRequestBuilder.class, UserProcessingResultCollectionReferenceRequest.class, UserProcessingResultCollectionReferenceRequestBuilder.class);
    }
}
