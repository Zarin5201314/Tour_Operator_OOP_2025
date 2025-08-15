package com.oopproject.new_tour_operator_project.Accountant;

import com.oopproject.new_tour_operator_project.Tourist.TourPackages;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageVendorPaymentsController
{
    @javafx.fxml.FXML
    private TableColumn<VendorPayment,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<VendorPayment,String>vendorNameColumn;
    @javafx.fxml.FXML
    private TableColumn<VendorPayment,String> amountColumn;
    @javafx.fxml.FXML
    private TableView<VendorPayment> manageVendorPaymentTableView;
    @javafx.fxml.FXML
    private Label outPutLabel;

    private ObservableList<VendorPayment> paymentList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        vendorNameColumn.setCellValueFactory(new PropertyValueFactory<>("vendorName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        loadSamplePaymentData();
        manageVendorPaymentTableView.setItems(paymentList);
    }


    private void loadSamplePaymentData() {
        paymentList.clear();
        paymentList.add(new VendorPayment("Airline XYZ", 50000.00, "Pending"));
        paymentList.add(new VendorPayment("Hotel ABC", 15000.00, "Paid"));
        paymentList.add(new VendorPayment("Transport Services", 7500.00, "Pending"));
        paymentList.add(new VendorPayment("Tour Guides Inc.", 20000.00, "Pending"));
    }

    @javafx.fxml.FXML
    public void markAsPaidOnClick(ActionEvent actionEvent) {
        VendorPayment selectedPayment = manageVendorPaymentTableView.getSelectionModel().getSelectedItem();

        if (selectedPayment != null) {
            if (selectedPayment.getStatus().equals("Paid")) {
                outPutLabel.setText("This payment is already marked as paid.");
                return;
            }
            selectedPayment.setStatus("Paid");
            manageVendorPaymentTableView.refresh();
            outPutLabel.setText("Payment for " + selectedPayment.getVendorName() + " marked as paid.");
        } else {
            outPutLabel.setText("Please select a payment to mark as paid.");
        }
    }


    @javafx.fxml.FXML
    public void goBackOnClick(ActionEvent actionEvent)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant/AccountantDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Accountant DashBoard");
        stage.show();
    }
}
