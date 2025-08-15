package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class TourGuideDashboardController {
    @FXML
    private BorderPane AdminDashboardBP;
    @FXML
    private Label TourGuidDashboard;

    // Method to load different FXML files into the center of BorderPane
    private void loadFXML(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node node = loader.load();
            AdminDashboardBP.setCenter(node);
        } catch (IOException e) {
            showErrorAlert("Loading Error", "Failed to load: " + fxmlPath);
            e.printStackTrace();
        }
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        // Initialization code if needed
    }

    // Add the missing method for ChatWithTourist button
    @FXML
    public void ChatWithTouristOAButton(ActionEvent actionEvent) {
        loadFXML("ChatWithTourist.fxml");
    }

    @FXML
    public void AccessTouristProfilesOAButton(ActionEvent actionEvent) {
        loadFXML("AccessTouristProfile.fxml");
    }

    @FXML
    public void LogTravelIssuesOAButton(ActionEvent actionEvent) {
        loadFXML("LogTravelIssues.fxml");
    }

    @FXML
    public void RateLocalserviceProviderOAButton(ActionEvent actionEvent) {
        loadFXML("RateLocatServiceProvide.fxml"); // Fixed typo in filename
    }

    @FXML
    public void SubmitTourCompletionReportOAButton(ActionEvent actionEvent) {
        loadFXML("SubmitTourCompletionReport.fxml");
    }

    @FXML
    public void CoordinateWithTransportOAButton(ActionEvent actionEvent) {
        loadFXML("CoordinateWithTransport.fxml");
    }

    @FXML
    public void MarksAttendenceOAButton(ActionEvent actionEvent) {
        loadFXML("MarkAttendence.fxml");
    }

    @FXML
    public void ViewUpcomingTourAssignOAButton(ActionEvent actionEvent) {
        loadFXML("ViewUpcommingTourAssign.fxml"); // Fixed typo in filename
    }

    @FXML
    public void tourGuideAccountButton(ActionEvent actionEvent) {
        loadFXML("TourGuideAccount.fxml");
    }
}