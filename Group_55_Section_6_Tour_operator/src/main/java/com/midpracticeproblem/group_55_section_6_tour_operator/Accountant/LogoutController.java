package com.midpracticeproblem.group_55_section_6_tour_operator.Accountant;

import javafx.event.ActionEvent;

public class LogoutController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelOnAction(ActionEvent actionEvent) throws IOException{
        Stage currentStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        currentStage.close();


        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginPage.fxml"));
        Parent root = loader.load();
        Stage loginStage = new Stage();
        loginStage.setScene(new Scene(root));
        loginStage.show();

    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        stage.close();

    
    }
}
