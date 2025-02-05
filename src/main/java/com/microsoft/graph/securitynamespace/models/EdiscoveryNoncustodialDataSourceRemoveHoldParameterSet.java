// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source Remove Hold Parameter Set.
 */
public class EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet {
    /**
     * The ids.
     * 
     */
    @SerializedName(value = "ids", alternate = {"Ids"})
    @Expose
	@Nullable
    public java.util.List<String> ids;


    /**
     * Instiaciates a new EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet
     */
    public EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet() {}
    /**
     * Instiaciates a new EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet(@Nonnull final EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder builder) {
        this.ids = builder.ids;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder newBuilder() {
        return new EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder();
    }
    /**
     * Fluent builder for the EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet
     */
    public static final class EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder {
        /**
         * The ids parameter value
         */
        @Nullable
        protected java.util.List<String> ids;
        /**
         * Sets the Ids
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder withIds(@Nullable final java.util.List<String> val) {
            this.ids = val;
            return this;
        }
        /**
         * Instanciates a new EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder
         */
        @Nullable
        protected EdiscoveryNoncustodialDataSourceRemoveHoldParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet build() {
            return new EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.ids != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ids", ids));
        }
        return result;
    }
}
