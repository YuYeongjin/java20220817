package p99Study.cafe;

import java.util.Arrays;

public class cafe091107 {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int i =0;
		int answer = Integer.MIN_VALUE;
		int[] min = new int[3];
//		int minVal = Integer.MAX_VALUE;
		Arrays.parallelSort(citations);
		for(;i<citations.length;i++) {
			min[0] = citations.length-i;
			System.out.println("min1은"+min[0]);
			min[1] = i+1;
			System.out.println("min2는"+min[1]);
			min[2] = citations[i];
			System.out.println("min3은"+min[2]);
			
			if(min[0]==min[1]&&min[1]==min[2]) {
				answer = min[0];
			}			
		}
		System.out.println(answer);
	}
}
