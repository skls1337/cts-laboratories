package ro.ase.csie.cts.g1092.dp.memento;

public class SuperHero {
	String name;
	int lifePoints;
	private String magick;

	public SuperHero(String name, int lifePoints, String magick) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.magick = magick;
	}

	public void attack() {
		System.out.println("Attacking");
	}

	public void healing() {
		System.out.println("Healing");
	}

	public void move() {
		System.out.println("Moving");
	}
	
	public HeroRestorePoint saveData() {
		return new HeroRestorePoint(name, lifePoints, magick);
	}
	
	public void restoreData(HeroRestorePoint memento) {
		this.name=memento.name;
		this.lifePoints=memento.lifePoints;
		this.magick=memento.getMagick();
	}
}
