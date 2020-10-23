// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Subscription;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription Collection Request Builder.
 */
public class SubscriptionCollectionRequestBuilder extends BaseCollectionRequestBuilder<Subscription, SubscriptionRequestBuilder, SubscriptionCollectionResponse, SubscriptionCollectionPage, SubscriptionCollectionRequest> {

    /**
     * The request builder for this collection of Subscription
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscriptionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SubscriptionRequestBuilder.class, SubscriptionCollectionRequest.class);
    }


}
