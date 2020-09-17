// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Teams Device Usage User Counts Request Builder.
 */
public interface IReportRootGetTeamsDeviceUsageUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsDeviceUsageUserCountsRequest instance
     */
    IReportRootGetTeamsDeviceUsageUserCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetTeamsDeviceUsageUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsDeviceUsageUserCountsRequest instance
     */
    IReportRootGetTeamsDeviceUsageUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
