package p99Study.academy;
import java.util.*;
import java.util.stream.*;
public class academy091601 {
	public static void main(String[] args) {
//		int[] arr= {100,99,19,3,7,8,10};
		int[] arr = {2,6,8,14,13};
//		int[] arr = {3,100};
		int answer= 1;
		int max = Integer.MIN_VALUE;
		int[] number = new int[100];
		int[][] findNum = new int[arr.length][100];
		List<Integer> ans = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for(int i = 0 ; i < arr.length;i++) {			
			int j=2;
			while(arr[i]!=1) {
				if(arr[i]%j==0) {
					arr[i]/=j;
					findNum[i][j]++;
					j=1;
				}
				j++;
			}			
		}
		System.out.println(Arrays.deepToString(findNum));
		for(int j = 0; j<100;j++) {
			max = 0;
			for(int i = 0 ; i < findNum.length;i++) {
				if(findNum[i][j]>max) {
					max=findNum[i][j];
				}
			}
			number[j]=max;
		}
		System.out.println(Arrays.toString(number));		
		
		for(int i= 0;i<number.length;i++ ) {
			if(number[i]!=0) {
				answer *= (int)Math.pow(i, number[i]);
			}
		}		
		System.out.println(answer);
		
		/*
		for(int i=0;i<arr.length;i++) {
			int j=2;
			while(arr[i]!=1) {
				if(arr[i]%j==0) {
					arr[i]/=j;
					number[j]++;
					j=1;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(number));
		*/
		
//		for(int i=0;)
		
		
//		List<Integer> list = new ArrayList<>();
//		for(int item : find) {
//			list.add(item);
//		}
//		list.sort((a,b)->a-b);
//		System.out.println(list);
//		for(int i = 0;i<list.size();i++) {
//			for(int j=i+1;j<list.size();j++) {
//				times=list.indexOf(list.get(i)*list.get(j));
//				try {
//					list.remove(times);					
//				} catch(Exception e) {
//					continue;
//				}
//			}
//		}
		
//		for(int i=list.size()-1;i>=0;i--) {
//			sqrt=list.get(i)*list.get(i);
//			if(list.contains(sqrt)) {
//				list.remove(i);
//			}
//		}
		
		
		}
}
