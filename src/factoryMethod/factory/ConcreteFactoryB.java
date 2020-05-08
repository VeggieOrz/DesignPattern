package factoryMethod.factory;

import factoryMethod.product.ConcreteProductB;
import factoryMethod.product.Product;

// �����ƷB��Ӧ�Ĺ���
public class ConcreteFactoryB implements Factory {
	
	public Product createProduct() {
		System.out.println("Product B is being produced.");
		return new ConcreteProductB();
	}
}
