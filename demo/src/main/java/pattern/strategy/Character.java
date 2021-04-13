package pattern.strategy;

public abstract class Character {

	WeaponBehavior weaponBehavior;

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	public abstract void fight();
}
