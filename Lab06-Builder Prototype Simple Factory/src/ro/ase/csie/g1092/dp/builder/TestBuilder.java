package ro.ase.csie.g1092.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		//1. Create 
		//Superhero superhero=new Superhero();
		//2. Init.
		//TO DO: don't forget to initialize the object with values
		Weapon pistol=new Weapon("Pistol");
		Superhero superhero1=new Superhero("Serghei Mizil", 100, false, false, pistol, pistol, "Drink alcohol", "");
		Superhero superhero2=new Superhero("Serghei Mizil's son", 100, false, false, null, null, "", "");
		Superhero superman=new Superhero.SuperheroBuilder("Superman", 100)
				.setLeftWeapon(pistol)
				.setSuperPower("He can fly")
				.setSuperSuperPower("Eye beam")
				.build();
		
		Superhero joker=new Superhero.SuperheroBuilder("Joker",200)
				.isVillain()
				.setRightWeapon(pistol)
				.build();
		
		System.out.println(superman.toString());
		System.out.println(joker.toString());
	}

}
