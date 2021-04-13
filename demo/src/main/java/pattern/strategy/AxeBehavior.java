package pattern.strategy;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("With Axe");
	}
	
}
