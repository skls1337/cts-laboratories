package ro.ase.csie.cts.g1092.proxy;

public class LoginModule implements LoginInterface {
	String serverIp;
	String dbConnection;

	public LoginModule(String serverIp, String dbConnection) {
		super();
		this.serverIp = serverIp;
		this.dbConnection = dbConnection;
	}

	@Override
	public boolean login(String username, String password) {
		System.out.println("Connectiong to the database: " + dbConnection);
		if (username.toLowerCase().equals("admin") && password.equals("1234admin")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean checkServerStatus() {

		return true;
	}
}
