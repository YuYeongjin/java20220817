package p99Study.cafe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class cafe091801 {
	public static void main(String[] args) {
		int[] scoville = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1};
		int K = 1000;
		int answer= 0;		
		
		List<Integer> hot = Arrays.stream(scoville).boxed().collect(Collectors.toList());
		
		System.out.println(hot);
		hot.sort((a,b)->a-b);
		if((hot.get(1)*Math.pow(2,hot.size()-1)<K)||hot.get(hot.size()-1)==0) {
			answer=-1;
		}
		while(hot.size()!=1) {			
			int one = 0;
			int two = 0;
			if(hot.get(0)<K) {
				one = hot.remove(hot.indexOf(Collections.min(hot)));
				two= hot.remove(hot.indexOf(Collections.min(hot)));
				hot.add(one+two*2);
				answer++;
			} else {
				break;
			}
		}
		if(hot.get(0)<K) {
			answer = -1;
		}
		System.out.println(hot);
		System.out.println(answer);
	}
}
