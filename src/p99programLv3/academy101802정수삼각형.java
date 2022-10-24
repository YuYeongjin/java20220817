package p99programLv3;

import java.util.TreeSet;

public class academy101802정수삼각형 {
	public static void main(String[] args) {
		academy101802정수삼각형 go = new academy101802정수삼각형();
		int[][] triangle={{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(go.solution(triangle));
	}
	public int solution(int[][] triangle) {
        TreeSet<Integer> sum = new TreeSet<>((a,b)->b-a);
		int[][] num = new int[triangle.length][triangle.length];
		for(int i = 0 ; i < triangle.length;i++) {
			for(int j = 0 ; j< triangle[i].length;j++) {
				num[i][j]=triangle[i][j];
			}
		}
//		System.err.println(Arrays.deepToString(num));
		for(int i=0;i<triangle.length-1;i++) {
			
			for(int l=0;l<=i;l++) {
				int now = num[i][l];
				for(int j = 0; j<2;j++) {
//					System.out.println(now + " + " +triangle[i+1][l+j]  +" 현재 인덱스 : " + (i+1) +" , " + (l+j)  + " 계산중"  );
					if(now+triangle[i+1][l+j]>num[i+1][l+j]) {
						num[i+1][l+j]=now+triangle[i+1][l+j];
//						System.out.println(num[i+1][l+j]);
					}
				}
//				System.out.println(Arrays.deepToString(num));
			}
		}
		for(int i = 0;i<num.length;i++) {
        	sum.add(num[num.length-1][i]);
        }
        return sum.first();
    }	
}
