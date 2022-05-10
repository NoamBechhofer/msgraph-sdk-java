package microsoft.graph.serviceprincipals.item.removekey;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the removeKey method. */
public class RemoveKeyRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The keyId property */
    private String _keyId;
    /** The proof property */
    private String _proof;
    /**
     * Instantiates a new removeKeyRequestBody and sets the default values.
     * @return a void
     */
    public RemoveKeyRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a removeKeyRequestBody
     */
    @javax.annotation.Nonnull
    public static RemoveKeyRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoveKeyRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoveKeyRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("keyId", (n) -> { currentObject.setKeyId(n.getStringValue()); });
            this.put("proof", (n) -> { currentObject.setProof(n.getStringValue()); });
        }};
    }
    /**
     * Gets the keyId property value. The keyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyId() {
        return this._keyId;
    }
    /**
     * Gets the proof property value. The proof property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProof() {
        return this._proof;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("keyId", this.getKeyId());
        writer.writeStringValue("proof", this.getProof());
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
     * Sets the keyId property value. The keyId property
     * @param value Value to set for the keyId property.
     * @return a void
     */
    public void setKeyId(@javax.annotation.Nullable final String value) {
        this._keyId = value;
    }
    /**
     * Sets the proof property value. The proof property
     * @param value Value to set for the proof property.
     * @return a void
     */
    public void setProof(@javax.annotation.Nullable final String value) {
        this._proof = value;
    }
}
