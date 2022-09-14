package p99Codingbat;

import java.util.Arrays;

public class academy091402 {
	public static void main(String[] args) {
		int N =5;
		int[] stages= {1,2,3,2,1};
		
		
		int[] answer = new int[N];
		Arrays.parallelSort(stages);
	    int[] up = new int[N];
	    int count=0;
	    int lv = 0;
	    int down=stages.length;
	    double[] rank=new double[N];
	    for(int j = 0; j<N; j++) {
	    	for(int  i = 0; i<stages.length;i++){	 	        
	    		if((j+1) == stages[i]){
	    			up[j]++;
	    		}
	    	}
	    	
	    	if(up[j]!=0||down!=0) {
	    		rank[j] = (double)up[j]/down;
	    		down -=up[j];	    		
	    	} else {
	    		rank[j]=0;	    		
	    	}
	    }
	   for(int i =0;i<up.length;i++) {
		   if(count<up[i]) {
			   count=up[i];
		   }		   
	   }
		    if(count==stages.length) {
		    	if(stages[0]>N) {
		    		answer[0]=1;
		    	} else {
		    		answer[0]=stages[0];
		    	}
		    	int b = 1;
		    	for(int l=1;l<N;l++){
		    		answer[l]=b;
		    		b++;
		    		if(answer[l]==answer[0]) {
		    			answer[l]=b;
		    			b++;
		    		}
		    	}
		    } else {
		    	for(int i=0; i<rank.length;i++) {
		    		int num = max(rank);
		    		answer[lv]=num+1;
		    		lv++;
		    		rank[num]=-1;
		    	}		    	
		    }
	System.out.println(Arrays.toString(answer));
    }
	 static int max(double[] a) {
		 double max = Integer.MIN_VALUE;
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
