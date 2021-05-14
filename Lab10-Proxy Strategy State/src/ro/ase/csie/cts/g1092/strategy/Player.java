package ro.ase.csie.cts.g1092.strategy;

public class Player {
	String userName;
	int playTime;
	int experiencePoints;

	BonusStrategyInterface bonusCampaign = new NoCampaign();

	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String userName, int playTime, int experiencePoints) {
		this.userName = userName;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}

	public void getExperiencePoints(int pointsReceied) {
		if(bonusCampaign!=null) {
			bonusCampaign.getBonusPoints(pointsReceied,this);
		}
	}
}
