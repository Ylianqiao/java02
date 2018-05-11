package javawork5;

public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour,int minute,int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public MyTime(int hour,int minute) {
		this.hour=hour;
		this.minute=minute;
	}
	public MyTime(int hour) {
		this.hour=hour;
	}
	public MyTime() {
	
	}
	
	public void disPlay() {
		System.out.println("时间是:"+hour+":"+minute+":"+second);
	}
	
	public void addSecond(int sec) {
		second=second+sec;
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	public void addMinute(int min) {
		minute=minute+min;
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	public void addhour(int hou) {
		hour=hour+hou;
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	public void subSecond(int sec) {
		second=second-sec;
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	public void subMinute(int min) {
		minute=minute-min;
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	public void subhour(int hou) {
		hour=hour-hou;
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
}
