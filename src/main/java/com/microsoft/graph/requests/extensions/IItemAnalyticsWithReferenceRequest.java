// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.requests.extensions.IItemActivityStatWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityStatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Analytics With Reference Request.
 */
public interface IItemAnalyticsWithReferenceRequest extends IHttpRequest {

    void post(final ItemAnalytics newItemAnalytics, final IJsonBackedObject payload, final ICallback<? super ItemAnalytics> callback);

    ItemAnalytics post(final ItemAnalytics newItemAnalytics, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ItemAnalytics> callback);

    ItemAnalytics get() throws ClientException;

	void delete(final ICallback<? super ItemAnalytics> callback);

	void delete() throws ClientException;

	void patch(final ItemAnalytics sourceItemAnalytics, final ICallback<? super ItemAnalytics> callback);

	ItemAnalytics patch(final ItemAnalytics sourceItemAnalytics) throws ClientException;

    IItemAnalyticsWithReferenceRequest select(final String value);

    IItemAnalyticsWithReferenceRequest expand(final String value);

}
