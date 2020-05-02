package singletonPattern;

public class IdentityCardNo {
	private String no;
	
	//某个类只能有一个实例
	private static IdentityCardNo instince = new IdentityCardNo();
	
	//必须自行创建这个实例
	private IdentityCardNo() {
		System.out.println("第一次办理身份证，分配新号码");
	}
	
	//必须自行向整个系统提供这个实例
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

// 懒汉式单例
public class IdentityCardNo {
	private String no;
	
	//某个类只能有一个实例
	private static IdentityCardNo instince = null;
	
	//必须自行创建这个实例
	private IdentityCardNo() {
		
	}
	
	//必须自行向整个系统提供这个实例
	public static IdentityCardNo getInstance() {
		if (instince == null) {
			System.out.println("第一次办理身份证，分配新号码");
			instince = new IdentityCardNo();
			instince.setIdentityCardNo("400000199710301111");
		} else {
			System.out.println("重复办理身份证，获取旧号码");
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