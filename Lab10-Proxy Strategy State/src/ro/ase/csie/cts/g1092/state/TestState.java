package ro.ase.csie.cts.g1092.state;

public class TestState {

	public static void main(String[] args) {
		SuperHero superHero=new SuperHero("Dorel", 500);
		superHero.move();
		superHero.takeAHit(350);
		superHero.move();
		superHero.takeAHit(250);
		superHero.move();
		superHero.heal(250);
		superHero.move();
	}

}
