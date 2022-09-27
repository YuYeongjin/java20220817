package p99Study.academy;

import java.util.*;

public class academy091504 {
	public static void main(String[] args) {
		

	int[][] items1 = {{1,1},{4,5},{3,8}};
	int[][] items2 = {{3,1},{1,5}};
	List<List<Integer>> answer = new ArrayList<>();
	
	List<Integer> two = new ArrayList<Integer>();
	
    for(int i = 0; i<items1.length;i++) {    	
    	two.add(items1[i][0]);
    	two.add(items1[i][1]);
    }
    for(int i = 0; i<items2.length;i++) {
    	two.add(items2[i][0]);
    	two.add(items2[i][1]);
    }
    
    int[] num = new int[2000];
    for(int i=0 ; i<two.size()-1;i+=2) {    	
    	num[two.get(i)]+=two.get(i+1);
    	System.out.println(i+1);
    }
    for(int i =0;i<num.length;i++) {
    	two = new ArrayList<Integer>();
    	if(num[i]!=0) {
    		two.add(i);
    		two.add(num[i]);
    		answer.add(two);
    	}
    }
    System.out.println(answer);
	}
}
