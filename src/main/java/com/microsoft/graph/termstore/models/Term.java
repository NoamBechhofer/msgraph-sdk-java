// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.termstore.models.LocalizedDescription;
import com.microsoft.graph.termstore.models.LocalizedLabel;
import com.microsoft.graph.models.KeyValue;
import com.microsoft.graph.termstore.models.Term;
import com.microsoft.graph.termstore.models.Relation;
import com.microsoft.graph.termstore.models.Set;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.termstore.requests.TermCollectionPage;
import com.microsoft.graph.termstore.requests.RelationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Term.
 */
public class Term extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Date and time of term creation. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Descriptions.
     * Description about term that is dependent on the languageTag.
     */
    @SerializedName(value = "descriptions", alternate = {"Descriptions"})
    @Expose
	@Nullable
    public java.util.List<LocalizedDescription> descriptions;

    /**
     * The Labels.
     * Label metadata for a term.
     */
    @SerializedName(value = "labels", alternate = {"Labels"})
    @Expose
	@Nullable
    public java.util.List<LocalizedLabel> labels;

    /**
     * The Last Modified Date Time.
     * Last date and time of term modification. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Properties.
     * Collection of properties on the term.
     */
    @SerializedName(value = "properties", alternate = {"Properties"})
    @Expose
	@Nullable
    public java.util.List<KeyValue> properties;

    /**
     * The Children.
     * Children of current term.
     */
    @SerializedName(value = "children", alternate = {"Children"})
    @Expose
	@Nullable
    public TermCollectionPage children;

    /**
     * The Relations.
     * To indicate which terms are related to the current term as either pinned or reused.
     */
    @SerializedName(value = "relations", alternate = {"Relations"})
    @Expose
	@Nullable
    public RelationCollectionPage relations;

    /**
     * The Set.
     * The [set] in which the term is created.
     */
    @SerializedName(value = "set", alternate = {"Set"})
    @Expose
	@Nullable
    public Set set;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("children")) {
            children = serializer.deserializeObject(json.get("children"), TermCollectionPage.class);
        }

        if (json.has("relations")) {
            relations = serializer.deserializeObject(json.get("relations"), RelationCollectionPage.class);
        }
    }
}
