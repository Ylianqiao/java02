package javawork1;

import java.util.Scanner;

public class javaWork1_1 {
	

	public static void main(String[] args) {
		
			System.out.print("�������������");
			Scanner scanner=new Scanner(System.in);
			int years=scanner.nextInt();
			if(years%400==0){
				System.out.println(years+"�������ꡣ");
			}else if(years%4==0&&years%100!=0){
				System.out.println(years+"�������ꡣ");
			}else{
				System.out.println(years+"�겻�����ꡣ");
			}
			/*
			System.out.print("������ɼ���");
			Scanner scanner=new Scanner(System.in);
			double s=scanner.nextDouble();
			if(90<=s&&s<=100){
				System.out.println("һ������ķ�������ð�Ŷ");
			}
			else if(80<=s&&s<90){
				System.out.println("һ�����õķ��������Ͱ�");
			}
			else if(70<=s&&s<80){
				System.out.println("һ�����ķ������ټӰѾ�");
		    }
			else if(60<=s&&s<70){
			System.out.println("һ���ոռ���ķ���������Ŭ��");
			}
			else if(0<=s&&s<60){
				System.out.println("������һ�����߰�");
			}else{
				System.out.println("�������Ҵ���ƨƨŶ");
			}*/
		}
	}