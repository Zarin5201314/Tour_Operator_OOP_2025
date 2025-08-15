package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import java.time.LocalDate;

public class CoordinateWithTransport {
    private String tourName,destination,assignGuide,vehicleType,driverName,driverNumber;

    public CoordinateWithTransport() {
    }

    public CoordinateWithTransport(String tourName, String destination, String assignGuide, String vehicleType, String driverName, String driverNumber) {
        this.tourName = tourName;
        this.destination = destination;
        this.assignGuide = assignGuide;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.driverNumber = driverNumber;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAssignGuide() {
        return assignGuide;
    }

    public void setAssignGuide(String assignGuide) {
        this.assignGuide = assignGuide;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }


    @Override
    public String toString() {
        return "CoordinateWithTransport{" +
                "tourName='" + tourName + '\'' +
                ", destination='" + destination + '\'' +
                ", assignGuide='" + assignGuide + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverNumber='" + driverNumber + '\'' +
                '}';
    }
}
