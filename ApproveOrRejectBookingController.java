package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ApproveOrRejectBookingController {

    @FXML
    private Button addToTableButton;

    @FXML
    private RadioButton adultRadioButton;

    @FXML
    private TableView<ApproveOrRejectBooking> approveOrRejectionBookingTableView;

    @FXML
    private Button approveTableButton;

    @FXML
    private RadioButton childrenRadioButton;

    @FXML
    private Button confarmOrRejectButton;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> dateTableColumn;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> idTableColumn;

    @FXML
    private TextField idTextField;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> nameTableColumn;

    @FXML
    private TextField nameTextField;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> passportNumTableColumn;

    @FXML
    private TextField passportNumTextField;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> personTableColumn;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> phoneNumTableColumn;

    @FXML
    private TextField phoneNumTextField;

    @FXML
    private ComboBox<String> rejectionReasonComboBox;

    @FXML
    private ComboBox<String> tourTypeComboBox;

    @FXML
    private TableColumn<ApproveOrRejectBooking,String> tourTypeTableColumn;

    @FXML
    void addToTableViewButton(ActionEvent event) {

    }

    @FXML
    void approveButton(ActionEvent event) {

    }

    @FXML
    void confarmRejectButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
