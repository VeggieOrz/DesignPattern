package singletonPattern;

public class IdentityCardNo {
	private String no;
	
	//ĳ����ֻ����һ��ʵ��
	private static IdentityCardNo instince = new IdentityCardNo();
	
	//�������д������ʵ��
	private IdentityCardNo() {
		System.out.println("��һ�ΰ������֤�������º���");
	}
	
	//��������������ϵͳ�ṩ���ʵ��
	public static IdentityCardNo getInstance() {
		instince.setIdentityCardNo("400000199710301111");
		return instince;
	}
	public String getIdentityCardNo() {
		return no;
	}

	public void setIdentityCardNo(String no) {
		this.no = no;
	}
}
/*

// ����ʽ����
public class IdentityCardNo {
	private String no;
	
	//ĳ����ֻ����һ��ʵ��
	private static IdentityCardNo instince = null;
	
	//�������д������ʵ��
	private IdentityCardNo() {
		
	}
	
	//��������������ϵͳ�ṩ���ʵ��
	public static IdentityCardNo getInstance() {
		if (instince == null) {
			System.out.println("��һ�ΰ������֤�������º���");
			instince = new IdentityCardNo();
			instince.setIdentityCardNo("400000199710301111");
		} else {
			System.out.println("�ظ��������֤����ȡ�ɺ���");
		}
		return instince;
	}
	public String getIdentityCardNo() {
		return no;
	}

	public void setIdentityCardNo(String no) {
		this.no = no;
	}
}
*/