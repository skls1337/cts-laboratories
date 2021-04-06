package ro.ase.csie.cts.g1092.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		GameAPIFacade.createProfileAndConnect();
		
		//3. Get the main character
		
		SuperHero superHero=new SuperHero("Superman", new Helmet(), new SuperPower());
		
		
	}

}
