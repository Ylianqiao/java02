package com.java.inheritance;

public class Homework1 {
	public static void main(String[] args) {
		CarHonda car=new CarHonda();
		System.out.println("第一辆车的详细信息如下:");
		car.showProduce();
		car.showColor();
		car.showModel();
		
		CarHonda car2=new CarHonda("银白色");
		System.out.println("第二辆车的详细信息如下:");
		car2.showProduce();
		car2.showColor();
		car2.showModel();
		
		CarHonda car3=new CarHonda("蓝色","卡车","天津一汽");
		System.out.println("第三辆车的详细信息如下:");
		car3.showProduce();
		car3.showColor();
		car3.showModel();
	}

}
