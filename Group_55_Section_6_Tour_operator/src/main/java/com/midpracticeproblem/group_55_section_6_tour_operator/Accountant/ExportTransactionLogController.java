package com.midpracticeproblem.group_55_section_6_tour_operator.Accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class ExportTransactionLogController
{
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportOnAction(ActionEvent actionEvent) {
        String logContent = textArea.getText(); // Get the content to be exported

        if (logContent.isBlank()) {
            textArea.setText("No content to export.");
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Transaction Logs");
        // Set extension filter for text files
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files (*.txt)", "*.txt"));

        // Get the current stage from the event
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        File file = fileChooser.showSaveDialog(stage); // Show save file dialog

        if (file != null) {
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(logContent);
                textArea.setText("Logs exported successfully to: " + file.getAbsolutePath());
                System.out.println("Logs exported to: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
                textArea.setText("Error exporting logs: " + e.getMessage());
                System.err.println("Error exporting logs: " + e.getMessage());
            }
        } else {
            textArea.setText("Export cancelled.");
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
