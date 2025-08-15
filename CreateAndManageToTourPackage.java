package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import java.time.LocalDate;

public class CreateAndManageToTourPackage {
    private String tourName, duration,location,price,tourType,targetaudience;
    private LocalDate date;

    public CreateAndManageToTourPackage() {
    }

    public CreateAndManageToTourPackage(String tourName, String duration, String location, String price, String tourType, String targetaudience) {
        this.tourName = tourName;
        this.duration = duration;
        this.location = location;
        this.price = price;
        this.tourType = tourType;
        this.targetaudience = targetaudience;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getTargetaudience() {
        return targetaudience;
    }

    public void setTargetaudience(String targetaudience) {
        this.targetaudience = targetaudience;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CreateAndManageToTourPackage{" +
                "tourName='" + tourName + '\'' +
                ", duration='" + duration + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                ", tourType='" + tourType + '\'' +
                ", targetaudience='" + targetaudience + '\'' +
                ", date=" + date +
                '}';
    }
}
