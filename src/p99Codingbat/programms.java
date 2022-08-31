package p99Codingbat;

import java.util.Arrays;

public class programms {
	public static void main(String[] args) {
		int n = 3;
		int[] works= {1,1};
		
		long answer = 0;
        int maxWork=0;
        while(n!=0){
            maxWork=max(works);
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
	static int max(int[] a){
	    int max = 0;
	    int result = 0;
	    int l = 0;
	    for(int i =0;i<a.length; i++){
	        if(max<a[i]){
	            max=a[i];
	        }
	    }
	    for(;l<a.length;l++) {
	    	if(max==a[l]) {
	    		result = l;
	    	}
	    }
	    return result;
	}
}
