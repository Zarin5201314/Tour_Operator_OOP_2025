package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.TableView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewUpcommingTourAssignController {

    @FXML
    private TableColumn<ViewUpcommingTourAssign,String> audienceTableColumn;

    @FXML
    private TableColumn<ViewUpcommingTourAssign,String> dateTableColumn;

    @FXML
    private TableColumn<ViewUpcommingTourAssign,String> durationTableColumn;

    @FXML
    private TableColumn<ViewUpcommingTourAssign,String> locationTableColumn;

    @FXML
    private TableColumn<ViewUpcommingTourAssign,String> tourNameTableColumn;

    @FXML
    private TableColumn<ViewUpcommingTourAssign,String> typesTableColumn;

    @FXML
    private TableView<ViewUpcommingTourAssign> viewUpcommingTourTableView;

    @FXML
    void upcommingTourButton(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }


}
