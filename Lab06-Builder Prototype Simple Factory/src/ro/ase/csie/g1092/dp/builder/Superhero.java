package ro.ase.csie.g1092.dp.builder;

public class Superhero {
	String name;
	int lifePoints;
	boolean isVillain;
	boolean isCriticalWounded;
	Weapon leftHandWeapon;
	Weapon rightHandWeapon;

	String superPower;
	String superSuperPower;

	private Superhero() {

	}

	public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticalWounded, Weapon leftHandWeapon,
			Weapon rightHandWeapon, String superPower, String superSuperPower) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isCriticalWounded = isCriticalWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Superhero [name=" + name + ", lifePoints=" + lifePoints + ", isVillain=" + isVillain
				+ ", isCriticalWounded=" + isCriticalWounded + ", leftHandWeapon=" + leftHandWeapon
				+ ", rightHandWeapon=" + rightHandWeapon + ", superPower=" + superPower + ", superSuperPower="
				+ superSuperPower + "]";
	}





	public static class SuperheroBuilder{
		Superhero superhero=null;
		
		public SuperheroBuilder(String name,int lifePoints) {
			superhero=new Superhero();
			superhero.name=name;
			superhero.lifePoints=lifePoints;
				//or
				//superhero=new Superhero(name,lifePoints,false,false,null,null,"","");
		}
		
		public SuperheroBuilder isVillain() {
			superhero.isVillain=true;
			return this;
		}
		
		public SuperheroBuilder isCriticalWounded() {
			superhero.isCriticalWounded=true;
			return this;
		}
		public SuperheroBuilder setLeftWeapon(Weapon weapon) {
			superhero.leftHandWeapon=weapon;
			return this;
		}
		public SuperheroBuilder setRightWeapon(Weapon weapon) {
			superhero.rightHandWeapon=weapon;
			return this;
		}
		public SuperheroBuilder setSuperPower(String superPower) {
			superhero.superPower=superPower;
			return this;
		}
		public SuperheroBuilder setSuperSuperPower(String superSuperPower) {
			superhero.superSuperPower=superSuperPower;
			return this;
		}
		
		public Superhero build() {
			return this.superhero;
		}
		
	}
	
}
