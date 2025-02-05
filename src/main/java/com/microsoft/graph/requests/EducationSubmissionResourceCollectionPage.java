// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.EducationSubmissionResource;
import com.microsoft.graph.requests.EducationSubmissionResourceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.EducationSubmissionResourceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission Resource Collection Page.
 */
public class EducationSubmissionResourceCollectionPage extends BaseCollectionPage<EducationSubmissionResource, EducationSubmissionResourceCollectionRequestBuilder> {

    /**
     * A collection page for EducationSubmissionResource
     *
     * @param response the serialized EducationSubmissionResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationSubmissionResourceCollectionPage(@Nonnull final EducationSubmissionResourceCollectionResponse response, @Nonnull final EducationSubmissionResourceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for EducationSubmissionResource
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EducationSubmissionResourceCollectionPage(@Nonnull final java.util.List<EducationSubmissionResource> pageContents, @Nullable final EducationSubmissionResourceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
