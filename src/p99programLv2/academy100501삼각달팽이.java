package p99programLv2;

import java.util.Arrays;

public class academy100501삼각달팽이 {
	class spot{
		spot(int y, int x, int cnt){
			this.x=x; this.y=y;this.cnt=cnt;
		}
		int x,y,cnt;
		
	}
	public static void main(String[] args) {
		academy100501삼각달팽이 go = new academy100501삼각달팽이();
		int n = 400;
		System.out.println(Arrays.toString(go.solution(n)));
	}
	public int[] solution(int n) {
		int[] answer = new int[n*(n+1)/2];
		int[][] triangle=new int[n][n];
		spot now = new spot(0,0,1);
	    boolean[][] check=new boolean[n][n];
//	    yfs(n,now,check,triangle);
	    
	    
	    int key=1;
	    while(now.cnt!=n*(n+1)/2) {
	    	check[now.y][now.x]=true;
	    	triangle[now.y][now.x]=now.cnt;
	    	System.out.println(Arrays.deepToString(triangle));
			switch (key) {
			case 1:
				if(now.y+1!=n&&!check[now.y+1][now.x]) {
					System.out.println("Y" + "좌표 : " + now.x + " , " + now.y);
					now = new spot(now.y+1, now.x,now.cnt+1);
				} else {
					System.out.println("X로 키 넘김");
					now = new spot(now.y, now.x+1,now.cnt+1);
					key=2;
				}
				break;
			case 2:
				if(now.x+1!=n&&!check[now.y][now.x+1]) {
					System.out.println("X" + "좌표 : " + now.x + " , " + now.y);
					now = new spot(now.y, now.x+1,now.cnt+1);					
//					check[now.y][now.x]=true;
//				    triangle[now.y][now.x]=now.cnt;
				} else {
					System.out.println("Z로 키 넘김");
					now = new spot(now.y-1, now.x-1,now.cnt+1);	
					key=3;
				}
				break;
			case 3:
				if(!check[now.y-1][now.x-1]) {
					System.out.println("Z" + "좌표 : " + now.x + " , " + now.y);
					now = new spot(now.y-1, now.x-1,now.cnt+1);			
//					check[now.y][now.x]=true;
//				    triangle[now.y][now.x]=now.cnt;
				} else {
					System.out.println("Y로 키 넘김");
					now = new spot(now.y+1, now.x,now.cnt+1);		
					key=1;
				}
				break;
			}		
//	    	System.out.println("X 좌표 : "+now.x + "// Y 좌표 : " + now.y);
	    }
	    check[now.y][now.x]=true;
    	triangle[now.y][now.x]=now.cnt;
    	
	    int count=0;
	    for(int i = 0 ; i < triangle.length;i++) {
	    	for(int l = 0; l<=i;l++) {
	    		answer[count]=triangle[i][l];
	    		count++;
	    	}
	    }	
	    return answer;
	}
	void xfs(int n,spot now, boolean[][] check, int[][] triangle) {
//		System.out.println("현재 좌표 : "+ (now.x)+","+(now.y) +"지금 카운트 : "+now.cnt);

		check[now.y][now.x]=true;
		triangle[now.y][now.x]=now.cnt;
		
		if(now.cnt==n*(n+1)/2) {
			return;
		}
		if(now.x+1==n||check[now.y][now.x+1]) {
//			System.err.println("대각이동 시작");
			zfs(n,new spot(now.x-1,now.y-1,now.cnt+1),check,triangle);
		} else {
//			System.out.println("x축계속감");
			xfs(n,new spot(now.x+1,now.y,now.cnt+1),check,triangle);
		}
	}
	void yfs(int n,spot now, boolean[][] check, int[][] triangle) {
//		System.out.println("현재 좌표 : "+ (now.x)+","+(now.y) +"지금 카운트 : "+now.cnt);
		check[now.y][now.x]=true;
		triangle[now.y][now.x]=now.cnt;		

		if(now.cnt==n*(n+1)/2) {
			return;
		}
		if(now.y+1==n||check[now.y+1][now.x]) {
//			System.err.println("x축이동 시작");
			xfs(n,new spot(now.x+1,now.y,now.cnt+1),check,triangle);
		} else {
//			System.out.println("y축계속감");
			yfs(n,new spot(now.x,now.y+1,now.cnt+1),check,triangle);
		}
	}
	void zfs(int n,spot now, boolean[][] check, int[][] triangle) {
//		System.out.println("현재 좌표 : "+ (now.x)+","+(now.y) +"지금 카운트 : "+now.cnt);

		check[now.y][now.x]=true;
		triangle[now.y][now.x]=now.cnt;
		if(now.cnt==n*(n+1)/2) {
			return;
		}
		
		if(check[now.y-1][now.x-1]) {
//			System.err.println("y축이동 시작");
			yfs(n,new spot(now.x,now.y+1,now.cnt+1),check,triangle);
		} else {
//			System.out.println("대각계속감");
			zfs(n,new spot(now.x-1,now.y-1,now.cnt+1),check,triangle);
		}
	}
}

/*
 import java.util.Arrays;
class Solution {
    class spot{
		spot(int x, int y, int cnt){
			this.x=x; this.y=y;this.cnt=cnt;
		}
		int x,y,cnt;
	}
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] triangle=new int[n][n];
		spot now = new spot(0,0,1);
	    boolean[][] check=new boolean[n][n];
        
	    yfs(n,now,check,triangle);
	    
	    int count=0;
	    for(int i = 0 ; i < triangle.length;i++) {
	    	for(int l = 0; l<=i;l++) {
	    		answer[count]=triangle[i][l];
	    		count++;
	    	}
	    }
        return answer;
    }
    
    void xfs(int n,spot now, boolean[][] check, int[][] triangle) {
		check[now.y][now.x]=true;
		triangle[now.y][now.x]=now.cnt;
		
		if(now.cnt==n*(n+1)/2) {return;}
		if(now.x+1==n||check[now.y][now.x+1]) {
			zfs(n,new spot(now.x-1,now.y-1,now.cnt+1),check,triangle);
		} else {
			xfs(n,new spot(now.x+1,now.y,now.cnt+1),check,triangle);
		}
	}
	void yfs(int n,spot now, boolean[][] check, int[][] triangle) {
		check[now.y][now.x]=true;
		triangle[now.y][now.x]=now.cnt;		

		if(now.cnt==n*(n+1)/2) {return;}
		if(now.y+1==n||check[now.y+1][now.x]) {
			xfs(n,new spot(now.x+1,now.y,now.cnt+1),check,triangle);
		} else {
			yfs(n,new spot(now.x,now.y+1,now.cnt+1),check,triangle);
		}
	}
	void zfs(int n,spot now, boolean[][] check, int[][] triangle) {
		check[now.y][now.x]=true;
		triangle[now.y][now.x]=now.cnt;
        
		if(now.cnt==n*(n+1)/2) {return;}
		if(check[now.y-1][now.x-1]) {
			yfs(n,new spot(now.x,now.y+1,now.cnt+1),check,triangle);
		} else {
			zfs(n,new spot(now.x-1,now.y-1,now.cnt+1),check,triangle);
		}
	}
}
 
 
 
 */






