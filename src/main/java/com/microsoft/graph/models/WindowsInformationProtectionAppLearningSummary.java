package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtectionAppLearningSummary extends Entity implements Parsable {
    /** Application Name */
    private String _applicationName;
    /** Application Type. Possible values are: universal, desktop. */
    private ApplicationType _applicationType;
    /** Device Count */
    private Integer _deviceCount;
    /**
     * Instantiates a new windowsInformationProtectionAppLearningSummary and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionAppLearningSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionAppLearningSummary
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionAppLearningSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionAppLearningSummary();
    }
    /**
     * Gets the applicationName property value. Application Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationName() {
        return this._applicationName;
    }
    /**
     * Gets the applicationType property value. Application Type. Possible values are: universal, desktop.
     * @return a applicationType
     */
    @javax.annotation.Nullable
    public ApplicationType getApplicationType() {
        return this._applicationType;
    }
    /**
     * Gets the deviceCount property value. Device Count
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionAppLearningSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationName", (n) -> { currentObject.setApplicationName(n.getStringValue()); });
            this.put("applicationType", (n) -> { currentObject.setApplicationType(n.getEnumValue(ApplicationType.class)); });
            this.put("deviceCount", (n) -> { currentObject.setDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeEnumValue("applicationType", this.getApplicationType());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
    }
    /**
     * Sets the applicationName property value. Application Name
     * @param value Value to set for the applicationName property.
     * @return a void
     */
    public void setApplicationName(@javax.annotation.Nullable final String value) {
        this._applicationName = value;
    }
    /**
     * Sets the applicationType property value. Application Type. Possible values are: universal, desktop.
     * @param value Value to set for the applicationType property.
     * @return a void
     */
    public void setApplicationType(@javax.annotation.Nullable final ApplicationType value) {
        this._applicationType = value;
    }
    /**
     * Sets the deviceCount property value. Device Count
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    public void setDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._deviceCount = value;
    }
}
