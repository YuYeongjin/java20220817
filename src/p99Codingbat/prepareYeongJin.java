package p99Codingbat;

import java.util.Arrays;

public class prepareYeongJin {
	public static void main(String[] args) {
		int n = 3;
		int[] works= {1,1};
		
		long answer = 0;
        int maxWork=0;
        while(n!=0){
        	int max = 0;
    	    for(int i =0;i<works.length; i++){
    	        if(max<works[i]){
    	            max=works[i];
    	        }
    	    }
    	    maxWork = Arrays.asList(works).indexOf(max);    	
            if(works[maxWork]!=0) {
            	works[maxWork]-=1;
            }
            n--;
            System.out.println(Arrays.toString(works));          
        }               
        for(int k=0; k<works.length;k++){        	
        	answer += Math.pow(works[k],2);      
        }
        System.out.println(answer);
	}
}
