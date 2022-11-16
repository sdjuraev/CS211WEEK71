package com.example.firstapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void setLoginButton() throws IOException {
        File file=new File("password.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNext()){
            String temp[]=scanner.nextLine().split(" ");

            if (loginText.getText().equals((temp[0]))&&passwordText.getText().equals(temp[1]))
            {
                System.out.println("Login successful!");
            }
        }
    }


}
// https://github.com/sdjuraev/CS211WEEK71.git