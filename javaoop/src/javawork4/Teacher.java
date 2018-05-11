package javawork4;

public class Teacher {
	private String name;
	private String professional;//授课
	private String course;//课程
	private int teachAge;//教龄
	
	public Teacher(String a,String b,String c,int d) {
		name=a;
		professional=b;
		course=c;
		teachAge=d;
	}
	
	public void show() {
		System.out.println(name+"的信息："+"\n"+"姓名:"+name+"\n"+"方向:"+professional
				+"\n"+"授课课程:"+course+"\n"+"教龄:"+teachAge+"\n");
	}
}
