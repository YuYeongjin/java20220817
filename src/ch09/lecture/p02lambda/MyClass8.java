package ch09.lecture.p02lambda;

import java.util.Arrays;

public class MyClass8 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		
		System.out.println(Arrays.toString(a1));
		
		Arrays.setAll(a1, i -> i);
		System.out.println(Arrays.toString(a1));
		
		Arrays.setAll(a1, i -> i+1);
		System.out.println(Arrays.toString(a1));
		
		
		int[] b = {8,2,7,6,8,25,7,3,5,9,6,23,4,34,412};
		Arrays.setAll(a1, i -> b[i]);
		System.out.println(Arrays.toString(a1));

		
	}
}
