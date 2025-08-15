package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CreateAndManageTourPackageController {

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> audienceTableColumn;

    @FXML
    private TableView<CreateAndManageToTourPackage> createAndManageTourPackageTableView;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> dateTableColumn;

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> durationTableColumn;

    @FXML
    private TextField durationTextField;

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> locationTableColumn;

    @FXML
    private TextField locationTextField;

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> priceTableColumn;

    @FXML
    private TextField priceTextField;

    @FXML
    private ComboBox<String> targetAudienceComboBox;

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> tourNameTableColumn;

    @FXML
    private TextField tourNameTextField;

    @FXML
    private ComboBox<String> tourTypeComboBox;

    @FXML
    private TableColumn<CreateAndManageToTourPackage,String> typeTableColumn;

    @FXML
    void createPackageButton(ActionEvent event) {

    }

}
