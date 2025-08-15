package com.oopproject.new_tour_operator_project.Tourist;

import com.oopproject.new_tour_operator_project.Accountant.Accountant;
import com.oopproject.new_tour_operator_project.User;

import java.time.LocalDate;
import java.util.Random;


public class Tourist extends User {
    private String id;

    public Tourist(String name, LocalDate dateOfBirth, String contactInfo, String gender, String email, String password, String id) {
        super(name, dateOfBirth, contactInfo, gender, email, password, id);
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }

    @Override
    public String generateID() {
        return "";







    }




    public Tourist CreateAccount(String name, LocalDate dateOfBirth, String contactInfo, String gender, String email, String password, String id){
        Tourist tourist = new Tourist( name, dateOfBirth, contactInfo, gender, email, password, id);
        return tourist;
    }
}
