package com.oopproject.new_tour_operator_project;

import java.time.LocalDate;
import java.util.Random;

public abstract class User {
    private String name;
    protected String id;
    private String password;
    private String email;
    private String gender;
    private String contactInfo;


    private LocalDate dateOfBirth;

    public User(String name, LocalDate dateOfBirth, String contactInfo, String gender, String email, String password, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public User(String name, String id, String password, String email, String gender, String contactInfo, double dateOfBirth) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "UserClass{" + '\n' +
                "Name='"  + name + '\n' +
                ", Id='" + id + '\n' +
                ", Password='" + password + '\n' +
                ", Email='" + email + '\n' +
                ", Gender='" + gender + '\n' +
                ", ContactInfo='" + contactInfo + '\n' +
                ", DateOfBirth=" + dateOfBirth +
                '}';


    }


    public abstract boolean login(String id, String password);
    public abstract String generateID();



}
