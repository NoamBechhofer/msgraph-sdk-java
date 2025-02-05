// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.requests.SiteCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.SiteCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection Page.
 */
public class SiteCollectionPage extends BaseCollectionPage<Site, SiteCollectionRequestBuilder> {

    /**
     * A collection page for Site
     *
     * @param response the serialized SiteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SiteCollectionPage(@Nonnull final SiteCollectionResponse response, @Nonnull final SiteCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Site
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SiteCollectionPage(@Nonnull final java.util.List<Site> pageContents, @Nullable final SiteCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
