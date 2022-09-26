package p99Codingbat;

import java.util.HashSet;
import java.util.Set;

public class cafe092502 {
	Set<Integer> text = new HashSet<>();
	int answer;

	public static void main(String[] args) {
		cafe092502 a = new cafe092502();
		String numbers = "17";
		a.nu("",numbers);
		a.findNum();
		System.out.println(a.answer);
	}
	void nu(String a, String b) {
		if(!a.equals(""))
			text.add(Integer.valueOf(a));
		if(b.length()==0) {
			return;
		}
		for(int i = 0 ; i < b.length();i++) {
			nu(a+b.charAt(i),b.substring(0, i)+b.substring(i+1));
		}
	}
	void findNum() {
		for(int num : text) {
			int cnt = 0;
			for(int i = 2;i<=num;i++) {
				if(num%i!=0) {
					cnt++;
				}
				if(cnt==num-2) {
					System.out.println(num+"은 소수입니다.");
					answer++;
					break;
				}
			}
		}
	}
	
	
	
//		for(int i = 0; i<numbers.length();i++) {
//			num.add(Integer.valueOf(numbers.substring(i, i+1)));
//		}
//		a.answer=0;
//		a.dfs(0,num);
//		
//		System.out.println(a.text);
//		System.out.println(a.answer);
//		System.out.println();
////		
		/*
		List<String> nums = new ArrayList<>();
		for (int i = 0; i < numbers.length(); i++) {
			nums.add((numbers.substring(i, i + 1)));
		}
		a.answer = 0;

		a.dfss(0, 0, sum, nums);

		System.out.println(a.text);
		System.out.println(a.answer);
	}
		*/
	
//	void dfs(int index, List<Integer> num) {
//		if(index == num.size()) {
//			return;
//		}
//		for(int i = 0; i < num.size();i++) {
//			text.add(num.get(i));
//		}
//		dfs(index+1, num);
//	}
	
	/*
	void dfss(int index, int cnt, String sum, List<String> nums) {
		sum="";
		List<String> newNum = nums;
		System.out.println(newNum);
		if (index == nums.size()) {
			return;
		}
		System.out.println("실행");
		sum = newNum.remove(index);
		System.out.println("sum : " + sum);
		for(int i = 0 ; i< cnt;i++) {
			sum+=newNum.remove(0);
			text.add(Integer.valueOf(sum));
		}		
		System.out.println(text);
		dfss(index+1,cnt+1,sum,nums);
	}
	*/
//	static String dfsss(int cnt, String ans, List<String> num) {
//		ans = "";
//		List<String> newNum = num;
//		while(ans.length()!=cnt) {
//			ans+=newNum.remove(0);
//			cnt++;
//		}
//		return ans;	
//	}
	
	
	
}
