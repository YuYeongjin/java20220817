package p99Study.academy;

import java.util.*;

public class academy091507 {
	public static void main(String[] args) {
		String jewels="aA";
		String stones="aAAbbbb";
		int answer=0;
		List<String> st = new ArrayList<>();
		
		for(int i = 0; i<stones.length();i++) {
			st.add(stones.substring(i, i+1));
		}
		for(int i = 0; i<st.size();i++) {
			if(jewels.contains(st.get(i))) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
