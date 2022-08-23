// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrinterCreateOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Create Operation Request.
 */
public class PrinterCreateOperationRequest extends BaseRequest<PrinterCreateOperation> {
	
    /**
     * The request for the PrinterCreateOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterCreateOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterCreateOperation.class);
    }

    /**
     * Gets the PrinterCreateOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrinterCreateOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PrinterCreateOperation from the service
     *
     * @return the PrinterCreateOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrinterCreateOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrinterCreateOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PrinterCreateOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrinterCreateOperation with a source
     *
     * @param sourcePrinterCreateOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrinterCreateOperation> patchAsync(@Nonnull final PrinterCreateOperation sourcePrinterCreateOperation) {
        return sendAsync(HttpMethod.PATCH, sourcePrinterCreateOperation);
    }

    /**
     * Patches this PrinterCreateOperation with a source
     *
     * @param sourcePrinterCreateOperation the source object with updates
     * @return the updated PrinterCreateOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrinterCreateOperation patch(@Nonnull final PrinterCreateOperation sourcePrinterCreateOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrinterCreateOperation);
    }

    /**
     * Creates a PrinterCreateOperation with a new object
     *
     * @param newPrinterCreateOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrinterCreateOperation> postAsync(@Nonnull final PrinterCreateOperation newPrinterCreateOperation) {
        return sendAsync(HttpMethod.POST, newPrinterCreateOperation);
    }

    /**
     * Creates a PrinterCreateOperation with a new object
     *
     * @param newPrinterCreateOperation the new object to create
     * @return the created PrinterCreateOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrinterCreateOperation post(@Nonnull final PrinterCreateOperation newPrinterCreateOperation) throws ClientException {
        return send(HttpMethod.POST, newPrinterCreateOperation);
    }

    /**
     * Creates a PrinterCreateOperation with a new object
     *
     * @param newPrinterCreateOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrinterCreateOperation> putAsync(@Nonnull final PrinterCreateOperation newPrinterCreateOperation) {
        return sendAsync(HttpMethod.PUT, newPrinterCreateOperation);
    }

    /**
     * Creates a PrinterCreateOperation with a new object
     *
     * @param newPrinterCreateOperation the object to create/update
     * @return the created PrinterCreateOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrinterCreateOperation put(@Nonnull final PrinterCreateOperation newPrinterCreateOperation) throws ClientException {
        return send(HttpMethod.PUT, newPrinterCreateOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrinterCreateOperationRequest select(@Nonnull final String value) {
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
     public PrinterCreateOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

