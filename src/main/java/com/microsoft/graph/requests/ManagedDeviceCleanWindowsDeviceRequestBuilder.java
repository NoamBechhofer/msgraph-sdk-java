// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ManagedDeviceCleanWindowsDeviceRequest;
import com.microsoft.graph.models.ManagedDevice;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceCleanWindowsDeviceParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Clean Windows Device Request Builder.
 */
public class ManagedDeviceCleanWindowsDeviceRequestBuilder extends BaseActionRequestBuilder<ManagedDevice> {

    private ManagedDeviceCleanWindowsDeviceParameterSet body;
    /**
     * The request builder for this ManagedDeviceCleanWindowsDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedDeviceCleanWindowsDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedDeviceCleanWindowsDeviceParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedDeviceCleanWindowsDeviceRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceCleanWindowsDeviceRequest instance
     */
    @Nonnull
    public ManagedDeviceCleanWindowsDeviceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceCleanWindowsDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceCleanWindowsDeviceRequest instance
     */
    @Nonnull
    public ManagedDeviceCleanWindowsDeviceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagedDeviceCleanWindowsDeviceRequest request = new ManagedDeviceCleanWindowsDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
