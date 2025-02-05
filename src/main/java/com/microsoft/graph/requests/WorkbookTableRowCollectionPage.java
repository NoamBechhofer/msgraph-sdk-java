// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookTableRow;
import com.microsoft.graph.requests.WorkbookTableRowCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WorkbookTableRowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Collection Page.
 */
public class WorkbookTableRowCollectionPage extends BaseCollectionPage<WorkbookTableRow, WorkbookTableRowCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookTableRow
     *
     * @param response the serialized WorkbookTableRowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookTableRowCollectionPage(@Nonnull final WorkbookTableRowCollectionResponse response, @Nonnull final WorkbookTableRowCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookTableRow
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookTableRowCollectionPage(@Nonnull final java.util.List<WorkbookTableRow> pageContents, @Nullable final WorkbookTableRowCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
