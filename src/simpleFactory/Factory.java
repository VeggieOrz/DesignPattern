package simpleFactory;

public class Factory {
	
	public static Product createProduct(String arg) throws Exception{
		if (arg != null && "A".equalsIgnoreCase(arg)) {
			System.out.println("Product A is being produced");
			return new ConcreteProductA();
		} else if (arg != null && "B".equalsIgnoreCase(arg)) {
			System.out.println("Product B is being produced");
			return new ConcreteProductB();
		} else {
			throw new Exception("Sorry,This kind of product is not found");
		}
	}
}
