package com.example.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class View {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
