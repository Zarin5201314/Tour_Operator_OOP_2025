package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SubmitTourCompletionReportController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> dateTableColumn;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> issuessFacedTableColumn;

    @FXML
    private ComboBox<String> issuessFatchComboBox;

    @FXML
    private ComboBox<String> locationComboBox;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> locationTableColumn;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> ratingTableColumn;

    @FXML
    private TextField ratingTextField;

    @FXML
    private TableView<SubmitTourCompletionReport> submitTourCompletionReportTableView;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> totalTouristTableColumn;

    @FXML
    private TextField totalTouristTextField;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> tourIDTableColumn;

    @FXML
    private TextField tourIDTextField;

    @FXML
    private TableColumn<SubmitTourCompletionReport,String> tourNameTableColumn;

    @FXML
    private TextField tourNameTextField;

    @FXML
    void addToTableButton(ActionEvent event) {

    }

    @FXML
    void submitButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
