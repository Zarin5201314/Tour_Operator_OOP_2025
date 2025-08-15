package com.midpracticeproblem.group_55_section_6_tour_operator.Accountant;

import com.midpracticeproblem.group_55_section_6_tour_operator.UserClass;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.Random;

public class AccountantClass extends UserClass {


    private String position;
    private String address;
    private LocalDate dateOfJoining;


    public AccountantClass(String name, String id, String password, String email, String gender, String contactInfo, double dateOfBirth, String emergencyContact) {
        super(name, id, password, email, gender, contactInfo, dateOfBirth);

        this.setId(this.generateID());
        this.position = position;
        this.address = address;
        this.dateOfJoining = LocalDate.now();
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }

    @Override
    public String generateID() {
        String id = " ";

        Random random = new Random();
        id = Integer.toString(random.nextInt(1000000, 9999999));
        return id;
    }
    public Accountant CreateAccountPage(String name, LocalDate dateOfBirth, String contactInfo, String gender, String email, String password, String id, LocalDate dayOfJoining){
        Accountant accountant = new Accountant(name, dateOfBirth , contactInfo, gender, email, password, id, dayOfJoining);
        return  accountant;
    }
}
