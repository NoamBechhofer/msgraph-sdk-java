// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCoupDaysNcRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Coup Days Nc Request Builder.
 */
public interface IWorkbookFunctionsCoupDaysNcRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCoupDaysNcRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCoupDaysNcRequest instance
     */
    IWorkbookFunctionsCoupDaysNcRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsCoupDaysNcRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCoupDaysNcRequest instance
     */
    IWorkbookFunctionsCoupDaysNcRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
