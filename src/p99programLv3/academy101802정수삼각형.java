package p99programLv3;

import java.util.Arrays;
import java.util.TreeSet;

public class academy101802정수삼각형 {
	public static void main(String[] args) {
		academy101802정수삼각형 go = new academy101802정수삼각형();
		int[][] triangle={{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(go.solution(triangle));
	}
	public int solution(int[][] triangle) {
        TreeSet<Integer> sum = new TreeSet<>((a,b)->b-a);
		int[][] num = triangle;
		
        for(int i=1;i<triangle.length;i++) {
        	for(int l=0;l<=i;l++) {
        		num[i][l]=num[i-1][i-1]+triangle[i][l];
        		if(l>=1) {
        			if(num[i][l]<num[i-1][l-1]+triangle[i][l]) {
        				num[i][l]=num[i-1][l-1]+triangle[i][l];
        			} 
        		}
        		System.out.println(Arrays.deepToString(num));
        	}
        }
        for(int i = 0;i<num.length;i++) {
        	sum.add(num[num.length-1][i]);
        }
        return sum.first();
    }	
}
