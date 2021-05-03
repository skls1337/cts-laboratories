package ro.ase.csie.cts.g1092.dp.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		SuperHeroCharacter fantasyHero = new FantasySuperHero("Alduin", 1000, true);

		fantasyHero.move();
		fantasyHero.takeAHit(500);

		SuperHeroCharacter woundedHero = new WoundedDecorator(fantasyHero);

		woundedHero.move();

		fantasyHero.heal(200);

		SuperHeroCharacter heroWithShield = new ShieldDecorator(fantasyHero, 200);
		System.out.println(heroWithShield.power);
		heroWithShield.takeAHit(500);
		System.out.println(fantasyHero.power);
		System.out.println(heroWithShield.power);
		SuperHeroCharacter heroWithShieldWithShield = new ShieldDecorator(fantasyHero, 250);
		heroWithShieldWithShield.takeAHit(260);
	}

}
