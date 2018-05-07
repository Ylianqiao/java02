package javawork1;

import java.util.Scanner;

public class javaWork1_1 {
	

	public static void main(String[] args) {
		/*
			System.out.print("请输入年份数：");
			Scanner scanner=new Scanner(System.in);
			int years=scanner.nextInt();
			if(years%400==0){
				System.out.println(years+"是闰年");
			}else if(years%4==0&&years%100!=0){
				System.out.println(years+"是闰年");
			}else{
				System.out.println(years+"不是闰年");
			}
			*/
			System.out.print("请输入分数：");
			Scanner scanner=new Scanner(System.in);
			double s=scanner.nextDouble();
			if(90<=s&&s<=100){
				System.out.println("一个优秀的分数，你好棒啊");
			}
			else if(80<=s&&s<90){
				System.out.println("一个评为良好的分数，加油啊");
			}
			else if(70<=s&&s<80){
				System.out.println("一个评为良的分数，再加把劲");
		    }
			else if(60<=s&&s<70){
			System.out.println("一个刚刚及格的分数，还需努力");
			}
			else if(0<=s&&s<60){
				System.out.println("这真是一个杯具啊");
			}else{
				System.out.println("乱输入我打你屁屁哦");
			}
		}
	}