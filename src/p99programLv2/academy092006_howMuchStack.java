package p99programLv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class academy092006_howMuchStack {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 4,3,2,2,3,2,2,3,2,3,3 };
		
		
//		System.out.println(Arrays.toString(first(prices)));
		
		System.out.println(Arrays.toString(three(prices)));
		
	}	
	public static int[] first(int[] prices) {
		int[] answer = new int[prices.length];
		boolean[] check = new boolean[prices.length];
		for (int i = 0; i < prices.length; i++) {
			for(int l = 0;l<i;l++) {
				if(check[l]) continue;
				if(prices[i]>=prices[l]) {
					answer[l]++;
				if(prices[i]<prices[l])
					check[l] = true;
				}
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
	public static int[] three(int[] prices) {
		int[] answer = new int[prices.length];
		Queue<Integer> ans = new LinkedList<>();
		int cnt = 0;
		ans.add(prices[cnt]);
		while(cnt!=prices.length-1) {
			int num=ans.remove();
			System.out.println(num);
			int i =cnt+1;
			int add = 0;
			for(; i < prices.length;i++) {
				add++;
				if(prices[i]<num) {
					break;
				}
			}
			answer[cnt]=add;
			cnt++;
			ans.add(prices[cnt]);
		}
		
		return answer;
	}
	
}
