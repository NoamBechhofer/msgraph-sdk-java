// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;
import com.microsoft.graph.identitygovernance.models.TaskProcessingResult;
import com.microsoft.graph.identitygovernance.requests.TaskProcessingResultCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.identitygovernance.requests.TaskProcessingResultCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Processing Result Collection Page.
 */
public class TaskProcessingResultCollectionPage extends BaseCollectionPage<TaskProcessingResult, TaskProcessingResultCollectionRequestBuilder> {

    /**
     * A collection page for TaskProcessingResult
     *
     * @param response the serialized TaskProcessingResultCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TaskProcessingResultCollectionPage(@Nonnull final TaskProcessingResultCollectionResponse response, @Nonnull final TaskProcessingResultCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TaskProcessingResult
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TaskProcessingResultCollectionPage(@Nonnull final java.util.List<TaskProcessingResult> pageContents, @Nullable final TaskProcessingResultCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
