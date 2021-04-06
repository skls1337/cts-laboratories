package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractWeaponFactory {

	@Override
	public  AbstractWeapon getWeapon(WeaponType type, String desc) {
		AbstractWeapon weapon = null;
		switch (type) {
		case BAZOOKA: {
			weapon = new WaterBalloon(desc);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return weapon;
	}

}
