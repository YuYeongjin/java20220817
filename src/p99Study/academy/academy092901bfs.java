package p99Study.academy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class academy092901bfs {
	static int[][] where = {{-1,0},{1,0},{0,-1},{0,1}};
	static class spot {
		spot(int x, int y, int step){
			ver = x; hor = y; count = step;
		}
		int ver, hor,count;
	}
	int answer;
	Set<Integer> path = new HashSet<>();
	
	public static void main(String[] args) {
		academy092901bfs go = new academy092901bfs();

	int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } };
//			int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};

	boolean[][] mapCheck = new boolean[maps.length][maps[0].length];

	go.bfs(0,0,maps,mapCheck);
	System.err.println(go.path);
	System.out.println(go.answer);
	}
	
	
	void bfs(int ver, int hor, int[][] maps, boolean[][] mapCheck) {
		Queue<spot> qu = new LinkedList<>();
		qu.add(new spot(ver, hor,0));
		mapCheck[ver][hor] = true;
		while (!qu.isEmpty()) {
			spot now = qu.remove();
			if (now.ver == maps.length - 1 && now.hor == maps[0].length - 1) {
				mapCheck=new boolean[maps.length][maps[0].length];
				System.err.println("실행 ->" + "수직방향: " + now.ver + "수평방향: " + now.hor);
				path.add(now.count);
//				answer =now.count;
				if(path.add(now.count)==false) {
					return;
				}
			}
				
			
			System.out.println("실행 ->" + "수직방향: " + now.ver + "수평방향: " + now.hor);
			for(int i =0; i < 4;i++) {
				int newVer =now.ver+where[i][0]; int newHor =now.hor+where[i][1];
			
				if (newVer < 0 || newHor < 0 || newHor > maps[0].length - 1 || newVer > maps.length - 1) continue;
				if (maps[newVer][newHor] == 0) continue;
				if (mapCheck[newVer][newHor]) continue;
					System.out.println(i+"일때 들어옴 좌표는"+newVer+ " : " + newHor);
					mapCheck[newVer][newHor] = true;
					qu.add(new spot(newVer,newHor,now.count+1));
			}
		}		
	}
}