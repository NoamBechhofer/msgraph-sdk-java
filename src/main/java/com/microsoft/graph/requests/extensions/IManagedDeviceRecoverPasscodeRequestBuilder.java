// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceRecoverPasscodeRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Recover Passcode Request Builder.
 */
public interface IManagedDeviceRecoverPasscodeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceRecoverPasscodeRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRecoverPasscodeRequest instance
     */
    IManagedDeviceRecoverPasscodeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IManagedDeviceRecoverPasscodeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRecoverPasscodeRequest instance
     */
    IManagedDeviceRecoverPasscodeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
