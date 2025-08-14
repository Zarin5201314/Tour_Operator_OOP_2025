package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class EditProfileController
{
    @javafx.fxml.FXML
    private TextField ContactInfoTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private Label outPutLabel;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tourist/TrackVisaStatus.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Track Visa Status");
        stage.setScene(scene);
        stage.show();

        
    }

    @javafx.fxml.FXML
    public void saveChangesOnAction(ActionEvent actionEvent) {

        String name = userNameTextField.getText();
        String email = emailTextField.getText();
        String password = passwordTextField.getText();
        String contactInfo = ContactInfoTextField.getText();

        // --- Input Validation ---
        if (name.isBlank() || email.isBlank() || password.isBlank() || contactInfo.isBlank()) {
            outPutLabel.setText("All fields are required.");
            return;
        }

        // Password length/strength (example)
        if (password.length() < 6) {
            outPutLabel.setText("Password must be at least 6 characters long.");
            return;
        }


        // Contact Info (digits only, example)
        if (!contactInfo.matches("\\d+")) {
            outPutLabel.setText("Contact Info must contain only digits.");
            return;
        }


        System.out.println("--- Saving Profile Changes ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password (hashed in real app): " + password); // Remember to hash passwords!
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("------------------------------");

        outPutLabel.setText("Profile updated successfully!");
    }
}
