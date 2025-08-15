package com.oopproject.new_tour_operator_project.Tourist;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactSupportController
{
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private Label outPutLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SendOnAction(ActionEvent actionEvent) {
        String subject = subjectTextField.getText();
        String message = messageTextArea.getText();

        // --- Input Validation ---
        if (subject.isBlank() || message.isBlank()) {
            outPutLabel.setText("Subject and Message fields cannot be empty.");
            return;
        }

        // --- Simulate Sending Support Request ---
        // In a real application, you would send this data to your backend service,
        // an email API, or save it to a database for support staff to review.
        System.out.println("--- Sending Support Request ---");
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        System.out.println("-------------------------------");

        outPutLabel.setText("Your message has been sent to support!");
        // Optionally, clear fields after sending
        subjectTextField.clear();
        messageTextArea.clear();
    }

    @javafx.fxml.FXML
    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourist/TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Tourist Dashboard");
        stage.show();
    }
}