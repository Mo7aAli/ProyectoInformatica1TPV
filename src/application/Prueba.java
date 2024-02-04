package application;

public class Prueba {
	
	public static void main(String[] args) {
		
		Client c = new Client("a","b","e","f","u",11, "");
		UserFileHandler.writeToFile("./logi.txt", c);
		//UserFileHandler.readFromFile("./logi.txt");
		
		
	}
	

}
