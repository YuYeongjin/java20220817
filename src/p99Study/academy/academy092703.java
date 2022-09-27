package p99Study.academy;

import java.util.Arrays;
import java.util.Comparator;

public class academy092703 {
	int answer;
	public static void main(String[] args) {
		int k = 150;
		int[][] dungeons = {{80,20},{50,40},{30,10},{80,20},{50,40},{30,10},{50,40},{30,30}};
		academy092703 a = new academy092703();
		Arrays.sort(dungeons, (x,y)->x[1]-y[1]);
		System.out.println(Arrays.deepToString(dungeons));
		
		a.answer=0;
		boolean[] clear = new boolean[dungeons.length];
		a.dfs(k,dungeons,k,clear);
			
		System.out.println(a.answer);
		
	}
	
	void dfs(int hp, int[][] gate,int k,boolean[] clear) {
		int cnt=0;
		int door = 0;
		for(int i = 0 ; i < gate.length;i++) {
			if(hp<gate[i][0]) {
				cnt++;
			}		
			if(clear[i]==true) {
				door++;
			}			
		}
		if(cnt==gate.length||door==gate.length) {
			answer = cnt;
			clear = new boolean[gate.length];
			System.out.println("아웃");
			return;
		}

		System.out.println("잔여 체력 : " + hp);
		for(int i = 0; i < gate.length;i++) {			
			if(hp>=gate[i][0]&&clear[i]!=true) {
				System.out.println((i+1)+"번째 던전 입장");
				clear[i]=true;
				dfs(hp-gate[i][1],gate,k,clear);
				
			}
		}		
	}
}
