package ro.ase.csie.cts.g1092.dp.adapter;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;

public class Disney2SuperHeroAdapter extends SuperHeroCharacter {

	DisneyActions disneyCharacter = null;

	public Disney2SuperHeroAdapter(DisneyActions disneyCharacter) {
		super(disneyCharacter.getName(), disneyCharacter.getPower());
		this.disneyCharacter = disneyCharacter;
	}

	@Override
	public void move() {
		disneyCharacter.changeLocation(0, 0);
	}

	@Override
	public void crouch() {
		System.out.println(disneyCharacter.getName()+" is crouching");
	}

	@Override
	public void takeAHit(int points) {
		disneyCharacter.isWounded(points);
	}

	@Override
	public void heal(int points) {
		disneyCharacter.isHealing(points);
	}
}
