package headfirst.duck;

public class MallockDuck extends Duck {

	public MallockDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Mallock Duck");
	}
	
}
