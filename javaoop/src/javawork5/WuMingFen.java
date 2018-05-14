package javawork5;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	
	public WuMingFen(String t,int q,boolean l) {
		theMa=t;
		quantity=q;
		likeSoup=l;
	}
	public WuMingFen(String t,int q) {
		theMa=t;
		quantity=q;
	}
	public WuMingFen() {
		theMa="酸辣面";
		quantity=2;
		likeSoup=true;
	}
	
	public void check() {
		System.out.println(theMa+quantity+likeSoup);
	}

}
