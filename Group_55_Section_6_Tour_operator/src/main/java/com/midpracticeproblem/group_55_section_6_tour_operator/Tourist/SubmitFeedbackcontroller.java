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

public class SubmitFeedbackcontroller {
    @javafx.fxml.FXML
    private TextField ratingTextField;
    @javafx.fxml.FXML
    private TextField touristIDTextField;
    @javafx.fxml.FXML
    private TextArea commentTextArea;
    @javafx.fxml.FXML
    private TextField tourIDTextField;
    @javafx.fxml.FXML
    private Label outPutLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitOnAction(ActionEvent actionEvent) {
        String touristId = touristIDTextField.getText();
        String tourId = tourIDTextField.getText();
        String ratingStr = ratingTextField.getText();
        String comments = commentTextArea.getText();

        // --- Input Validation ---
        if (touristId.isBlank() || tourId.isBlank() || ratingStr.isBlank() || comments.isBlank()) {

            System.out.println("---------------------------");
            outPutLabel.setText("Thank you for your feedback!");
            // clear fields after submission
            touristIDTextField.clear();
            tourIDTextField.clear();
            ratingTextField.clear();
            commentTextArea.clear();
        }


    }

    @javafx.fxml.FXML
    public void cancelOnAction (ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourist/TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Tourist Dashboard");
        stage.show();
    }
}