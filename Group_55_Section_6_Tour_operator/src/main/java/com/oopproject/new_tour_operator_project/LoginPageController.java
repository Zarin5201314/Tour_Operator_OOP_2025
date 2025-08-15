package com.oopproject.new_tour_operator_project;

import com.oopproject.new_tour_operator_project.Accountant.AccountantDashBoardController;
import com.oopproject.new_tour_operator_project.Tourist.TouristDashBoardController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController
{
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label outputLabel;


    ObservableList<User> touristObservableList = FXCollections.observableArrayList();
    ObservableList<User> accountantDashBoardObservableList = FXCollections.observableArrayList();




    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOAction(ActionEvent actionEvent) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccountPage.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Create Account");
        stage.show();
    }

    @javafx.fxml.FXML
    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();



        String name , password;
        boolean flag = true;
        outputLabel.setText("Error");

        name = userNameTextField.getText();
        password = passwordTextField.getText();
         if (name.isEmpty()){
             flag = false;
             outputLabel.setText("User name error");
             try {
                 outputLabel.wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }


         }

         else if (password.isBlank()){
             flag = false;
             outputLabel.setText("Password error");
             try {
                 outputLabel.wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }



         }


         else {
             outputLabel.setText("Invalid username or password.");
         }








    }


}