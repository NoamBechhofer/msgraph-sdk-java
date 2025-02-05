// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.identitygovernance.models.WorkflowBase;
import com.microsoft.graph.identitygovernance.requests.RunCollectionPage;
import com.microsoft.graph.identitygovernance.requests.TaskReportCollectionPage;
import com.microsoft.graph.identitygovernance.requests.WorkflowVersionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workflow.
 */
public class Workflow extends WorkflowBase implements IJsonBackedObject {


    /**
     * The Deleted Date Time.
     * When the workflow was deleted.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "deletedDateTime", alternate = {"DeletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deletedDateTime;

    /**
     * The Id.
     * Identifier used for individually addressing a specific workflow.Supports $filter(eq, ne) and $orderby.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Next Schedule Run Date Time.
     * The date time when the workflow is expected to run next based on the schedule interval, if there are any users matching the execution conditions. Supports $filter(lt,gt) and $orderBy.
     */
    @SerializedName(value = "nextScheduleRunDateTime", alternate = {"NextScheduleRunDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime nextScheduleRunDateTime;

    /**
     * The Version.
     * The current version number of the workflow. Value is 1 when the workflow is first created.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;

    /**
     * The Execution Scope.
     * The unique identifier of the Azure AD identity that last modified the workflow object.
     */
	@Nullable
    public com.microsoft.graph.identitygovernance.requests.UserProcessingResultCollectionPage executionScope;

    /**
     * The Runs.
     * Workflow runs.
     */
    @SerializedName(value = "runs", alternate = {"Runs"})
    @Expose
	@Nullable
    public com.microsoft.graph.identitygovernance.requests.RunCollectionPage runs;

    /**
     * The Task Reports.
     * Represents the aggregation of task execution data for tasks within a workflow object.
     */
    @SerializedName(value = "taskReports", alternate = {"TaskReports"})
    @Expose
	@Nullable
    public com.microsoft.graph.identitygovernance.requests.TaskReportCollectionPage taskReports;

    /**
     * The User Processing Results.
     * Per-user workflow execution results.
     */
    @SerializedName(value = "userProcessingResults", alternate = {"UserProcessingResults"})
    @Expose
	@Nullable
    public com.microsoft.graph.identitygovernance.requests.UserProcessingResultCollectionPage userProcessingResults;

    /**
     * The Versions.
     * The workflow versions that are available.
     */
    @SerializedName(value = "versions", alternate = {"Versions"})
    @Expose
	@Nullable
    public com.microsoft.graph.identitygovernance.requests.WorkflowVersionCollectionPage versions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("executionScope")) {
            executionScope = serializer.deserializeObject(json.get("executionScope"), com.microsoft.graph.identitygovernance.requests.UserProcessingResultCollectionPage.class);
        }

        if (json.has("runs")) {
            runs = serializer.deserializeObject(json.get("runs"), com.microsoft.graph.identitygovernance.requests.RunCollectionPage.class);
        }

        if (json.has("taskReports")) {
            taskReports = serializer.deserializeObject(json.get("taskReports"), com.microsoft.graph.identitygovernance.requests.TaskReportCollectionPage.class);
        }

        if (json.has("userProcessingResults")) {
            userProcessingResults = serializer.deserializeObject(json.get("userProcessingResults"), com.microsoft.graph.identitygovernance.requests.UserProcessingResultCollectionPage.class);
        }

        if (json.has("versions")) {
            versions = serializer.deserializeObject(json.get("versions"), com.microsoft.graph.identitygovernance.requests.WorkflowVersionCollectionPage.class);
        }
    }
}
