package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationProgress implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The completedUnits property */
    private Long completedUnits;
    /** The OdataType property */
    private String odataType;
    /** The progressObservationDateTime property */
    private OffsetDateTime progressObservationDateTime;
    /** The totalUnits property */
    private Long totalUnits;
    /** The units property */
    private String units;
    /**
     * Instantiates a new synchronizationProgress and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationProgress() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationProgress
     */
    @javax.annotation.Nonnull
    public static SynchronizationProgress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationProgress();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the completedUnits property value. The completedUnits property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCompletedUnits() {
        return this.completedUnits;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("completedUnits", (n) -> { this.setCompletedUnits(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("progressObservationDateTime", (n) -> { this.setProgressObservationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalUnits", (n) -> { this.setTotalUnits(n.getLongValue()); });
        deserializerMap.put("units", (n) -> { this.setUnits(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the progressObservationDateTime property value. The progressObservationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProgressObservationDateTime() {
        return this.progressObservationDateTime;
    }
    /**
     * Gets the totalUnits property value. The totalUnits property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalUnits() {
        return this.totalUnits;
    }
    /**
     * Gets the units property value. The units property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnits() {
        return this.units;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("completedUnits", this.getCompletedUnits());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("progressObservationDateTime", this.getProgressObservationDateTime());
        writer.writeLongValue("totalUnits", this.getTotalUnits());
        writer.writeStringValue("units", this.getUnits());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the completedUnits property value. The completedUnits property
     * @param value Value to set for the completedUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedUnits(@javax.annotation.Nullable final Long value) {
        this.completedUnits = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the progressObservationDateTime property value. The progressObservationDateTime property
     * @param value Value to set for the progressObservationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProgressObservationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.progressObservationDateTime = value;
    }
    /**
     * Sets the totalUnits property value. The totalUnits property
     * @param value Value to set for the totalUnits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUnits(@javax.annotation.Nullable final Long value) {
        this.totalUnits = value;
    }
    /**
     * Sets the units property value. The units property
     * @param value Value to set for the units property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnits(@javax.annotation.Nullable final String value) {
        this.units = value;
    }
}
