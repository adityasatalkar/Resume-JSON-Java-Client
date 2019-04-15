package com.Example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Award {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("awarder")
    @Expose
    private String awarder;
    @SerializedName("summary")
    @Expose
    private String summary;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Award() {
    }

    /**
     * 
     * @param summary
     * @param title
     * @param awarder
     * @param date
     */
    public Award(String title, String date, String awarder, String summary) {
        super();
        this.title = title;
        this.date = date;
        this.awarder = awarder;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAwarder() {
        return awarder;
    }

    public void setAwarder(String awarder) {
        this.awarder = awarder;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
