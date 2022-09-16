package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		// Map 만들기
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("korea", "seoul");
		map1.put("japan", "tokyo");
		map1.put("us", "new york");
		map1.put("uk", "london");
		System.out.println(map1);
		
		// of 메소드 사용 수정 불가능함
		Map<String, String> map2 = Map.of("seoul","korea","busan","korea","osaka","japan", "newyork","us");
		System.out.println(map2);
		
//		map2.put("london", "uk"); // xx
//		map2.put("busan", "china"); // xx
//		map2.remove("osaka"); //xx
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey("seoul"));		
	}
}
