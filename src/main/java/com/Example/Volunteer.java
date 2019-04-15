package com.Example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Volunteer {

    @SerializedName("organization")
    @Expose
    private String organization;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("highlights")
    @Expose
    private List<String> highlights = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Volunteer() {
    }

    /**
     * 
     * @param summary
     * @param position
     * @param startDate
     * @param organization
     * @param website
     * @param endDate
     * @param highlights
     */
    public Volunteer(String organization, String position, String website, String startDate, String endDate, String summary, List<String> highlights) {
        super();
        this.organization = organization;
        this.position = position;
        this.website = website;
        this.startDate = startDate;
        this.endDate = endDate;
        this.summary = summary;
        this.highlights = highlights;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

}
