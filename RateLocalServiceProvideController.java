package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RateLocalServiceProvideController {

    @FXML
    private TableColumn<RateLocalServiceProvider,String> commentsTableColumn;

    @FXML
    private TextArea commentsTextArea;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<RateLocalServiceProvider,String> dateTableColumn;

    @FXML
    private ComboBox<String> provideTypeComboBox;

    @FXML
    private TableColumn<RateLocalServiceProvider,String> provideTypeTableColumn;

    @FXML
    private ComboBox<String> providerNameComboBox;

    @FXML
    private TableColumn<RateLocalServiceProvider,String> providerNameTableColumn;

    @FXML
    private TableView<RateLocalServiceProvider> rateLocalServiceProvideTableView;

    @FXML
    private TableColumn<RateLocalServiceProvider,String> ratingTableColumn;

    @FXML
    private TextField ratingTextField;

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
