package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

public class ManageCancellationPolicies {
    private String tourType, packageType,season,timeWindow,penalty,reason;

    public ManageCancellationPolicies() {
    }

    public ManageCancellationPolicies(String tourType, String packageType, String season, String timeWindow, String penalty, String reason) {
        this.tourType = tourType;
        this.packageType = packageType;
        this.season = season;
        this.timeWindow = timeWindow;
        this.penalty = penalty;
        this.reason = reason;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(String timeWindow) {
        this.timeWindow = timeWindow;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ManageCancellationPolicies{" +
                "tourType='" + tourType + '\'' +
                ", packageType='" + packageType + '\'' +
                ", season='" + season + '\'' +
                ", timeWindow='" + timeWindow + '\'' +
                ", penalty='" + penalty + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
