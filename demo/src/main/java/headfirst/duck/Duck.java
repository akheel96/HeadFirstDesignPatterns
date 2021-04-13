package headfirst.duck;

public abstract class Duck {
	
	IFlyBehavior flyBehavior;
	
	IQuackBehavior quackBehavior;

	public abstract void display();
	
	public void swim() {
		System.out.println("Iam Swimming at default speed");
	}
	
	public void swim(int speed) {
		System.out.println("Iam Swimming at " + speed + " speed");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
}
