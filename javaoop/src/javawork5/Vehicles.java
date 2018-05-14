package javawork5;

public class Vehicles {
	protected String brand;
	protected String color;
	
	public Vehicles() {
		 brand="bmw";
		 color="yellow";
	}
	
	public void run() {
		System.out.println("我已经开动了。");
	}
	
	public void showInfo() {
		System.out.println(brand+color);
	}

}
class Car extends Vehicles{
	private int seats;
	
	public void showCar() {
		System.out.print(brand+color+seats);
	}
	public Car() {
		seats=4;
		
		
	}
}
class Truck extends Vehicles{
	private float  load;
	
	public void showTruck() {
		System.out.println(brand+color+load);
	}
	public Truck() {
		load=5;
	}
}
