package p99Study.academy;

import java.util.Arrays;

public class academy092304 {
	public static void main(String[] args) {
		int n = 7;
		
		int[] arr = new int[n];
		arr[0]=1;
		arr[1]=2;
		
		for(int i = 2 ; i < n ; i++) {
			arr[i]= arr[i-2]+arr[i-1];
			if(arr[i]>1000000007) {
				arr[i]-=1000000007;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
