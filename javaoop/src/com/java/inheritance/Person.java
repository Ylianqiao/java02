package com.java.inheritance;

public class Person {
	private String name;
	private String sex;
	private int age;
	
	public Person() {
		name="习大大";
		sex="男";
		age=60;
	}

	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	
	
	public void showMessage() {
		System.out.println("姓名："+name+"\n"+"性别："+sex+"\n"+"年龄："+age);
	
	}
	
	
	

}
