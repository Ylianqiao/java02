package javawork1;

import java.util.Scanner;

public class javaWork1_2 {
	public static void main(String[] arge) {
		// �žų˷���
		/*
		  for(int i=1;i<10;i++){ 
		  System.out.println(" "); 
		  for(int j=1;j<=i;j++){
		  System.out.print(i+"x"+j+"="+i*j); 
		  System.out.print("   "); } 
		  } 
		  */ 
		  
		 

// ���������δ�ӡ
/*
		System.out.print("������������������");
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

//���������δ�ӡ
/*
		System.out.print("������������������");
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


// ���Ľ׳��㷨
/*
  System.out.print("������һ������");
  Scanner scanner=new Scanner(System.in); 
  int s=scanner.nextInt(); 
  int b=1;
  for(int a=2;a<=s;a++){ 
      b=b*a; 
  }
  System.out.print("�����Ľ׳�Ϊ��"+b); 
*/
		
//����N�η�
		/*
		System.out.print("�����������");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
	    System.out.print("����������:");
	    int num2=scanner.nextInt();
		int a=num1;
		for(int num3=num2;num3>1;num3--) {
			num1=num1*a;
		}
		System.out.print(a+"��"+num2+"�η�Ϊ��"+num1);
		*/
  
		
		//��Ǯ�����
		/*
		double a=2.5;
		int day1=0;
		double money = 0;
		while(c<100) {
			money=money+a;
			day1++;
			if(day1%5==0) {
				System.out.print("�����ó���6Ԫ��");
				money=money-6;
			}System.out.println("��"+day1+"�����"+money+"Ԫ");
		}System.out.println("��Ҫ����"+day1+"����ܴ���һ��Ԫ��");	
		*/
		
		//��һ�����ڵ�����ż��
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
