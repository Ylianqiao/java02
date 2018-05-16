package com.java.coustomer;

public class Coustomer {
	private String name;
	private String gender;
	
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
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void touSu(String name,String gender) {
		System.out.println("投诉信息:"+"\n"+level+name+gender+"正在投诉中...");
	}
}
