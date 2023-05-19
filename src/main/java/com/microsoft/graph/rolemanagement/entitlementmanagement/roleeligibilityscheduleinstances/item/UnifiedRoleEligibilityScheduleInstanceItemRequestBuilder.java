package com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.item.appscope.AppScopeRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.item.directoryscope.DirectoryScopeRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.item.principal.PrincipalRequestBuilder;
import com.microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.item.roledefinition.RoleDefinitionRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the roleEligibilityScheduleInstances property of the microsoft.graph.rbacApplication entity.
 */
public class UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the appScope property of the microsoft.graph.unifiedRoleScheduleInstanceBase entity. */
    @javax.annotation.Nonnull
    public AppScopeRequestBuilder appScope() {
        return new AppScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the directoryScope property of the microsoft.graph.unifiedRoleScheduleInstanceBase entity. */
    @javax.annotation.Nonnull
    public DirectoryScopeRequestBuilder directoryScope() {
        return new DirectoryScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the principal property of the microsoft.graph.unifiedRoleScheduleInstanceBase entity. */
    @javax.annotation.Nonnull
    public PrincipalRequestBuilder principal() {
        return new PrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleDefinition property of the microsoft.graph.unifiedRoleScheduleInstanceBase entity. */
    @javax.annotation.Nonnull
    public RoleDefinitionRequestBuilder roleDefinition() {
        return new RoleDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleEligibilityScheduleInstances/{unifiedRoleEligibilityScheduleInstance%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/entitlementManagement/roleEligibilityScheduleInstances/{unifiedRoleEligibilityScheduleInstance%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property roleEligibilityScheduleInstances for roleManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property roleEligibilityScheduleInstances for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the instance of a role eligibility.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleInstance
     * @see <a href="https://docs.microsoft.com/graph/api/unifiedroleeligibilityscheduleinstance-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the instance of a role eligibility.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleInstance
     * @see <a href="https://docs.microsoft.com/graph/api/unifiedroleeligibilityscheduleinstance-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property roleEligibilityScheduleInstances in roleManagement
     * @param body The request body
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleInstance
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> patch(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleInstance body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property roleEligibilityScheduleInstances in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of unifiedRoleEligibilityScheduleInstance
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> patch(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleInstance body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, UnifiedRoleEligibilityScheduleInstance::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance> executionException = new java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityScheduleInstance>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property roleEligibilityScheduleInstances for roleManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property roleEligibilityScheduleInstances for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the instance of a role eligibility.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the instance of a role eligibility.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property roleEligibilityScheduleInstances in roleManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleInstance body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property roleEligibilityScheduleInstances in roleManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final UnifiedRoleEligibilityScheduleInstance body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the instance of a role eligibility.
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
