package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class LogTravelIssuesController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<LogTravelIssues,String> dateTableColumn;

    @FXML
    private TextArea descriptionBoxTextArea;

    @FXML
    private TableColumn<LogTravelIssues,String> descriptionTableColumn;

    @FXML
    private RadioButton highRadioButton;

    @FXML
    private TableColumn<LogTravelIssues,String> issuessTypeTableColumn;

    @FXML
    private ComboBox<String> issuestypeComboBox;

    @FXML
    private TableView<LogTravelIssues> logTravelIssuessTableView;

    @FXML
    private RadioButton lowRadioButton;

    @FXML
    private RadioButton mediumRadioButton;

    @FXML
    private TableColumn<LogTravelIssues,String> urgencyLabelTableColumn;

    @FXML
    void addToTableButton(ActionEvent event) {

    }

    @FXML
    void sendToOperationManagerButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
