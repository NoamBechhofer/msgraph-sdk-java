// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsHelloForBusinessAuthenticationMethod;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Hello For Business Authentication Method Request.
 */
public interface IWindowsHelloForBusinessAuthenticationMethodRequest extends IHttpRequest {

    /**
     * Gets the WindowsHelloForBusinessAuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsHelloForBusinessAuthenticationMethod> callback);

    /**
     * Gets the WindowsHelloForBusinessAuthenticationMethod from the service
     *
     * @return the WindowsHelloForBusinessAuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHelloForBusinessAuthenticationMethod get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsHelloForBusinessAuthenticationMethod> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsHelloForBusinessAuthenticationMethod with a source
     *
     * @param sourceWindowsHelloForBusinessAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsHelloForBusinessAuthenticationMethod sourceWindowsHelloForBusinessAuthenticationMethod, final ICallback<? super WindowsHelloForBusinessAuthenticationMethod> callback);

    /**
     * Patches this WindowsHelloForBusinessAuthenticationMethod with a source
     *
     * @param sourceWindowsHelloForBusinessAuthenticationMethod the source object with updates
     * @return the updated WindowsHelloForBusinessAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHelloForBusinessAuthenticationMethod patch(final WindowsHelloForBusinessAuthenticationMethod sourceWindowsHelloForBusinessAuthenticationMethod) throws ClientException;

    /**
     * Posts a WindowsHelloForBusinessAuthenticationMethod with a new object
     *
     * @param newWindowsHelloForBusinessAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsHelloForBusinessAuthenticationMethod newWindowsHelloForBusinessAuthenticationMethod, final ICallback<? super WindowsHelloForBusinessAuthenticationMethod> callback);

    /**
     * Posts a WindowsHelloForBusinessAuthenticationMethod with a new object
     *
     * @param newWindowsHelloForBusinessAuthenticationMethod the new object to create
     * @return the created WindowsHelloForBusinessAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHelloForBusinessAuthenticationMethod post(final WindowsHelloForBusinessAuthenticationMethod newWindowsHelloForBusinessAuthenticationMethod) throws ClientException;

    /**
     * Posts a WindowsHelloForBusinessAuthenticationMethod with a new object
     *
     * @param newWindowsHelloForBusinessAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsHelloForBusinessAuthenticationMethod newWindowsHelloForBusinessAuthenticationMethod, final ICallback<? super WindowsHelloForBusinessAuthenticationMethod> callback);

    /**
     * Posts a WindowsHelloForBusinessAuthenticationMethod with a new object
     *
     * @param newWindowsHelloForBusinessAuthenticationMethod the object to create/update
     * @return the created WindowsHelloForBusinessAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsHelloForBusinessAuthenticationMethod put(final WindowsHelloForBusinessAuthenticationMethod newWindowsHelloForBusinessAuthenticationMethod) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsHelloForBusinessAuthenticationMethodRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsHelloForBusinessAuthenticationMethodRequest expand(final String value);

}

