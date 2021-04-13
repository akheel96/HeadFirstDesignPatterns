package pattern.strategy;

public class Knight extends Character{

	public Knight() {
		setWeaponBehavior(new SwordBehavior());
	}
	
	@Override
	public void fight() {
		System.out.println("King is Fighting ");
		weaponBehavior.useWeapon();
	}
}
