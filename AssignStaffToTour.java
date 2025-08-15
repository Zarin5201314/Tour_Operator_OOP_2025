package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import java.time.LocalDate;

public class AssignStaffToTour {
    private int staffID;
    private String staffName, phoneNumber,destination,staffRole;
    private LocalDate date;

    public AssignStaffToTour() {
    }

    public AssignStaffToTour(int staffID, String staffName, String phoneNumber, String destination, String staffRole) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.phoneNumber = phoneNumber;
        this.destination = destination;
        this.staffRole = staffRole;
        this.date = date;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AssignStaffToTour{" +
                "staffID=" + staffID +
                ", staffName='" + staffName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", staffRole='" + staffRole + '\'' +
                ", date=" + date +
                '}';
    }
}
