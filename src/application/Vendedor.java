package application;

	import java.util.ArrayList;
	import java.util.List;

	public class Vendedor extends Person{
		
		private List<Product> cart;

		public Vendedor(String firstName, String secondsName, String username, String password,
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
		
		
		

}
