package simpleFactory;

public class Client {

	public static void main(String[] args) {
		try {
			Product product;
			String brandName = XMLUtilProduct.getBrandName();
			product = Factory.createProduct(brandName);
			product.use();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
