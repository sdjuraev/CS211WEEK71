package com.example.firstapp;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HelloController {
    @FXML
    Button LoginButton;
    @FXML
    private Label welcomeText;
    @FXML
    private TextField loginText;
    @FXML
    private PasswordField passwordText;
    int counter=5;
    boolean status=false;

    @FXML
    Button CancelButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void setLoginButton() throws IOException {
        if (loginText.getText().isEmpty()||passwordText.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Login password can't be empty!");
            alert.show();
        } else {
            File file = new File("password.txt");
            Scanner scanner = new Scanner(file);
            //https://github.com/sdjuraev/CS211WEEK71.git
            if (counter <= 0) {
                System.out.println("You attempted many times");
                LoginButton.setDisable(true);
            }
            counter--;
            while (scanner.hasNext()) {
                String temp[] = scanner.nextLine().split(" ");
                if (loginText.getText().equals((temp[0])) && passwordText.getText().equals(temp[1])) {
                    System.out.println("Login successful!");
                    counter = 5;
                    status = true;
                } else {

                }
            }
            if (!status) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "You have " + counter + " attempts");
                alert.show();
            }
        }
    }
    @FXML
    public void setCancelButton()
    {
        Platform.exit();


            }



}
// https://github.com/sdjuraev/CS211WEEK71.git