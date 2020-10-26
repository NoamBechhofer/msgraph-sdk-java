package com.microsoft.graph.http;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.http.ICollectionResponse;

public abstract class BaseCollectionResponse<T> implements ICollectionResponse<T>, IJsonBackedObject  {
	
	/**
     * The list of items within this collection page
     */
	@SerializedName("value")
    @Expose
	public java.util.List<T> value;
	

	/**
     * The list of items within this collection page
     */
    @Override
    public java.util.List<T> values() {
        return value;
	}

    /** The link to the next page returned by the initial request if any. */
	@SerializedName("@odata.nextLink")
    @Expose(serialize = false)
    public String nextLink;
	
	@Override
    public String nextLink() {
        return nextLink;
    }

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The raw representation of this class
     */
    protected JsonObject rawObject;

    /**
     * The serializer
     */
	protected ISerializer serializer;
	
	/**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    public ISerializer getSerializer() {
        return serializer;
	}

	/**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;
        if (json.has("value")) {
            final JsonArray array = json.getAsJsonArray("value");
            for (int i = 0; i < array.size(); i++) {
				final Object targetObject = value.get(i);
				if(targetObject instanceof IJsonBackedObject && array.get(i).isJsonObject()) {
					((IJsonBackedObject)targetObject).setRawObject(serializer, array.get(i).getAsJsonObject());
				}
            }
        }
    }
}