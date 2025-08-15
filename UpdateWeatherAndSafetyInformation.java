package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import java.time.LocalDate;

public class UpdateWeatherAndSafetyInformation {
    private String alertType,location;
    private LocalDate date,expireDate;

    public UpdateWeatherAndSafetyInformation() {
    }

    public UpdateWeatherAndSafetyInformation(String alertType, String location, LocalDate date, LocalDate expireDate) {
        this.alertType = alertType;
        this.location = location;
        this.date = date;
        this.expireDate = expireDate;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "UpdateWeatherAndSafetyInformation{" +
                "alertType='" + alertType + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", expireDate=" + expireDate +
                '}';
    }
}
