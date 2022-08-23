// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PlannerTask;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Request Builder.
 */
public class PlannerTaskRequestBuilder extends BaseRequestBuilder<PlannerTask> {

    /**
     * The request builder for the PlannerTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerTaskRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PlannerTaskRequest instance
     */
    @Nonnull
    public PlannerTaskRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PlannerTaskRequest instance
     */
    @Nonnull
    public PlannerTaskRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PlannerTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for PlannerAssignedToTaskBoardTaskFormat
     *
     * @return the PlannerAssignedToTaskBoardTaskFormatRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.PlannerAssignedToTaskBoardTaskFormatRequestBuilder assignedToTaskBoardFormat() {
        return new com.microsoft.graph.requests.PlannerAssignedToTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("assignedToTaskBoardFormat"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerBucketTaskBoardTaskFormat
     *
     * @return the PlannerBucketTaskBoardTaskFormatRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.PlannerBucketTaskBoardTaskFormatRequestBuilder bucketTaskBoardFormat() {
        return new com.microsoft.graph.requests.PlannerBucketTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("bucketTaskBoardFormat"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerTaskDetails
     *
     * @return the PlannerTaskDetailsRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.PlannerTaskDetailsRequestBuilder details() {
        return new com.microsoft.graph.requests.PlannerTaskDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("details"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerProgressTaskBoardTaskFormat
     *
     * @return the PlannerProgressTaskBoardTaskFormatRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.PlannerProgressTaskBoardTaskFormatRequestBuilder progressTaskBoardFormat() {
        return new com.microsoft.graph.requests.PlannerProgressTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("progressTaskBoardFormat"), getClient(), null);
    }
}
