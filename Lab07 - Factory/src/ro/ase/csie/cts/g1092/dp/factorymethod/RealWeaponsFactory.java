package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class RealWeaponsFactory  extends AbstractWeaponFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String desc) {
		return null;
	}

}
