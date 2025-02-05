// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuthenticationCombinationConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Combination Configuration Request.
 */
public class AuthenticationCombinationConfigurationRequest extends BaseRequest<AuthenticationCombinationConfiguration> {
	
    /**
     * The request for the AuthenticationCombinationConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AuthenticationCombinationConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AuthenticationCombinationConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AuthenticationCombinationConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationCombinationConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthenticationCombinationConfiguration.class);
    }

    /**
     * Gets the AuthenticationCombinationConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationCombinationConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AuthenticationCombinationConfiguration from the service
     *
     * @return the AuthenticationCombinationConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationCombinationConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationCombinationConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AuthenticationCombinationConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuthenticationCombinationConfiguration with a source
     *
     * @param sourceAuthenticationCombinationConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationCombinationConfiguration> patchAsync(@Nonnull final AuthenticationCombinationConfiguration sourceAuthenticationCombinationConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAuthenticationCombinationConfiguration);
    }

    /**
     * Patches this AuthenticationCombinationConfiguration with a source
     *
     * @param sourceAuthenticationCombinationConfiguration the source object with updates
     * @return the updated AuthenticationCombinationConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationCombinationConfiguration patch(@Nonnull final AuthenticationCombinationConfiguration sourceAuthenticationCombinationConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthenticationCombinationConfiguration);
    }

    /**
     * Creates a AuthenticationCombinationConfiguration with a new object
     *
     * @param newAuthenticationCombinationConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationCombinationConfiguration> postAsync(@Nonnull final AuthenticationCombinationConfiguration newAuthenticationCombinationConfiguration) {
        return sendAsync(HttpMethod.POST, newAuthenticationCombinationConfiguration);
    }

    /**
     * Creates a AuthenticationCombinationConfiguration with a new object
     *
     * @param newAuthenticationCombinationConfiguration the new object to create
     * @return the created AuthenticationCombinationConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationCombinationConfiguration post(@Nonnull final AuthenticationCombinationConfiguration newAuthenticationCombinationConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAuthenticationCombinationConfiguration);
    }

    /**
     * Creates a AuthenticationCombinationConfiguration with a new object
     *
     * @param newAuthenticationCombinationConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthenticationCombinationConfiguration> putAsync(@Nonnull final AuthenticationCombinationConfiguration newAuthenticationCombinationConfiguration) {
        return sendAsync(HttpMethod.PUT, newAuthenticationCombinationConfiguration);
    }

    /**
     * Creates a AuthenticationCombinationConfiguration with a new object
     *
     * @param newAuthenticationCombinationConfiguration the object to create/update
     * @return the created AuthenticationCombinationConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthenticationCombinationConfiguration put(@Nonnull final AuthenticationCombinationConfiguration newAuthenticationCombinationConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAuthenticationCombinationConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AuthenticationCombinationConfigurationRequest select(@Nonnull final String value) {
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
     public AuthenticationCombinationConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

