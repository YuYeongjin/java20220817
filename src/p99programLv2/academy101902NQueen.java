package p99programLv2;

import java.util.Stack;

public class academy101902NQueen {
	int answer=0;int[][] ans;
	class Spot{Spot(int x, int y){this.x = x; this.y=y;}int x,y;}
	Stack<Spot> point = new Stack<>();
	
	public static void main(String[] args) {		
	academy101902NQueen go = new academy101902NQueen();
	int n = 4;
	System.out.println(go.solution(n));
	
	}
	public int solution(int n) {
		ans = new int[n][n];
        
		
		int cnt=0; int y =0;
		boolean[] check=new boolean[n];
		while(point.size()!=n) {
			
			if(!dfs(cnt,n,y,new int[n],check)) {
				point.pop();
			} else {
				dfs(cnt++,n,y++,new int[n],check);
			}
		}
        
        return answer;
    }
	boolean dfs(int cnt, int n, int y,int[] x, boolean[] check){
		
		
		
		
		
		for(int i = 0 ; i < x.length;i++) {
			if(check[i])continue;
			return true;
		}
		return false;
	}
}
