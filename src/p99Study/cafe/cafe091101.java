package p99Study.cafe;

import java.util.*;

public class cafe091101 {
	public static void main(String[] args) {
//		String[] strings = {"sun", "bed", "car"};
//		String[] strings = {"abce", "abcd", "cdx","aac", "aaa","aab","abba","acc","aaaaaaa","aaaaaac","aaaac","aaac"};
		String[] strings = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		
		int n = 2;
		String[] answer = {};
		String word = "";

		Arrays.parallelSort(strings, (a,b)-> a.charAt(n)-b.charAt(n));
		System.out.println("초기 상태 : "+Arrays.toString(strings));

		int count = 0;
		word = strings[0].substring(n, n+1);
		for(int i =1; i<strings.length;i++) {
			System.out.println(strings[i-1].compareTo(strings[i]));
			if(!word.equals(strings[i].substring(n, n+1))) {	
				Arrays.parallelSort(strings, i-count, i);
				
				System.out.println(i-count+"부터"+(i-1)+"번째");
				System.out.println(strings[i-count]+"부터"+strings[i-1]+"까지");
				count=1;
			} else {
				count++;
			}
		
			word = strings[i].substring(n, n+1);
			if(count ==strings.length-1) {
				Arrays.parallelSort(strings);
			}
		}
		System.out.println(Arrays.toString(strings));
		
	}
}
