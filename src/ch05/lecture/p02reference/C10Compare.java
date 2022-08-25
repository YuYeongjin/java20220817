package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a==b);  // true
	
		int[] c = new int[] {3,4,5};
		int[] d = new int[] {3,4,5};
		
		System.out.println(c==d); // false
		
		// content을 비교해서 > true
		System.out.println(Arrays.equals(c, d)); //true
		
		
		
		int[] e = c;
		e[0] = 33;
		System.out.println(c[0]);
		System.out.println(e==c);
	}
}
