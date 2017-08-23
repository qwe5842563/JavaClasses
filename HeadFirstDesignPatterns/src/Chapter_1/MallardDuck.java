package Chapter_1;
//綠頭鴨的class繼承Duck
public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	// 外觀顯示
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}