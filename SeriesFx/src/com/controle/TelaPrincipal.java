package com.controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class TelaPrincipal implements Initializable{
	
	@FXML private TextField campoMeio;
	
	@FXML protected void mouseAndou(ActionEvent event){
		System.out.println("Entrou no metodo");
		campoMeio.setText("Voalá! ");
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
}
