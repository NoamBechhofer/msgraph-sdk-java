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
import com.microsoft.graph.models.WorkbookChartAxes;
import com.microsoft.graph.models.WorkbookChartDataLabels;
import com.microsoft.graph.models.WorkbookChartAreaFormat;
import com.microsoft.graph.models.WorkbookChartLegend;
import com.microsoft.graph.models.WorkbookChartTitle;
import com.microsoft.graph.models.WorkbookWorksheet;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WorkbookChartSeriesCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart.
 */
public class WorkbookChart extends Entity implements IJsonBackedObject {


    /**
     * The Height.
     * Represents the height, in points, of the chart object.
     */
    @SerializedName(value = "height", alternate = {"Height"})
    @Expose
	@Nullable
    public Double height;

    /**
     * The Left.
     * The distance, in points, from the left side of the chart to the worksheet origin.
     */
    @SerializedName(value = "left", alternate = {"Left"})
    @Expose
	@Nullable
    public Double left;

    /**
     * The Name.
     * Represents the name of a chart object.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Top.
     * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     */
    @SerializedName(value = "top", alternate = {"Top"})
    @Expose
	@Nullable
    public Double top;

    /**
     * The Width.
     * Represents the width, in points, of the chart object.
     */
    @SerializedName(value = "width", alternate = {"Width"})
    @Expose
	@Nullable
    public Double width;

    /**
     * The Axes.
     * Represents chart axes. Read-only.
     */
    @SerializedName(value = "axes", alternate = {"Axes"})
    @Expose
	@Nullable
    public WorkbookChartAxes axes;

    /**
     * The Data Labels.
     * Represents the datalabels on the chart. Read-only.
     */
    @SerializedName(value = "dataLabels", alternate = {"DataLabels"})
    @Expose
	@Nullable
    public WorkbookChartDataLabels dataLabels;

    /**
     * The Format.
     * Encapsulates the format properties for the chart area. Read-only.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public WorkbookChartAreaFormat format;

    /**
     * The Legend.
     * Represents the legend for the chart. Read-only.
     */
    @SerializedName(value = "legend", alternate = {"Legend"})
    @Expose
	@Nullable
    public WorkbookChartLegend legend;

    /**
     * The Series.
     * Represents either a single series or collection of series in the chart. Read-only.
     */
    @SerializedName(value = "series", alternate = {"Series"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WorkbookChartSeriesCollectionPage series;

    /**
     * The Title.
     * Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public WorkbookChartTitle title;

    /**
     * The Worksheet.
     * The worksheet containing the current chart. Read-only.
     */
    @SerializedName(value = "worksheet", alternate = {"Worksheet"})
    @Expose
	@Nullable
    public WorkbookWorksheet worksheet;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("series")) {
            series = serializer.deserializeObject(json.get("series"), com.microsoft.graph.requests.WorkbookChartSeriesCollectionPage.class);
        }
    }
}
