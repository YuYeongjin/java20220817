package p99programLv2;

import java.util.HashMap;
import java.util.Map;

public class academy102002롤케이크 {
	public static void main(String[] args) {
		
		academy102002롤케이크 go = new academy102002롤케이크();
		
		int[] topping = {1,2,3,4,1,2,5,4,1,2,5,6,2,3,4,4,2,3,4,2,6,4,6,7,4,2,1,2,3,5,6,2,4,5,8,9,6,8,0};
//		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		System.out.println(go.solution(topping));
		
	}
	public int solution(int[] topping) {
		int answer = 0;
		Map<Integer,Integer> bro = new HashMap<>();
		Map<Integer,Integer> bra = new HashMap<>();
		for(int i = 0 ; i< topping.length;i++) {
			if(bro.containsKey(topping[i])) {
				bro.put(topping[i], bro.get(topping[i])+1);
			} else {
				bro.put(topping[i], 1);
			}
		}
		int cnt=0;
		while(cnt!=topping.length) {
			if(bra.containsKey(topping[cnt])) {
				bra.put(topping[cnt], bra.get(topping[cnt])+1);
			} else {
				bra.put(topping[cnt], 1);
			}
			bro.put(topping[cnt], bro.get(topping[cnt])-1);
			if(bro.get(topping[cnt])==0) {
				bro.remove(topping[cnt]);
			}
			cnt++;
			if(bro.size()==bra.size()) answer++;
		}		
		return answer;
	}
}
