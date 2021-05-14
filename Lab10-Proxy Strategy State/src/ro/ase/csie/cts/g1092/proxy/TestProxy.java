package ro.ase.csie.cts.g1092.proxy;

public class TestProxy {

	public static void main(String[] args) {
		LoginInterface loginModule=new LoginModule("10.0.01", "mongodb");
		if(loginModule.login("admin", "1234admin")) {
			System.out.println("Hello admin");
		}else {
			System.out.println("Invalid credentials");
		}
		
		loginModule=new LoginWith2FactorAuth(loginModule);
		
		String[] passwords= {"1234","123456","admin","root","1234admin"};
		
		for(String password :passwords) {
			if(loginModule.login("admin", password)) {
				System.out.println("Found: "+password);
				break;
			}
		}
	}

}
