package p99Study.academy;

import java.util.*;

public class academy091501 {
	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};

		 List<Integer> stone = new ArrayList<>();
	        Arrays.parallelSort(stones);
	        System.out.println(Arrays.toString(stones));
	        int weight=0;
	        for(int i = 0;i<stones.length;i++){
	            stone.add(stones[i]);
	        }
	        
	        for(int i = stones.length-1;i>=0;i--){
	        	stone.sort((a,b)->a-b);
	        	if(stone.size()<=1){
	        		break;
	        	}
	            weight = stone.get(stone.size()-1)-stone.get(stone.size()-2);
	            System.out.println("무게"+weight);
	            stone.remove(stone.size()-1);
	            System.out.println(stone);
	            stone.remove(stone.size()-1);
	            System.out.println(stone);
	            stone.add(weight);
	            System.out.println(stone);
	        }
	        System.out.println(stone);
	}
}
