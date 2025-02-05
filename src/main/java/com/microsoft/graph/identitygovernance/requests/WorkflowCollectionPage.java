// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;
import com.microsoft.graph.identitygovernance.models.Workflow;
import com.microsoft.graph.identitygovernance.requests.WorkflowCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.identitygovernance.requests.WorkflowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workflow Collection Page.
 */
public class WorkflowCollectionPage extends BaseCollectionPage<Workflow, WorkflowCollectionRequestBuilder> {

    /**
     * A collection page for Workflow
     *
     * @param response the serialized WorkflowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkflowCollectionPage(@Nonnull final WorkflowCollectionResponse response, @Nonnull final WorkflowCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Workflow
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkflowCollectionPage(@Nonnull final java.util.List<Workflow> pageContents, @Nullable final WorkflowCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
