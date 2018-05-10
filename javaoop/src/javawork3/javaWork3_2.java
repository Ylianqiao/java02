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
		int day=0;
	    int h=0;
	    while(true) {
	        day++;
	    	h=h+3;
	    	if(h>=7) {
	    		break;
	    	}
	    	h=h-2;
	    	
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
	    /*
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		String num= scanner.nextLine();
		String[] array=num.split("");     //将字符串num分解成字符存入数组；
		String[] array2=new String[array.length];   //建立一个长度跟array数组长度相同的数组；
		int i=0;
		while (i<array.length) {
			array2[i]=array[array.length-i-1];   //调换顺序
			i++;
		}*/
		
		
		
		Scanner scanner=new Scanner(System.in) ;
		System.out.print("输入一个正整数:");	
		int num=scanner.nextInt();
		
	int s=0;
	while(num>0) {
		s=s*10+num%10;
		num/=10;
	}
	System.out.print(s);
	
	}
	
}
		