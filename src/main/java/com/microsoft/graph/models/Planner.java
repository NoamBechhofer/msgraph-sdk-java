package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the planner singleton. */
public class Planner extends Entity implements Parsable {
    /** Read-only. Nullable. Returns a collection of the specified buckets */
    private java.util.List<PlannerBucket> _buckets;
    /** Read-only. Nullable. Returns a collection of the specified plans */
    private java.util.List<PlannerPlan> _plans;
    /** Read-only. Nullable. Returns a collection of the specified tasks */
    private java.util.List<PlannerTask> _tasks;
    /**
     * Instantiates a new planner and sets the default values.
     * @return a void
     */
    public Planner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a planner
     */
    @javax.annotation.Nonnull
    public static Planner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Planner();
    }
    /**
     * Gets the buckets property value. Read-only. Nullable. Returns a collection of the specified buckets
     * @return a plannerBucket
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerBucket> getBuckets() {
        return this._buckets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Planner currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("buckets", (n) -> { currentObject.setBuckets(n.getCollectionOfObjectValues(PlannerBucket::createFromDiscriminatorValue)); });
            this.put("plans", (n) -> { currentObject.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns a collection of the specified plans
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this._plans;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns a collection of the specified tasks
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the buckets property value. Read-only. Nullable. Returns a collection of the specified buckets
     * @param value Value to set for the buckets property.
     * @return a void
     */
    public void setBuckets(@javax.annotation.Nullable final java.util.List<PlannerBucket> value) {
        this._buckets = value;
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns a collection of the specified plans
     * @param value Value to set for the plans property.
     * @return a void
     */
    public void setPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this._plans = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns a collection of the specified tasks
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this._tasks = value;
    }
}
