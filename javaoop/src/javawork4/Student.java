package javawork4;

public class Student {
	String name;
	int age;
	String course;//课程
	String interest;//兴趣
	
	public Student(String a,int b,String c,String d) {
		name=a;
	    age=b;
	    course=c;
	    interest=d;
	}
    public void show() {
    	System.out.println(name+"的信息："+"\n"+"姓名:"+name+"\n"+"年龄:"+age+"\n"+
    "选择的课程:"+course+"\n"+"兴趣:"+interest+"\n"+"\n");
    }
}
