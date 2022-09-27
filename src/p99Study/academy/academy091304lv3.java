package p99Study.academy;

import java.util.Arrays;

public class academy091304lv3 {
	public static void main(String[] args) {
		int n = 40;
		int[] works = {14,15,15};
		long answer = 0;
	        
		while(n!=0){
            int iValue=0;
        	int max = Integer.MIN_VALUE;
    	    for(int i =0;i<works.length; i++){
    	        if(max<works[i]){
    	            max=works[i];
                    iValue=i;
    	        }
    	    }
    	    if(works[iValue]!=0) {
            	works[iValue]-=1;
            }
            n--;    
        }      
	    for(int k=0; k<works.length;k++){        	
	    	answer += Math.pow(works[k],2);      
	    }
	    System.out.println(answer);
	}
}
