// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserDetailRequest;
import com.microsoft.graph.models.ReportRoot;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Detail Request Builder.
 */
public class ReportRootGetOffice365ActivationsUserDetailRequestBuilder extends BaseFunctionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this ReportRootGetOffice365ActivationsUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserDetailRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ReportRootGetOffice365ActivationsUserDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365ActivationsUserDetailRequest instance
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserDetailRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetOffice365ActivationsUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365ActivationsUserDetailRequest instance
     */
    @Nonnull
    public ReportRootGetOffice365ActivationsUserDetailRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365ActivationsUserDetailRequest request = new ReportRootGetOffice365ActivationsUserDetailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
