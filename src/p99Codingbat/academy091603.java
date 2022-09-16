package p99Codingbat;
import java.util.*;
public class academy091603 {
	public static void main(String[] args) {
		int[] citations = {4,4,4};
		int answer = Integer.MIN_VALUE;
		Arrays.parallelSort(citations);
		int[] min = new int[10001];
		
		for(int i =0; i<min.length;i++) {
			int[] find = new int[3];
			int a = Integer.MAX_VALUE;
			int countSmall = 0;
			int count = 0;
			for(int j = 0;j<citations.length;j++) {
				if(i<=citations[j]) {
					count++;
				}
			}
			countSmall= count;
			for(int j = 0;j<citations.length-count;j++) {
				if(i<citations[j]) {
					countSmall=citations[j]-i;
				}
			}
			find[0]= i;
			find[1]= count;
			find[2]= countSmall;
			for(int num : find) {
				if(a>num) {
					a=num;
				}
			}
			min[i]=a;
		}		
		for(int l = 0; l<min.length;l++) {
			if(answer <min[l]) {
				answer = min[l];
			}
		}
		System.out.println(answer);
	}
}
