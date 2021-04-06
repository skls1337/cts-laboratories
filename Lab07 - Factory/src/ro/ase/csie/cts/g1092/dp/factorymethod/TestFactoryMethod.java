package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.SuperHero;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;


public class TestFactoryMethod {

	public static void main(String[] args) {
		SuperHero superHero=new SuperHero("SUPER-MAN");
		boolean kidsMode=true;
		AbstractWeaponFactory abstractFactory=null;
		if(kidsMode) {
			abstractFactory=new WaterWeaponsFactory();
		}else {
			abstractFactory=new RealWeaponsFactory();
		}
		superHero.setWeapon(abstractFactory.getWeapon(WeaponType.BAZOOKA, "pew pew"));
	}

}
