package application;

import javafx.scene.shape.Path;

public class Product {
	
	private String nombre;
	private double price;
	private double weight;
	private String decription;
	private  int quantityAvailble;
	private  String path;
	
	public Product(String nombre, double price, double weight, String decription, int quantityAvailble,String path) {
		super();
		this.nombre = nombre;
		this.price = price;
		this.weight = weight;
		this.decription = decription;
		this.quantityAvailble = quantityAvailble;
		this.path = path;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public int getQuantityAvailble() {
		return quantityAvailble;
	}

	public void setQuantityAvailble(int quantityAvailble) {
		this.quantityAvailble = quantityAvailble;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
	
	
	
}
