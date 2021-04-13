package ro.ase.csie.cts.g1092.dp.decorator;

public abstract class AbstractDecorator extends SuperHeroCharacter {
	SuperHeroCharacter decoratedObject = null;

	public AbstractDecorator(SuperHeroCharacter decoratedObject) {
		super(decoratedObject.name, decoratedObject.power);
		this.decoratedObject = decoratedObject;
	}

	@Override
	public void move() {
		decoratedObject.move();

	}

	@Override
	public void crouch() {
		decoratedObject.crouch();

	}

	@Override
	public void takeAHit(int points) {
		decoratedObject.takeAHit(points);

	}

	@Override
	public void heal(int points) {
		decoratedObject.heal(points);

	}

}
