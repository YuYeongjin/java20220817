package p99Codingbat;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class home091301 {
	public static void main(String[] args) {
		String[] strings = {"bcxab","abxcd","abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa","bazab"};
		int n =2;
		int iVal = 0;		

        String word = "";
        Arrays.parallelSort(strings,(a,b)->a.charAt(n)-b.charAt(n));
        int count = 0;
		for(int i =0; i<strings.length;i++) {
			if(!word.equals(strings[i].substring(n, n+1))) {	
				Arrays.parallelSort(strings, i-count, i);
				System.out.println((i-count)+"랑 "+i+"번째 정렬중");
				count=0;
				iVal = i;
            }
			count++;
			word = strings[i].substring(n, n+1);
			if(count ==strings.length) {
				Arrays.sort(strings);
				break;
			}
		}				
		if(count!=strings.length&&count>1) {
			Arrays.parallelSort(strings, iVal, strings.length);
		}
		System.out.println(Arrays.toString(strings));
		
	}
}
