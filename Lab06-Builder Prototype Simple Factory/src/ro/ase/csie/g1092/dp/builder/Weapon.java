package ro.ase.csie.g1092.dp.builder;

public class Weapon {
	String type;
	
	public Weapon(String type) {
		this.type = type;
	}

	
	
	@Override
	public String toString() {
		return "Weapon [type=" + type + "]";
	}



	public void pewPew() {
		System.out.println("pew pew");
	}
}
