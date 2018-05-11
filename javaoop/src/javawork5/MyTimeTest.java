package javawork5;

public class MyTimeTest {
	public static void main(String[] args) {
		MyTime myt=new MyTime(14,30,26);
		myt.disPlay();
		
		myt.addSecond(30);
		myt.addMinute(20);
		myt.addhour(2);
		myt.subSecond(13);
		myt.subMinute(15);
		myt.subhour(4);
	}

}
