package com.matin.paint.frontend;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
    	BorderPane root = FXMLLoader.load(getClass().getResource("paintStartPage.fxml"));
        Scene scene = new Scene(root, 1000, 700);
        primaryStage.setTitle("Matin Paint");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); 
    }
}
