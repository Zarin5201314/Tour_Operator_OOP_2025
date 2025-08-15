package com.oopproject.new_tour_operator_project.Accountant;

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

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class TrackEarrningsController
{
    @javafx.fxml.FXML
    private TableColumn<EarningEntry, String> packageNameColumn;
    @javafx.fxml.FXML
    private TableColumn<EarningEntry, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<EarningEntry, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableView<EarningEntry> trackEarningTableView;
    @javafx.fxml.FXML
    private Label outputLabel;




    private ObservableList<EarningEntry> earningsList = FXCollections.observableArrayList();



    @javafx.fxml.FXML
    public void initialize() {
        packageNameColumn.setCellValueFactory(new PropertyValueFactory<>("packageName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));



        // Set the items to the TableView
        trackEarningTableView.setItems(earningsList);
    }
    @javafx.fxml.FXML
    public void saveEarningsToBinary() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("earnings_data.dat"))) {
            dos.writeInt(earningsList.size());
            for (EarningEntry entry : earningsList) {
                dos.writeUTF(entry.getPackageName());
                dos.writeDouble(entry.getAmount());
                dos.writeUTF(entry.getDate());
            }
            System.out.println("Earnings saved to earnings_data.dat successfully!");
        } catch (IOException e) {
            e.printStackTrace();
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
