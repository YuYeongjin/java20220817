package ch15.book.exercise.e09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore=0;		
		
		Set<String> items = map.keySet();
		for(String item : items) {
			int score = map.get(item);
			totalScore +=score;
			if(maxScore<score) {
				maxScore = score;
				name = item;
			}
		}
		System.out.println(" 평균 점수 : " + (totalScore/map.size()));
		System.out.println(" 최고 점수 : " + maxScore);
		System.out.println(" 최고 점수를 받은 아이디 : " + name);
		
		
	}
}
