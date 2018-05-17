package com.java.inheritance;

public class Car {
	private String color;
	private String model;
	
	
	public Car(String color, String model) {
		this.color = color;
		this.model = model;
	}
	
	public Car() {
		color="红色";
		model="轿车";
	}
	public void showColor() {
		System.out.println("车的颜色："+color);
	}
	public void showModel() {
		System.out.println("车的型号："+model);
	}
	

}
