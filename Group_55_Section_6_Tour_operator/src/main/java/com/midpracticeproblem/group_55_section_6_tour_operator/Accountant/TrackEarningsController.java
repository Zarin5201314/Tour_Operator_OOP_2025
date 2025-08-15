package com.midpracticeproblem.group_55_section_6_tour_operator.Accountant;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrackEarningsController
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
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Accountant/AccountantDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Accountant DashBoard");
        stage.show();
    }


}
