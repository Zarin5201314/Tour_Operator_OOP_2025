package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AssignStaffToTourController {

    @FXML
    private TableView<AssignStaffToTour> assignStaffToTourTableView;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<AssignStaffToTour,String> dateTableColumn;

    @FXML
    private ComboBox<String> destinationComboBox;

    @FXML
    private TableColumn<AssignStaffToTour,String> destinationTableColumn;

    @FXML
    private TextField phoneNumTextField;

    @FXML
    private TableColumn<AssignStaffToTour,String> phoneTableColumn;

    @FXML
    private TextField stafIDTextField;

    @FXML
    private TextField stafNameTextField;

    @FXML
    private TableColumn<AssignStaffToTour,String> staffIDTableColumn;

    @FXML
    private TableColumn<AssignStaffToTour,String> staffNameTableColumn;

    @FXML
    private ComboBox<String> staffRoleComboBox;

    @FXML
    private TableColumn<AssignStaffToTour,String> staffRoleTableColumn;

    @FXML
    void confarmAssignButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
