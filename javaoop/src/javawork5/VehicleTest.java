package javawork5;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle car=new Vehicle();
		car.setSpeed(50);
		car.setSize(3200);
		System.out.println("汽车的速度为:"+car.getSpeed()+"km/h"+"\n"+"汽车的体积为："+
		car.getSize()+"L");
		
		car.move();
		car.speedUp(10);
		car.speedDown(5);
	}

}
