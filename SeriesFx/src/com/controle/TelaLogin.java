package com.controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class TelaLogin implements Initializable{
	
	@FXML private TextField userTx;
	@FXML private TextField passTx;
	
	@FXML protected void logar(ActionEvent event){
		System.out.println("Entrou no metodo");
		System.out.println("Var a "+userTx.getText());
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}


	public TextField getUserTx() {
		return userTx;
	}


	public void setUserTx(TextField userTx) {
		this.userTx = userTx;
	}


	public TextField getPassTx() {
		return passTx;
	}


	public void setPassTx(TextField passTx) {
		this.passTx = passTx;
	}
	
	
	
}
