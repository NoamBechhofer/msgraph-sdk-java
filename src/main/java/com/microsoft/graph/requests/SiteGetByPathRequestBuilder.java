// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.SiteGetByPathRequest;
import com.microsoft.graph.termstore.requests.StoreRequestBuilder;
import com.microsoft.graph.termstore.requests.StoreCollectionRequestBuilder;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.SiteGetByPathParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Get By Path Request Builder.
 */
public class SiteGetByPathRequestBuilder extends BaseFunctionRequestBuilder<Site> {

    /**
     * The request builder for this SiteGetByPath
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteGetByPathRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this SiteGetByPath
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SiteGetByPathRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SiteGetByPathParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the SiteGetByPathRequest
     *
     * @param requestOptions the options for the request
     * @return the SiteGetByPathRequest instance
     */
    @Nonnull
    public SiteGetByPathRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SiteGetByPathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SiteGetByPathRequest instance
     */
    @Nonnull
    public SiteGetByPathRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SiteGetByPathRequest request = new SiteGetByPathRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the ItemAnalyticsWithReferenceRequestBuilder instance
     */
    @Nonnull
    public ItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ColumnDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    /**
     * Gets a request builder for the ColumnDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ColumnDefinitionRequestBuilder columns(@Nonnull final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ContentType collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContentTypeCollectionRequestBuilder contentTypes() {
        return new ContentTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes"), getClient(), null);
    }

    /**
     * Gets a request builder for the ContentType item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContentTypeRequestBuilder contentTypes(@Nonnull final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    @Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Drive collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    /**
     * Gets a request builder for the Drive item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DriveRequestBuilder drives(@Nonnull final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ColumnDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ColumnDefinitionCollectionWithReferencesRequestBuilder externalColumns() {
        return new ColumnDefinitionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("externalColumns"), getClient(), null);
    }

    /**
     * Gets a request builder for the ColumnDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ColumnDefinitionWithReferenceRequestBuilder externalColumns(@Nonnull final String id) {
        return new ColumnDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("externalColumns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the BaseItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public BaseItemCollectionRequestBuilder items() {
        return new BaseItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the BaseItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public BaseItemRequestBuilder items(@Nonnull final String id) {
        return new BaseItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the List collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ListCollectionRequestBuilder lists() {
        return new ListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    /**
     * Gets a request builder for the List item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ListRequestBuilder lists(@Nonnull final String id) {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Permission collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PermissionCollectionRequestBuilder permissions() {
        return new PermissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Permission item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PermissionRequestBuilder permissions(@Nonnull final String id) {
        return new PermissionRequestBuilder(getRequestUrlWithAdditionalSegment("permissions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Site collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    /**
     * Gets a request builder for the Site item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SiteRequestBuilder sites(@Nonnull final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Store
     *
     * @return the StoreRequestBuilder instance
     */
    @Nonnull
    public StoreRequestBuilder termStore() {
        return new StoreRequestBuilder(getRequestUrlWithAdditionalSegment("termStore"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Store collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public StoreCollectionRequestBuilder termStores() {
        return new StoreCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("termStores"), getClient(), null);
    }

    /**
     * Gets a request builder for the Store item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public StoreRequestBuilder termStores(@Nonnull final String id) {
        return new StoreRequestBuilder(getRequestUrlWithAdditionalSegment("termStores") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    @Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }
}
