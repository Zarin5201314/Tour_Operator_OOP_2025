package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import java.time.LocalDate;

public class LogTravelIssues {
    private String issuesType,urgencyLabel,description;
    private LocalDate date;

    public LogTravelIssues() {
    }

    public LogTravelIssues(String issuesType, String urgencyLabel, String description) {
        this.issuesType = issuesType;
        this.urgencyLabel = urgencyLabel;
        this.description = description;
        this.date = date;
    }

    public String getIssuesType() {
        return issuesType;
    }

    public void setIssuesType(String issuesType) {
        this.issuesType = issuesType;
    }

    public String getUrgencyLabel() {
        return urgencyLabel;
    }

    public void setUrgencyLabel(String urgencyLabel) {
        this.urgencyLabel = urgencyLabel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LogTravelIssues{" +
                "issuesType='" + issuesType + '\'' +
                ", urgencyLabel='" + urgencyLabel + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
