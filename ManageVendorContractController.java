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

public class ManageVendorContractController {

    @FXML
    private TableColumn<ManageVendorContract,String> contractNameTableColumn;

    @FXML
    private TextField contractNameTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<ManageVendorContract,String> dateTableColumn;

    @FXML
    private TableColumn<ManageVendorContract,String> locationTableColumn;

    @FXML
    private TextField locationTextField;

    @FXML
    private TableView<ManageVendorContract> manageVendorContractTableView;

    @FXML
    private TableColumn<ManageVendorContract,String> numberTableColumn;

    @FXML
    private TextField phoneOrEmailTextField;

    @FXML
    private TableColumn<ManageVendorContract,String> vendorNameTableColumn;

    @FXML
    private TextField vendorNameTextField;

    @FXML
    private ComboBox<String> vendorTypeComboBox;

    @FXML
    private TableColumn<ManageVendorContract,String> vendorTypeTableColumn;

    @FXML
    void addToTableButton(ActionEvent event) {

    }

    @FXML
    void approveButton(ActionEvent event) {

    }

    @FXML
    void expireButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
