package ro.ase.csie.cts.g1092.state;

public class SuperHero {

	public static final int CRITICAL_VALUE = 50;
	public static final int WOUNDED_VALUE = 200;

	String name;
	int lifePoints;

	MoveStateInterface moveState = null;

	public SuperHero(String name, int lifePoints) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.moveState = new NormalState();
	}

	public void move() {
		if (moveState != null) {
			this.moveState.moveAtDifferentLocation();
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	public void takeAHit(int points) {
		lifePoints-=points;
		if(lifePoints<=CRITICAL_VALUE) {
			moveState=new CriticalWoundedState();
		}else 
			if(lifePoints<=WOUNDED_VALUE) {
				moveState=new WoundedState();
			}
	}
	public void heal(int points) {
		this.lifePoints+=points;
		if(lifePoints>WOUNDED_VALUE) {
			moveState=new NormalState();
		}else 
			if(lifePoints>CRITICAL_VALUE) {
				moveState=new WoundedState();
			}
	}
}
