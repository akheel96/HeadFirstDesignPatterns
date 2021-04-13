package pattern.strategy;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("With Bow And Arrow");
	}
	
}
