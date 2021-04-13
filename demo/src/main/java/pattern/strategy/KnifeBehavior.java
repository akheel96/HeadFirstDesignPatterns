package pattern.strategy;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("With Knife");
	}
	
}
