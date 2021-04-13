package ro.ase.csie.cts.g1092.dp.adapter.disney;

public class DonaldDuck implements DisneyActions {

	String name;
	int lifePoints;

	public DonaldDuck(int lifePoints) {
		this.name = "Donald Duck";
		this.lifePoints = lifePoints;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Is moving to long: " + x + " lat: " + y);
	}

	@Override
	public void isWounded(int lostPoints) {
		System.out.println(name + " is taking " + lostPoints + " points");
		lifePoints -= lostPoints;
	}

	@Override
	public void isHealing(int recoveredPoints) {
		System.out.println(name + " is recovering " + recoveredPoints + " points");
		lifePoints += recoveredPoints;

	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public int getPower() {

		return lifePoints;
	}

}
