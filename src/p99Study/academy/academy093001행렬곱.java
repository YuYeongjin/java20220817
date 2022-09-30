package p99Study.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class academy093001행렬곱 {
	List<Integer> ansList = new ArrayList<>();
	int[][] answer;
	public static void main(String[] args) {
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,2},{1,4}};
		
		academy093001행렬곱 go = new academy093001행렬곱();
		
		System.out.println(go.solution(arr1, arr2));
		System.out.println(Arrays.deepToString(go.answer));
	}
	
	int[][] solution(int[][] arr1, int[][] arr2) {
	        answer = new int[arr1[0].length][arr2.length];
	        System.out.println(Arrays.deepToString(answer));
	        for(int i = 0 ; i < answer.length;i++) {
	        	for(int j = 0; j< answer[i].length;j++) {
	        		for(int l = 0; l <arr1[0].length;l++) {
	        			answer[i][j]+=(arr1[i][l]*arr2[l][j]);
	        		}
	        	}
	        	
	        }

	        return answer;
	 }
}
	        	
	        
	        
