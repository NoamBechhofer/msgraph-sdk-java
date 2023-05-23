package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationSchema extends Entity implements Parsable {
    /** The directories property */
    private java.util.List<DirectoryDefinition> directories;
    /** The synchronizationRules property */
    private java.util.List<SynchronizationRule> synchronizationRules;
    /** The version property */
    private String version;
    /**
     * Instantiates a new synchronizationSchema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationSchema
     */
    @javax.annotation.Nonnull
    public static SynchronizationSchema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationSchema();
    }
    /**
     * Gets the directories property value. The directories property
     * @return a directoryDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryDefinition> getDirectories() {
        return this.directories;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directories", (n) -> { this.setDirectories(n.getCollectionOfObjectValues(DirectoryDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("synchronizationRules", (n) -> { this.setSynchronizationRules(n.getCollectionOfObjectValues(SynchronizationRule::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the synchronizationRules property value. The synchronizationRules property
     * @return a synchronizationRule
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationRule> getSynchronizationRules() {
        return this.synchronizationRules;
    }
    /**
     * Gets the version property value. The version property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("directories", this.getDirectories());
        writer.writeCollectionOfObjectValues("synchronizationRules", this.getSynchronizationRules());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the directories property value. The directories property
     * @param value Value to set for the directories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectories(@javax.annotation.Nullable final java.util.List<DirectoryDefinition> value) {
        this.directories = value;
    }
    /**
     * Sets the synchronizationRules property value. The synchronizationRules property
     * @param value Value to set for the synchronizationRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizationRules(@javax.annotation.Nullable final java.util.List<SynchronizationRule> value) {
        this.synchronizationRules = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
