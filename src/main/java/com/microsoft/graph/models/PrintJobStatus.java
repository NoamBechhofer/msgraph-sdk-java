package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintJobStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A human-readable description of the print job's current processing state. Read-only. */
    private String _description;
    /** Additional details for print job state. Valid values are described in the following table. Read-only. */
    private java.util.List<String> _details;
    /** True if the job was acknowledged by a printer; false otherwise. Read-only. */
    private Boolean _isAcquiredByPrinter;
    /** The OdataType property */
    private String _odataType;
    /** The state property */
    private PrintJobProcessingState _state;
    /**
     * Instantiates a new printJobStatus and sets the default values.
     * @return a void
     */
    public PrintJobStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.printJobStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printJobStatus
     */
    @javax.annotation.Nonnull
    public static PrintJobStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintJobStatus();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the description property value. A human-readable description of the print job's current processing state. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the details property value. Additional details for print job state. Valid values are described in the following table. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintJobStatus currentObject = this;
        return new HashMap<>(5) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("details", (n) -> { currentObject.setDetails(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isAcquiredByPrinter", (n) -> { currentObject.setIsAcquiredByPrinter(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(PrintJobProcessingState.class)); });
        }};
    }
    /**
     * Gets the isAcquiredByPrinter property value. True if the job was acknowledged by a printer; false otherwise. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAcquiredByPrinter() {
        return this._isAcquiredByPrinter;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the state property value. The state property
     * @return a printJobProcessingState
     */
    @javax.annotation.Nullable
    public PrintJobProcessingState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("details", this.getDetails());
        writer.writeBooleanValue("isAcquiredByPrinter", this.getIsAcquiredByPrinter());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the description property value. A human-readable description of the print job's current processing state. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the details property value. Additional details for print job state. Valid values are described in the following table. Read-only.
     * @param value Value to set for the details property.
     * @return a void
     */
    public void setDetails(@javax.annotation.Nullable final java.util.List<String> value) {
        this._details = value;
    }
    /**
     * Sets the isAcquiredByPrinter property value. True if the job was acknowledged by a printer; false otherwise. Read-only.
     * @param value Value to set for the isAcquiredByPrinter property.
     * @return a void
     */
    public void setIsAcquiredByPrinter(@javax.annotation.Nullable final Boolean value) {
        this._isAcquiredByPrinter = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final PrintJobProcessingState value) {
        this._state = value;
    }
}
