package javawork2;

import java.util.Arrays;
import java.util.Scanner;

public class javaWork2_1 {
	public static void main(String[] args) {
		//String str="ͳ��һ���ַ����ַ����е�����λ��";
		Scanner sca=new Scanner(System.in);
		System.out.print("请输入你想查找的字符串:");
		String str=sca.nextLine();
		System.out.print("请输入你想匹配的字符:");
		String str1=sca.nextLine();
		char str2=str1.charAt(0);  //charAt()获取指定位置的字符内容；
		int array[]=new int[0];
		for(int i=0;i<str.length();i++) {  //遍历输入的字符串内容
			char mychar=str.charAt(i);
			if(str2==mychar) {
				 array=Arrays.copyOf(array, array.length+1);
			     array[array.length-1]=i;
			     System.out.println("这个字符所在的位置有："+i);
			}			
	}
		//for(i=0;i<array.length;i++) {
			//System.out.println(array[i]);
		//}
  }
}
