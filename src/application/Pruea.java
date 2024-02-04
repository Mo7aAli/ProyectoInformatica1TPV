package application;

import java.util.Iterator;

public class Pruea {
	public static void main(String[] gs) {
		FileUtilAlmacen fu = new FileUtilAlmacen();
		Client c = new Client("jsoe","b","alvaro","2004", "e" ,5,"f");
		fu.guardar(c);
		
		for(Client client : fu.leer()) {
			System.out.println(client.getFirstName());
		}
	}

}
