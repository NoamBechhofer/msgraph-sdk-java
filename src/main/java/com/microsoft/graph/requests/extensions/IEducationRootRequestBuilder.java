// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Root Request Builder.
 */
public interface IEducationRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEducationRootRequest instance
     */
    IEducationRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IEducationRootRequest instance
     */
    IEducationRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IEducationClassCollectionRequestBuilder classes();

    IEducationClassRequestBuilder classes(final String id);

    /**
     * Gets the request builder for EducationUser
     *
     * @return the IEducationUserRequestBuilder instance
     */
    IEducationUserRequestBuilder me();

    IEducationSchoolCollectionRequestBuilder schools();

    IEducationSchoolRequestBuilder schools(final String id);

    IEducationUserCollectionRequestBuilder users();

    IEducationUserRequestBuilder users(final String id);

}