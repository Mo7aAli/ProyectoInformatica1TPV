package controller;

import java.util.List;

import application.Client;
import application.FileUtilAlmacen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CheckUsernameController {

	@FXML
	private TextField userId;

	FileUtilAlmacen fu = new FileUtilAlmacen();
	
	private String username;
	
	public CheckUsernameController() {
	}


	@FXML
	void checkUsernme(ActionEvent event) {
		List<Client> clientes = fu.leer();

		boolean encontro= false;
		for(Client c : clientes) {
			if(userId.getText().equals(c.getUsername())) {
				//this.username=userId.getText();
				///username=userId.getText();
				encontro=true;
				try {
					FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/RecoverPassword.fxml"));
					RecoverPasswordController control2 = new RecoverPasswordController();
					control2.setUsername(userId.getText());
					loader2.setController(control2);

					Parent root2 = loader2.load();			
					Stage stage = new Stage();

					stage.setScene(new Scene(root2));
					stage.initModality(Modality.WINDOW_MODAL);
					stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
					stage.show();

				} catch(Exception e) {

				}
			}
		}


		if(!encontro) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Mensaje de Alerta");
			alert.setHeaderText(null);
			alert.setContentText("Este es un mensaje de alerta.");

			// Mostrar y esperar
			alert.showAndWait();
		}
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
