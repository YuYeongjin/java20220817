package p99Study.academy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class academy092003 {
	public static void main(String[] args) {
		String numbers="107";
		
		System.out.println(findNum(numbers));
	}
	
	public static int findNum(String numbers) {
		int answer = 0;
		List<String> word = new ArrayList<>();
		for(int i = 0 ; i <numbers.length() ; i++ ) {
			word.add(numbers.substring(i, i+1));
		}
		System.out.println(word);
		Set<Integer> num = new HashSet<>();
		
		int count = 1;
		while(count != word.size()) {
//			if(word.)
				
			
			count++;
		}
		
		return answer;
	}
}
