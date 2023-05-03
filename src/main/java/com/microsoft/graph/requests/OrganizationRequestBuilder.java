// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Organization;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Request Builder.
 */
public class OrganizationRequestBuilder extends BaseRequestBuilder<Organization> {

    /**
     * The request builder for the Organization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OrganizationRequest instance
     */
    @Nonnull
    public OrganizationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OrganizationRequest instance
     */
    @Nonnull
    public OrganizationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.OrganizationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for OrganizationalBranding
     *
     * @return the OrganizationalBrandingRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.OrganizationalBrandingRequestBuilder branding() {
        return new com.microsoft.graph.requests.OrganizationalBrandingRequestBuilder(getRequestUrlWithAdditionalSegment("branding"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CertificateBasedAuthConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration() {
        return new com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("certificateBasedAuthConfiguration"), getClient(), null);
    }

    /**
     * Gets a request builder for the CertificateBasedAuthConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(@Nonnull final String id) {
        return new com.microsoft.graph.requests.CertificateBasedAuthConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("certificateBasedAuthConfiguration") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Extension collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ExtensionCollectionRequestBuilder extensions() {
        return new com.microsoft.graph.requests.ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Extension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ExtensionRequestBuilder extensions(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }

    /**
     * Set mobile device management authority
     * @return the request builder
     */
    @Nonnull
    public OrganizationSetMobileDeviceManagementAuthorityRequestBuilder setMobileDeviceManagementAuthority() {
        return new OrganizationSetMobileDeviceManagementAuthorityRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setMobileDeviceManagementAuthority"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSet parameters) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(@Nonnull final DirectoryObjectCheckMemberObjectsParameterSet parameters) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(@Nonnull final DirectoryObjectGetMemberGroupsParameterSet parameters) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(@Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
