package Chapter_1;
//���Y�n��class�~��Duck
public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	// �~�[���
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}