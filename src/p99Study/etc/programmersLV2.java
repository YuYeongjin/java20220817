package p99Study.etc;

import java.util.Arrays;

public class programmersLV2 {
	public static void main(String[] args) {
		 int N = 4;
		 int[] stages = {4,4,4,4};
		
		 int[] answer = new int[N];
		 Arrays.parallelSort(stages);
	     int test = stages[0];
	     int count = 0;
	     int down=stages.length;
	     double[] rank=new double[N];
	     int i = 0;
	     int a = 0;
	     System.out.println(Arrays.toString(stages));
	     for(; i<stages.length;i++){
	    	 System.out.println("실행횟수 = "+i);
	    	 System.out.println();
	         if(test == stages[i]){
	             count++;
	         } else{
	             //랭크 다른게 생긴경우
	        	 System.out.println("stage변화");	             
	             System.out.println("count값 ="+count);
	             System.out.println("down값 ="+down);
	             if(down!=0){
	                 rank[a] = (double)count/down;
	                 System.out.println(a+"번째 랭크값 = "+rank[a]);
	                 
	                 down -=count;
	                 a++;
	                 System.out.println("rank = "+ Arrays.toString(rank));
	             }
	             count=1;
	         }
	         // 랭크가 다똑같을경우
             if(count == stages.length) {
	                 answer[0]=stages[i];
	                 System.out.println("결과의 i="+i);
	                 for(int j=1;j<=i;j++){
	                     answer[j]=j;
	                 }
	         }
             //마지막 번호
             if(i == stages.length-1) {
            	 rank[a]= (double)(count)/down;
            	 System.out.println("마지막 랭크값 = "+rank[a]);
             }            
	         System.out.println("누적 count값 ="+count);
	         System.out.println("----------------------");
	         test = stages[i];
	     }
	     System.out.println(Arrays.toString(rank));
	     System.out.println(Arrays.toString(answer));
	}
}