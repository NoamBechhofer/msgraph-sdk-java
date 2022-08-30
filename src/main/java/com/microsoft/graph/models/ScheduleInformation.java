package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ScheduleInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere. */
    private String _availabilityView;
    /** Error information from attempting to get the availability of the user, distribution list, or resource. */
    private FreeBusyError _error;
    /** The OdataType property */
    private String _odataType;
    /** An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation. */
    private String _scheduleId;
    /** Contains the items that describe the availability of the user or resource. */
    private java.util.List<ScheduleItem> _scheduleItems;
    /** The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings. */
    private WorkingHours _workingHours;
    /**
     * Instantiates a new scheduleInformation and sets the default values.
     * @return a void
     */
    public ScheduleInformation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.scheduleInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scheduleInformation
     */
    @javax.annotation.Nonnull
    public static ScheduleInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleInformation();
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
     * Gets the availabilityView property value. Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAvailabilityView() {
        return this._availabilityView;
    }
    /**
     * Gets the error property value. Error information from attempting to get the availability of the user, distribution list, or resource.
     * @return a freeBusyError
     */
    @javax.annotation.Nullable
    public FreeBusyError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ScheduleInformation currentObject = this;
        return new HashMap<>(6) {{
            this.put("availabilityView", (n) -> { currentObject.setAvailabilityView(n.getStringValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(FreeBusyError::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("scheduleId", (n) -> { currentObject.setScheduleId(n.getStringValue()); });
            this.put("scheduleItems", (n) -> { currentObject.setScheduleItems(n.getCollectionOfObjectValues(ScheduleItem::createFromDiscriminatorValue)); });
            this.put("workingHours", (n) -> { currentObject.setWorkingHours(n.getObjectValue(WorkingHours::createFromDiscriminatorValue)); });
        }};
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
     * Gets the scheduleId property value. An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScheduleId() {
        return this._scheduleId;
    }
    /**
     * Gets the scheduleItems property value. Contains the items that describe the availability of the user or resource.
     * @return a scheduleItem
     */
    @javax.annotation.Nullable
    public java.util.List<ScheduleItem> getScheduleItems() {
        return this._scheduleItems;
    }
    /**
     * Gets the workingHours property value. The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings.
     * @return a workingHours
     */
    @javax.annotation.Nullable
    public WorkingHours getWorkingHours() {
        return this._workingHours;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("availabilityView", this.getAvailabilityView());
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("scheduleId", this.getScheduleId());
        writer.writeCollectionOfObjectValues("scheduleItems", this.getScheduleItems());
        writer.writeObjectValue("workingHours", this.getWorkingHours());
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
     * Sets the availabilityView property value. Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere.
     * @param value Value to set for the availabilityView property.
     * @return a void
     */
    public void setAvailabilityView(@javax.annotation.Nullable final String value) {
        this._availabilityView = value;
    }
    /**
     * Sets the error property value. Error information from attempting to get the availability of the user, distribution list, or resource.
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final FreeBusyError value) {
        this._error = value;
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
     * Sets the scheduleId property value. An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     * @param value Value to set for the scheduleId property.
     * @return a void
     */
    public void setScheduleId(@javax.annotation.Nullable final String value) {
        this._scheduleId = value;
    }
    /**
     * Sets the scheduleItems property value. Contains the items that describe the availability of the user or resource.
     * @param value Value to set for the scheduleItems property.
     * @return a void
     */
    public void setScheduleItems(@javax.annotation.Nullable final java.util.List<ScheduleItem> value) {
        this._scheduleItems = value;
    }
    /**
     * Sets the workingHours property value. The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings.
     * @param value Value to set for the workingHours property.
     * @return a void
     */
    public void setWorkingHours(@javax.annotation.Nullable final WorkingHours value) {
        this._workingHours = value;
    }
}
