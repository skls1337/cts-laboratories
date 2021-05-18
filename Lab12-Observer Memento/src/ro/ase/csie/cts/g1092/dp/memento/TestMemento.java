package ro.ase.csie.cts.g1092.dp.memento;

public class TestMemento {
	public static void main(String[] args) {
		SuperHero hero=new SuperHero("SuperMan", 100, "Fly");
		HeroRestorePoint initial=hero.saveData();
		hero.lifePoints+=150;
		System.out.println("HP: "+ hero.lifePoints);
		hero.restoreData(initial);
		System.out.println("HP: "+ hero.lifePoints);
	}
}
