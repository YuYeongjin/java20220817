package p99Codingbat;

import java.util.Arrays;

public class home3 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer= new String[n];		
		String[][] a = new String[n][n];
		String[][] b = new String[n][n];
		String[] cc = new String[n];
		String[] dd = new String[n];
		for(int i = 0; i<arr1.length;i++) {
			cc[i] = ""+Integer.toBinaryString(arr1[i]);
			System.out.println(Arrays.toString(cc));
		}
		for(int i = 0; i<cc.length;i++) {
			for(int j=0;j<n;j++) {
				try {
					a[i][n-j-1]=cc[i].substring(cc[i].length()-1-j, cc[i].length()-j);
				}catch (Exception e){
					a[i][n-j-1]=""+0;
				} 
			}
		}		
		System.out.println(Arrays.deepToString(a));
		
		for(int i = 0; i<arr2.length;i++) {
			dd[i] = ""+Integer.toBinaryString(arr2[i]);
			System.out.println(Arrays.toString(dd));
		}
		for(int i = 0; i<dd.length;i++) {
			for(int j=0;j<n;j++) {
				try {
					b[i][n-j-1]=dd[i].substring(dd[i].length()-1-j, dd[i].length()-j);
				}catch (Exception e){
					b[i][n-j-1]=""+0;
				} 
			}
		}		
		System.out.println(Arrays.deepToString(b));
		
		
		
		
		for(int i = 0; i<a.length;i++) {
			answer[i]="";
			for(int j = 0; j<a.length;j++) {
				if(a[i][j].equals("1")||b[i][j].equals("1")) {
					answer[i]+="#";
				} else {
					answer[i]+=" ";
				}				
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
