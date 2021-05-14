package ro.ase.csie.cts.g1092.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Player player = new Player("Dorel", 15, 150);
		player.setBonusCampaign(new EasternCampaign());

		player.getExperiencePoints(150);
		System.out.println(player.experiencePoints);
		player.setBonusCampaign(new SummerCampaign());

		player.getExperiencePoints(150);
		System.out.println(player.experiencePoints);
		player.setBonusCampaign(new NoCampaign());

		player.getExperiencePoints(150);
		System.out.println(player.experiencePoints);
	}

}
