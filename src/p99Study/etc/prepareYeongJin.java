package p99Study.etc;

public class prepareYeongJin {
	public static void main(String[] args) {
		int n = 4;
		int[] works= {4,3,3};
		
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
