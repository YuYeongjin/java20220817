package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C02Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		//뭐든지 올 수 있는 <?> 에서 add는 어떠한 것도 안됌
		//하지만 꺼내서 object로 받을 순 있음
		ArrayList<?> list2 = list1; //ok
//		list2.add(""); //x
		Object a = list2.get(0);
		System.out.println(a);
		
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		
		ArrayList<?> list4 = list3;
//		list4.add(300) //x
	}
}
