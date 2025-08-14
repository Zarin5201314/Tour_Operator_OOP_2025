package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBookingController
{
    @javafx.fxml.FXML
    private TableColumn contactColumn;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn genderColumn;
    @javafx.fxml.FXML
    private TableColumn packagePriceColumn;
    @javafx.fxml.FXML
    private TableColumn packageNameColumn;
    @javafx.fxml.FXML
    private TableColumn durationColumn;
    @javafx.fxml.FXML
    private TableColumn bookingdateColumn;
    @javafx.fxml.FXML
    private TableView viewbookigTableView;
    @javafx.fxml.FXML
    private TableColumn bookingIDColumn;

    @javafx.fxml.FXML
    public void initialize() {

        packageNameColumn.setCellValueFactory(new PropertyValueFactory<>("package name"));
        bookingIDColumn.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        packagePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        bookingdateColumn.setCellValueFactory(new PropertyValueFactory<>("bookingDate"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactColumn.setCellValueFactory(new PropertyValueFactory<>("contactInfo"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
    }
}
