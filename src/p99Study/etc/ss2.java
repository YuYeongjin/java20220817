package p99Study.etc;

import java.util.Arrays;

public class ss2 {
public static void main(String[] args) {
	int N =5;
	int[] stages = {1,4,4,4,6,6,6};
	 int[] answer = new int[N];
	 Arrays.parallelSort(stages);
     int test = stages[0];
     int count = 0;
     int down=stages.length;
     double[] rank=new double[N];
     int i = 0;
//     if(stages[0]!=1) {
//		 rank[0]=0;
//		 i++;
//		 count++;
//	 }
     int time = 1;
    while(time!=N){
    	if(stages[i]==time) {
    		count++;
    	} else if(stages[i]==time+1) {
    		if(stages[i]==2) {
    			rank[0]=0;
    		} else {
    		rank[time-1]=(double)(count/down);
    		down-=count;
    		count =1;
    		time++;
    		}
    	}
    	i++;
    	System.out.println(Arrays.toString(rank));    	
    }
}}
     
     
     /*
     for(; i<stages.length;i++){
         if(test == stages[i]){
             count++;
         } else {
             if(down!=0){
                 rank[stages[i]-2] = (double)count/down;
                 down -=count;
             }             
             if ((test+1)!=stages[i]){
            	 rank[stages[i]-2]=0;
             }
             count=1;
        	 }
         if(i == (stages.length-1)&&stages[i]<=N) {
        	 rank[stages[i]-1]= (double)(count)/down;
         }     
         test = stages[i];	         
     }  
    */
     
     /*
     
     if(count == stages.length) {
    	 answer[0]=stages[0];
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
    		 copy[m]=(int)(rank[m]*10000);
    	 }
    	 System.out.println(Arrays.toString(copy));
    	 for(int k = 0; k<rank.length;k++) {
	    	 findNum = max(copy);
	    	 answer[k]=findNum+1;
	    	 copy[findNum]=-1;	    	 
	     }
     }
     System.out.println("정답" + Arrays.toString(answer));
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