// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignParameterSet;
import com.microsoft.graph.models.DeviceCompliancePolicyScheduleActionsForRulesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Request Builder.
 */
public class DeviceCompliancePolicyRequestBuilder extends BaseRequestBuilder<DeviceCompliancePolicy> {

    /**
     * The request builder for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceCompliancePolicyRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceCompliancePolicyRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DeviceCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceCompliancePolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SettingStateDeviceSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new com.microsoft.graph.requests.SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the SettingStateDeviceSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new com.microsoft.graph.requests.DeviceComplianceDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceComplianceDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceDeviceOverview
     *
     * @return the DeviceComplianceDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new com.microsoft.graph.requests.DeviceComplianceDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceScheduledActionForRule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule() {
        return new com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceScheduledActionForRule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceUserStatusCollectionRequestBuilder userStatuses() {
        return new com.microsoft.graph.requests.DeviceComplianceUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceComplianceUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceUserOverview
     *
     * @return the DeviceComplianceUserOverviewRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceComplianceUserOverviewRequestBuilder userStatusOverview() {
        return new com.microsoft.graph.requests.DeviceComplianceUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceCompliancePolicyAssignCollectionRequestBuilder assign(@Nonnull final DeviceCompliancePolicyAssignParameterSet parameters) {
        return new DeviceCompliancePolicyAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceCompliancePolicyScheduleActionsForRulesRequestBuilder scheduleActionsForRules(@Nonnull final DeviceCompliancePolicyScheduleActionsForRulesParameterSet parameters) {
        return new DeviceCompliancePolicyScheduleActionsForRulesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.scheduleActionsForRules"), getClient(), null, parameters);
    }
}
