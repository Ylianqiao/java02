package com.java.inheritance;

public class CarHonda extends Car {
	private String produce;

	public CarHonda() {
		this("黑色");
	}
	
	public CarHonda(String color) {
		super(color,"轿车");
		produce="广州本田";
	}
	public CarHonda(String color, String model, String produce) {
		super(color, model);
		this.produce = produce;
	}
	
	public void showProduce() {
		System.out.println("生产厂家："+produce);
	}
	

}
