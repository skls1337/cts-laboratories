package ro.ase.csie.cts.singleton;

import ro.ase.csie.cts.sources.IRobotSoftware;

public class Robot implements IRobotSoftware {

	private static Robot instance = null;

	private Robot() {

	}

	

	public static Robot getInstance() {
		if (instance == null) {
			instance = new Robot();
		}
		return instance;
	}

	@Override
	public void trimiteCerere(String denumire) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInformatii(String categorie) {
		
		return categorie;
	}

	@Override
	public void prelucrareCerere(String tip) {
		System.out.println("doing stuff..."+tip);
		
	}

	@Override
	public int getIdRobot() {
		
		return 0;
	}

}
