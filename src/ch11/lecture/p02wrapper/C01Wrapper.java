package ch11.lecture.p02wrapper;

import java.util.Arrays;

public class C01Wrapper {
	public static void main(String[] args) {
		// data type : primitive type(2장), reference type(5장)
		
		// 기본타입을 참조타입처럼 쓰고 싶을 경우
		
		// 기본 타입 8개에 매칭되는 참조타입
	
		// int,byte,short,long,char,long,float,double,boolean
		// Integer,Byte,Short,Long,Character,Long,Float,Double,Boolean
		
		String[] arr1= new String[3];
		
		arr1[0]= "coyote";
		arr1[1]= "robster";
		arr1[2]= "iceman";
		
		int[] arr2 = new int[3];
		arr2[0]=99;
		arr2[1]=100;
		arr2[2]=300;
		
		Integer b = Integer.valueOf(3);
		
		// String과 int를 섞어넣고싶을때
		
		Object[] arr3 = new Object[3];
		arr3[0]="phoenix";
		arr3[1]=Integer.valueOf(99);
		arr3[2]=Integer.valueOf(100);
		
		System.out.println(Arrays.toString(arr3));
		
	}
}
