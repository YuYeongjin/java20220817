package p99programLv2;

import java.util.Arrays;
import java.util.TreeSet;

public class academy092703던파 {
	int answer=0;
	TreeSet<Integer> ans = new TreeSet<>((a,b)->b-a);
	public static void main(String[] args) {
//		int k = 150;
		int k = 80;
//		int[][] dungeons = {{80,20},{50,40},{30,10},{80,20},{50,40},{30,10},{50,40},{30,30}};
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		
		
		academy092703던파 a = new academy092703던파();
		System.out.println(Arrays.deepToString(dungeons));
		for(int l = 0 ; l <2;l++) {
			if(l==0) {
				Arrays.sort(dungeons, (x,y)->y[0]-x[0]);				
			} else {
				Arrays.sort(dungeons, (x,y)->y[1]-x[1]);	
			}
			for(int i = 0 ; i < dungeons.length;i++) {
				a.answer=0; int hp = k;
				boolean[] clear = new boolean[dungeons.length];
				if(dungeons[i][0]<=k) {
					a.answer=1;
					hp-=dungeons[i][1];
					clear[i]=true;	
				} else {
					continue;
				}
				System.out.println("dfs실행");
				a.dfsR(hp,dungeons,clear,a.answer);
			}
			for(int i = 0 ; i < dungeons.length;i++) {
				a.answer=0; int hp = k;
				boolean[] clear = new boolean[dungeons.length];
				if(dungeons[i][0]<=k) {
					a.answer=1;
					hp-=dungeons[i][1];
					clear[i]=true;	
				} else {
					continue;
				}
				System.out.println("dfs실행");
				a.dfsL(hp,dungeons,clear,a.answer);
			}
		}
		System.out.println(a.ans.first());
	}
	void dfsR(int hp, int[][] gate,boolean[] clear,int answer) {
		int cnt = 0; 
		for(int i = 0 ; i < gate.length;i++) {
			if(hp<gate[i][0]||clear[i]) {
				cnt++;
			}
		}
		if(cnt==gate.length) {
			System.err.println(ans);
			ans.add(answer);
			return;
		}
		
		System.out.println("잔여 체력 : " + hp);
		for(int i = 0; i < gate.length;i++) {
			if(hp>=gate[i][0]&&!clear[i]) {
				System.out.println((i+1)+"번째 던전 입장");
				clear[i]=true;
				dfsR(hp-gate[i][1],gate,clear, answer+1);
			}
		}
	}
	void dfsL(int hp, int[][] gate,boolean[] clear,int answer) {
		int cnt = 0; 
		for(int i = 0 ; i < gate.length;i++) {
			if(hp<gate[i][0]||clear[i]) {
				cnt++;
			}
		}
		if(cnt==gate.length) {
			System.err.println(ans);
			ans.add(answer);
			return;
		}
		
		System.out.println("잔여 체력 : " + hp);
		for(int i = gate.length-1; i >=0;i--) {
			if(hp>=gate[i][0]&&!clear[i]) {
				System.out.println((i+1)+"번째 던전 입장");
				clear[i]=true;
				dfsL(hp-gate[i][1],gate,clear, answer+1);
			}
		}
	}
//	void bfs(int hp, int[][] gate,int k,boolean[] clear) {
//		Queue<Integer> open = new LinkedList<>();
//		int where = 0;
//		open.add(where);
//		clear[where] = true;
//		while(!open.isEmpty()&&hp>=0) {
//			where=open.remove();
//			hp-=gate[where][1];
//			System.out.println("잔여 체력 : " + hp+"현재 gate : " + where);
//			for(int next = 0;next <gate.length;next++) {
//				if(clear[next]!=true&&gate[next][0]<=hp) {
//					clear[next]=true;
//					answer++;
//					open.add(next);
//				}
//			}
//		}
//	}
}
