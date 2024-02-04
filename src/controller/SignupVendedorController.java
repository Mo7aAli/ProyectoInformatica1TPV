package controller;

import application.Vendedor;
import application.FileutilVendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignupVendedorController {

	@FXML
	private TextField firstNameId;

	@FXML
	private TextField secondNameId;

	@FXML
	private TextField userId;

	@FXML
	private TextField passwordId;

	@FXML
	private TextField directionId;

	@FXML
	private TextField numberId;

	@FXML
	private TextField emailId;

	@FXML
	private TextField confirmPassId;

	@FXML
	private Button sigUpButton;

	FileutilVendedor  fu = new FileutilVendedor ();

	@FXML
	void registrrse(ActionEvent event) {

		if(passwordId.getText().equals(confirmPassId.getText()) & !passwordId.getText().isEmpty() & !userId.getText().isEmpty()) {
			System.out.println("entrando");
			String first = firstNameId.getText();
			String second = secondNameId.getText();
			String user = userId.getText();
			String password = passwordId.getText();
			String direction = directionId.getText();
			String email = emailId.getText();
			int number = Integer.parseInt(numberId.getText());

			Vendedor v = new Vendedor(first, second, user, password, email,number, direction);
			fu.guardar(v);

			Node source = (Node) event.getSource(); 
			Stage stage = (Stage) source.getScene().getWindow();
			stage.close();

		}else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Mensaje de Alerta");
			alert.setHeaderText(null);
			alert.setContentText("Este es un mensaje de alerta.");

			// Mostrar y esperar
			alert.showAndWait();
		}

	}



}
