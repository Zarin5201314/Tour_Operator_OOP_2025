package com.oopproject.new_tour_operator_project.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class IssueInvoicesController
{
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TextField bookingIDTextField;
    @javafx.fxml.FXML
    private Label outPutLabel;

    @javafx.fxml.FXML
    public void initialize() {
        outPutLabel.setText("");
    }

    @javafx.fxml.FXML
    public void cancelOnClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant/AccountantDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Accountant DashBoard");
        stage.show();

    }

    @javafx.fxml.FXML
    public void issueInvoiceOnClick(ActionEvent actionEvent) {
        String bookingId = bookingIDTextField.getText();
        String amountText = amountTextField.getText();

        // --- Input Validation ---
        if (bookingId.isBlank() || amountText.isBlank()) {
            outPutLabel.setText("Booking ID and Amount fields cannot be empty.");
            return;
        }

        // Validate Booking ID is numeric (if applicable for your system)
        if (!bookingId.matches("\\d+")) { // Assumes Booking ID is numeric
            outPutLabel.setText("Booking ID must be a number.");
            return;
        }

        // Validate Amount is a valid number
        double amount;
        try {
            amount = Double.parseDouble(amountText);
            if (amount <= 0) {
                outPutLabel.setText("Amount must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            outPutLabel.setText("Amount must be a valid number.");
            return;
        }

        // --- Simulate Invoice Issuance ---
        // In a real application, you would record this invoice in your database,
        // potentially generate a PDF, or send an email.
        System.out.println("--- Issuing Invoice ---");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Amount: $" + String.format("%.2f", amount));
        System.out.println("Invoice Issued on: " + java.time.LocalDate.now());
        System.out.println("-----------------------");

        outPutLabel.setText("Invoice issued successfully for Booking ID: " + bookingId);
        // Optionally, clear fields after issuing
        bookingIDTextField.clear();
        amountTextField.clear();
    }
}