package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OperationManagerDashboardController {

    @FXML
    private BorderPane OperationManagerBP;

    // Method to load different FXML files into the center of BorderPane
    private void loadFXML(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node node = loader.load();
            OperationManagerBP.setCenter(node);
        } catch (IOException e) {
            e.printStackTrace();
            // You might want to show an error message to the user here
        }
    }

    @FXML
    void ApproveOrRejectBookingOAButton(ActionEvent event) {
        loadFXML("ApproveOrRejectBooking.fxml");
    }

    @FXML
    void AssignStaffToTourOAButton(ActionEvent event) {
        loadFXML("AssignStuffToTour.fxml");
    }

    @FXML
    void CreateManageTourPackageOAButton(ActionEvent event) {
        loadFXML("CreateAndManageTourPackage.fxml");
    }

    @FXML
    void GenerateOperationalReportsOAButton(ActionEvent event) {
        loadFXML("GenerateOperationalReport.fxml");
    }

    @FXML
    void ManageCancellationPoliciesOAButton(ActionEvent event) {
        loadFXML("ManageCancellationPolicies.fxml");
    }

    @FXML
    void ManageVendorContractOAButton(ActionEvent event) {
        loadFXML("ManageVendorContract.fxml");
    }

    @FXML
    void MonitorResourceAllocationOAButton(ActionEvent event) {
        loadFXML("MonitorResourceAllocation.fxml");
    }

    @FXML
    void UpdateWeatherSafetyInformationOAButton(ActionEvent event) {
        loadFXML("UpdateWeatherAndSafetyInformation.fxml");
    }

    @FXML
    void operationManagerAccount(ActionEvent event) {
        loadFXML("OperationManagerAccount.fxml");
    }

    @FXML
    void initialize() {
        // You can load a default FXML here if needed
        // loadFXML("DefaultDashboard.fxml");
    }
}