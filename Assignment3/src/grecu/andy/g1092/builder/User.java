package grecu.andy.g1092.builder;

import grecu.andy.g1092.singleton.MongoDBConnection;

public abstract class User {
	protected int id;
	protected String email;
	protected String password;
	protected RoleEnum role;
	protected String token;

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static String login(String email, String password, MongoDBConnection connection) {
		if (connection != null) {
			try {
				System.out.println("logged in with: " + email);
				return "token_" + email.hashCode() + password.hashCode();
			} catch (Exception e) {
				System.out.println("Invalid credentials");
				e.printStackTrace();
			}
		} else {
			System.out.println("Internal server error");
			return null;
		}
		return null;
	}

	public static void logout(MongoDBConnection connection, User user) {
		if (connection != null) {
			try {
				System.out.println("Logged out");
				user.setToken(null);
			} catch (Exception e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
		} else {
			System.out.println("Internal server error");
		}
	}
}
