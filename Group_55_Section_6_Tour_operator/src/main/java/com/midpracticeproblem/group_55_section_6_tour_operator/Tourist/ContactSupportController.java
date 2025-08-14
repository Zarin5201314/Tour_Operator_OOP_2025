package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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

        //  Validation ---
        if (subject.isBlank() || message.isBlank()) {
            outPutLabel.setText("Subject and Message fields cannot be empty.");
            return;
        }

        
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
    public void cancelOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourist/TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Tourist Dashboard");
        stage.show();

        
    }
}
