// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuditEvent;
import com.microsoft.graph.requests.AuditEventCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuditEventCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Event Collection Page.
 */
public class AuditEventCollectionPage extends BaseCollectionPage<AuditEvent, AuditEventCollectionRequestBuilder> {

    /**
     * A collection page for AuditEvent
     *
     * @param response the serialized AuditEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuditEventCollectionPage(@Nonnull final AuditEventCollectionResponse response, @Nonnull final AuditEventCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuditEvent
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuditEventCollectionPage(@Nonnull final java.util.List<AuditEvent> pageContents, @Nullable final AuditEventCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
