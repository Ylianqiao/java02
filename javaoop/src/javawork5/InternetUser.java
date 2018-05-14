package javawork5;

public class InternetUser {
	private String user;
	private String password;
	private String emailaddress;

	public InternetUser(String u,String p) {
		user=u;
		password=p;
	}
	public InternetUser(String u,String p,String e) {
		user=u;
		password=p;
		emailaddress=e;
	}
	public void show() {
		System.out.println("用户名："+user+"密码："+password+"邮箱地址："+emailaddress);
	
	}
}

