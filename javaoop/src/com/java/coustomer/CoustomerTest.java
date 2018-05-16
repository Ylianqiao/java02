package com.java.coustomer;

public class CoustomerTest {
	public static void main(String[] args) {
		Coustomer user=new Coustomer();
		user.setName("张三");
		user.setGender("女士");
		user.service();
		
		VIPCoustomer user1=new VIPCoustomer();
		 user1.setLevel("vip3级别");
		 user1.touSu(user.getName(),user.getGender());
	}

}
