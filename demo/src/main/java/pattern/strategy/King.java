package pattern.strategy;

public class King extends Character{

	public King() {
		setWeaponBehavior(new BowAndArrowBehavior());
	}
	
	@Override
	public void fight() {
		System.out.println("King is Fighting ");
		weaponBehavior.useWeapon();
	}
}
