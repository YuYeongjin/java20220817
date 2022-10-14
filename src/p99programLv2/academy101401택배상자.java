package p99programLv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class academy101401택배상자 {
	
	public static void main(String[] args) {
		academy101401택배상자 go = new academy101401택배상자();
//		int[] order = {4,3,1,2,5};
		int[] order = {5,4,3,2,1};		
		System.out.println(go.solution(order));
	}
	 public int solution(int[] order) {
	        int answer = 0;
	        //인풋은 queue 보조벨트는 stack으로 풀자
	        Queue<Integer> belt = new LinkedList<>();
	        Stack<Integer> subBelt = new Stack<>();
	        for(int i = 0; i < order.length;i++) {
	        	belt.add(i+1);
	        }
	        System.out.println(belt);
	        while(belt.size()!=0) {
	        	if(order[answer]==belt.peek()) {
	        		System.out.println("벨트에서 " +belt.peek()+ " 상자실음");
	        		belt.poll();
	        		answer++;
	        	} else if (!subBelt.isEmpty()&&subBelt.peek()==order[answer]) {
	        		System.out.println("보조벨트에서 " +subBelt.peek()+ " 상자실음");
	        		subBelt.pop();
	        		answer++;
	        	} else {
	        		subBelt.push(belt.poll());	
	        	}	        		
	        }
	        while(!subBelt.isEmpty()&&subBelt.peek()==order[answer]){
	        	answer++;
	        	subBelt.pop();
	        }
	        return answer;
	    }
	
}
