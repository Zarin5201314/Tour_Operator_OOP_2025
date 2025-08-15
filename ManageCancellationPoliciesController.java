package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ManageCancellationPoliciesController {

    @FXML
    private TableView<ManageCancellationPolicies> manageCancellationpoliciesTableView;

    @FXML
    private ComboBox<String> packageTypeCombobox;

    @FXML
    private TableColumn<ManageCancellationPolicies,String> packageTypeTableColumn;

    @FXML
    private TextField penaltyTextField;

    @FXML
    private TableColumn<ManageCancellationPolicies,String> peneltyTableColumn;

    @FXML
    private TableColumn<ManageCancellationPolicies,String> reasonTableColumn;

    @FXML
    private ComboBox<String> seasonCombobox;

    @FXML
    private TableColumn<ManageCancellationPolicies,String> seasonTableColumn;

    @FXML
    private TextArea textreasonTextArea;

    @FXML
    private TableColumn<ManageCancellationPolicies,String> timeWindowTableColumn;

    @FXML
    private TextField timeWindowTextField;

    @FXML
    private ComboBox<String> tourTypeCombobox;

    @FXML
    private TableColumn<ManageCancellationPolicies,String> tourTypeTableColumn;

    @FXML
    void addToTableButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
