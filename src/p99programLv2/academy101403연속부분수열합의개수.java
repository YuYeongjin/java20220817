package p99programLv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class academy101403연속부분수열합의개수 {
	Set<Integer> number = new HashSet<>();
	public static void main(String[] args) {
		academy101403연속부분수열합의개수 go = new academy101403연속부분수열합의개수();
		
		int[] elements = {7,9,1,1,4};
		
		for(int i = 1 ; i <= elements.length; i++) {
			go.bfs(0,0,elements, i);			
		}
		
		System.out.println(go.number.size());
	}
	void bfs(int cnt,int sum,int[] elements, int len){
		Queue<Integer> point = new LinkedList<>();
		boolean[] check = new boolean[len];
		
	
		
		
		}
		
	}
	
	
}
