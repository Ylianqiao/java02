package com.java.quiz;

import java.util.Scanner;

public class JudgementDaysTest {
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		Scanner sca=new Scanner(System.in);
		while(true) {
		System.out.print("请输入日期:");
		int a[]=new int[3];
		for(int i=0;i<a.length;i++) {
	        a[i]=sca.nextInt();
		}
		year=a[0];
		month=a[1];
		day=a[2];
		
		JudgementDays s=new JudgementDays();
		s.setYear(year);
		s.setMonth(month);
		s.setDay(day);
		if(s.panDuan()) {
			s.num();
		}else {
			s.cuoWu();
		}
		

		
      }
   }
}