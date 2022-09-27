package p99Study.academy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//리트코드
public class academy092004 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,2};		
		int[] nums2 = {3,2,3,2,2,2};
	
		System.out.println(find1748(nums));
		System.out.println(find1512(nums2));
		System.out.println(find2206(nums2));
		
		
	}
	
	public static int find1748(int[] nums) {
		int answer = 0;
		
		List<Integer> ans = Arrays.stream(nums).boxed().collect(Collectors.toList());
		answer = ans.stream()
				.collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()==1)
				.mapToInt(e->e.getKey())
				.sum();
		return answer;
	}
	
	public static int find1512(int[] nums) {
		int answer = 0;
		
		List<Integer> ans = Arrays.stream(nums).boxed().collect(Collectors.toList());
		answer = ans.stream()
				.collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()>=2)
				.mapToInt(e->(int)((e.getValue()-1)*e.getValue()/2))
				.sum();
		return answer;
	}
	public static boolean find2206(int[] nums) {
		long answer = 0;
		
		List<Integer> ans = Arrays.stream(nums).boxed().collect(Collectors.toList());
		answer = ans.stream()
				.collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue()%2==0&&e.getValue()!=0)
				.mapToLong(x->Long.valueOf(x.getValue()))
				.sum();
				
		return answer==ans.size();
	}
}
