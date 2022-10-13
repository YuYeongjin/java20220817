package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class academy1013전력망을둘로나누기 {
	int answer = 0;
	TreeSet<Integer> set = new TreeSet<>();
	Set<Integer> list = new HashSet<>();
	int count =0;
	class Spot{
		Spot(int a,int b, int cnt){
			this.first=a; this.second=b;this.cnt=cnt;
		}
		int first;int second; int cnt;
	}
	public static void main(String[] args) {
		academy1013전력망을둘로나누기 go = new academy1013전력망을둘로나누기();
		int[][] wires = new int[][] {{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
//		int[][] wires = new int[][] {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
//		int[][] wires = new int[][] {{1,2},{2,3},{3,4}};
		
		int n = 7;
		System.out.println(go.solution(n,wires));
	}
	
	public int solution(int n, int[][] wires) {
		int x =0;
        while(x!=wires.length-1) {
        	int[][] wire = new int[wires.length-1][2];
        	int idx1=0;
        	
        	for(int i = 0 ; i<wires.length;i++) {
        		if(x==i){
        			System.out.println(" 끊은 전력망 : " + wires[i][0] +" > "+ wires[i][1]);
        			continue;
        		} else{
        			wire[idx1] = wires[i];
        			idx1++;
        		}
        	}
        	System.out.println(Arrays.deepToString(wire));
        	int sum = bfs(wire);
        	System.out.println(sum);
       		set.add(Math.abs(n-sum*2));
        	System.err.println(set);
        	x++;
        }
        return set.first();
    }
	
	int bfs (int[][] wires) {
		list = new HashSet<>();
		boolean[] check = new boolean[wires.length+1];
		Spot now = new Spot(0,0,0);
		Queue<Spot> point = new LinkedList<>();
		point.add(new Spot(wires[0][0],wires[0][1],1));
		check[0]=true;
		list.add(wires[0][0]);list.add(wires[0][1]);
		
		
		while(!point.isEmpty()) {
			now = point.remove();
			for(int next= 0; next<wires.length;next++) {
				if(check[next]) continue;
				if(wires[next][0]!=now.first&&wires[next][1]!=now.first&&wires[next][0]!=now.second&&wires[next][1]!=now.second) continue;
				check[next]=true;
				if(wires[next][0]==now.second || wires[next][0]==now.first) {
					now.cnt=now.cnt+1;
					list.add(wires[next][1]); list.add(wires[next][0]);
					point.add(new Spot(wires[next][0],wires[next][1],now.cnt));					
				} else {
					now.cnt=now.cnt+1;
					list.add(wires[next][1]);	list.add(wires[next][0]);
					point.add(new Spot(wires[next][1],wires[next][0],now.cnt));
				}
			}
			System.out.println(list);
		}
		
		return list.size();
	}
}




/*
  public int solution(int n, int[][] wires) {
        int x =0;
        while(x!=wires.length-1) {
        	x++;
        	int[][] wire = new int[wires.length-1][2];
        	int idx1=0;
        	for(int i = 0 ; i<wires.length;i++) {
        		if(x==i){
        			continue;
        		} else{
        			wire[idx1] = wires[i];
        			idx1++;
        		}
        	}
        	int sum = bfs(wire);
        	set.add(Math.abs(n-sum*2));
            
        }
        return set.first();
    }
    
	int bfs (int[][] wires) {
		boolean[] check = new boolean[wires.length];
		Spot now = new Spot(0,0,0);
		Queue<Spot> point = new LinkedList<>();
		point.add(new Spot(wires[0][0],wires[0][1],1));
		check[0]=true;
		
		while(!point.isEmpty()) {
			now = point.remove();
			for(int next= 0; next<wires.length;next++) {
				if(check[next]) continue;
				if(wires[next][0]!=now.first&&wires[next][1]!=now.first&&wires[next][0]!=now.second&&wires[next][1]!=now.second) continue;
				check[next]=true;
				if(wires[next][0]==now.second || wires[next][0]==now.first) {
					now.cnt=now.cnt+1;
					point.add(new Spot(wires[next][0],wires[next][1],now.cnt));					
				} else {
					now.cnt=now.cnt+1;
					point.add(new Spot(wires[next][1],wires[next][0],now.cnt));
				}
			}
		}
		return now.cnt+1;
	}
}
 */











