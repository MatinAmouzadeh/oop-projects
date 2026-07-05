package com.matin.calculator.frontend;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws IOException
	{
		AnchorPane root= FXMLLoader.load(getClass().getResource("/com/matin/calculator/frontend/StartPage.fxml"));
		Scene scene = new Scene(root , 335, 550);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) 
	{
		launch(args);
	}

}
