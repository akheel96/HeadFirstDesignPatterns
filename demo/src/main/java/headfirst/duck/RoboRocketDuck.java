package headfirst.duck;

public class RoboRocketDuck extends Duck {

	public RoboRocketDuck() {
		flyBehavior = new RocketPoweredFlying();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("Robot Rocket Duck");
	}

}
