package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectoryAudit extends Entity implements Parsable {
    /**
     * Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime activityDateTime;
    /**
     * Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list, see Azure AD activity list.
     */
    private String activityDisplayName;
    /**
     * Indicates additional details on the activity.
     */
    private java.util.List<KeyValue> additionalDetails;
    /**
     * Indicates which resource category that's targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement.
     */
    private String category;
    /**
     * Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services.
     */
    private String correlationId;
    /**
     * The initiatedBy property
     */
    private AuditActivityInitiator initiatedBy;
    /**
     * Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
     */
    private String loggedByService;
    /**
     * Indicates the type of operation that was performed. The possible values include but are not limited to the following: Add, Assign, Update, Unassign, and Delete.
     */
    private String operationType;
    /**
     * Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
     */
    private OperationResult result;
    /**
     * Indicates the reason for failure if the result is failure or timeout.
     */
    private String resultReason;
    /**
     * Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other.
     */
    private java.util.List<TargetResource> targetResources;
    /**
     * Instantiates a new directoryAudit and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryAudit() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directoryAudit
     */
    @javax.annotation.Nonnull
    public static DirectoryAudit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryAudit();
    }
    /**
     * Gets the activityDateTime property value. Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.activityDateTime;
    }
    /**
     * Gets the activityDisplayName property value. Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list, see Azure AD activity list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityDisplayName() {
        return this.activityDisplayName;
    }
    /**
     * Gets the additionalDetails property value. Indicates additional details on the activity.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getAdditionalDetails() {
        return this.additionalDetails;
    }
    /**
     * Gets the category property value. Indicates which resource category that's targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the correlationId property value. Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityDisplayName", (n) -> { this.setActivityDisplayName(n.getStringValue()); });
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getObjectValue(AuditActivityInitiator::createFromDiscriminatorValue)); });
        deserializerMap.put("loggedByService", (n) -> { this.setLoggedByService(n.getStringValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getEnumValue(OperationResult.class)); });
        deserializerMap.put("resultReason", (n) -> { this.setResultReason(n.getStringValue()); });
        deserializerMap.put("targetResources", (n) -> { this.setTargetResources(n.getCollectionOfObjectValues(TargetResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The initiatedBy property
     * @return a auditActivityInitiator
     */
    @javax.annotation.Nullable
    public AuditActivityInitiator getInitiatedBy() {
        return this.initiatedBy;
    }
    /**
     * Gets the loggedByService property value. Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoggedByService() {
        return this.loggedByService;
    }
    /**
     * Gets the operationType property value. Indicates the type of operation that was performed. The possible values include but are not limited to the following: Add, Assign, Update, Unassign, and Delete.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the result property value. Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
     * @return a operationResult
     */
    @javax.annotation.Nullable
    public OperationResult getResult() {
        return this.result;
    }
    /**
     * Gets the resultReason property value. Indicates the reason for failure if the result is failure or timeout.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultReason() {
        return this.resultReason;
    }
    /**
     * Gets the targetResources property value. Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other.
     * @return a targetResource
     */
    @javax.annotation.Nullable
    public java.util.List<TargetResource> getTargetResources() {
        return this.targetResources;
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
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("activityDisplayName", this.getActivityDisplayName());
        writer.writeCollectionOfObjectValues("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeObjectValue("initiatedBy", this.getInitiatedBy());
        writer.writeStringValue("loggedByService", this.getLoggedByService());
        writer.writeStringValue("operationType", this.getOperationType());
        writer.writeEnumValue("result", this.getResult());
        writer.writeStringValue("resultReason", this.getResultReason());
        writer.writeCollectionOfObjectValues("targetResources", this.getTargetResources());
    }
    /**
     * Sets the activityDateTime property value. Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.activityDateTime = value;
    }
    /**
     * Sets the activityDisplayName property value. Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list, see Azure AD activity list.
     * @param value Value to set for the activityDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDisplayName(@javax.annotation.Nullable final String value) {
        this.activityDisplayName = value;
    }
    /**
     * Sets the additionalDetails property value. Indicates additional details on the activity.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalDetails(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this.additionalDetails = value;
    }
    /**
     * Sets the category property value. Indicates which resource category that's targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the correlationId property value. Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the initiatedBy property value. The initiatedBy property
     * @param value Value to set for the initiatedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiatedBy(@javax.annotation.Nullable final AuditActivityInitiator value) {
        this.initiatedBy = value;
    }
    /**
     * Sets the loggedByService property value. Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
     * @param value Value to set for the loggedByService property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoggedByService(@javax.annotation.Nullable final String value) {
        this.loggedByService = value;
    }
    /**
     * Sets the operationType property value. Indicates the type of operation that was performed. The possible values include but are not limited to the following: Add, Assign, Update, Unassign, and Delete.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final String value) {
        this.operationType = value;
    }
    /**
     * Sets the result property value. Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
     * @param value Value to set for the result property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResult(@javax.annotation.Nullable final OperationResult value) {
        this.result = value;
    }
    /**
     * Sets the resultReason property value. Indicates the reason for failure if the result is failure or timeout.
     * @param value Value to set for the resultReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultReason(@javax.annotation.Nullable final String value) {
        this.resultReason = value;
    }
    /**
     * Sets the targetResources property value. Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other.
     * @param value Value to set for the targetResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetResources(@javax.annotation.Nullable final java.util.List<TargetResource> value) {
        this.targetResources = value;
    }
}
