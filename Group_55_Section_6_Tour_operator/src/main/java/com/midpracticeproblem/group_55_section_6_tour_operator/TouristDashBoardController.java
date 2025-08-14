package com.midpracticeproblem.group_55_section_6_tour_operator;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;



import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class TouristDashBoardController
{
    @javafx.fxml.FXML
    private TextArea infoTextArea;
    @javafx.fxml.FXML
    private BorderPane touristDashBoardBP;

    @javafx.fxml.FXML
    public void initialize() {
        if (infoTextArea != null) {
            infoTextArea.setText("Welcome to your Tourist Dashboard! Select an option from the left menu.");
        }
    }

    @javafx.fxml.FXML
    private void loadNewScene(ActionEvent event, String fxmlFileName, String title) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.show();
    }


    @javafx.fxml.FXML
    public void cancelBookingOnAction(ActionEvent actionEvent)throws IOException {
        loadNewScene(actionEvent, "CancelBooking.fxml", "Cancel Booking");
        
    }

    @javafx.fxml.FXML
    public void bookTourOnAction(ActionEvent actionEvent) throws IOException{
        loadNewScene(actionEvent, "BookTour.fxml", "Book Tour");
        
    }

    @javafx.fxml.FXML
    public void contactSupportOnAction(ActionEvent actionEvent)throws IOException{
        loadNewScene(actionEvent, "ContactSupport.fxml", "Contact Support");
    }

    @javafx.fxml.FXML
    public void trackVisaStatusOnAction(ActionEvent actionEvent)throws IOException {
        loadNewScene(actionEvent, "TrackVisaStatus.fxml", "Track Visa Status");
    }

    @javafx.fxml.FXML
    public void submitFeedbackOnAction(ActionEvent actionEvent) IOException {
        loadNewScene(actionEvent, "SubmitFeedback.fxml", "Submit Feedback");
    }

    @javafx.fxml.FXML
    public void editProfileOnAction(ActionEvent actionEvent) throws IOException {
        loadNewScene(actionEvent, "EditProfile.fxml", "Edit Profile");
    }

    @javafx.fxml.FXML
    public void viewBookingOnAction(ActionEvent actionEvent)throws IOException{
        loadNewScene(actionEvent, "ViewBooking.fxml", "View Booking");
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent)throws IOException {
        loadNewScene(actionEvent, "Logout.fxml", "Logout");
    }

    @javafx.fxml.FXML
    public void bookPackagesOnAction(ActionEvent actionEvent)  throws IOException {
        loadNewScene(actionEvent, "BrowsePackages.fxml", "Browse Packages");
    }

    @javafx.fxml.FXML
    public void downloadBookingOnAction(ActionEvent actionEvent)throws IOException{
        loadNewScene(actionEvent, "DownloadTicket.fxml", "Download Tickets");
    }
    
}
