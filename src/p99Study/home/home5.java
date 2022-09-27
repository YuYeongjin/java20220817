package p99Study.home;
import java.util.Arrays;

public class home5 {
	class Solution {
	    public int[] solution(int N, int[] stages) {
	    int[] answer = new int[N];
		Arrays.parallelSort(stages);
	    int test = stages[0];
	    int count = 0;
	    int down=stages.length;
	    double[] rank=new double[N];
	    int i = 0;
	    int a = 0;

	     for(; i<stages.length;i++){    	 
	         if(test == stages[i]){
	             count++;
	         } else {
	             if(down!=0){
	            	 if((stages[i]-1)!=(a-1)) {
	            		 a=test;
	                 }
	            		 rank[a-1] = (double)count/down;
	            		 down -=count;
	            		 a++;         		 
	            	 
	             }             
	             for (int y = test+1; y<stages[i];y++) {
	            		 rank[y-1]=0;
	            		 a++;    
	             }
	             count=1;
	        	 }         
	         if(i == (stages.length-1)&&stages[i]<=N) {
	             if(a!=0){
	        	 rank[a-1]= (double)(count)/down;
	            }
	         }             
	         test = stages[i];	         
	     }  
	     if(count == stages.length) {
	    	 if(stages[0]>N) {
	    		 answer[0]=1;
	    	 } else {
	    		 answer[0]=stages[0];    		 
	    	 }
	    	 int b = 1;
	    	 for(int j=1;j<N;j++){
	    		 answer[j]=b;
	    		 b++;
	    		 if(answer[j]==answer[0]) {
	    			 answer[j]=b;
	    			 b++;
	    		 }
	    	 } 
	     } else {   	
	    	 int[] copy = new int[rank.length];
	    	 int findNum=0;
	    	 for (int m =0;m<copy.length;m++) {
	    		 copy[m]=(int)(rank[m]*200000);
	    	 }
	    	 for(int k = 0; k<rank.length;k++) {
		    	 findNum = max(copy);
		    	 answer[k]=findNum+1;
		    	 copy[findNum]=-1;	    	 
		     }
	     }
	     return answer ;
	}
	 static int max(int[] a) {
		 int max = Integer.MIN_VALUE;
		 int l = 0;
		 int ans = 0;
		 for(; l<a.length;l++) {
	    	 if(a[l]>max) {
	    		 max = a[l];
	    	 }
	     }
		 for(int s = a.length-1; s>=0;s--) {
			 if(max == a[s]) {
				 ans=s;
			 }
		 }
		 return ans;
	 }
	}
}
