package factoryMethod.factory;

import factoryMethod.product.ConcreteProductA;
import factoryMethod.product.Product;

// �����ƷA��Ӧ�Ĺ���
public class ConcreteFactoryA implements Factory{

	public Product createProduct() {
		System.out.println("Product A is being produced.");
		return new ConcreteProductA();
	}
}
