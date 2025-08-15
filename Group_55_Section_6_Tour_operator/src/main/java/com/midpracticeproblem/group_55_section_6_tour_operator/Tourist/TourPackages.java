package com.oopproject.new_tour_operator_project.Tourist;

import com.oopproject.new_tour_operator_project.User;

import java.time.LocalDate;

public class TourPackages  {

    private String packageName;
    private String bookingID;

    private double price;
    private String duration;
    private LocalDate bookingDate;
    private String status;
    private String packageID;


    public TourPackages(String packageName, String bookingID, double price, LocalDate bookingDate, String duration, String status, String packageID) {


        this.packageName = packageName;
        this.bookingID = bookingID;
        this.price = price;
        this.bookingDate = bookingDate;
        this.duration = duration;
        this.status = status;
        this.packageID = packageID;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "TourPackages{" +
                "Package Name='" + packageName + '\n' +
                ", Booking ID='" + bookingID + '\n' +
                ", Price=" + price +
                ", Duration='" + duration + '\n' +
                ", Booking Date=" + bookingDate + '\n' +
                ", Status=" + status + '\n' +
                ", Package ID=" + packageID +

                '}';
    }







}