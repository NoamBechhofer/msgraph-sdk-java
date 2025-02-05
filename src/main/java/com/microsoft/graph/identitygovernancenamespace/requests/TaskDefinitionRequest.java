// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.TaskDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Task Definition Request.
 */
public class TaskDefinitionRequest extends BaseRequest<TaskDefinition> {
	
    /**
     * The request for the TaskDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TaskDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TaskDefinition.class);
    }

    /**
     * Gets the TaskDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaskDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TaskDefinition from the service
     *
     * @return the TaskDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaskDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaskDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TaskDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TaskDefinition with a source
     *
     * @param sourceTaskDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaskDefinition> patchAsync(@Nonnull final TaskDefinition sourceTaskDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceTaskDefinition);
    }

    /**
     * Patches this TaskDefinition with a source
     *
     * @param sourceTaskDefinition the source object with updates
     * @return the updated TaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaskDefinition patch(@Nonnull final TaskDefinition sourceTaskDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceTaskDefinition);
    }

    /**
     * Creates a TaskDefinition with a new object
     *
     * @param newTaskDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaskDefinition> postAsync(@Nonnull final TaskDefinition newTaskDefinition) {
        return sendAsync(HttpMethod.POST, newTaskDefinition);
    }

    /**
     * Creates a TaskDefinition with a new object
     *
     * @param newTaskDefinition the new object to create
     * @return the created TaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaskDefinition post(@Nonnull final TaskDefinition newTaskDefinition) throws ClientException {
        return send(HttpMethod.POST, newTaskDefinition);
    }

    /**
     * Creates a TaskDefinition with a new object
     *
     * @param newTaskDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaskDefinition> putAsync(@Nonnull final TaskDefinition newTaskDefinition) {
        return sendAsync(HttpMethod.PUT, newTaskDefinition);
    }

    /**
     * Creates a TaskDefinition with a new object
     *
     * @param newTaskDefinition the object to create/update
     * @return the created TaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaskDefinition put(@Nonnull final TaskDefinition newTaskDefinition) throws ClientException {
        return send(HttpMethod.PUT, newTaskDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TaskDefinitionRequest select(@Nonnull final String value) {
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
     public TaskDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

