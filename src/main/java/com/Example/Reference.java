package com.Example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reference {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("reference")
    @Expose
    private String reference;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reference() {
    }

    /**
     * 
     * @param name
     * @param reference
     */
    public Reference(String name, String reference) {
        super();
        this.name = name;
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
