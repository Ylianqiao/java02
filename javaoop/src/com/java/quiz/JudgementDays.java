package com.java.quiz;

import java.util.Scanner;

public class JudgementDays {
	
	private int year;
	private int month;
	private int day;
	private int b[]=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void num() {
	int days=0;
	if(year%400==0||(year%4==0&&year%100!=0)){
		for(int j=1;j<month;j++) {
			days=b[j-1]+days;
		}
		System.out.println(month+"月"+day+"日是这一年的第"+(days+day+1)+"天");
	}else {
		for(int j=1;j<month;j++) {
			days=b[j-1]+days;
	}
		System.out.println(month+"月"+day+"日是这一年的第"+(days+day)+"天");
	}
	}

	
	public boolean panDuan() {
		if(year>0) {
			if(month>0&&month<=12) {
		switch(month) {
		case 1:
		    if(day<=31&&day>1) {
			 
		     return true;
		}break;
		case 2:
		    if(year%400==0||(year%4==0&&year%100!=0)) {
		    	if(day<=29&&day>1) {
		    		return true;
		    	}
		    }else {
		    	if(day<=28&&day>1) {
		    		return true;
		    	}
		    }	
	    break;
		case 3:
			if(day<=31&&day>1) {
				 
			     return true;
			}break;
		case 4:
			if(day<=30&&day>1) {
				 
			     return true;
			}break;
		case 5:
			if(day<=31&&day>1) {
				
			     return true;
			}break;
		case 6:
			if(day<=30&&day>1) {
				 
			     return true;
			}break;
		case 7:
			if(day<=31&&day>1) {
				 
			     return true;
			}break;
		case 8:
			if(day<=31&&day>1) {
				 
			     return true;
			}break;
		case 9:
			if(day<=30&&day>1) {
				 
			     return true;
			}break;
		case 10:
			if(day<=31&&day>1) {
				 
			     return true;
			}break;
		case 11:
			if(day<=30&&day>1) {
				 
			     return true;
			}break;
		case 12:
			if(day<=31&&day>1) {
				 
			     return true;
			}break;
		}
	}
}
		return false;
}
	public void cuoWu() {
		if(year>0) {
			if(month>0&&month<=12) {
		switch(month) {
		case 1:
		    if(day>31) {
			 System.out.println(month+"月份不能大于31。");
		     
		}break;
		case 2:
			if(year%400==0||(year%4==0&&year%100!=0)) {
		    	if(day>29) {
		    		System.out.println("闰年2月份不能大于29。");
		}
			}else {
				if(day>28) {
					System.out.println("平年2月份不能大于28。");
				}
			}break;
		case 3:
			if(day>31) {
				 
				System.out.println(month+"月份不能大于31。");
			}break;
		case 4:
			if(day>30) {
				 
				System.out.println(month+"月份不能大于30。");
			}break;
		case 5:
			if(day>31) {
				
				System.out.println(month+"月份不能大于31。");
			}break;
		case 6:
			if(day>30) {
				 
				System.out.println(month+"月份不能大于30。");
			}break;
		case 7:
			if(day>31) {
				 
				System.out.println(month+"月份不能大于31。");
			}break;
		case 8:
			if(day>31) {
				 
				System.out.println(month+"月份不能大于31。");
			}break;
		case 9:
			if(day>30) {
				 
				System.out.println(month+"月份不能大于30。");
			}break;
		case 10:
			if(day>31) {
				 
				System.out.println(month+"月份不能大于31。");
			}break;
		case 11:
			if(day>30) {
				 
				System.out.println(month+"月份不能大于30。");
			}break;
		case 12:
			if(day>31) {
				 
				System.out.println(month+"月份不能大于31。");
			}break;
		
		}
		
	}else{System.out.println("月份不能为负数或大于12。");}
}else {System.out.println("年份不能为负数。");}
}
}
