package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation summary of a book for a device.
 */
public class EBookInstallSummary extends Entity implements Parsable {
    /**
     * Number of Devices that have failed to install this book.
     */
    private Integer failedDeviceCount;
    /**
     * Number of Users that have 1 or more device that failed to install this book.
     */
    private Integer failedUserCount;
    /**
     * Number of Devices that have successfully installed this book.
     */
    private Integer installedDeviceCount;
    /**
     * Number of Users whose devices have all succeeded to install this book.
     */
    private Integer installedUserCount;
    /**
     * Number of Devices that does not have this book installed.
     */
    private Integer notInstalledDeviceCount;
    /**
     * Number of Users that did not install this book.
     */
    private Integer notInstalledUserCount;
    /**
     * Instantiates a new eBookInstallSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EBookInstallSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eBookInstallSummary
     */
    @javax.annotation.Nonnull
    public static EBookInstallSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EBookInstallSummary();
    }
    /**
     * Gets the failedDeviceCount property value. Number of Devices that have failed to install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.failedDeviceCount;
    }
    /**
     * Gets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUserCount() {
        return this.failedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedUserCount", (n) -> { this.setFailedUserCount(n.getIntegerValue()); });
        deserializerMap.put("installedDeviceCount", (n) -> { this.setInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("installedUserCount", (n) -> { this.setInstalledUserCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledDeviceCount", (n) -> { this.setNotInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledUserCount", (n) -> { this.setNotInstalledUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedDeviceCount property value. Number of Devices that have successfully installed this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this.installedDeviceCount;
    }
    /**
     * Gets the installedUserCount property value. Number of Users whose devices have all succeeded to install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledUserCount() {
        return this.installedUserCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Number of Devices that does not have this book installed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this.notInstalledDeviceCount;
    }
    /**
     * Gets the notInstalledUserCount property value. Number of Users that did not install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledUserCount() {
        return this.notInstalledUserCount;
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
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("failedUserCount", this.getFailedUserCount());
        writer.writeIntegerValue("installedDeviceCount", this.getInstalledDeviceCount());
        writer.writeIntegerValue("installedUserCount", this.getInstalledUserCount());
        writer.writeIntegerValue("notInstalledDeviceCount", this.getNotInstalledDeviceCount());
        writer.writeIntegerValue("notInstalledUserCount", this.getNotInstalledUserCount());
    }
    /**
     * Sets the failedDeviceCount property value. Number of Devices that have failed to install this book.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.failedDeviceCount = value;
    }
    /**
     * Sets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this book.
     * @param value Value to set for the failedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedUserCount(@javax.annotation.Nullable final Integer value) {
        this.failedUserCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Number of Devices that have successfully installed this book.
     * @param value Value to set for the installedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.installedDeviceCount = value;
    }
    /**
     * Sets the installedUserCount property value. Number of Users whose devices have all succeeded to install this book.
     * @param value Value to set for the installedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledUserCount(@javax.annotation.Nullable final Integer value) {
        this.installedUserCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Number of Devices that does not have this book installed.
     * @param value Value to set for the notInstalledDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.notInstalledDeviceCount = value;
    }
    /**
     * Sets the notInstalledUserCount property value. Number of Users that did not install this book.
     * @param value Value to set for the notInstalledUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotInstalledUserCount(@javax.annotation.Nullable final Integer value) {
        this.notInstalledUserCount = value;
    }
}
