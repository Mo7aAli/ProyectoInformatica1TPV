package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import application.Vendedor;
import application.Product;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class HomepageVendedorController {


	
	@FXML
	private Button buttonTechSupport;



	@FXML
	private ImageView image1;

	@FXML
	private ImageView image2;

	@FXML
	private ImageView image3;

	@FXML
	private ImageView image4;

	@FXML
	private ImageView image5;

	@FXML
	private ImageView image6;

	@FXML
	private ImageView image9;

	@FXML
	private ImageView image8;

	@FXML
	private ImageView image7;

	private Vendedor v;

	@FXML
	private ImageView imageInfo;

	@FXML
	private Label nameInfo;

	@FXML
	private Label priceInfo;

	@FXML
	private Label weightPrice;

	@FXML
	private Label descriptionIno;



	public Vendedor getV() {
		return v;
	}

	public void setV(Vendedor v2) {
		this.v = v;
		
	}

	public ImageView getImage1() {
		return image1;
	}

	public void setImage1(ImageView image1) {
		this.image1 = image1;
	}

	public ImageView getImage2() {
		return image2;
	}

	public void setImage2(ImageView image2) {
		this.image2 = image2;
	}

	public ImageView getImage3() {
		return image3;
	}

	public void setImage3(ImageView image3) {
		this.image3 = image3;
	}

	public ImageView getImage4() {
		return image4;
	}

	public void setImage4(ImageView image4) {
		this.image4 = image4;
	}

	public ImageView getImage5() {
		return image5;
	}

	public void setImage5(ImageView image5) {
		this.image5 = image5;
	}

	public ImageView getImage6() {
		return image6;
	}

	public void setImage6(ImageView image6) {
		this.image6 = image6;
	}

	public ImageView getImage9() {
		return image9;
	}

	public void setImage9(ImageView image9) {
		this.image9 = image9;
	}

	public ImageView getImage8() {
		return image8;
	}

	public void setImage8(ImageView image8) {
		this.image8 = image8;
	}

	public ImageView getImage7() {
		return image7;
	}

	public void setImage7(ImageView image7) {
		this.image7 = image7;
	}

	public ImageView getImageInfo() {
		return imageInfo;
	}

	public void setImageInfo(ImageView imageInfo) {
		this.imageInfo = imageInfo;
	}

	public Label getNameInfo() {
		return nameInfo;
	}

	public void setNameInfo(Label nameInfo) {
		this.nameInfo = nameInfo;
	}

	public Label getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(Label priceInfo) {
		this.priceInfo = priceInfo;
	}

	public Label getDescriptionIno() {
		return descriptionIno;
	}

	public void setDescriptionIno(Label descriptionIno) {
		this.descriptionIno = descriptionIno;
	}

	@FXML
	void mostarInfo(MouseEvent event) {

		List<Product> productos = new ArrayList<Product>();
		Product product = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Agua.png");		
		productos.add(product);
		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());
		Product selectedProduct = productos.get(0);
		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		//imageInfo.setImage(image1.getImage());



	}

	@FXML
	void mostrarInfo2(MouseEvent event) {
		Product selected = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());
		//imageInfo.setImage(null);
		imageInfo.setImage(new Image(selected.getPath()));
		nameInfo.setText(selected.getNombre());
		priceInfo.setText(String.valueOf(selected.getPrice()));
		descriptionIno.setText(selected.getDecription());
		//imageInfo.setImage(new Image(selectedProduct.getPath()));

	}

	@FXML
	void mostrarInfo3(MouseEvent event) {
		Product selectedProduct = new Product("Limon", 2.00, 1.80, "limon de Peru", 10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image2.getImage());
	}

	@FXML
	void mostrarInfo4(MouseEvent event) {
		Product selectedProduct = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image1.getImage());
	}

	@FXML
	void mostrarInfo5(MouseEvent event) {
		Product selectedProduct = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image1.getImage());
	}

	@FXML
	void mostrarInfo6(MouseEvent event) {
		Product selectedProduct = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image1.getImage());
	}

	@FXML
	void mostrarInfo7(MouseEvent event) {
		Product selectedProduct = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image1.getImage());
	}

	@FXML
	void mostrarInfo8(MouseEvent event) {
		Product selectedProduct = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image1.getImage());
	}

	@FXML
	void mostrarInfo9(MouseEvent event) {
		Product selectedProduct = new Product("Agua", 1.00, 1.50, "agua del mecadona",   10,"Limon.png");		

		ImageView clickedImageView = (ImageView) event.getSource();
		System.out.println(clickedImageView.getImage().impl_getUrl());

		imageInfo.setImage(new Image(selectedProduct.getPath()));
		nameInfo.setText(selectedProduct.getNombre());
		priceInfo.setText(String.valueOf(selectedProduct.getPrice()));
		descriptionIno.setText(selectedProduct.getDecription());
		imageInfo.setImage(image1.getImage());
	}




}
