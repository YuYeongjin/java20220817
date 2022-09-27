package p99Study.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class academy092002 {
	public static void main(String[] args) {
		
		
		
		
		int n = 1000;
		int k = 4;
		int num = 0;
		int[] answer = new int[n];
		int pac = IntStream.rangeClosed(1, n).reduce((a,b)->a*b).getAsInt();
		List<Integer> ans = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
		if(k==pac) {
			answer = ans.stream().sorted((a,b)-> b-a).mapToInt(x->x).toArray();
		} else {
			for(int i = 0;i<answer.length;i++) {
				pac/=n;
				num = (k/pac);
				answer[i]=ans.remove((int)num);
				k=k%pac;
				n--;
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
		}
		System.out.println(Arrays.toString(answer));
	}
}
/*
List<Integer> npac =  new ArrayList<Integer>();

for(int i = 0 ;i<n;i++) {
	if(i!=0) {
		count*=i;				
	}
	npac.add(count);
}
npac.remove(0);
System.out.println(npac);
*/