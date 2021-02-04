// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookFilterApplyBottomItemsFilterRequest;
import com.microsoft.graph.models.WorkbookFilter;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WorkbookFilterApplyBottomItemsFilterParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Bottom Items Filter Request Builder.
 */
public class WorkbookFilterApplyBottomItemsFilterRequestBuilder extends BaseActionRequestBuilder<WorkbookFilter> {

    private WorkbookFilterApplyBottomItemsFilterParameterSet body;
    /**
     * The request builder for this WorkbookFilterApplyBottomItemsFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFilterApplyBottomItemsFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFilterApplyBottomItemsFilterParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFilterApplyBottomItemsFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyBottomItemsFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyBottomItemsFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyBottomItemsFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyBottomItemsFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyBottomItemsFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookFilterApplyBottomItemsFilterRequest request = new WorkbookFilterApplyBottomItemsFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
