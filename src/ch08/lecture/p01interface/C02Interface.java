package ch08.lecture.p01interface;

import java.io.Serializable;

public class C02Interface {
	public static void main(String[] args) {
		String s1 = "maverick";
		
		Object o1 = s1;
		Serializable o2 = s1;
		CharSequence o3 = s1;
		Comparable<String> o4 = s1;
	
		System.out.println(s1 instanceof Object);
		System.out.println(s1 instanceof Serializable);
		System.out.println(s1 instanceof CharSequence);
		System.out.println(s1 instanceof Comparable<?>);
		
		System.out.println(o1 instanceof Object);
		System.out.println(o1 instanceof Serializable);
		System.out.println(o1 instanceof CharSequence);
		System.out.println(o1 instanceof Comparable<?>);
		
		System.out.println(o2 instanceof Object);
		System.out.println(o2 instanceof Serializable);
		System.out.println(o2 instanceof CharSequence);
		System.out.println(o2 instanceof Comparable<?>);
		
		
		
	
	}
}
