package p99Codingbat;

import java.util.*;

public class cafe3 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,1,1},{0,2,5,1,1},{1,2,4,4,2},{1,5,1,3,1}};
		int[] moves = {1,5,3,5};
		int answer = 0;
        int[] zone = new int[moves.length];
        
        for(int i = 0; i<moves.length;i++){
            pickUp : for(int floor = 0; floor<board.length;floor++){
                if(board[floor][moves[i]-1]==0){
                    continue;
                } else {
                    zone[i]=board[floor][moves[i]-1];
                    board[floor][moves[i]-1]=0;
                    break pickUp;
                }
            }         
        }       
        System.out.println(Arrays.toString(zone));
        int doll = zone[0];
        for(int i = 1; i<zone.length; i++) {
        	if(zone[i]==0) {
        		continue;
        	} 
        	if(zone[i]==doll) {
        		System.out.println("몇번");
        		System.out.println(Arrays.toString(zone));
	        	answer+=2;
	        	zone[i]=0;
	        	zone[i-1]=0;
	        	List<Integer> dollzone = new ArrayList<>();
	        	for(int l = 0; l<zone.length;l++) {
	        		if(zone[l]!=0) {
	        			dollzone.add(zone[l]);	        			
	        		}
	        	}
	        	zone=dollzone.stream().mapToInt(Integer::intValue).toArray();
	        	i=0;
	        }
        	if(zone.length>1) {
        		doll = zone[i];	        		
        	}
        }       
        System.out.println(answer);        
	}
}
