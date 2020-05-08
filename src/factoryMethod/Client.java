package factoryMethod;

import factoryMethod.factory.Factory;
import factoryMethod.product.Product;
// ���ڲ��ԵĿͻ���
public class Client {

	public static void main(String[] args) {
		try {
			Factory factory;
			Product product;
			// ��ͨ����ȡ�����ļ���Java������ƴ�������
			factory = (Factory)XMLUtil.getBean();
			// �������𴴽���Ӧ�Ĳ�Ʒ
			product = factory.createProduct();
			product.use();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}