package p99Codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class academy091903 {
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		int answer = 0;
		int maxV = 0;
		int minV = 0;
		
		int indexT = 0;
		
		List<Integer> minT = new ArrayList<>();
		List<Integer> lostT = new ArrayList<>();
		for(int i =0 ; i <dungeons.length;i++) {
			minT.add(dungeons[i][0]);
			lostT.add(dungeons[i][1]);
		}
		for(int i = 0 ; i < dungeons.length;i++) {
			indexT = minT.indexOf(Collections.max(minT));
			maxV = minT.remove(indexT);
			minV = lostT.remove(indexT);
			if(maxV <=k) {
				System.out.println(maxV);
				answer++;
			}
		}
		System.out.println(answer);
	}
}
