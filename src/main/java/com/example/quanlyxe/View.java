package com.example.quanlyxe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class View extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("car_management.fxml")));
        stage.setTitle("Tu_Hoc_Vu_đz");
        stage.setScene(new Scene(root,1177,900));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



