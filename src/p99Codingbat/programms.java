package p99Codingbat;

import java.util.Arrays;

public class programms {
	public static void main(String[] args) {
		long n = 10000000000L;
//		long n = 9999999999L;
		
		int[] answer = {};
        int[] a = new int[11];
        long b= n;
        int count=0;
        
        System.out.println(b);
        for(int i =0; i<a.length; i++){
            a[i]=(int)(b%10);
            b=b/10;            
        }   
        System.out.println(Arrays.toString(a));
        for(int i = 11; i>0; i--) {
        	System.out.println(a[i-1]);
        	if (a[i-1]!=0){
        		count = i;
        		break;
        	}
        }
        System.out.println(count);
        answer = new int[count];
        for(int i =0; i<answer.length; i++){
            answer[i]=(int)(n%10);
            n=n/10;            
        } 
	    System.out.println(Arrays.toString(answer));
	}
}        