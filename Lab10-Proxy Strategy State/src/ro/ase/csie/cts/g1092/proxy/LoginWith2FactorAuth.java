package ro.ase.csie.cts.g1092.proxy;

public class LoginWith2FactorAuth implements LoginInterface {

	LoginInterface loginModule = null;

	public LoginWith2FactorAuth(LoginInterface loginModule) {
		this.loginModule = loginModule;
	}

	public boolean checkGeneratedCode(int code) {
		if (code == 1245) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean login(String username, String password) {
		if (loginModule.login(username, password)) {
			System.out.println("Please input the generated code that yo u received over email");
			System.out.println("Check received code");
			if (checkGeneratedCode(1245)) {
				System.out.println("Hello: " + username);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

}
