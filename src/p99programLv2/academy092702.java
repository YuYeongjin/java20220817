package p99programLv2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class academy092702 {
	TreeSet<String> set = new TreeSet<>();
	public static void main(String[] args) {
		String word = "EIO";
		String text="AEIOU";
		
		int answer = 0;
		
		academy092702 z = new academy092702();
		z.check("", text);
		System.out.println(z.set);
		for(String item : z.set) {
			answer++;
			if(word.equals(item)) {
				System.out.println(answer);
			}
		}
	}
	void check(String a, String b) {
		if(!a.equals(""))
		set.add(a);
		
		if(a.length()==5) {
			return;
		}
		for(int i = 0 ; i < b.length();i++) {
			check(a+b.charAt(i),b);
		}
				
	}
	
}
