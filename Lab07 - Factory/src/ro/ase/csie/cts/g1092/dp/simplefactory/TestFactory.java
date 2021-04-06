package ro.ase.csie.cts.g1092.dp.simplefactory;

public class TestFactory {

	public static void main(String[] args) {
		SuperHero superHero=new SuperHero("SUPER-MAN");
		superHero.setWeapon(new Bazooka("bAZOOKA"));
		superHero.setWeapon(new MachineGun("Bratata",100,99));
		
		superHero.setWeapon(WeaponsFactory.getWeapon(WeaponType.PISTOL, "pew pew"));
	}

}
