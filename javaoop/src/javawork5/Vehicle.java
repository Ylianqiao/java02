package javawork5;

	public class Vehicle{
		private double speed;
		private double size;
		
		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getSize() {
			return size;
		}

		public void setSize(double size) {
			this.size = size;
		}

		public void move() {
			System.out.println("汽车发动了。");
		}
		
		public void speedUp(int speed1) {
			speed=speed+speed1;
			System.out.println("汽车加速了"+speed1+"，此时速度为："+speed+"km/h");
		}
		public void speedDown(int speed2) {
			speed=speed-speed2;
			System.out.println("汽车减速了"+speed2+"，此时速度为："+speed+"km/h");
		}
	}


