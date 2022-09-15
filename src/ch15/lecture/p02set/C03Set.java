package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		// Set 만들기
		Set<String> set1 = new HashSet<>(); //수정가능한 set
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		set1.remove("goose");
		System.out.println(set1);
		
		// 수정 불가능한 Set  // 처음에 중복된 값을 만들 수도 없음
		Set<String> set2 = Set.of("thor","hulk","batman" /*,"thor"*/);
		
//		set2.add("super"); //XX
//		set2.remove("hulk")//XX
		
		System.out.println(set2.contains("hulk"));
		System.out.println(set2.size());
		
	}
}
