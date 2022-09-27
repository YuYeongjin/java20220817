package p99Study.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class home092701line {

	public static void main(String[] args) {		
		int n = 15;
		long k = 54123451;
		double num = 0;
		int[] answer = new int[n];
//		double pac = IntStream.range(1, n).reduce((a,b)->a*b).getAsInt();
		double pac =1;
		for(int i = 1;i<n;i++) {
			pac*=i;
		}
//		List<Integer> ans = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
		List<Integer> ans = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			ans.add(i);
		}
		
		if(k==pac) {
			answer = ans.stream().sorted((a,b)-> b-a).mapToInt(x->x).toArray();
			System.out.println(Arrays.toString(answer));
		}
		for(int i = 0;i<answer.length;i++) {
			num = (k/pac);
			System.out.println("num??"+num);
			System.out.println(k);
			System.out.println(pac);
			if(num == (int)num) {
				answer[i]=ans.remove((int)num-1);				
			} else {
				answer[i]=ans.remove((int)num);
			}
			k=k%(long)pac;
			n--;
			pac/=n;
			if(k<=1) {
				break;
			}
		}		
		if(k==0&&ans.size()>=2) {
			for(int i = 0; i<answer.length;i++) {
				if(answer[i]==0) {
					answer[i]=ans.remove(ans.size()-1);
				}
			}
		} else {
			for(int i = 0; i<answer.length;i++) {
				if(answer[i]==0) {
					answer[i]=ans.remove(0);
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
