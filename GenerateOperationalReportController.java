package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GenerateOperationalReportController {

    @FXML
    private TableView<GenerateOperationalReport> createOperationalReportTableView;

    @FXML
    private TableColumn<GenerateOperationalReport,String> dateRangeTableColumn;

    @FXML
    private DatePicker endingDateDatepicker;

    @FXML
    private ComboBox<String> reportCatagoryComboBox;

    @FXML
    private TableColumn<GenerateOperationalReport,String> reportCatagoryTableview;

    @FXML
    private DatePicker startingDateDatePicker;

    @FXML
    private TableColumn<GenerateOperationalReport,String> totalBookingTableview;

    @FXML
    private TextField totalBookingTextField;

    @FXML
    private ComboBox<String> tourTypeComboBox;

    @FXML
    private TableColumn<GenerateOperationalReport,String> tourTypeTableview;

    @FXML
    void addToTableButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
