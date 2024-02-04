package controller;

import java.util.List;

import application.Client;
import application.FileUtilAlmacen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RecoverPasswordController {


	@FXML
	private TextField confirmPasswordId;

	@FXML
	private TextField passwordId;
	
	private String username;

	@FXML
	void recoverPassworor(ActionEvent event) {
		System.out.println(passwordId.getText());
		CheckUsernameController check = new CheckUsernameController();
		String user = username;
		System.out.println(user + "  l");
		FileUtilAlmacen fu = new FileUtilAlmacen();
		List<Client> clientes = fu.leer();
		if(confirmPasswordId.getText().equals(passwordId.getText())) {
			for(Client c : clientes) {
				if(c.getUsername().equals(user)) {
					Client client = c;
					client.setPassword(passwordId.getText());
					FileUtilAlmacen fuli = new FileUtilAlmacen();
					boolean borrado =fuli.borrar(user);
					System.out.println(borrado);
					fuli.guardar(client);
				}
			}
		}else {
			System.out.println("no entra");
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
