package p99programlv1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class academy101302삼총사 {
	int answer = 0;
	public static void main(String[] args) {
		academy101302삼총사 go = new academy101302삼총사();
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
//		int[] number = {0,0,0,0};
		
		
		System.out.println(go.solution(number));
	}
	public int solution(int[] number) {
//	
		for(int i = 0 ; i < number.length;i++) {
			Set<Integer> set = new HashSet<>();
			int[] sum = new int[3];
			sum[0]=number[i];
			for(int j = 0 ; j < number.length;j++) {
				if(j==i)continue;
				sum[1]=number[j];
				for(int l = 0 ; l < number.length;l++) {
					if(l==i)continue;
					if(l==j)continue;
					sum[2]=number[l];
					if(sum[0]+sum[1]+sum[2]==0) {
						
							answer++;
					}
				}
			}
		}
        return answer/6;
    }
	
}
