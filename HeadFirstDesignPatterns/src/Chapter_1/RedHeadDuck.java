package Chapter_1;
//紅頭鴨的class繼承Duck
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	// 外觀顯示
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}