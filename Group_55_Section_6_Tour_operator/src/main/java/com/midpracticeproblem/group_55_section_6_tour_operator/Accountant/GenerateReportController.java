package com.midpracticeproblem.group_55_section_6_tour_operator.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class GenerateReportController
{
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant/AccountantDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Accountant DashBoard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void generateFinalcialReportOnAction(ActionEvent actionEvent) {
        LocalDate startDate = startDatePicker.getValue();
        LocalDate endDate = endDatePicker.getValue();

        // --- Input Validation ---
        if (startDate == null) {
            outputTextArea.setText("Please select a Start Date.");
            return;
        }
        if (endDate == null) {
            outputTextArea.setText("Please select an End Date.");
            return;
        }
        if (endDate.isBefore(startDate)) {
            outputTextArea.setText("End Date cannot be before Start Date.");
            return;
        }


        StringBuilder reportContent = new StringBuilder();
        reportContent.append("--- Financial Report for ").append(startDate).append(" to ").append(endDate).append(" ---\n\n");

        // Sample data for the report (replace with actual data processing)
        double totalRevenue = 150000.00;
        double totalExpenses = 75000.00;
        double netProfit = totalRevenue - totalExpenses;
        int toursBooked = 250;
        int refundsProcessed = 15;

        reportContent.append("Total Revenue: $").append(String.format("%.2f", totalRevenue)).append("\n");
        reportContent.append("Total Expenses: $").append(String.format("%.2f", totalExpenses)).append("\n");
        reportContent.append("Net Profit: $").append(String.format("%.2f", netProfit)).append("\n");
        reportContent.append("Tours Booked: ").append(toursBooked).append("\n");
        reportContent.append("Refunds Processed: ").append(refundsProcessed).append("\n");
        reportContent.append("\n--- End of Report ---");

        outputTextArea.setText(reportContent.toString());
        outputTextArea.setText("Report generated successfully!");

    }
}
