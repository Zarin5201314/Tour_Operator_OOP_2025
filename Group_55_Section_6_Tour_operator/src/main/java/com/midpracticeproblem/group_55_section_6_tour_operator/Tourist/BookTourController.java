package com.oopproject.new_tour_operator_project.Tourist;

import com.oopproject.new_tour_operator_project.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class BookTourController {
    @javafx.fxml.FXML
    private DatePicker availableDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> itineraryComboBox;
    @javafx.fxml.FXML
    private TextField durationtTextField;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> packageNameComboBox;
    @javafx.fxml.FXML
    private TextField totalAmountTextField;
    @javafx.fxml.FXML
    private Label outPutLabel;

    @javafx.fxml.FXML
    public void initialize() {
        packageNameComboBox.getItems().addAll("European Grand Tour", "Asian Highlights", "African Safari", "South American Wonders");
        itineraryComboBox.getItems().addAll("Historical City Tour", "Mountain Trek Adventure", "Beach Relaxation Getaway", "Cultural Immersion Trip");
        paymentMethodComboBox.getItems().addAll("Credit Card","Debit card","Bkash","Nagad", "Bank Transfer");
        paymentMethodComboBox.setPromptText("Select Method");
    }


    @javafx.fxml.FXML
    public void viewBookingOnClick(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewBooking.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }

    @javafx.fxml.FXML
    public void confirmBookingOnClick(ActionEvent actionEvent) {
        if (itineraryComboBox.getValue() == null || itineraryComboBox.getValue().isEmpty()) {
            outPutLabel.setText("Please select a Detailed Itinerary.");
            return;
        }
        if (availableDatePicker.getValue() == null) {
            outPutLabel.setText("Please select an Available Date.");
            return;
        }
        if (packageNameComboBox.getValue() == null || packageNameComboBox.getValue().isEmpty()) {
           outPutLabel.setText("Please select a Package Name.");
            return;
        }
        if (durationtTextField.getText().isBlank()) {
            outPutLabel.setText("Please enter the Duration.");
            return;
        }
        if (!durationtTextField.getText().matches("\\d+")) {
            outPutLabel.setText("Duration must be a number.");
            return;
        }
        if (totalAmountTextField.getText().isBlank()) {
            outPutLabel.setText("Please enter the Total Amount.");
            return;
        }
        if (!totalAmountTextField.getText().matches("\\d+(\\.\\d+)?")) {
            outPutLabel.setText("Total Amount must be a valid number.");
            return;
        }
        if (paymentMethodComboBox.getValue() == null || paymentMethodComboBox.getValue().isEmpty()) {
            outPutLabel.setText("Please select a Payment Method.");
            return;
        }


        String itinerary = itineraryComboBox.getValue();
        LocalDate date = availableDatePicker.getValue();
        String packageName = packageNameComboBox.getValue();
        String duration = durationtTextField.getText();
        String totalAmount = totalAmountTextField.getText();
        String paymentMethod = paymentMethodComboBox.getValue();

        System.out.println("--- Booking Confirmed ---");
        System.out.println("Itinerary: " + itinerary);
        System.out.println("Date: " + date);
        System.out.println("Package: " + packageName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Amount: $" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("-------------------------");


        outPutLabel.setText("Booking confirmed successfully!");

    }



    @javafx.fxml.FXML
    public void goBackOnClick(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @javafx.fxml.FXML
    private void clearFields() {
        itineraryComboBox.getSelectionModel().clearSelection();
        availableDatePicker.setValue(null);
        packageNameComboBox.getSelectionModel().clearSelection();
        durationtTextField.clear();
        totalAmountTextField.clear();
        paymentMethodComboBox.getSelectionModel().clearSelection();
        outPutLabel.setText("");
    }


}




