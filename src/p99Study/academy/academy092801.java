package p99Study.academy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class academy092801 {
	int answer;
	Set<Integer> path = new HashSet<>();
	
	public static void main(String[] args) {
		academy092801 solution = new academy092801();
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		
		boolean[][] mapCheck = new boolean[maps.length][maps[0].length];
		solution.answer = -1;
		solution.dfs(0,0,0,maps,mapCheck);
//		int a = Integer.MAX_VALUE;
//		for(int item : path) {
//			if(a>item) {
//				a=item;
//			}
//		}
//		if(a!=Integer.MAX_VALUE)
//			answer=a;
		System.out.println(solution.path);
	}
	void dfs(int ver,int hor,int cnt,int[][] maps,boolean[][] mapCheck) {
		if(ver==maps.length-1&&hor==maps[0].length-1) {
			System.err.println("실행 ->"+"수직방향: " +ver+"수평방향: "+hor);
			path.add(cnt);
			mapCheck=new boolean[maps.length][maps[0].length];
			System.out.println(Arrays.deepToString(mapCheck));
			ver=0;
			hor=0;
			cnt=0;

			if(path.add(cnt)!=true) {
				return;
			}
		}
		System.out.println("실행 ->"+"수직방향: " +ver+"수평방향: "+hor);
		cnt+=maps[ver][hor];
		mapCheck[ver][hor]=true;
		
		if(ver!=maps[0].length-1&&maps[ver+1][hor]!=0&&mapCheck[ver+1][hor]!=true) {
			dfs(ver+1,hor,cnt,maps,mapCheck);
		}
		if(hor!=maps[0].length-1&&maps[ver][hor+1]!=0&&mapCheck[ver][hor+1]!=true) {
			dfs(ver,hor+1,cnt,maps,mapCheck);
		}
		if(ver!=0&&maps[ver-1][hor]!=0&&mapCheck[ver-1][hor]!=true) {
			dfs(ver-1,hor,cnt,maps,mapCheck);
		}
		if(hor!=0&&maps[ver][hor-1]!=0&&mapCheck[ver][hor-1]!=true) {
			dfs(ver,hor-1,cnt,maps,mapCheck);
		}
	}
}
