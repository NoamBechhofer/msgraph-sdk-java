package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UrlAssessmentRequest extends ThreatAssessmentRequest implements Parsable {
    /** The URL string. */
    private String _url;
    /**
     * Instantiates a new UrlAssessmentRequest and sets the default values.
     * @return a void
     */
    public UrlAssessmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.urlAssessmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UrlAssessmentRequest
     */
    @javax.annotation.Nonnull
    public static UrlAssessmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UrlAssessmentRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UrlAssessmentRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the url property value. The URL string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the url property value. The URL string.
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
}
