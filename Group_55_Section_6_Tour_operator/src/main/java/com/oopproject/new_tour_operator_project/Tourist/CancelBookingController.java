package com.oopproject.new_tour_operator_project.Tourist;

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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> bookingIDColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> packageNamneColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> statusColumn;
    @javafx.fxml.FXML
    private TableView<TourPackages> cancelBookingTableView;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> packageIDColumn;


    private ObservableList<TourPackages> bookingList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private Label outPutLabel;


    @javafx.fxml.FXML
    public void initialize() {

        packageNamneColumn.setCellValueFactory(new PropertyValueFactory<>("packageName"));
        bookingIDColumn.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        packageIDColumn.setCellValueFactory(new PropertyValueFactory<>("packageID"));



        cancelBookingTableView.setItems(bookingList);
    }

    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent) {
        TourPackages selectedBooking = cancelBookingTableView.getSelectionModel().getSelectedItem();

        if (selectedBooking != null) {
            if (selectedBooking.getStatus().equals("Cancelled")) {
                outPutLabel.setText("This booking is already cancelled.");
                return;
            }

            selectedBooking.setStatus("Cancelled");

            cancelBookingTableView.refresh();
            outPutLabel.setText("Booking ID " + selectedBooking.getBookingID() + " has been cancelled.");


        } else {
            outPutLabel.setText("Please select a booking to cancel.");
        }
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourist/TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Tourist Dashboard");
        stage.show();
    }
}