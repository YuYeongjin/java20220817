package p99Study.home;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class home091801 {
	public static void main(String[] args) {
		int[] nums = {3,2,3,2,2,2};
		 Set<Integer> test = new HashSet<>();
		 
	        Arrays.sort(nums);
	        for(int i =0;i<nums.length;i++){
	            if(test.add(nums[i])!=true){
	                test.remove(nums[i]);
	                }
	            System.out.println(test);
	        }
	        System.out.println(test.size()==0);
	}
}
