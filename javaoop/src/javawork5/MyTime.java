package javawork5;

public class MyTime {
	private static final String Date = null;
	private int hour;
	private int minute;
	private int second;
	private int mintue;

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
		addMinute(second/60);
		second=second%60;
	}
	public void addMinute(int min) {
		minute=minute+min;
		addhour(minute/60);
		minute=minute%60;
	}
	public void addhour(int hou) {
		hour=hour+hou;
		if(hour>=24) {
			hour-=24;
			System.out.println("第二天了");
		}
		
	}
	public void subSecond(int sec) {
		second=second-sec;
		if(second<0) {
			second=60+second;
			minute-=1;
			if(minute<0) {
				minute=60+minute;
				hour-=1;
				if(hour<0) {
					hour=24+hour;
					System.out.println("前一天了");
				}
			}
		}
		
	}
	public void subMinute(int min) {
		minute=minute-min;
		if(minute<0) {
			minute=60+minute;
			hour-=1;
			if(hour<0) {
				hour=24+hour;
				System.out.println("前一天了");
			}
		}
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	public void subhour(int hou) {
		this.hour=hour-hou;
		if(hour<0) {
			hour=24+hour;
			System.out.println("前一天了");
		}
		System.out.println("现在时间是:"+hour+":"+minute+":"+second);
	}
	
}
