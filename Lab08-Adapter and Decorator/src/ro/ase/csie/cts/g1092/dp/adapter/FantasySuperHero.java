package ro.ase.csie.cts.g1092.dp.adapter;

public class FantasySuperHero extends SuperHeroCharacter {

	boolean canFly;

	public FantasySuperHero(String name, int power, boolean canFly) {
		super(name, power);
		this.canFly = canFly;
	}

	@Override
	public void move() {
		if (canFly) {
			System.out.println("Flying");
		} else {
			System.out.println("Moving");
		}
	}

	@Override
	public void crouch() {
		if (canFly) {
			System.out.println("Not able to do this");
		} else {
			System.out.println("Crouching");
		}
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.name+" took a hit of "+points +" points");
		this.power-=points;
	}

	@Override
	public void heal(int points) {
		System.out.println(this.name+" is healing "+points +" points");
		this.power+=points;
	}

}
