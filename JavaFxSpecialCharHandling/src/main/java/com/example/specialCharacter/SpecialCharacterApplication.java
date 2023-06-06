package com.example.specialCharacter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SpecialCharacterApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SpecialCharacterApplication.class.getResource("special-character-handling-gui.fxml"));
        stage.setTitle("JavaFX Special Character Handling");
        Scene scene = new Scene(fxmlLoader.load(), 640, 800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}