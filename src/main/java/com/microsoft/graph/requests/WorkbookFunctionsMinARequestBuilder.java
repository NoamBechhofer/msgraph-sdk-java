// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookFunctionsMinARequest;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.models.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WorkbookFunctionsMinAParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Min ARequest Builder.
 */
public class WorkbookFunctionsMinARequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    private WorkbookFunctionsMinAParameterSet body;
    /**
     * The request builder for this WorkbookFunctionsMinA
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsMinARequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsMinAParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFunctionsMinARequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsMinARequest instance
     */
    @Nonnull
    public WorkbookFunctionsMinARequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsMinARequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsMinARequest instance
     */
    @Nonnull
    public WorkbookFunctionsMinARequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookFunctionsMinARequest request = new WorkbookFunctionsMinARequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
