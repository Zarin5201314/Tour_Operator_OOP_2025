package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import java.time.LocalDate;

public class ApproveOrRejectBooking {
    private int id;
    private String name, phone,passportNumber,person,TourType;
    private LocalDate date;

    public ApproveOrRejectBooking() {
    }

    public ApproveOrRejectBooking(String tourType, String person, int id, String name, String phone, String passportNumber) {
        TourType = tourType;
        this.person = person;
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.passportNumber = passportNumber;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTourType() {
        return TourType;
    }

    public void setTourType(String tourType) {
        TourType = tourType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ApproveOrRejectBooking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", person='" + person + '\'' +
                ", TourType='" + TourType + '\'' +
                ", date=" + date +
                '}';
    }
}
