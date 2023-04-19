/*
Harlan Ferguson 101133838
Raleigh Desmond 101374701
Owen Beattie 101379668
*/
package com.example.realsem3java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}