package p99Study.cafe;

import java.util.*;

public class cafe091103 {
	public static void main(String[] args) {
		String s = "110010101001";
		int[] answer = new int[2];
		
		int zero = 0;
		int play = 0;
		
		while(true) {
			int count = 0;
			for(int i =0; i<s.length();i++) {
				if(s.substring(i, i+1).equals("0")) {
					zero++;
				} else {
					count++;
				}
			}
			s=Integer.toBinaryString(count);
			System.out.println(s);
			play++;
			if(s.equals("1")) {
				break;
			}
		}
		
		answer[1]=zero;
		answer[0]=play;
		System.out.println(Arrays.toString(answer));
	}
}
