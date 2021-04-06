package ro.ase.csie.cts.g1092.dp.facade;

public class GameAPIFacade {
	public static void createProfileAndConnect() {
		//in order to connect to the game from an external app
				// you need to:
				//1. Create Player Profile and Login
				
				PlayerProfile profile=new PlayerProfile();
				profile.login();
				profile.getUserSettings();
				
				//2. Check the subscription
				Subscription subscription=new Subscription();
				subscription.checkSubscription();
				
	}
}
