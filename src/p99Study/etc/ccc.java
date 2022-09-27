package p99Study.etc;

import java.util.Arrays;
public class ccc {
public static void main(String[] args) {
	int N =5;
	int[] stages = {4,4,4,4};
	 int[] answer = new int[N];
	 Arrays.parallelSort(stages);
     int test = stages[0];
     int count = 0;
     int down=stages.length;
     double[] rank=new double[N];
     int i = 0;
     int a = 0;
     if(stages[0]!=1) {
    	 System.out.println("1번째 stages pass");
		 rank[0]=0;
		 a++;
		 i++;
		 count++;
	 }
     System.out.println(Arrays.toString(stages));
     for(; i<stages.length;i++){
    	 System.out.println("실행횟수 = "+(i+1)+"번째");
    	 System.out.println();
    	 
         if(test == stages[i]){
             count++;
             System.out.println("count 추가, 현재 count = " +count);
         } else {
             //랭크 다른게 생긴경우        	 
        	 System.out.println("stage변화");	             
             System.out.println("count값 ="+count);
             System.out.println("down값 ="+down);
             if(down!=0){
            	 if((stages[i]-1)!=(a-1)) {
            		 a=test;
            	 }
            		 rank[a-1] = (double)count/down;
            		 System.out.println((a)+"스테이지 실패율 = "+rank[a-1]);
            		 down -=count;
            		 a++;
            		 System.out.println("rank = "+ Arrays.toString(rank));                     	 
             }            
             for (int y = test+1; y<stages[i];y++) {
            		 rank[y-1]=0;
            		 a++;
            		 System.out.println(y+"번째 스테이지 실패율 없음");            	            	 
             }
             count=1;
        	 }
         //마지막 번호
         if(i == (stages.length-1)&&stages[i]<=N) {
        	 if(a!=0) {
	        	 rank[a-1]= (double)(count)/down;
	        	 System.out.println("마지막 실패율 = "+rank[a-1]);
	        	 System.out.println("false = "+ Arrays.toString(rank));
	         } 
         }
         System.out.println("----------------------");
         test = stages[i];	         
     }  
     // 랭크가 다똑같을경우 // 종결
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
	 }else {   	//랭크 다를경우 
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