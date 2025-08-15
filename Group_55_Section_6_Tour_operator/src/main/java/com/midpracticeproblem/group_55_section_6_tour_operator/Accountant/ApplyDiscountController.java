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

public class ApplyDiscountController
{
    @javafx.fxml.FXML
    private TextField discountTextField;
    @javafx.fxml.FXML
    private Label outPutLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyDiscountOnAction(ActionEvent actionEvent) {
        String discountText = discountTextField.getText();

        // --- Input Validation ---
        if (discountText.isBlank()) {
            outPutLabel.setText("Please enter a discount percentage.");
            return;
        }

        try {
            double discount = Double.parseDouble(discountText);

            if (discount < 0 || discount > 100) {
                outPutLabel.setText("Discount must be between 0 and 100%.");
                return;
            }


            System.out.println("--- Applying Discount ---");
            System.out.println("Applying a " + discount + "% discount.");
            System.out.println("-------------------------");

            outPutLabel.setText(String.format("Successfully applied %.2f%% discount!", discount));

            discountTextField.clear();

        } catch (NumberFormatException e) {
            outPutLabel.setText("Please enter a valid number for the discount.");
        }
    }

    @javafx.fxml.FXML
    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant/AccountantDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Accountant DashBoard");
        stage.show();
    }
}