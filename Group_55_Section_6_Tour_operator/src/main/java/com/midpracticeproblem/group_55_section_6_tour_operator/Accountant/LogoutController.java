package com.oopproject.new_tour_operator_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LogoutController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void yesLogoutOnAction(ActionEvent actionEvent) throws IOException{
        Stage currentStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        currentStage.close();


        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginPage.fxml"));
        Parent root = loader.load();
        Stage loginStage = new Stage();
        loginStage.setScene(new Scene(root));
        loginStage.show();

    }

    @javafx.fxml.FXML
    public void cancelOnAction(ActionEvent actionEvent) {


        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        stage.close();

    }
}