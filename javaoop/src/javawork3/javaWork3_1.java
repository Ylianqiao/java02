/**
 * 冒泡排序
 */
package javawork3;

import java.util.Scanner;

public class javaWork3_1 {

	public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);
	     System.out.print("请输入七个整数:");
	     int[] array=new int[7];
	     for(int i=0;i<array.length;i++) {
	    	 array[i]=scanner.nextInt();
	     }
	     for(int k=1;k<array.length;k++) {     //把每个数排列一遍
	     for(int j=1;j<array.length;j++) {     //把大数往后排列好
	    	 int a;
	    	 if(array[j]<array[j-1]) {
	    		 a=array[j];
	    		 array[j]=array[j-1];
	    		 array[j-1]=a;
	    	 }
	     
	}
	     
	     for(int a=0;a<array.length;a++) { 
		System.out.print(array[a]+" ");
	     }
	     System.out.println("");
	   
	     }
	}
}
