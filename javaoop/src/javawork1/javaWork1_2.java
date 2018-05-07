package javawork1;

import java.util.Scanner;

public class javaWork1_2 {
	public static void main(String[] arge) {
		// 九九乘法表
		/*
		  int j;
		  int i;
		  for(i=1;i<10;i++){ 
		  for(j=1;j<=i;j++){
		  System.out.print(j+"x"+i+"="+i*j+"\t"); 
		  }
			  System.out.println("");
		   */
		/*
		int i=1;
		
		while(i<10) {
			int j=1;
			while(j<=i) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
			
		}
		*/
		  		 
		  
		/*for(int i=1;i<=4;i++){ 
			  System.out.println(""); 
			  for(int j=1;j<=i;j++){
			  System.out.print("*"); 
			  } */

// 靠右的直角三角形
/*
		System.out.print("请输入三角形的行数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >0; j--) {
				if (j <=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
*/

//等腰三角形

		System.out.print("请输入三角形的行数:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i=1 ; i <= num; i++) {
			for (int j = num; j > 0; j--) {
				if (j <=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				if (j <i) {
					System.out.print("*");
					}
			}
			System.out.println(" ");
		}
		
		



// 数的阶乘
/*
  System.out.print("这里是计算阶乘，请输入一个数：");
  Scanner scanner=new Scanner(System.in); 
  int s=scanner.nextInt(); 
  int b=2;
  for(int a=3;a<=s;a++){ 
      b=b*a; 
  }
  System.out.println("这个数的阶乘为："+b); 
  */
	
//阶乘递归计算(自己调用自己)
/*
  System.out.print("这里是计算阶乘，请输入一个数：");
  Scanner sca=new Scanner(System.in); 
  int s1=scanner.nextInt();
  System.out.println(fac(s1));
	}
	
	public static int fac(int s1) {
		if(s1==1) {
			return 1;
		}else {
			return s1*fac(s1-1);
		}
*/
		

		
//数的N次方
		/*
		System.out.print("请输入一个数：");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
	    System.out.print("请输入次方数:");
	    int num2=scanner.nextInt();
		int a=num1;
		for(int num3=num2;num3>1;num3--) {
			num1=num1*a;
		}
		System.out.print(a+"的"+num2+"次方为："+num1);
		*/
  
		
		//存钱问题
		/*
		double a=2.5;
		int day1=0;
		double money = 0;
		while(c<100) {
			money=money+a;
			day1++;
			if(day1%5==0) {
				System.out.print("今天取出了六块钱，");
				money=money-6;
			}System.out.println("第"+day1+"天存了"+money+"元");
		}System.out.println("需要"+day1+"天才能存上一百元。");	
		*/ 
		
		//打印偶数
		/*
		int num=0;
		int num1=0;
		while(num<=100){
			if(num%2==0){
				//System.out.print(num+"  ");
				num1=num1+num;
			}
			
			
			//if(num%10==0) {
			//	System.out.println("");
			//}
			num++;
		};*/
	}
	}

