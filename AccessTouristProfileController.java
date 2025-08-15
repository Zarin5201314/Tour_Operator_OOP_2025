package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AccessTouristProfileController {

    @FXML
    private TableView<AccessTouristProfile> accessTouristProfileTableView;

    @FXML
    private TableColumn<AccessTouristProfile,String> ageTableColumn;

    @FXML
    private TableColumn<AccessTouristProfile,String> genderTableColumn;

    @FXML
    private TableColumn<AccessTouristProfile,String> nameTableColumn;

    @FXML
    private TableColumn<AccessTouristProfile,String> nationalityTableColumn;

    @FXML
    private TableColumn<AccessTouristProfile,String> passportNumberTableColumn;

    @FXML
    private TableColumn<AccessTouristProfile,String> phoneNumberTableColumn;

    @FXML
    private Button searchByNameButton;

    @FXML
    private Button showOnlyFemaleTouristButton;

    @FXML
    private Button showOnlyMaleTouristButton;

    @FXML
    private Button viewTouristListButton;


}
