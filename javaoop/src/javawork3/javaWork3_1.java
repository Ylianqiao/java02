/**
 * 冒泡排序
 */
package javawork3;

import java.util.Scanner;

public class javaWork3_1 {

	public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);
	     System.out.print("请输入7个整数:");
	     int[] array=new int[7];
	     for(int i=0;i<array.length;i++) {
	    	 array[i]=scanner.nextInt();       //把输入的数字分别存入数组
	     }
	     for(int k=1;k<array.length;k++) {     //把每个数比较一遍
	     for(int j=1;j<=array.length-k;j++) {     //把大数往后排列好
	    	 int a;
	    	 if(array[j]<array[j-1]) {
	    		 a=array[j];
	    		 array[j]=array[j-1];
	    		 array[j-1]=a;
	    	 }  
	}
} 
	     //array=bubbleSort(array);
	     for(int a=0;a<array.length;a++) { 
		System.out.print(array[a]+" ");
	     }
	     System.out.println("");
	   
	}

	/*private static int[] bubbleSort(int[] array) {
		for(int x=0;x<array.length-1;x++) {
			for(int y=0;y<array.length-x-1;y++) {
				if(array[y]>array[y+1]) {
					int temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
			}
		}
		return array;
	}*/
}
