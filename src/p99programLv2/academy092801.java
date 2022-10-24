package p99programLv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class academy092801 {
	static void spot(int x, int y, int step) {
		
	}
	int answer;
	Set<Integer> path = new HashSet<>();
	
	public static void main(String[] args) {
		academy092801 solution = new academy092801();
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		
		boolean[][] mapCheck = new boolean[maps.length][maps[0].length];
		solution.answer = -1;
		System.out.println(solution.path);
//		solution.dfs(0,0,0,maps,mapCheck);
//		int a = Integer.MAX_VALUE;
//		for(int item : path) {
//			if(a>item) {
//				a=item;
//			}
//		}
//		if(a!=Integer.MAX_VALUE)
//			answer=a;
		
		mapCheck = new boolean[maps.length][maps[0].length];
		solution.bfs(0, 0, 0, maps, mapCheck);
		System.out.println(solution.path);
	}

	
	void bfs(int ver,int hor,int cnt,int[][] maps,boolean[][] mapCheck) {
		Queue<int[]> qu = new LinkedList<>();
		int[] now= {ver,hor};
		qu.add(now);
		mapCheck[ver][hor]=true;
		while(!qu.isEmpty()) {
			now=qu.remove();
			if(ver==maps[0].length-1&&hor==maps[0].length-1) {
				System.err.println("실행 ->"+"수직방향: " +ver+"수평방향: "+hor);
				answer = cnt;
				return;
			}
		}
		System.out.println("실행 ->"+"수직방향: " +ver+"수평방향: "+hor);
		mapCheck[ver][hor]=true;
		
			System.out.println("현재 ver/hor : "+ver+ "/" +hor);
			if(ver!=0 ||hor!=0 ||hor!=maps[0].length-1||ver!=maps[0].length-1) {
				if(maps[ver][hor]!=0&&mapCheck[ver][hor]!=true) {
					System.out.println("들어오");
					mapCheck[ver][hor]=true;
					qu.add(new int[] {ver,hor});
				}
			}
				
			
		}
	}

//	void dfs(int ver,int hor,int cnt,int[][] maps,boolean[][] mapCheck) {
//		if(ver==maps.length-1&&hor==maps[0].length-1) {
//			System.err.println("실행 ->"+"수직방향: " +ver+"수평방향: "+hor);
//			path.add(cnt);
//			mapCheck=new boolean[maps.length][maps[0].length];
//			System.out.println(Arrays.deepToString(mapCheck));
//			ver=0;
//			hor=0;
//			cnt=0;
//
//			if(path.add(cnt)!=true) {
//				return;
//			}
//		}
//		System.out.println("실행 ->"+"수직방향: " +ver+"수평방향: "+hor);
//		cnt+=maps[ver][hor];
//		mapCheck[ver][hor]=true;
//		
//		if(ver!=maps[0].length-1&&maps[ver+1][hor]!=0&&mapCheck[ver+1][hor]!=true) {
//			dfs(ver+1,hor,cnt,maps,mapCheck);
//		}
//		if(hor!=maps[0].length-1&&maps[ver][hor+1]!=0&&mapCheck[ver][hor+1]!=true) {
//			dfs(ver,hor+1,cnt,maps,mapCheck);
//		}
//		if(ver!=0&&maps[ver-1][hor]!=0&&mapCheck[ver-1][hor]!=true) {
//			dfs(ver-1,hor,cnt,maps,mapCheck);
//		}
//		if(hor!=0&&maps[ver][hor-1]!=0&&mapCheck[ver][hor-1]!=true) {
//			dfs(ver,hor-1,cnt,maps,mapCheck);
//		}
//	}