package p99Study.academy;

import java.util.Arrays;

public class academy092006_howMuchStack {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		
		
		System.out.println(Arrays.toString(first(prices)));
		
		
	}	
	public static int[] first(int[] prices) {
		int[] answer = new int[prices.length];
	
		for (int i = 0; i < prices.length; i++) {
			for(int l = 0;l<i;l++) {
				if(prices[i]<prices[l]) {
					break;
				}
				answer[l]++;
			}		
		}
		return answer;
	}
	public static int[] second(int[] prices) {
		int[] answer = new int[prices.length];
	
		for (int i = 0; i < prices.length; i++) {
			for(int l = 0;l<i;l++) {
				if(prices[i]<prices[l]) {
					break;
				}
				answer[l]++;
			}		
		}
		return answer;
	}
	
	
}
