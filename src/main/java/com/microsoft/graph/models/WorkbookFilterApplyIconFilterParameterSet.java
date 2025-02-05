// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookIcon;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Icon Filter Parameter Set.
 */
public class WorkbookFilterApplyIconFilterParameterSet {
    /**
     * The icon.
     * 
     */
    @SerializedName(value = "icon", alternate = {"Icon"})
    @Expose
	@Nullable
    public WorkbookIcon icon;


    /**
     * Instiaciates a new WorkbookFilterApplyIconFilterParameterSet
     */
    public WorkbookFilterApplyIconFilterParameterSet() {}
    /**
     * Instiaciates a new WorkbookFilterApplyIconFilterParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFilterApplyIconFilterParameterSet(@Nonnull final WorkbookFilterApplyIconFilterParameterSetBuilder builder) {
        this.icon = builder.icon;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyIconFilterParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyIconFilterParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyIconFilterParameterSet
     */
    public static final class WorkbookFilterApplyIconFilterParameterSetBuilder {
        /**
         * The icon parameter value
         */
        @Nullable
        protected WorkbookIcon icon;
        /**
         * Sets the Icon
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyIconFilterParameterSetBuilder withIcon(@Nullable final WorkbookIcon val) {
            this.icon = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFilterApplyIconFilterParameterSetBuilder
         */
        @Nullable
        protected WorkbookFilterApplyIconFilterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyIconFilterParameterSet build() {
            return new WorkbookFilterApplyIconFilterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.icon != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("icon", icon));
        }
        return result;
    }
}
