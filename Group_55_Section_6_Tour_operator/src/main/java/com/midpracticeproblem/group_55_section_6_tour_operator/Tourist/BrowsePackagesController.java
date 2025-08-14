package com.midpracticeproblem.group_55_section_6_tour_operator.Tourist;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BrowsePackagesController
{
    @javafx.fxml.FXML
    private DatePicker preffredDatePicker;
    @javafx.fxml.FXML
    private RadioButton internationalRadioButton;
    @javafx.fxml.FXML
    private ToggleGroup packageTypeToggleGroup;
    @javafx.fxml.FXML
    private TextField durationTextField;
    @javafx.fxml.FXML
    private RadioButton domesticRadioButton;
    @javafx.fxml.FXML
    private TextField priceTextField;

    private List<String> domesticPackageNames = new ArrayList<>();
    private List<String> internationalPackageNames = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        packageTypeToggleGroup = new ToggleGroup();
        domesticRadioButton.setToggleGroup(packageTypeToggleGroup);
        internationalRadioButton.setToggleGroup(packageTypeToggleGroup);


        domesticRadioButton.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                populateAvailablePackages("Domestic");
            }
        });
        internationalRadioButton.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                populateAvailablePackages("International");
            }
        });


        
        domesticPackageNames.add("Himalayan Trek");
        domesticPackageNames.add("Coastal Beach Getaway");
        domesticPackageNames.add("Historical City Tour (Domestic)");

        internationalPackageNames.add("European Grand Tour");
        internationalPackageNames.add("Asian Cultural Expedition");
        internationalPackageNames.add("African Wildlife Safari");

       
        durationTextField.setEditable(false);
        priceTextField.setEditable(false);


        durationTextField.setEditable(false);
        priceTextField.setEditable(false);
    }

    @javafx.fxml.FXML
    private void populateAvailablePackages(String type) {
        availablePackageComboBox.getItems().clear();
        if (type.equals("Domestic")) {
            availablePackageComboBox.getItems().addAll(domesticPackageNames);
        } else if (type.equals("International")) {
            availablePackageComboBox.getItems().addAll(internationalPackageNames);
        }
        availablePackageComboBox.setPromptText("Select a Package");
        durationTextField.clear();
        priceTextField.clear();
        outPutLabel.setText("");
    }

    @javafx.fxml.FXML
    public void goBackOnclick(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Tourist/TouristDashBoard.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Tourist Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewDetailsOnclick(ActionEvent actionEvent) {
        
        String selectedPackageName = availablePackageComboBox.getAccessibleHelp();
        LocalDate preferredDate = preffredDatePicker.getValue();

        // Validation before viewing details
        if (selectedPackageName == null || selectedPackageName.isEmpty()) {
            outPutLabel.setText("Please select a package first.");
            return;
        }
        if (preferredDate == null) {
            outPutLabel.setText("Please select a Preferred Date.");
            return;
        }

        // Retrieve and display full details
        String description = "No description available."; // Default description
        if (domesticRadioButton.isSelected()) {
            if (selectedPackageName.equals("Himalayan Trek")) {
                description = "An exciting trek through the beautiful Himalayas.";
            } else if (selectedPackageName.equals("Coastal Beach Getaway")) {
                description = "Relaxing time on pristine local beaches.";
            } else if (selectedPackageName.equals("Historical City Tour (Domestic)")) {
                description = "Explore ancient ruins and vibrant local markets.";
            }
        } else if (internationalRadioButton.isSelected()) {
            if (selectedPackageName.equals("European Grand Tour")) {
                description = "Visit Paris, Rome, and Berlin.";
            } else if (selectedPackageName.equals("Asian Cultural Expedition")) {
                description = "Discover Tokyo, Seoul, and Beijing.";
            } else if (selectedPackageName.equals("African Wildlife Safari")) {
                description = "Experience the majestic wildlife of Africa.";
            }
        }
        else {
            outPutLabel.setText("Please select a package type.");
            return;
        }

        // Displaying details (e.g., to console, or to a separate dialog/area)
        System.out.println("--- Package Details ---");
        System.out.println("Package Name: " + selectedPackageName);
        System.out.println("Type: " + (domesticRadioButton.isSelected() ? "Domestic" : "International"));
        System.out.println("Preferred Date: " + preferredDate);
        System.out.println("Duration: " + durationTextField.getText()); // Already populated
        System.out.println("Price: " + priceTextField.getText());     // Already populated
        System.out.println("Description: " + description);
        System.out.println("-----------------------");

        outPutLabel.setText("Details for " + selectedPackageName + " displayed.");
    }
    }

    @javafx.fxml.FXML
    public void availablePackageComboBox(ActionEvent actionEvent) {
        String selectedPackageName = availablePackageComboBox.getValue();
        if (selectedPackageName != null && !selectedPackageName.isEmpty()) {
            // Manually assign details based on selected package name and type
            if (domesticRadioButton.isSelected()) {
                if (selectedPackageName.equals("Himalayan Trek")) {
                    durationTextField.setText("7 Days");
                    priceTextField.setText("500.00");
                } else if (selectedPackageName.equals("Coastal Beach Getaway")) {
                    durationTextField.setText("5 Days");
                }
                outPutLabel.setText(""); 
            } else {
                durationTextField.clear();
                priceTextField.clear();
                outPutLabel.setText("");
            }
        }
    }
}
