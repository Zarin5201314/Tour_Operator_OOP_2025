package com.oopproject.new_tour_operator_project.Tourist;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ViewBookingController {
    @javafx.fxml.FXML
    private TableColumn<Tourist,String> contactColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> packageNameColumn;
    @javafx.fxml.FXML
    private TableColumn<Tourist,String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> bookingIDColumn;
    @javafx.fxml.FXML
    private TableView<Tourist> viewbookigTableView;
    @javafx.fxml.FXML
    private TableColumn<Tourist,String> genderColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> packagePriceColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages,String> durationColumn;
    @javafx.fxml.FXML
    private TableColumn<TourPackages, DatePicker> bookingdateColumn;



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