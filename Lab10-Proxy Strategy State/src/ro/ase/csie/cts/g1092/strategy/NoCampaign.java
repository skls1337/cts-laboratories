package ro.ase.csie.cts.g1092.strategy;

public class NoCampaign implements BonusStrategyInterface{
	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints+=points;
		
	}

}
