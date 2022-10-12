package p99programLv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class academy092703던파 {
	int answer;
	public static void main(String[] args) {
		int k = 150;
		int[][] dungeons = {{80,20},{50,40},{30,10},{80,20},{50,40},{30,10},{50,40},{30,30}};
		academy092703던파 a = new academy092703던파();
		Arrays.sort(dungeons, (x,y)->y[0]-x[0]);
		System.out.println(Arrays.deepToString(dungeons));
		
		a.answer=0;
		boolean[] clear = new boolean[dungeons.length];
//		a.dfs(k,dungeons,k,clear);
		a.bfs(k, dungeons, k, clear);
		System.out.println(a.answer);
	}
//	void dfs(int hp, int[][] gate,int k,boolean[] clear) {
//		int cnt=0;
//		int door = 0;
//		for(int i = 0 ; i < gate.length;i++) {
//			if(hp<gate[i][0]) {
//				cnt++;
//			}		
//			if(clear[i]==true) {
//				door++;
//			}			
//		}
//		if(cnt==gate.length||door==gate.length) {
//			answer = cnt;
//			System.out.println("아웃");
//			return;
//		}
//
//		System.out.println("잔여 체력 : " + hp);
//		for(int i = 0; i < gate.length;i++) {
//			if(hp>=gate[i][0]&&clear[i]!=true) {
//				System.out.println((i+1)+"번째 던전 입장");
//				clear[i]=true;
//				dfs(hp-gate[i][1],gate,k,clear);
//			}
//		}		
//	}
	void bfs(int hp, int[][] gate,int k,boolean[] clear) {
		Queue<Integer> open = new LinkedList<>();
		int where = 0;
		open.add(where);
		clear[where] = true;
		while(!open.isEmpty()&&hp>=0) {
			where=open.remove();
			hp-=gate[where][1];
			System.out.println("잔여 체력 : " + hp+"현재 gate : " + where);
			for(int next = 0;next <gate.length;next++) {
				if(clear[next]!=true&&gate[next][0]<=hp) {
					clear[next]=true;
					answer++;
					open.add(next);
				}
			}
		}
	}
}
