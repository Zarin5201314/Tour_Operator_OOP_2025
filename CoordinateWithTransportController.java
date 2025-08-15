package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CoordinateWithTransportController {

    @FXML
    private ComboBox<String> assignGuideComboBox;

    @FXML
    private TableColumn<CoordinateWithTransport,String> assignGuideTableColumn;

    @FXML
    private TableView<CoordinateWithTransport> coordinateWithTransportTableView;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> destinationComboBox;

    @FXML
    private TableColumn<CoordinateWithTransport,String> destinationTableColumn;

    @FXML
    private TableColumn<CoordinateWithTransport,String> driverNameTableColumn;

    @FXML
    private TextField driverNameTextField;

    @FXML
    private TableColumn<CoordinateWithTransport,String> driverNumberTableColumn;

    @FXML
    private TextField driverNumberTextField;

    @FXML
    private DatePicker dropDateDatePicker;

    @FXML
    private Button informationAddToTableButton;

    @FXML
    private DatePicker pickupDateDatePicker;

    @FXML
    private ComboBox<String> tourNameComboBox;

    @FXML
    private TableColumn<CoordinateWithTransport,String> tourNameTableColumn;

    @FXML
    private TextField vehicleNumberTextField;

    @FXML
    private ComboBox<String> vehicleTypeComboBox;

    @FXML
    private TableColumn<CoordinateWithTransport,String> vehicleTypeTableColumn;

    @FXML
    void informationAddToTableButton(ActionEvent event) {

    }

}
