package Chapter_1;
//�ҫ��n��class�~��Duck�����O
public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	// �~�[���
	public void display() {
		System.out.println("I'm a model duck");
	}
}
