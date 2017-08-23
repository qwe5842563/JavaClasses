package Chapter_1;
//模型鴨的class繼承Duck的類別
public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	// 外觀顯示
	public void display() {
		System.out.println("I'm a model duck");
	}
}
