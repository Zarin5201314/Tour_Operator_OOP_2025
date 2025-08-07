package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import com.midpracticeproblem.group_55_section_6_tour_operator.UserClass;

import java.util.Random;

public class TouristClass extends UserClass {
    private String emergencyContact;

    public TouristClass(String name, String id, String password, String email, String gender, String contactInfo, double dateOfBirth, String emergencyContact) {
        super(name, id, password, email, gender, contactInfo, dateOfBirth);
        this.emergencyContact = emergencyContact;
        this.setId(this.generateID());
    }



    @Override
    public boolean login(String id, String password) {
        return false;
    }

    @Override
    public String generateID() {
        String id = " ";
        Random random  = new Random();
        id = Integer.toString(random.nextInt(1000, 9999));

        return id;
    }


}
