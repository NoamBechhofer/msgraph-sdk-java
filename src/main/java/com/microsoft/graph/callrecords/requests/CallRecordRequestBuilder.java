// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.callrecords.models.CallRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Request Builder.
 */
public class CallRecordRequestBuilder extends BaseRequestBuilder<CallRecord> {

    /**
     * The request builder for the CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CallRecordRequest instance
     */
    @Nonnull
    public CallRecordRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CallRecordRequest instance
     */
    @Nonnull
    public CallRecordRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.callrecords.requests.CallRecordRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Session collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.callrecords.requests.SessionCollectionRequestBuilder sessions() {
        return new com.microsoft.graph.callrecords.requests.SessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Session item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.callrecords.requests.SessionRequestBuilder sessions(@Nonnull final String id) {
        return new com.microsoft.graph.callrecords.requests.SessionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions") + "/" + id, getClient(), null);
    }
}
