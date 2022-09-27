package p99Study.home;

import java.util.*;
import java.util.stream.*;

public class home091902 {
	public static void main(String[] args) {
		int n = 5;
		int k = 23;
		int num = 0;
		int[] answer = new int[n];
		int pac = IntStream.rangeClosed(1, n).reduce((a,b)->a*b).getAsInt();
		List<Integer> ans = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
		if(pac ==k) {
			answer = ans.stream().sorted((a,b)-> b-a).mapToInt(x->x).toArray();
		} else {
			for(int i = 0;i<answer.length;i++) {	
				pac/=n;
				num = (int)(k/pac);
				System.out.println(num);
				k=k%pac;
				answer[i]=ans.remove(num);
				n--;			
				System.out.println(ans);
				System.out.println(k);
				if(k==1) {
					break;
				}
			}
			for(int i = 0; i<answer.length;i++) {
				if(answer[i]==0) {
					answer[i]=ans.remove(0);
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		
		
	}
}
