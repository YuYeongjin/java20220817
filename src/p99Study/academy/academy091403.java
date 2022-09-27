package p99Study.academy;

public class academy091403 {
	public static void main(String[] args) {
		//사본입니다.
		/*
		int[] answer = new int[N];
		Arrays.parallelSort(stages);
	    int[] up = new int[N];
	    int count = 0;
	    int cnt = 0;
	    int down=stages.length;
	    double[] rank=new double[N];
	    for(int j = 0; j<N; j++) {
	    	for(int  i = 0; i<stages.length;i++){    	 	        
	    		if((j+1) == stages[i]){
	    			up[j]++;
	    		}
	    	}
	    	try {
	    		rank[j] = (double)up[j]/down;
	    		down -=up[j];
	    	} catch(ArithmeticException e) {
	    		rank[j]=0;
	    	}
	    }	    
	     for(int l = 0; l<stages.length;l++){
	     	if(cnt == stages[l]){
	     		count++;	     		
	     	}
	     	cnt = stages[l];
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
        return answer;
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
		
		
		
		*/
	}
}
