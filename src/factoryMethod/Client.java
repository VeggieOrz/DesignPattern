package factoryMethod;

import factoryMethod.factory.Factory;
import factoryMethod.product.Product;
// 用于测试的客户端
public class Client {

	public static void main(String[] args) {
		try {
			Factory factory;
			Product product;
			// 先通过读取配置文件和Java反射机制创建工厂
			factory = (Factory)XMLUtil.getBean();
			// 工厂负责创建相应的产品
			product = factory.createProduct();
			product.use();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}