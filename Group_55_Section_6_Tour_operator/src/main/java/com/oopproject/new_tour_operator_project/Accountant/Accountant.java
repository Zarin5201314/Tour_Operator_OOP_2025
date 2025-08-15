package com.oopproject.new_tour_operator_project.Accountant;

import com.oopproject.new_tour_operator_project.User;

import java.time.LocalDate;
import java.util.Random;

public class Accountant extends User {
    private LocalDate dayOfJoining;

    public Accountant(String name, LocalDate dateOfBirth, String contactInfo, String gender, String email, String password, String id, LocalDate dayOfJoining) {
        super(name, dateOfBirth, contactInfo, gender, email, password, id);

        this.dayOfJoining = dayOfJoining;
    }


    public LocalDate getDayOfJoining() {
        return dayOfJoining;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                //"Accountant{" +
                "DayOfJoining=" + '\n'+ dayOfJoining +
                '}';
    }

    public void setDayOfJoining(LocalDate dayOfJoining) {
        this.dayOfJoining = dayOfJoining;
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }

    @Override
    public String generateID() {
        return "";




    }


    public Accountant CreateAccountPage(String name, LocalDate dateOfBirth, String contactInfo, String gender, String email, String password, String id, LocalDate dayOfJoining){
        Accountant accountant = new Accountant(name, dateOfBirth , contactInfo, gender, email, password, id, dayOfJoining);
        return  accountant;
    }
}
