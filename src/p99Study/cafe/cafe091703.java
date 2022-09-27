package p99Study.cafe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class cafe091703 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
        Set<Integer> ans = new HashSet<>();
        int[] integ = new int[101];
        int answer=0;
        for(int i = 0; i<nums.length;i++){
            if(ans.add(nums[i])!=true){
                integ[nums[i]]++;
            }
        }
        System.out.println(Arrays.toString(integ));
        for(int i = 0 ; i < integ.length;i++){
            if(integ[i]!=0){
                answer+=integ[i];
                integ[i]--;
                i=0;
            }
        }
        System.out.println(answer);
	}
}
