// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartAxis;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Request Builder.
 */
public class WorkbookChartAxisRequestBuilder extends BaseRequestBuilder<WorkbookChartAxis> {

    /**
     * The request builder for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartAxisRequest instance
     */
    @Nonnull
    public WorkbookChartAxisRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartAxisRequest instance
     */
    @Nonnull
    public WorkbookChartAxisRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WorkbookChartAxisRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartAxisFormat
     *
     * @return the WorkbookChartAxisFormatRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkbookChartAxisFormatRequestBuilder format() {
        return new com.microsoft.graph.requests.WorkbookChartAxisFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the WorkbookChartGridlinesRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkbookChartGridlinesRequestBuilder majorGridlines() {
        return new com.microsoft.graph.requests.WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("majorGridlines"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the WorkbookChartGridlinesRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkbookChartGridlinesRequestBuilder minorGridlines() {
        return new com.microsoft.graph.requests.WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("minorGridlines"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAxisTitle
     *
     * @return the WorkbookChartAxisTitleRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkbookChartAxisTitleRequestBuilder title() {
        return new com.microsoft.graph.requests.WorkbookChartAxisTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }
}
