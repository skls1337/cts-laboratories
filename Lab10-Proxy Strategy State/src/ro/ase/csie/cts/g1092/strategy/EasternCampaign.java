package ro.ase.csie.cts.g1092.strategy;

public class EasternCampaign implements BonusStrategyInterface {

	@Override
	public void getBonusPoints(int points, Player player) {
		if (player.playTime > 5) {
			player.experiencePoints += (2 * points);
		}
	}

}
