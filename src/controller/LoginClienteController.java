package controller;


import java.io.File;
import java.util.List;

import application.Client;
import application.FileUtilAlmacen;
import application.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginClienteController {

	@FXML
	private Button buttonLogin;

	@FXML
	private Button buttonSignup;

	@FXML
	private TextField userTest;

	@FXML
	private PasswordField passTest;

	@FXML
	private Hyperlink forgotPasswordLink;

	FileUtilAlmacen fu = new FileUtilAlmacen();

	@FXML
	void mostrarHomepagecliente(ActionEvent event) {

		System.out.println(userTest.getText());
		System.out.println(passTest.getText());

		List<Client> clientes = fu.leer();

		System.out.println(clientes.size());


		boolean entro = false;	
		for(Client c : clientes) {
			if(c.getUsername().equals(userTest.getText()) & c.getPassword().equals(passTest.getText())) {
				try {
					FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/HomepageCliente.fxml"));
					entro = true;

					HomepageClienteController control2 = new HomepageClienteController();
					Product product = new Product("Agua", 1.00, 1.50, "agua del mecadona", 10,"Agua.png");					
					Image myImage = new Image(product.getPath());
					Product product2 = new Product("Limon", 2.00, 1.80, "limon de Peru", 10,"Limon.png");					
					Product product3 = new Product("Lays", 2.00, 1.80, "limin de Peru", 10,"Lays.png");	
					Product product4 = new Product("Limon", 2.00, 1.80, "limin de Peru", 10,"Limon.png");
					Product product5 = new Product("Limon", 2.00, 1.80, "limin de Peru", 10,"Limon.png");					
					Product product6 = new Product("Limon", 2.00, 1.80, "limin de Peru", 10,"Limon.png");					
					Product product7 = new Product("Limon", 2.00, 1.80, "limin de Peru", 10,"Limon.png");					
					Product product8 = new Product("Limon", 2.00, 1.80, "limin de Peru", 10,"Limon.png");			
					Product product9 = new Product("Limon", 2.00, 1.80, "limin de Peru", 10,"Limon.png");					
					
					
					
					
					loader2.setController(control2);
					control2.setC(c);

					Parent root2 = loader2.load();
					
					control2.getImage1().setImage(myImage);
					
					control2.getImage2().setImage(new Image(product2.getPath()));
					
					control2.getImage3().setImage(new Image(product3.getPath()));
					
					
					Stage stage = new Stage();

					stage.setScene(new Scene(root2));
					stage.initModality(Modality.WINDOW_MODAL);
					stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
					stage.show();

				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			}


		}

		if(!entro) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Mensaje de Alerta");
			alert.setHeaderText(null);
			alert.setContentText("Este es un mensaje de alerta.");

			// Mostrar y esperar
			alert.showAndWait();
		}
	}




	@FXML
	void mostrarSignupCliente(ActionEvent event) {

		try {
			FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/fxml/SignupCliente.fxml"));

			SignUpCliente control3 = new SignUpCliente();

			loader3.setController(control3);

			Parent root3 = loader3.load();			
			Stage stage = new Stage();

			stage.setScene(new Scene(root3));
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
			stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

    @FXML
    void recoverPass(ActionEvent event) {
    	
    	try {
			FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/fxml/CheckUsername.fxml"));

			CheckUsernameController control3 = new CheckUsernameController();

			loader3.setController(control3);

			Parent root3 = loader3.load();			
			Stage stage = new Stage();

			stage.setScene(new Scene(root3));
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
			stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    
    private ImageView createImageView(String imagePath) {
        Image image = new Image(new File(imagePath).toURI().toString());
        ImageView imageView = new ImageView(image);

        // Adjuntar la ruta de la imagen como un dato adicional al ImageView
        imageView.setUserData(imagePath);

        return imageView;
    }
}