package singletonPattern;

public class Client {

	public static void main(String[] args) {
		IdentityCardNo no1, no2;
		no1 = IdentityCardNo.getInstance();
		no2 = IdentityCardNo.getInstance();
		System.out.println("���֤�����Ƿ�һ�£�" + (no1 == no2));
		
		String str1, str2;
		str1 = no1.getIdentityCardNo();
		str2 = no1.getIdentityCardNo();
		System.out.println("�����Ƿ���ȣ�" + str1.equals(str2));
		System.out.println("�Ƿ�����ͬ����"+ (str1 == str2));
	}

}
