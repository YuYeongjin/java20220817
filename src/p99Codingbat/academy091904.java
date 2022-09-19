package p99Codingbat;

import java.util.Arrays;

public class academy091904 {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			for(int l = 0;l<i;l++) {
				if(prices[i]<prices[l]) {
					break;
				}
				answer[l]++;
			}
		}
		System.out.println(Arrays.toString(answer));

	}
}
