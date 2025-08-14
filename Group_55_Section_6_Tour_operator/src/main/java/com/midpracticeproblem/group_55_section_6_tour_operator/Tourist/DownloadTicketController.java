package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DownloadTicketController
{
    @javafx.fxml.FXML
    private TableColumn packageNameColumn;
    @javafx.fxml.FXML
    private TableColumn bookingIDColumn;
    @javafx.fxml.FXML
    private TableView downloadTicketTableView;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn packageIDColumn;
    @javafx.fxml.FXML
    private Label outPutLabel;

    private ObservableList<TourPackages> ticketList = FXCollections.observableArrayList();
   

    @javafx.fxml.FXML
    public void initialize() {

        packageNameColumn.setCellValueFactory(new PropertyValueFactory<>("packageName"));
        bookingIDColumn.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        packageNameColumn.setCellValueFactory(new PropertyValueFactory<>("packageID"));
        packageIDColumn.setCellValueFactory((new PropertyValueFactory<>("packageID")));
        downloadTicketTableView.setItems(ticketList);
    }

    @javafx.fxml.FXML
    public void downloadTicketOnAction(ActionEvent actionEvent) {
        TourPackages selectedBooking = downloadTicketTableView.getSelectionModel().getSelectedItem();

        if (selectedBooking != null) {
            if (selectedBooking.getStatus().equals("Confirmed")) {
                // Simulate ticket download
                System.out.println("Simulating download for Booking ID: " + selectedBooking.getBookingID());
                System.out.println("Ticket for Package: " + selectedBooking.getPackageName());
                System.out.println("This would typically generate a PDF/email or save a file.");
                outPutLabel.setText("Ticket for Booking ID " + selectedBooking.getBookingID());

            } else {
               outPutLabel.setText("Ticket for Booking ID " + selectedBooking.getBookingID() + " is not confirmed and cannot be downloaded.");
            }
        } else {
            outPutLabel.setText("Please select a booking to download the ticket for.");
        }
    }

    @javafx.fxml.FXML
    public void gobackOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourist/TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Tourist Dashboard");
        stage.show();
    }
}
