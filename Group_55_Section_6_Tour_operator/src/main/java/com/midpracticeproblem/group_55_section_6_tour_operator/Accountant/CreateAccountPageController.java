package com.oopproject.new_tour_operator_project.Accountant;

import com.oopproject.new_tour_operator_project.User;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreateAccountPageController  {
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private ToggleGroup tg;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField employNameTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private RadioButton othersRadioButton;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private DatePicker dayOfJoiningFDatepicker;




    Accountant accountant;

    public void setter(Accountant accountant){
        this.accountant = accountant;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    ArrayList<User> userArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void logInOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createAccountOnAction(ActionEvent actionEvent) {

        String name, email, contactInfo,gender = " ", password;
        LocalDate datOfJoining;

        name = employNameTextField.getText();
        email = emailTextField.getText();
        contactInfo = contactTextField.getText();
        password =passwordTextField.getText();
        datOfJoining = dayOfJoiningFDatepicker.getValue();


        if (employNameTextField.getText().trim().isEmpty()) {
            outputLabel.setText("Please enter a name");
            return;
        }

        if (passwordTextField.getText().isEmpty()) {
            outputLabel.setText("Please enter a password");
            return;
        }

        if (emailTextField.getText().trim().isEmpty()) {
            outputLabel.setText("Please enter your email");
            return;
        }


        if (maleRadioButton.isSelected()) {
            gender = "Male";
        }
        else if (femaleRadioButton.isPressed()) {
            gender = "Female";
        }
        else if (othersRadioButton.isSelected()){
            gender = "Others";
        }

        if (contactTextField.contains(null)){
            outputLabel.setText("Please enter your contact number");
            return;

        }

        boolean foundDigit = false;
        for (int i = 0 ; i<passwordTextField.getText().length(); i++) {
            if (passwordTextField.getText().charAt(i) >= '0' && passwordTextField.getText().charAt(i) <= '9') {
                foundDigit = true;
                outputLabel.setText("You have entered valid Password");
                return;

            }
        }

        for (User us : userArrayList){
            if (us.getName().equals(employNameTextField.getText())){
                outputLabel.setText("A user with the same name already exists please change the name");
                return;
            }
        }

        employNameTextField.clear();
        emailTextField.clear();
        passwordTextField.clear();
        contactTextField.clear();











    }
}