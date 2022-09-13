package p99Codingbat;

import java.util.*;

public class academy091303 {
	public static void main(String[] args) {
		int n = 15;
		List<Integer> num = new ArrayList<>();
		int answer = 0;
		int sum=n;
		int count=0;
		while(count!=n) {
			sum=n;
			for(int i =count;i<n;i++) {
				sum-=i;
				if(sum==0&&!num.contains(i)) {
					num.add(i);
					answer++;
				}
			}
			count++;
		}
		System.out.println(answer);
	}
}
