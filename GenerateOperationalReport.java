package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import java.time.LocalDate;

public class GenerateOperationalReport {
    private String tourType, reportCatagory,totalBooking;
    private LocalDate startingDate,endingDate;

    public GenerateOperationalReport(String tourType) {
        this.tourType = tourType;
    }

    public GenerateOperationalReport(String tourType, String reportCatagory, String totalBooking, LocalDate startingDate, LocalDate endingDate) {
        this.tourType = tourType;
        this.reportCatagory = reportCatagory;
        this.totalBooking = totalBooking;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getReportCatagory() {
        return reportCatagory;
    }

    public void setReportCatagory(String reportCatagory) {
        this.reportCatagory = reportCatagory;
    }

    public String getTotalBooking() {
        return totalBooking;
    }

    public void setTotalBooking(String totalBooking) {
        this.totalBooking = totalBooking;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "GenerateOperationalReport{" +
                "tourType='" + tourType + '\'' +
                ", reportCatagory='" + reportCatagory + '\'' +
                ", totalBooking='" + totalBooking + '\'' +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                '}';
    }
}
