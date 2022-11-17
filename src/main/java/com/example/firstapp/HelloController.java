package com.example.firstapp;

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

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void setLoginButton() throws IOException {
        File file=new File("password.txt");
        Scanner scanner=new Scanner(file);
        //https://github.com/sdjuraev/CS211WEEK71.git
        counter--;
        Alert alert=new Alert(Alert.AlertType.WARNING,"You have "+counter+" attempts");
        alert.show();
        if (counter<=0){
            System.out.println("You attempted many times");
            LoginButton.setDisable(true);

        }
        while (scanner.hasNext()){
            String temp[]=scanner.nextLine().split(" ");

            if (loginText.getText().equals((temp[0]))&&passwordText.getText().equals(temp[1]))
            {
                System.out.println("Login successful!");
            }
            else {

            }
        }
    }


}
// https://github.com/sdjuraev/CS211WEEK71.git