package p99Codingbat;
import java.util.Arrays;

public class lv2 {
public static void main(String[] args) {
	int N =5;
	int[] stages = {2,1,4,2,3,3,1,1,6,6,1,3,4};
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
    	 System.out.println("실행횟수 = "+(i+1)+"번째");
    	 System.out.println();
         if(test == stages[i]){
             count++;
         } else {
             //랭크 다른게 생긴경우
        	 System.out.println("stage변화");	             
             System.out.println("count값 ="+count);
             System.out.println("down값 ="+down);
             if(down!=0){
                 rank[a] = (double)count/down;
                 System.out.println((a+1)+"스테이지 랭크값 = "+rank[a]);
                 down -=count;
                 a++;
                 System.out.println("rank = "+ Arrays.toString(rank));
             }
             if ((test+1)!=stages[i]){
            	 System.out.println(stages[i]-1+"번째 스테이지 패스");
            	 rank[a]=0;
            	 a++;
             }
             count=1;
         } 
         //마지막 번호
         if(i == (stages.length-1)&&stages[i]<=N) {
        	 rank[a]= (double)(count)/down;
        	 System.out.println("마지막 랭크값 = "+rank[a]);
        	 System.out.println("rank = "+ Arrays.toString(rank));
         }            
         
         System.out.println("누적 count값 ="+count);
         System.out.println("----------------------");
         test = stages[i];	         
     }
     
     
     // 랭크가 다똑같을경우 // 종결
     if(count == stages.length) {
    	 answer[0]=stages[i];
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
    	 for (int m =0;m<copy.length;m++) {
    		 rank[m]*=10000;
    		 copy[m]=(int)rank[m];
    	 }
    	 int[] copyAns = copy;
	     for(int k = 0; k<rank.length;k++) {
	    	 Arrays.parallelSort(copy);
	    	 int findAns = Arrays.binarySearch(copyAns,max(copy));
	    	 answer[k]=findAns;
	    	 copy[Arrays.binarySearch(copy,max(copy))]=-1;
	     }
	     
     }
     System.out.println("정답" + Arrays.toString(answer));
}
 static int max(int[] a) {
	 int max = Integer.MIN_VALUE;
	 for(int l = 0; l<a.length;l++) {
    	 if(a[l]>max) {
    		 max = a[l];
    	 }
     }
	 return max;
 }
}
