package javawork5;

public class MyTimeTest {
	public static void main(String[] args) {
		MyTime myt=new MyTime(0,30,30);
		myt.disPlay();
		
		myt.addSecond(20);
		myt.disPlay();
		myt.addMinute(300);
		myt.disPlay();
		myt.addhour(2);
		myt.disPlay();
		myt.subSecond(13);
		myt.subMinute(15);
		myt.subhour(4);
	}

}
