package simpleFactory;

public class ConcreteProductA implements Product {

	@Override
	public void use() {
		System.out.println("This is product A");
	}
}
