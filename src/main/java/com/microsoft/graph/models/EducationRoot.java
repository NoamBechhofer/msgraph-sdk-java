package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationRoot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The classes property */
    private java.util.List<EducationClass> _classes;
    /** The me property */
    private EducationUser _me;
    /** The schools property */
    private java.util.List<EducationSchool> _schools;
    /** The users property */
    private java.util.List<EducationUser> _users;
    /**
     * Instantiates a new EducationRoot and sets the default values.
     * @return a void
     */
    public EducationRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationRoot
     */
    @javax.annotation.Nonnull
    public static EducationRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRoot();
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
     * Gets the classes property value. The classes property
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this._classes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationRoot currentObject = this;
        return new HashMap<>(4) {{
            this.put("classes", (n) -> { currentObject.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
            this.put("me", (n) -> { currentObject.setMe(n.getObjectValue(EducationUser::createFromDiscriminatorValue)); });
            this.put("schools", (n) -> { currentObject.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
            this.put("users", (n) -> { currentObject.setUsers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the me property value. The me property
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public EducationUser getMe() {
        return this._me;
    }
    /**
     * Gets the schools property value. The schools property
     * @return a educationSchool
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this._schools;
    }
    /**
     * Gets the users property value. The users property
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getUsers() {
        return this._users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classes", this.getClasses());
        writer.writeObjectValue("me", this.getMe());
        writer.writeCollectionOfObjectValues("schools", this.getSchools());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
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
     * Sets the classes property value. The classes property
     * @param value Value to set for the classes property.
     * @return a void
     */
    public void setClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this._classes = value;
    }
    /**
     * Sets the me property value. The me property
     * @param value Value to set for the me property.
     * @return a void
     */
    public void setMe(@javax.annotation.Nullable final EducationUser value) {
        this._me = value;
    }
    /**
     * Sets the schools property value. The schools property
     * @param value Value to set for the schools property.
     * @return a void
     */
    public void setSchools(@javax.annotation.Nullable final java.util.List<EducationSchool> value) {
        this._schools = value;
    }
    /**
     * Sets the users property value. The users property
     * @param value Value to set for the users property.
     * @return a void
     */
    public void setUsers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this._users = value;
    }
}
