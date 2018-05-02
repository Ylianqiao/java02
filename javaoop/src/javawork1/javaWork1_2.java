package javawork1;

import java.util.Scanner;

public class javaWork1_2 {
	public static void main(String[] arge) {
		// 九九乘法表
		/*
		  for(int i=1;i<10;i++){ 
		  System.out.println(" "); 
		  for(int j=1;j<=i;j++){
		  System.out.print(i+"x"+j+"="+i*j); 
		  System.out.print("   "); } 
		  } 
		  */ 
		  
		 

// 靠右三角形打印
/*
		System.out.print("请输入三角形行数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
*/

//等腰三角形打印
/*
		System.out.print("请输入三角形行数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > 0; j--) {
				if (j <= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
*/	


// 数的阶乘算法
/*
  System.out.print("请输入一个数：");
  Scanner scanner=new Scanner(System.in); 
  int s=scanner.nextInt(); 
  int b=1;
  for(int a=2;a<=s;a++){ 
      b=b*a; 
  }
  System.out.print("该数的阶乘为："+b); 
*/
		
//数的N次方
		/*
		System.out.print("请输入底数：");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
	    System.out.print("请输入幂数:");
	    int num2=scanner.nextInt();
		int a=num1;
		for(int num3=num2;num3>1;num3--) {
			num1=num1*a;
		}
		System.out.print(a+"的"+num2+"次方为："+num1);
		*/
  
		
		//存钱买玩具
		/*
		double a=2.5;
		int day1=0;
		double money = 0;
		while(c<100) {
			money=money+a;
			day1++;
			if(day1%5==0) {
				System.out.print("今天拿出了6元，");
				money=money-6;
			}System.out.println("第"+day1+"天存下"+money+"元");
		}System.out.println("需要经过"+day1+"天才能存上一百元。");	
		*/
		
		//求一百以内的所有偶数
		int num=1;
		while(num<=100){
			if(num%2==0) {
				System.out.print(num+"  ");
			}
			if(num%10==0) {
				System.out.println("");
			}
			num++;
		}
	}
}
