package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClienteVendedorControler {
	
	 @FXML
	    void entrarCliente(ActionEvent event) {


	    	try {
				FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/LoginCliente.fxml"));
				
				LoginClienteController control2 = new LoginClienteController();
				
				loader2.setController(control2);
				
				Parent root2 = loader2.load();			
				Stage stage = new Stage();
				
				stage.setScene(new Scene(root2));
				stage.initModality(Modality.WINDOW_MODAL);
				stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
				stage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
	    
		 

	    }

	    @FXML
	    void entrarVendedor(ActionEvent event) {
	    	
	    	try {
				FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/LoginVendedor.fxml"));
				
				loginVendedorController control2 = new loginVendedorController();
				
				loader2.setController(control2);
				
				Parent root2 = loader2.load();			
				Stage stage = new Stage();
				
				stage.setScene(new Scene(root2));
				stage.initModality(Modality.WINDOW_MODAL);
				stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
				stage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}

	    }


}
