// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AuthenticationMethodConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authentication Method Configuration Request.
 */
public interface IAuthenticationMethodConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AuthenticationMethodConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AuthenticationMethodConfiguration> callback);

    /**
     * Gets the AuthenticationMethodConfiguration from the service
     *
     * @return the AuthenticationMethodConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AuthenticationMethodConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AuthenticationMethodConfiguration with a source
     *
     * @param sourceAuthenticationMethodConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AuthenticationMethodConfiguration sourceAuthenticationMethodConfiguration, final ICallback<? super AuthenticationMethodConfiguration> callback);

    /**
     * Patches this AuthenticationMethodConfiguration with a source
     *
     * @param sourceAuthenticationMethodConfiguration the source object with updates
     * @return the updated AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodConfiguration patch(final AuthenticationMethodConfiguration sourceAuthenticationMethodConfiguration) throws ClientException;

    /**
     * Posts a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration, final ICallback<? super AuthenticationMethodConfiguration> callback);

    /**
     * Posts a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the new object to create
     * @return the created AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodConfiguration post(final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration) throws ClientException;

    /**
     * Posts a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration, final ICallback<? super AuthenticationMethodConfiguration> callback);

    /**
     * Posts a AuthenticationMethodConfiguration with a new object
     *
     * @param newAuthenticationMethodConfiguration the object to create/update
     * @return the created AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AuthenticationMethodConfiguration put(final AuthenticationMethodConfiguration newAuthenticationMethodConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAuthenticationMethodConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAuthenticationMethodConfigurationRequest expand(final String value);

}

