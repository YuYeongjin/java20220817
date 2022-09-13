package p99Codingbat;

import java.util.*;

public class academy091302 {
	public static void main(String[] args) {
//		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		int answer = 1;
		List<String> clo = new ArrayList<String>();
        for(int i = 0; i<clothes.length;i++) {
			if(!clo.contains(clothes[i][1])) {
				clo.add(clothes[i][1]);
			}
		}
		int[] item = new int[clo.size()];
		
		for(int i = 0; i<clothes.length;i++) {
			if(clo.contains(clothes[i][1])) {
				item[clo.indexOf(clothes[i][1])]++;
			}
		}
		for(int i = 0; i<item.length;i++) {
			if(item.length ==1) {
				System.out.println("길이1 인데");
				answer = item[0];
			} else {				
				answer *=(item[i]+1);
			}
		}
		System.out.println(clo);
		System.out.println(Arrays.toString(item));

		System.out.println("정답은");
		System.out.println(answer);
	}
}
