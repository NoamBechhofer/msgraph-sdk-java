// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.EventTentativelyAcceptRequest;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.TimeSlot;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.EventTentativelyAcceptParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Tentatively Accept Request Builder.
 */
public class EventTentativelyAcceptRequestBuilder extends BaseActionRequestBuilder<Event> {

    /**
     * The request builder for this EventTentativelyAccept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventTentativelyAcceptRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private EventTentativelyAcceptParameterSet body;
    /**
     * The request builder for this EventTentativelyAccept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public EventTentativelyAcceptRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final EventTentativelyAcceptParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the EventTentativelyAcceptRequest
     *
     * @param requestOptions the options for the request
     * @return the EventTentativelyAcceptRequest instance
     */
    @Nonnull
    public EventTentativelyAcceptRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EventTentativelyAcceptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EventTentativelyAcceptRequest instance
     */
    @Nonnull
    public EventTentativelyAcceptRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EventTentativelyAcceptRequest request = new EventTentativelyAcceptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
