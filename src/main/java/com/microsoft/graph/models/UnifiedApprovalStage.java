// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.SubjectSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Approval Stage.
 */
public class UnifiedApprovalStage implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Approval Stage Time Out In Days.
     * 
     */
    @SerializedName(value = "approvalStageTimeOutInDays", alternate = {"ApprovalStageTimeOutInDays"})
    @Expose
	@Nullable
    public Integer approvalStageTimeOutInDays;

    /**
     * The Escalation Approvers.
     * 
     */
    @SerializedName(value = "escalationApprovers", alternate = {"EscalationApprovers"})
    @Expose
	@Nullable
    public java.util.List<SubjectSet> escalationApprovers;

    /**
     * The Escalation Time In Minutes.
     * 
     */
    @SerializedName(value = "escalationTimeInMinutes", alternate = {"EscalationTimeInMinutes"})
    @Expose
	@Nullable
    public Integer escalationTimeInMinutes;

    /**
     * The Is Approver Justification Required.
     * 
     */
    @SerializedName(value = "isApproverJustificationRequired", alternate = {"IsApproverJustificationRequired"})
    @Expose
	@Nullable
    public Boolean isApproverJustificationRequired;

    /**
     * The Is Escalation Enabled.
     * 
     */
    @SerializedName(value = "isEscalationEnabled", alternate = {"IsEscalationEnabled"})
    @Expose
	@Nullable
    public Boolean isEscalationEnabled;

    /**
     * The Primary Approvers.
     * 
     */
    @SerializedName(value = "primaryApprovers", alternate = {"PrimaryApprovers"})
    @Expose
	@Nullable
    public java.util.List<SubjectSet> primaryApprovers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
