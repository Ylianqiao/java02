package com.java.inheritance;

public class Homework3 {
	public static void main(String[] args) {
		StudentAchievement student=new StudentAchievement(80.5,78.5,88.0,90.0);
		student.setRemark("该生在校表现积极，能够认真对待老师分配的任务，积极配合老师的工作，但是该生的基本知识不牢固，希望家长能多注意一下补习基本知识。");
		student.print();
	}

}
