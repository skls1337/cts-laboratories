package ro.ase.csie.cts.g1092.strategy;

public class SummerCampaign implements BonusStrategyInterface{
	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints+=1.5*points;
		
	}
	
}
