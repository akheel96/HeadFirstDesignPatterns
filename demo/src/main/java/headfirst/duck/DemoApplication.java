package headfirst.duck;

public class DemoApplication {

	public static void main(String[] args) {
		Duck duck = new MallockDuck();
		duck.performFly();
		duck.display();
		duck.swim(3);
		duck.performQuack();
	}

}
