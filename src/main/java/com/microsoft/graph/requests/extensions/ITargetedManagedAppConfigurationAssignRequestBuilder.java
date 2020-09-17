// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationAssignRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Targeted Managed App Configuration Assign Request Builder.
 */
public interface ITargetedManagedAppConfigurationAssignRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITargetedManagedAppConfigurationAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppConfigurationAssignRequest instance
     */
    ITargetedManagedAppConfigurationAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITargetedManagedAppConfigurationAssignRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppConfigurationAssignRequest instance
     */
    ITargetedManagedAppConfigurationAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
