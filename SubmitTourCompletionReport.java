package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import java.time.LocalDate;

public class SubmitTourCompletionReport {
    private String tourName,tourID,totalTourist,rating,location,issuesFaced;
    private LocalDate date;

    public SubmitTourCompletionReport() {
    }

    public SubmitTourCompletionReport(String tourName, String tourID, String totalTourist, String rating, String location, String issuesFaced) {
        this.tourName = tourName;
        this.tourID = tourID;
        this.totalTourist = totalTourist;
        this.rating = rating;
        this.location = location;
        this.issuesFaced = issuesFaced;
        this.date = date;

    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public String getTotalTourist() {
        return totalTourist;
    }

    public void setTotalTourist(String totalTourist) {
        this.totalTourist = totalTourist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIssuesFaced() {
        return issuesFaced;
    }

    public void setIssuesFaced(String issuesFaced) {
        this.issuesFaced = issuesFaced;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SubmitTourCompletionReport{" +
                "tourName='" + tourName + '\'' +
                ", tourID='" + tourID + '\'' +
                ", totalTourist='" + totalTourist + '\'' +
                ", rating='" + rating + '\'' +
                ", location='" + location + '\'' +
                ", issuesFaced='" + issuesFaced + '\'' +
                ", date=" + date +
                '}';
    }
}
