package factoryMethod.factory;

import factoryMethod.product.ConcreteProductA;
import factoryMethod.product.Product;

// 具体产品A对应的工厂
public class ConcreteFactoryA implements Factory{

	public Product createProduct() {
		System.out.println("Product A is being produced.");
		return new ConcreteProductA();
	}
}
