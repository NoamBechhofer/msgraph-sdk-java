// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Request Builder.
 */
public class WorkbookWorksheetRequestBuilder extends BaseRequestBuilder implements IWorkbookWorksheetRequestBuilder {

    /**
     * The request builder for the WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookWorksheetRequest instance
     */
    public IWorkbookWorksheetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookWorksheetRequest instance
     */
    public IWorkbookWorksheetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookWorksheetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookChartCollectionRequestBuilder charts() {
        return new WorkbookChartCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("charts"), getClient(), null);
    }

    public IWorkbookChartRequestBuilder charts(final String id) {
        return new WorkbookChartRequestBuilder(getRequestUrlWithAdditionalSegment("charts") + "/" + id, getClient(), null);
    }
    public IWorkbookNamedItemCollectionRequestBuilder names() {
        return new WorkbookNamedItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    public IWorkbookNamedItemRequestBuilder names(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    public IWorkbookPivotTableCollectionRequestBuilder pivotTables() {
        return new WorkbookPivotTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pivotTables"), getClient(), null);
    }

    public IWorkbookPivotTableRequestBuilder pivotTables(final String id) {
        return new WorkbookPivotTableRequestBuilder(getRequestUrlWithAdditionalSegment("pivotTables") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheetProtection
     *
     * @return the IWorkbookWorksheetProtectionRequestBuilder instance
     */
    public IWorkbookWorksheetProtectionRequestBuilder protection() {
        return new WorkbookWorksheetProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("protection"), getClient(), null);
    }
    public IWorkbookTableCollectionRequestBuilder tables() {
        return new WorkbookTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tables"), getClient(), null);
    }

    public IWorkbookTableRequestBuilder tables(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("tables") + "/" + id, getClient(), null);
    }

    public IWorkbookWorksheetCellRequestBuilder cell(final Integer row, final Integer column) {
        return new WorkbookWorksheetCellRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cell"), getClient(), null, row, column);
    }

    public IWorkbookWorksheetUsedRangeRequestBuilder usedRange() {
        return new WorkbookWorksheetUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null);
    }

    public IWorkbookWorksheetUsedRangeRequestBuilder usedRange(final Boolean valuesOnly) {
        return new WorkbookWorksheetUsedRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usedRange"), getClient(), null, valuesOnly);
    }

    public IWorkbookWorksheetRangeRequestBuilder range() {
        return new WorkbookWorksheetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookWorksheetRangeRequestBuilder range(final String address) {
        return new WorkbookWorksheetRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null, address);
    }
}
