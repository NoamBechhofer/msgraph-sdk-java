// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CustomCalloutExtension;
import com.microsoft.graph.requests.CustomCalloutExtensionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CustomCalloutExtensionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Callout Extension Collection Page.
 */
public class CustomCalloutExtensionCollectionPage extends BaseCollectionPage<CustomCalloutExtension, CustomCalloutExtensionCollectionRequestBuilder> {

    /**
     * A collection page for CustomCalloutExtension
     *
     * @param response the serialized CustomCalloutExtensionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CustomCalloutExtensionCollectionPage(@Nonnull final CustomCalloutExtensionCollectionResponse response, @Nonnull final CustomCalloutExtensionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CustomCalloutExtension
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CustomCalloutExtensionCollectionPage(@Nonnull final java.util.List<CustomCalloutExtension> pageContents, @Nullable final CustomCalloutExtensionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
