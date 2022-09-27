package p99Study.academy;

import java.util.*;
public class academy091301 {
	public static void main(String[] args) {
		int brown=18;
		int yellow=6;
		int[] answer = new int[2];
        
		answer[1] = 3;
		if(brown==yellow*2+6) {
			answer[0]=(brown+yellow)/answer[1];
		} else {
			answer[1]=(int)(Math.sqrt(brown+yellow));
			for(int i =0;i<yellow;i++) {
				answer[0]=(brown+yellow)/answer[1];
				if(answer[0]*answer[1]!=(brown+yellow)) {
					answer[1]--;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
