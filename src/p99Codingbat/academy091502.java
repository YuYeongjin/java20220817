package p99Codingbat;

import java.util.*;

public class academy091502 {
	public static void main(String[] args) {
		
	int rowIndex = 4;
	 List<Integer> answer = new ArrayList<>();
	 List<List<Integer>> ans = new ArrayList<>();
	 answer.add(1);
	 ans.add(answer);
    	 for(int l= 1; l<rowIndex;l++) {
    		 List<Integer> next = new ArrayList<>();
    		 next.add(1);
    		 for(int i =1;i<answer.size();i++) {
    			 next.add(answer.get(i)+answer.get(i-1));
    		 }
    		 next.add(1);
    		 answer=next;
    		 ans.add(answer);
    	 }
     
     System.out.println(answer);
     System.out.println(ans);     
	}
}
