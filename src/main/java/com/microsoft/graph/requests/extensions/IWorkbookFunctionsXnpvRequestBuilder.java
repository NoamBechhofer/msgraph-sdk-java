// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsXnpvRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Xnpv Request Builder.
 */
public interface IWorkbookFunctionsXnpvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsXnpvRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXnpvRequest instance
     */
    IWorkbookFunctionsXnpvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsXnpvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXnpvRequest instance
     */
    IWorkbookFunctionsXnpvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
