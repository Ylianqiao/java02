package com.java.coustomer;

public class Coustomer {
	private String name;
	private String gender;
	
	public Coustomer(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void service() {
		System.out.println("服务信息:"+"\n"+name+gender+"正在服务中...");
	}

}
class VIPCoustomer extends Coustomer{
	
	private String level;
	
	public VIPCoustomer(String name,String gender,String level) {
		super(name,gender);
		this.level=level;
		
	}

	public void touSu() {
		System.out.println("投诉信息:"+"\n"+level+getName()+getGender()+"正在投诉中...");
	}
}
