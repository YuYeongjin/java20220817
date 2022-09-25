package p99Codingbat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class cafe092502 {
	Set<Integer> text = new HashSet<>();
	int answer ;
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		cafe092502 a = new cafe092502();
		String numbers="17";
		String sum="";
		for(int i = 0; i<numbers.length();i++) {
			num.add(Integer.valueOf(numbers.substring(i, i+1)));
		}
		a.answer=0;
		a.dfs(0,num);
		
		System.out.println(a.text);
		System.out.println(a.answer);
		System.out.println();
		
		List<String> nums = new ArrayList<>();
		for(int i = 0; i<numbers.length();i++) {
			nums.add((numbers.substring(i, i+1)));
		}
		a.answer=0;
		
		a.dfss(0,0,sum,nums);
		
		System.out.println(a.text);
		System.out.println(a.answer);

	}
	
	void dfs(int index, List<Integer> num) {
		if(index == num.size()) {
			return;
		}
		for(int i = 0; i < num.size();i++) {
			text.add(num.get(i));
		}
		dfs(index+1, num);
	}
	void dfss(int index, int cnt,String sum, List<String> nums) {
		if(cnt == nums.size()) {
			return;
		}
		sum=nums.get(index);
		for(int i = 0 ; i < cnt; i++) {
			dfss(index+1, cnt,sum+nums.get(index),nums);
		}
		text.add(Integer.valueOf(sum));
		dfss(index, cnt+1,sum,nums);
	}
}
