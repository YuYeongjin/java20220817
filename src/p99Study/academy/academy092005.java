package p99Study.academy;

import java.util.ArrayList;
import java.util.List;

public class academy092005 {
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		
		System.out.println("정답 : "+maxNum(number,k));
//		System.out.println("정답 : "+maxNum2(number,k));
	}
	public static String maxNum(String number,int k) {
		String answer = "";
		
		List<Integer> num = new ArrayList<>();
		for(int i = 0; i<number.length();i++) {
			num.add(Integer.valueOf(number.substring(i, i+1)));
		}
		
		for(int i = 0 ; i < k;i++) {
			int max = num.lastIndexOf(num.stream().mapToInt(x->x).max().getAsInt());
			System.out.println(max);
			if(max==0) {
				int nextMax = num.lastIndexOf(num.stream().skip(1).mapToInt(x->x).max().getAsInt());
				num.remove(num.indexOf(num.stream().limit(nextMax).mapToInt(x->x).min().getAsInt()));								
			} else {
				num.remove(num.indexOf(num.stream().limit(max).mapToInt(x->x).min().getAsInt()));				
			}
		}
		for(int ans : num) {
			answer +=ans;
		}
		return answer;
	}
	
	public static String maxNum2(String number,int k) {
		String answer = "";
		String find = "";
		int[] arr = new int[answer.length()];
		List<Integer> num = new ArrayList<>();
		for(int i = 0; i<number.length();i++) {
			num.add(Integer.valueOf(number.substring(i, i+1)));
		}
		System.out.println(num);

		for(int ans : num) {
			answer +=ans;
		}
		return answer;
	
	}
}
