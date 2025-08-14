package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TableColumn bookingIDColumn;
    @javafx.fxml.FXML
    private TableColumn packageNamneColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableView cancelBookingTableView;
    @javafx.fxml.FXML
    private TableColumn packageIDColumn;
    @javafx.fxml.FXML
    private Label outPutLabel;

    private ObservableList<TourPackages> bookingList = FXCollections.observableArrayList();
    

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
