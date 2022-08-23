// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationRoot;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Root Request Builder.
 */
public class EducationRootRequestBuilder extends BaseRequestBuilder<EducationRoot> {

    /**
     * The request builder for the EducationRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationRootRequest instance
     */
    @Nonnull
    public EducationRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationRootRequest instance
     */
    @Nonnull
    public EducationRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EducationRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EducationClass collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationClassCollectionRequestBuilder classes() {
        return new com.microsoft.graph.requests.EducationClassCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationClass item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationClassRequestBuilder classes(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationClassRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EducationUser
     *
     * @return the EducationUserRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserRequestBuilder me() {
        return new com.microsoft.graph.requests.EducationUserRequestBuilder(getRequestUrlWithAdditionalSegment("me"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationSchool collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationSchoolCollectionRequestBuilder schools() {
        return new com.microsoft.graph.requests.EducationSchoolCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationSchool item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationSchoolRequestBuilder schools(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationSchoolRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserCollectionRequestBuilder users() {
        return new com.microsoft.graph.requests.EducationUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserRequestBuilder users(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationUserRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }
}
