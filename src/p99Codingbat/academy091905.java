package p99Codingbat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class academy091905 {
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String answer = "";
		
		List<Integer> num = new ArrayList<>();
		for(int i = 0; i<number.length();i++) {
			num.add(Integer.valueOf(number.substring(i, i+1)));
		}
		System.out.println(num);
		
		int max = num.stream().limit(k-1).mapToInt(x->x).max().getAsInt();
		System.out.println(max);
		System.out.println("i인덱스의 값"+num.indexOf(max));
		int indexI=num.indexOf(max);
		
		for(int i = 0 ; i < indexI;i++) {
			System.out.println("실행");
			num.remove(0);
			k--;
		}
		System.out.println("잔여 k : " + k);
		
		while(k!=0) {
//
//			num.remove(num.indexOf(Collections.min(num)));			
//			k--;
		}

		System.out.println(num);
		for(int ans : num) {
			answer +=ans;
		}
		System.out.println(answer);		
	}
}
