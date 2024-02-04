package application;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{
	
	private List<Product> cart;

	public Client(String firstName, String secondsName, String username, String password,
			String email, int numero, String direction) {
		super(firstName, secondsName, username, password, email, numero, direction);
		this.cart= new ArrayList<Product>();
		
		
	}
	
	public Product searchProduct(Product p) {
		Product pro = null;
		String serached = p.getNombre();
		for(Product product : this.cart ) {
		if(product.getNombre().equals(p.getNombre())){
			pro=product;
		}
		
		}
		return pro;
	}

	public List<Product> getCart() {
		return cart;
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
	
	
	public void addProduct(Product p) {
		this.cart.add(p);
		
	}
	
	public void removeProduct(Product p) {
		this.cart.remove(p);
	}
	
	public void editQuantity(Product p) {
		String serached = p.getNombre();
		for(Product product : this.cart ) {
		if(product.getNombre().equals(p.getNombre())){
			int quantity = product.getQuantityAvailble();
			quantity++;
			product.setQuantityAvailble(quantity);
			
		}
		
		}
		
	}
	
	
	public void editProfile(Person p) {
		this.setUsername(p.getUsername());
		this.setSecondsName(p.getSecondsName());
		this.setPassword(p.getPassword());
		this.setNumero(p.getNumero());
		this.setFirstName(p.getFirstName());
		this.setEmail(p.getEmail());
		this.setDirection(p.getDirection());
	}
	
	
	
}
