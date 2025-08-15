package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MonitorResourceAllocationController {

    @FXML
    private TableColumn<?,?> assignTourTableColumn;

    @FXML
    private TableColumn<?, ?> gpsTrackerTableColumn;

    @FXML
    private TableColumn<?, ?> guideIDTableColumn;

    @FXML
    private TableColumn<?, ?> guideNameTableColumn;

    @FXML
    private TableColumn<?, ?> hotelNameTableColumn;

    @FXML
    private TableView<?> hotelRoomAllocationTable;

    @FXML
    private TableColumn<?, ?> numberPlateTableColumn;

    @FXML
    private TableColumn<?, ?> roomRemainingTableColumn;

    @FXML
    private TableColumn<?, ?> roomsAssignTableColumn;

    @FXML
    private TableView<?> tourGuideAllocationTable;

    @FXML
    private TableColumn<?, ?> tourNameTableColumn;

    @FXML
    private TableView<?> vehicleStatusTable;

    @FXML
    private TableColumn<?, ?> vehicleTypeTableColumn;


}
