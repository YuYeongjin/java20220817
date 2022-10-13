package p99programlv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class academy101302삼총사 {
	int answer = 0;
	public static void main(String[] args) {
		academy101302삼총사 go = new academy101302삼총사();
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		System.out.println(go.solution(number));
	}
	public int solution(int[] number) {
		List<int[]> list = new ArrayList<>();
		for(int i = 0 ; i < number.length;i++) {
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
						Arrays.sort(sum);
						list.add(sum);
					}
				}
			}
		}
		int len= list.size();
		for(int i = 0 ; i < len;i++) {
			int[] a = list.get(i);
			
			for(int l = 0 ; l < list.size();l++) {
				if(i==l)continue;
				if(!(a[0]==list.get(l)[0]&&a[1]==list.get(l)[1]&&a[2]==list.get(l)[2])) {
					answer++;
				}
			}
		}
		
        return answer;
    }
	
}
