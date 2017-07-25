
public class Runner {

	public static void main(String[] args) {
		Parent parent = new Parent("Ming");
		parent.whoAmI();
		Child child = new Child("Hao");
		child.whoAmI();
		Parent anotherChild = new Child("Wei");
		anotherChild.whoAmI();
	}

}
