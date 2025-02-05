// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DriveItemCreateLinkRequest;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.Permission;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DriveItemCreateLinkParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Create Link Request Builder.
 */
public class DriveItemCreateLinkRequestBuilder extends BaseActionRequestBuilder<Permission> {

    /**
     * The request builder for this DriveItemCreateLink
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemCreateLinkRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DriveItemCreateLinkParameterSet body;
    /**
     * The request builder for this DriveItemCreateLink
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DriveItemCreateLinkRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DriveItemCreateLinkParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DriveItemCreateLinkRequest
     *
     * @param requestOptions the options for the request
     * @return the DriveItemCreateLinkRequest instance
     */
    @Nonnull
    public DriveItemCreateLinkRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DriveItemCreateLinkRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DriveItemCreateLinkRequest instance
     */
    @Nonnull
    public DriveItemCreateLinkRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DriveItemCreateLinkRequest request = new DriveItemCreateLinkRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
