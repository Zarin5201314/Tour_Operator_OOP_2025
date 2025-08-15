package com.oopproject.new_tour_operator_project.Accountant;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class AccountantDashBoardController
{
    @javafx.fxml.FXML
    private BorderPane accountantDashBoardBP;
    @javafx.fxml.FXML
    private TextArea infoTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        if (infoTextArea != null) {
            infoTextArea.setText("Welcome, Accountant! Select an action from the left menu.");
        }
    }
    @javafx.fxml.FXML

    private void loadNewScene(ActionEvent event, String fxmlFileName, String title) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.show();
    }
    @javafx.fxml.FXML

    private void loadModalDialog(ActionEvent event, String fxmlFileName, String title) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
    Parent dialogRoot = loader.load();

    Stage dialogStage = new Stage();
    dialogStage.initModality(Modality.APPLICATION_MODAL);
    dialogStage.initOwner(((Node) event.getSource()).getScene().getWindow());
    dialogStage.setScene(new Scene(dialogRoot));
    dialogStage.setTitle(title);
    dialogStage.showAndWait(); // Show and wait for the dialog to be closed
}

    @javafx.fxml.FXML
    public void trackEarningsOnAction(ActionEvent actionEvent) throws IOException {
        loadNewScene(actionEvent, "TrackEarrnings.fxml", "Track Earnings");
    }

    @javafx.fxml.FXML
    public void processRefundsOnAction(ActionEvent actionEvent) throws IOException{
        loadNewScene(actionEvent, "ProcessRefunds.fxml", "Process Refunds");
    }

    @javafx.fxml.FXML
    public void logOutOnClick(ActionEvent actionEvent) throws IOException {
        try {
            loadModalDialog(actionEvent, "Logout.fxml", "Logout");
        } catch (IOException e) {
            e.printStackTrace();
            if (infoTextArea != null) {
                infoTextArea.setText("Error loading logout dialog.");
            }
        }
    }

    @javafx.fxml.FXML
    public void exportTransactionLogsOnAction(ActionEvent actionEvent) throws IOException {
        loadNewScene(actionEvent, "ExportTransactionLogs.fxml", "Export Transaction Logs");
    }

    @javafx.fxml.FXML
    public void applyDiscountsOnActive(ActionEvent actionEvent) throws IOException{
        loadNewScene(actionEvent, "ApplyDiscount.fxml", "Apply Discount");

    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) throws IOException {
        loadNewScene(actionEvent, "GenerateReport.fxml", "Generate Financial Reports");
    }

    @javafx.fxml.FXML
    public void issueInvoicesOnAction(ActionEvent actionEvent) throws IOException{
        loadNewScene(actionEvent, "IssueInvoices.fxml", "Issue Invoices");

    }

    @javafx.fxml.FXML
    public void manageVendorPaymentsOnAction(ActionEvent actionEvent) throws IOException{
        loadNewScene(actionEvent, "TrackEarrnings.fxml", "Track Earnings");

    }

    @javafx.fxml.FXML

    public void onLoadScene2Action(ActionEvent event) throws IOException {
        // Assuming Scene2.fxml is directly in the 'resources' folder or a common parent.
        // Adjust the path ("../Scene2.fxml" or "../../Scene2.fxml") based on its location relative to this controller.
        loadNewScene(event, "../Scene2.fxml", "My Custom Scene 2");
    }
}