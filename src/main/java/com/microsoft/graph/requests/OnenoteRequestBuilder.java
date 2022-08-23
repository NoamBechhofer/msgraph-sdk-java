// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Onenote;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Request Builder.
 */
public class OnenoteRequestBuilder extends BaseRequestBuilder<Onenote> {

    /**
     * The request builder for the Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OnenoteRequest instance
     */
    @Nonnull
    public OnenoteRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OnenoteRequest instance
     */
    @Nonnull
    public OnenoteRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.OnenoteRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Notebook collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.NotebookCollectionRequestBuilder notebooks() {
        return new com.microsoft.graph.requests.NotebookCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notebooks"), getClient(), null);
    }

    /**
     * Gets a request builder for the Notebook item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.NotebookRequestBuilder notebooks(@Nonnull final String id) {
        return new com.microsoft.graph.requests.NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("notebooks") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnenoteOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenoteOperationCollectionRequestBuilder operations() {
        return new com.microsoft.graph.requests.OnenoteOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnenoteOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenoteOperationRequestBuilder operations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.OnenoteOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnenotePage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenotePageCollectionRequestBuilder pages() {
        return new com.microsoft.graph.requests.OnenotePageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pages"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnenotePage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenotePageRequestBuilder pages(@Nonnull final String id) {
        return new com.microsoft.graph.requests.OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment("pages") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnenoteResource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenoteResourceCollectionRequestBuilder resources() {
        return new com.microsoft.graph.requests.OnenoteResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnenoteResource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenoteResourceRequestBuilder resources(@Nonnull final String id) {
        return new com.microsoft.graph.requests.OnenoteResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SectionGroup collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SectionGroupCollectionRequestBuilder sectionGroups() {
        return new com.microsoft.graph.requests.SectionGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the SectionGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SectionGroupRequestBuilder sectionGroups(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnenoteSection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenoteSectionCollectionRequestBuilder sections() {
        return new com.microsoft.graph.requests.OnenoteSectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnenoteSection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.OnenoteSectionRequestBuilder sections(@Nonnull final String id) {
        return new com.microsoft.graph.requests.OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections") + "/" + id, getClient(), null);
    }
}
