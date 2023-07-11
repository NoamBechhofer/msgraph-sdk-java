package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeMappingParameterSchema implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The given parameter can be provided multiple times (for example, multiple input strings in the Concatenate(string,string,...) function).
     */
    private Boolean allowMultipleOccurrences;
    /**
     * Parameter name.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * true if the parameter is required; otherwise false.
     */
    private Boolean required;
    /**
     * The type property
     */
    private AttributeType type;
    /**
     * Instantiates a new attributeMappingParameterSchema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttributeMappingParameterSchema() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attributeMappingParameterSchema
     */
    @javax.annotation.Nonnull
    public static AttributeMappingParameterSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMappingParameterSchema();
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
     * Gets the allowMultipleOccurrences property value. The given parameter can be provided multiple times (for example, multiple input strings in the Concatenate(string,string,...) function).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleOccurrences() {
        return this.allowMultipleOccurrences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowMultipleOccurrences", (n) -> { this.setAllowMultipleOccurrences(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(AttributeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Parameter name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the required property value. true if the parameter is required; otherwise false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Gets the type property value. The type property
     * @return a attributeType
     */
    @javax.annotation.Nullable
    public AttributeType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleOccurrences", this.getAllowMultipleOccurrences());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the allowMultipleOccurrences property value. The given parameter can be provided multiple times (for example, multiple input strings in the Concatenate(string,string,...) function).
     * @param value Value to set for the allowMultipleOccurrences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowMultipleOccurrences(@javax.annotation.Nullable final Boolean value) {
        this.allowMultipleOccurrences = value;
    }
    /**
     * Sets the name property value. Parameter name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the required property value. true if the parameter is required; otherwise false.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this.required = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final AttributeType value) {
        this.type = value;
    }
}
