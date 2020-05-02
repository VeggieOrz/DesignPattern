package simpleFactory;

public class Factory {
	
	public static Product createProduct(String arg) {
		if (arg != null && "A".equals(arg)) {
			return new ConcreteProductA();
		} else if (arg != null && "B".equals(arg)) {
			return new ConcreteProductB();
		} else {
			return null;
		}
	}
}
