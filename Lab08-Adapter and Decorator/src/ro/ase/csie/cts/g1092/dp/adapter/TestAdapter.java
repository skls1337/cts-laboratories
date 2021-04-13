package ro.ase.csie.cts.g1092.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.g1092.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.g1092.dp.adapter.disney.DonaldDuck;

public class TestAdapter {

	public static void main(String[] args) {
		SuperHeroCharacter fantasyHero=new FantasySuperHero("Alduin", 1000, true);
		
		fantasyHero.move();
		fantasyHero.takeAHit(500);
		fantasyHero.heal(200);
		
		DisneyActions donald=new DonaldDuck(200);
		donald.changeLocation(20, 10);
		donald.isWounded(20);
		donald.isHealing(90);
	
		ArrayList<SuperHeroCharacter>gameHeroes=new ArrayList<>();
		gameHeroes.add(fantasyHero);
		//gameHeroes.add(donald);
		Disney2SuperHeroAdapter donaldAdapter=new Disney2SuperHeroAdapter(donald);
		gameHeroes.add(donaldAdapter);
		
		for(SuperHeroCharacter hero:gameHeroes) {
			hero.crouch();
			hero.takeAHit(15);
			hero.heal(10);
		}
		
	}

}
