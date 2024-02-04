package application;

public class Person {

	private String firstName;
	private String secondsName;
	private String username;
	private String password;
	private String email;
	private int numero;
	private String direction;
	

	public Person(String firstName, String secondsName, String username, String password,
			String email, int numero, String direction) {
		super();
		this.firstName = firstName;
		this.secondsName = secondsName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.numero = numero;
		this.direction = direction;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondsName() {
		return secondsName;
	}

	public void setSecondsName(String secondsName) {
		this.secondsName = secondsName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	


}
