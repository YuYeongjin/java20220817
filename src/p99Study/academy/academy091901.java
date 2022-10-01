package p99Study.academy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class academy091901 {
	public static void main(String[] args) {
		int[] scoville = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1};
		int K = 10000;
		int answer= 0;		
		
		List<Integer> hot = Arrays.stream(scoville).boxed().collect(Collectors.toList());
		
		PriorityQueue<Integer> what = new PriorityQueue<>();
		for(int i = 0 ; i < scoville.length;i++) {
			what.add(scoville[i]);
		}
		System.out.println(what);
		while(what.size()!=1) {			
			int one = 0;
			int two = 0;
			if(what.poll()<K) {
				one = what.poll();
				two= what.poll();
				what.add(one+two*2);
				answer++;
			} else {
				break;
			}
		}
		if(what.poll()<K) {
			answer = -1;
		}
		System.out.println(what);
		/*
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
		*/
		System.out.println(answer);
	}
}