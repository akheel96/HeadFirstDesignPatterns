package headfirst.duck;

public class MuteQuack implements IQuackBehavior{

	public void quack() {
		System.out.println("I cannot Quack");
	}

}
