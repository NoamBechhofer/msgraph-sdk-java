// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetAddRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Collection Request Builder.
 */
public class WorkbookWorksheetCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookWorksheet, WorkbookWorksheetRequestBuilder, WorkbookWorksheetCollectionResponse, WorkbookWorksheetCollectionPage, WorkbookWorksheetCollectionRequest> {

    /**
     * The request builder for this collection of Workbook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookWorksheetRequestBuilder.class, WorkbookWorksheetCollectionRequest.class);
    }



    public WorkbookWorksheetAddRequestBuilder add(final String name) {
        return new WorkbookWorksheetAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, name);
    }
}
