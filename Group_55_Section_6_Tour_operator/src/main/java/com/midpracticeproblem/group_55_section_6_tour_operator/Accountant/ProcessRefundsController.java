package com.midpracticeproblem.group_55_section_6_tour_operator.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class ProcessRefundsController
{
    @javafx.fxml.FXML
    private TableColumn<RefundRequest,String> touristIDColumn;
    @javafx.fxml.FXML
    private TableColumn<RefundRequest,String> packageIDcolumn;
    @javafx.fxml.FXML
    private TableColumn<RefundRequest,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<RefundRequest,Double> totalAmountColumn;
    @javafx.fxml.FXML
    private TableView<RefundRequest> refundTableView;
    @javafx.fxml.FXML
    private Label messageLabel;


    private ObservableList<RefundRequest> refundList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        packageIDcolumn.setCellValueFactory(new PropertyValueFactory<>("packageId"));
        touristIDColumn.setCellValueFactory(new PropertyValueFactory<>("touristId"));
        totalAmountColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void rejectOnAction(ActionEvent actionEvent) {
        RefundRequest selectedRequest = refundTableView.getSelectionModel().getSelectedItem();

        if (selectedRequest != null) {
            if (selectedRequest.getStatus().equals("Approved")) {
                messageLabel.setText("This refund request is already approved.");
                return;
            }
            // Simulate approval
            selectedRequest.setStatus("Approved");
            // Refresh the table view to show the updated status
            refundTableView.refresh();
            messageLabel.setText("Refund for Package ID " + selectedRequest.getPackageId() + " approved.");

            
        } else {
            messageLabel.setText("Please select a refund request to approve.");
        }
    }

    @javafx.fxml.FXML
    public void approveOnAction(ActionEvent actionEvent) {
         RefundRequest selectedRequest = refundTableView.getSelectionModel().getSelectedItem();
        if (selectedRequest != null) {
            if (selectedRequest.getStatus().equals("Rejected")) {
                messageLabel.setText("This refund request is already rejected.");
                return;
            }
            // Simulate rejection
            selectedRequest.setStatus("Rejected");
            // Refresh the table view to show the updated status
            refundTableView.refresh();
            messageLabel.setText("Refund for Package ID " + selectedRequest.getPackageId() + " rejected.");

            // In a real application:
            // 1. Update the status in your database.
            // 2. Potentially send a rejection notification.
        } else {
            messageLabel.setText("Please select a refund request to reject.");
        }
    }

     @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant/AccountantDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Accountant DashBoard");
        stage.show();
    }
}
