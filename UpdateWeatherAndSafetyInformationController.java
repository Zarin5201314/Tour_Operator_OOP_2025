package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UpdateWeatherAndSafetyInformationController {

    @FXML
    private ComboBox<String> alertTypeComboBox;

    @FXML
    private TableColumn<UpdateWeatherAndSafetyInformation,String> alertTypeTableColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<UpdateWeatherAndSafetyInformation,String> dateTableColumn;

    @FXML
    private TextArea detailInstructionTextArea;

    @FXML
    private DatePicker expireDateDatepicker;

    @FXML
    private TableColumn<UpdateWeatherAndSafetyInformation,String> expireDateTableColumn;

    @FXML
    private ComboBox<String> locationComboBox;

    @FXML
    private TableColumn<UpdateWeatherAndSafetyInformation,String> locationTableColumn;

    @FXML
    private TextArea manualInputTextArea;

    @FXML
    private CheckBox targetTourNotificationCheckBox;

    @FXML
    private TableView<UpdateWeatherAndSafetyInformation> updateWeatherAndSafetyInformationTableView;

    @FXML
    private TextField warningTitleTextField;

    @FXML
    void fetchWeatherButton(ActionEvent event) {

    }

    @FXML
    void submitUpdateButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
