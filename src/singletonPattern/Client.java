package singletonPattern;

public class Client {

	public static void main(String[] args) {
		IdentityCardNo no1, no2;
		no1 = IdentityCardNo.getInstance();
		no2 = IdentityCardNo.getInstance();
		System.out.println("身份证号码是否一致：" + (no1 == no2));
		
		String str1, str2;
		str1 = no1.getIdentityCardNo();
		str2 = no1.getIdentityCardNo();
		System.out.println("内容是否相等：" + str1.equals(str2));
		System.out.println("是否是相同对象："+ (str1 == str2));
	}

}
