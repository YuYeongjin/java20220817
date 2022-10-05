package p99programLv2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class academy092305 {
	public static void main(String[] args) {
		academy092305 a = new academy092305();
		int n = 3;
		
		a.dfs(0,0,n,5);
		System.out.println(a.answer);
	}
	int[] answer;
	int cnt;
	void dfs(int i, int cnt, int n, int k) {
		List<Integer> numList = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
		int[] answer = new int[n];
		//탈출
		if(cnt==k) {	
			return;
		}
		//수행
		
		
		
		
		dfs(i+1,cnt,n,k);
		
		
		
		
		
		
		
		
	}
	
}
