package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TrackVisaStatusController
{
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField tourIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void trackVisaStatusOnAction(ActionEvent actionEvent) {
        String tourId = tourIDTextField.getText();

        // --- Input Validation ---
        if (tourId.isBlank()) {
            outputLabel.setText("Please enter a Tour ID.");
            return;
        }

        if (!tourId.matches("\\d+")) {
            outputLabel.setText("Tour ID must be a number.");
            return;
        }

        String status = "" ;
        if (status != null) {
            outputLabel.setText("Visa Status for Tour ID " + tourId + ":\n" + status);
        } else {
            outputLabel.setText("Tour ID " + tourId + " not found or no visa status available.");
        }

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
