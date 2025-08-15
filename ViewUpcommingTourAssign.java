package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import java.time.LocalDate;

public class ViewUpcommingTourAssign {
    public String tourName,duration,location,types,audience;
    public LocalDate date;

    public ViewUpcommingTourAssign() {
    }

    public ViewUpcommingTourAssign(String tourName, String duration, String location, String types, String audience, LocalDate date) {
        this.tourName = tourName;
        this.duration = duration;
        this.location = location;
        this.types = types;
        this.audience = audience;
        this.date = date;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ViewUpcommingTourAssign{" +
                "tourName='" + tourName + '\'' +
                ", duration='" + duration + '\'' +
                ", location='" + location + '\'' +
                ", types='" + types + '\'' +
                ", audience='" + audience + '\'' +
                ", date=" + date +
                '}';
    }
}
