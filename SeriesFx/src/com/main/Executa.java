package com.main;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Executa extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage palco) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/telaPrincipal.fxml"));
		Scene scene = new Scene(root);

        palco.setScene(scene);
        palco.show();
		
		
	}
}
