package ch15.book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		list1.forEach((t)->System.out.println(t));
		
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(Integer value : list2) {
			System.out.println(value);
		}
		
		
	}
}
