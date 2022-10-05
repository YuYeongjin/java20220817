package p99programLv2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class academy092701 {
	public static void main(String[] args) {
		int n = 16;
		long k = 23;
		double num = 0;
		int[] answer = new int[n];
		double pac = IntStream.rangeClosed(1, n).reduce((a,b)->a*b).getAsInt();
		List<Integer> ans = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        if(k==pac) {
			answer = ans.stream().sorted((a,b)-> b-a).mapToInt(x->x).toArray();
            System.out.println(Arrays.toString(answer));
		}
		for(int i = 0;i<answer.length;i++) {
			pac/=n;
			System.out.println(k);
			System.out.println(pac);
			
			num = (k/pac);
			System.out.println(num);
			if(num == (int)num) {
				answer[i]=ans.remove((int)num-1);				
			} else {
				answer[i]=ans.remove((int)num);
			}
			k=k%(int)pac;
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
		System.out.println(Arrays.toString(answer));
    }
	
}
