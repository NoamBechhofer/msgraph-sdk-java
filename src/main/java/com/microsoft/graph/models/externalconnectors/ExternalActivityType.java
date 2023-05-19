package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ExternalActivityType implements ValuedEnum {
    Viewed("viewed"),
    Modified("modified"),
    Created("created"),
    Commented("commented"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExternalActivityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ExternalActivityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "viewed": return Viewed;
            case "modified": return Modified;
            case "created": return Created;
            case "commented": return Commented;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
