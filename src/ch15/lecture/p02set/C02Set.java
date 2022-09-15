package ch15.lecture.p02set;

import java.util.*;

public class C02Set {
	public static void main(String[] args) {
		// 전체 탐색 방법
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("jsp");
		set.add("css");
		set.add("html");
		set.add("java");
		
		// 순서가 보장되지 않음
		// 인덱스가 없어서 일반 for문 사용불가능
		System.out.println("향상된 for문");
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("Iterator 사용");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("forEach 메소드 사용");
		set.forEach((e)->System.out.println(e));
		
		
	}
}
