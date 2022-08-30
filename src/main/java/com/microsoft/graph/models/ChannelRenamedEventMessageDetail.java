package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChannelRenamedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** The updated name of the channel. */
    private String _channelDisplayName;
    /** Unique identifier of the channel. */
    private String _channelId;
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /**
     * Instantiates a new ChannelRenamedEventMessageDetail and sets the default values.
     * @return a void
     */
    public ChannelRenamedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.channelRenamedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelRenamedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static ChannelRenamedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelRenamedEventMessageDetail();
    }
    /**
     * Gets the channelDisplayName property value. The updated name of the channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChannelDisplayName() {
        return this._channelDisplayName;
    }
    /**
     * Gets the channelId property value. Unique identifier of the channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChannelId() {
        return this._channelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChannelRenamedEventMessageDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("channelDisplayName", (n) -> { currentObject.setChannelDisplayName(n.getStringValue()); });
            this.put("channelId", (n) -> { currentObject.setChannelId(n.getStringValue()); });
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this._initiator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("channelDisplayName", this.getChannelDisplayName());
        writer.writeStringValue("channelId", this.getChannelId());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the channelDisplayName property value. The updated name of the channel.
     * @param value Value to set for the channelDisplayName property.
     * @return a void
     */
    public void setChannelDisplayName(@javax.annotation.Nullable final String value) {
        this._channelDisplayName = value;
    }
    /**
     * Sets the channelId property value. Unique identifier of the channel.
     * @param value Value to set for the channelId property.
     * @return a void
     */
    public void setChannelId(@javax.annotation.Nullable final String value) {
        this._channelId = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
}
