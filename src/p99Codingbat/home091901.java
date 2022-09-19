package p99Codingbat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
public class home091901 {	
		public static void main(String[] args) {
			int[] scoville = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1};
			int K = 10000;
			int answer= 0;		
			
			List<Integer> hot = Arrays.stream(scoville).boxed().collect(Collectors.toList());
			
			PriorityQueue<Integer> what = new PriorityQueue<>();
			for(int i = 0 ; i < scoville.length;i++) {
				what.add(scoville[i]);
			}
			System.out.println(what);
			while(what.size()!=1) {			
				int one = 0;
				int two = 0;
				if(what.peek()<K) {
					one = what.poll();
					two= what.poll();
					what.add(one+two*2);
					answer++;
				} else {
					break;
				}
			}
			if(what.poll()<K) {
				answer = -1;
			}
			System.out.println(what);
			
			System.out.println(answer);
		}
	
}
