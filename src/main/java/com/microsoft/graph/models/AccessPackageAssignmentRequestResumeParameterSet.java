// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.CustomExtensionData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request Resume Parameter Set.
 */
public class AccessPackageAssignmentRequestResumeParameterSet {
    /**
     * The source.
     * 
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public String source;

    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The data.
     * 
     */
    @SerializedName(value = "data", alternate = {"Data"})
    @Expose
	@Nullable
    public CustomExtensionData data;


    /**
     * Instiaciates a new AccessPackageAssignmentRequestResumeParameterSet
     */
    public AccessPackageAssignmentRequestResumeParameterSet() {}
    /**
     * Instiaciates a new AccessPackageAssignmentRequestResumeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected AccessPackageAssignmentRequestResumeParameterSet(@Nonnull final AccessPackageAssignmentRequestResumeParameterSetBuilder builder) {
        this.source = builder.source;
        this.type = builder.type;
        this.data = builder.data;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static AccessPackageAssignmentRequestResumeParameterSetBuilder newBuilder() {
        return new AccessPackageAssignmentRequestResumeParameterSetBuilder();
    }
    /**
     * Fluent builder for the AccessPackageAssignmentRequestResumeParameterSet
     */
    public static final class AccessPackageAssignmentRequestResumeParameterSetBuilder {
        /**
         * The source parameter value
         */
        @Nullable
        protected String source;
        /**
         * Sets the Source
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AccessPackageAssignmentRequestResumeParameterSetBuilder withSource(@Nullable final String val) {
            this.source = val;
            return this;
        }
        /**
         * The type parameter value
         */
        @Nullable
        protected String type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AccessPackageAssignmentRequestResumeParameterSetBuilder withType(@Nullable final String val) {
            this.type = val;
            return this;
        }
        /**
         * The data parameter value
         */
        @Nullable
        protected CustomExtensionData data;
        /**
         * Sets the Data
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AccessPackageAssignmentRequestResumeParameterSetBuilder withData(@Nullable final CustomExtensionData val) {
            this.data = val;
            return this;
        }
        /**
         * Instanciates a new AccessPackageAssignmentRequestResumeParameterSetBuilder
         */
        @Nullable
        protected AccessPackageAssignmentRequestResumeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public AccessPackageAssignmentRequestResumeParameterSet build() {
            return new AccessPackageAssignmentRequestResumeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.source != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("source", source));
        }
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
        }
        if(this.data != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("data", data));
        }
        return result;
    }
}
