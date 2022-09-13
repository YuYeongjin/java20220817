package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(300);
		
		ArrayList<? super Integer> list2 = list1;
		list2.add(500);
	}

}
