package javawork3;

import java.util.Scanner;

import javax.xml.stream.events.EntityDeclaration;

public class javaWork3_2 {
	public static void main(String[] args) {
		//青蛙爬井问题
		/*
		int day=0;
		for(int a=0;(a=a+3)<=7;a=a-2) {
			day++;
		}
	    System.out.print(day);
	    */
		/*
		int day=1;
	    int h=0;
	    while(true) {
	    	h=h+3;
	    	if(h>=7) {
	    		break;
	    	}
	    	h=h-2;
	    	day++;
	    }
	    System.out.print(day);
	    */
		
		//10000本金利滚利问题
		/*
		double money=10000;
		for(int year=1;year<=5;year++) {
			money=money*(1+0.003);
		}
		System.out.print(money);
		*/
		
		//数的左右翻转输出
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		String num= scanner.nextLine();
		String[] array=num.split("");
		int i;
		String[] array2=new String[array.length];
		for(i=0;i<array.length;i++) {
			array2[i]=array[array.length-i-1];
			System.out.print(array2[i]);
		}
			
			
		
}
			}
		
	


