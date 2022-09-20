package p99Codingbat;
import java.util.*;
import java.util.stream.*;

public class academy092001 {
	public static void main(String[] args) {
		int n = 16;
		int k = 362879;
		double num = 0;
		int[] answer = new int[n];
		double pac = IntStream.rangeClosed(1, n).reduce((a,b)->a*b).getAsInt();
		List<Integer> ans = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
		if(k==pac) {
			answer = ans.stream().sorted((a,b)-> b-a).mapToInt(x->x).toArray();
		}
		for(int i = 0;i<answer.length;i++) {
			pac/=n;
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
