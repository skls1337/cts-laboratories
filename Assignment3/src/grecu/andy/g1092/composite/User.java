package grecu.andy.g1092.composite;

import grecu.andy.g1092.builder.RoleEnum;
import grecu.andy.g1092.singleton.MongoDBConnection;

public abstract class User {
	protected int id;
	protected String email;
	protected String password;
	protected RoleEnum role;

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void login(String email, String password, MongoDBConnection connection) {
		if (connection != null) {
			try {
				System.out.println("logged in with: "+email);
			} catch (Exception e) {
				System.out.println("Invalid credentials");
				e.printStackTrace();
			}
		} else {
			System.out.println("Internal server error");
		}
	}

	public static void logout(MongoDBConnection connection) {
		if (connection != null) {
			try {
				System.out.println("Logged out");
			} catch (Exception e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
		} else {
			System.out.println("Internal server error");
		}
	}
}
