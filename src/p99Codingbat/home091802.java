package p99Codingbat;

import java.util.Arrays;

public class home091802 {
	public static void main(String[] args) {
		int n = 500;
		 long answer = 0;
	        long[] ans = new long[n+1];
	        ans[1]=1;
	        ans[2]=2;
	        for(int i = 3; i<=n;i++){
	        	
	            ans[i]=ans[i-2]+ans[i-1];
	            if(ans[i]>1234567) {
	            	ans[i]-=1234567;
	            }
	        
	        }
	        System.out.println(Arrays.toString(ans));
	        System.out.println(ans[n]%1234567);
	}
}
