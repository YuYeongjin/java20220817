package p99Codingbat;

import java.util.*;

public class academy091503 {
	public static void main(String[] args) {
	int[] arr = {1,3,6,10,15};
    Arrays.parallelSort(arr);
    List<Integer> ans = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    
    List<List<Integer>> answer = new ArrayList<>();
    for(int num : arr){
        ans.add(num);
    }
    for(int i=1;i<ans.size();i++) {
    	if(arr[i]-arr[i-1]<min) {
    		min=arr[i]-arr[i-1];
    	}        
    }
    
    for(int i=1;i<ans.size();i++){
    	List<Integer> two = new ArrayList<>();
        two.add(ans.get(i-1));
        two.add(ans.get(i));
        if(min==two.get(1)-two.get(0))
        answer.add(two);
    }
    System.out.println(answer);
	}
}
