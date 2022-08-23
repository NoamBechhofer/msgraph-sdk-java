// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidManagedAppProtection;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection Request.
 */
public class AndroidManagedAppProtectionRequest extends BaseRequest<AndroidManagedAppProtection> {
	
    /**
     * The request for the AndroidManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedAppProtection.class);
    }

    /**
     * Gets the AndroidManagedAppProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidManagedAppProtection from the service
     *
     * @return the AndroidManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidManagedAppProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidManagedAppProtection with a source
     *
     * @param sourceAndroidManagedAppProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppProtection> patchAsync(@Nonnull final AndroidManagedAppProtection sourceAndroidManagedAppProtection) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidManagedAppProtection);
    }

    /**
     * Patches this AndroidManagedAppProtection with a source
     *
     * @param sourceAndroidManagedAppProtection the source object with updates
     * @return the updated AndroidManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppProtection patch(@Nonnull final AndroidManagedAppProtection sourceAndroidManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidManagedAppProtection);
    }

    /**
     * Creates a AndroidManagedAppProtection with a new object
     *
     * @param newAndroidManagedAppProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppProtection> postAsync(@Nonnull final AndroidManagedAppProtection newAndroidManagedAppProtection) {
        return sendAsync(HttpMethod.POST, newAndroidManagedAppProtection);
    }

    /**
     * Creates a AndroidManagedAppProtection with a new object
     *
     * @param newAndroidManagedAppProtection the new object to create
     * @return the created AndroidManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppProtection post(@Nonnull final AndroidManagedAppProtection newAndroidManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newAndroidManagedAppProtection);
    }

    /**
     * Creates a AndroidManagedAppProtection with a new object
     *
     * @param newAndroidManagedAppProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedAppProtection> putAsync(@Nonnull final AndroidManagedAppProtection newAndroidManagedAppProtection) {
        return sendAsync(HttpMethod.PUT, newAndroidManagedAppProtection);
    }

    /**
     * Creates a AndroidManagedAppProtection with a new object
     *
     * @param newAndroidManagedAppProtection the object to create/update
     * @return the created AndroidManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedAppProtection put(@Nonnull final AndroidManagedAppProtection newAndroidManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newAndroidManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidManagedAppProtectionRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AndroidManagedAppProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

