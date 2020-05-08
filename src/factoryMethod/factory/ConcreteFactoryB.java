package factoryMethod.factory;

import factoryMethod.product.ConcreteProductB;
import factoryMethod.product.Product;

// 具体产品B对应的工厂
public class ConcreteFactoryB implements Factory {
	
	public Product createProduct() {
		System.out.println("Product B is being produced.");
		return new ConcreteProductB();
	}
}
