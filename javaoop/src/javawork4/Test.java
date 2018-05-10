package javawork4;

public class Test {

	public static void main(String[] args) {
		Student student=new Student("张三",21,"计算机科学与技术","玩游戏");
		student.show();
		
		Teacher teach=new Teacher("李四","信息工程","计算机科学与技术",15);
		teach.show();

	}

}
