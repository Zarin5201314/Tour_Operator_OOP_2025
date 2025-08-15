package com.oopproject.new_tour_operator_project;

import com.oopproject.new_tour_operator_project.Accountant.Accountant;
import com.oopproject.new_tour_operator_project.Tourist.Tourist;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CreateAccountPageController
{
    @javafx.fxml.FXML
    private DatePicker dateOfBIrthDatePicker;
    @javafx.fxml.FXML
    private TextField emergencyContactTextField;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private TextField passwordField;
    @javafx.fxml.FXML
    private RadioButton othersRadioButton;
    @javafx.fxml.FXML
    private ToggleGroup genderToggleGroup;

    ArrayList<User> userArrayList = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {

        genderToggleGroup = new ToggleGroup();
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        maleRadioButton.setToggleGroup(genderToggleGroup);
        othersRadioButton.setToggleGroup(genderToggleGroup);

    }



    @javafx.fxml.FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();



        String newUsername = nameTextField.getText();
        String newPassword = passwordField.getText();
        String contactNumber = contactTextField.getText();
        LocalDate DateOfBirth = dateOfBIrthDatePicker.getValue();
        String emergencyContact = emergencyContactTextField.getText();
        String email = emailTextField.getText();
        RadioButton selectedGender = (RadioButton) genderToggleGroup.getSelectedToggle();



        if (newUsername.isBlank() || newPassword.isBlank()  || contactNumber.isBlank() || emergencyContact.isBlank() || email.isBlank()){ // Updated validation
            outputTextArea.setText("All fields are required.");
            return;
        }




        if (nameTextField.getText().trim().isEmpty()){
            outputTextArea.setText("Please enter a name");
            return;

        }
        if (newUsername.length() < 3) {
            outputTextArea.setText("Username must be at least 3 characters long.");
            return;
        }




        if (!contactNumber.matches("\\d+")) {
            outputTextArea.setText("Contact number must contain only digits.");
            return;
        }

        if (emergencyContactTextField.contains(null)) {
            outputTextArea.setText("Please enter a contact");
            return;
        }
        if (!emergencyContact.matches("\\d+")) {
            outputTextArea.setText("Emergency contact must contain only digits.");
            return;
        }




        if (emailTextField.getText().trim().isEmpty()){
            outputTextArea.setText("Please an email");
            return;
        }




        String gender = selectedGender.getText();
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        }
        else if (femaleRadioButton.isPressed()) {
            gender = "Female";
        }
        else if (othersRadioButton.isSelected()) {
            gender = "Others";
        }

        if (dateOfBIrthDatePicker == null) {
            outputTextArea.setText("Please select a Date Of Birth");

        }


        if (passwordField.getText().isEmpty()){
            outputTextArea.setText("Please enter a password");
            return;
        }

        boolean foundDigit = false;
        for (int i = 0 ; i<passwordField.getText().length() ; i++)  {
            if (passwordField.getText().charAt(i) >= '0' && passwordField.getText().charAt(i) <= '9') {
                foundDigit = true;
                outputTextArea.setText("You have entered valid Password");
                return;
            }
            if (newPassword.length() != 6 || !newPassword.matches("\\d{6}")) {
                outputTextArea.setText("Password must be exactly 6 digits.");
                return;
            }
        }

        System.out.println("Attempting to create account with the following details:");
        System.out.println("Username: " + newUsername);
        System.out.println("Password (hashed in real app): " + newPassword);
        System.out.println("Date of Birth: " + DateOfBirth);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Emergency Contact: " + emergencyContact);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);


        boolean accountCreatedSuccessfully = true;

        if (accountCreatedSuccessfully) {
            outputTextArea.setText("Account created successfully! Redirecting to login...");


        } else {
            // Handle cases where account creation fails (e.g., username already exists)
            outputTextArea.setText("Failed to create account. Username might already exist or other error.");
        }


        for (User us : userArrayList){
            if (us.getName().equals(nameTextField.getText())){
                outputTextArea.setText("A user with the same name already exists please change the name");
                return;
            }
        }

    }

    @javafx.fxml.FXML
    public void backToLoginOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }
}


