package p99programLv2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;

public class academy092005큰수만들기 {
	TreeSet<String> find = new TreeSet<>((a,b)->b.compareTo(a));
	Stack<Integer> nums = new Stack<>();
	String answer ;
	public static void main(String[] args) {
		String number = "4177252841";

//		String number = "2154099";
		int k = 4;
		academy092005큰수만들기 go = new academy092005큰수만들기();
//		System.out.println(go.solution(number, k));
//		System.out.println(go.gg(number, k));
		System.out.println(go.ggg(number, k));
		
	}
	public String gg(String number, int k) {
		StringBuilder num = new StringBuilder();
		find.add(number);
		for (int i = 0; i < k; i++) {
			String word = find.first();
			find.clear();
			for (int l = 0; l < word.length(); l++) {
					num = new StringBuilder(word.substring(0, l) + word.substring(l + 1));
					find.add(num.toString());
					System.out.println(find);
					if (find.size() > 1) {
						find.remove(find.last());
					}
			}
		}
		return find.first();
	}

	public String ggg(String number, int k) {
		StringBuilder num = new StringBuilder();
		for(int i = 0; i < number.length();i++) {
			if(nums.size()==0) {
				nums.add(Integer.valueOf(number.substring(i,i+1)));				
				continue;
			}
			if(nums.peek()>=Integer.valueOf(number.substring(i,i+1))) {
				nums.add(Integer.valueOf(number.substring(i,i+1)));
				
			} else {
				System.err.println("k 감소" + nums.peek()+ "빠짐");
				k--;
				nums.pop();
				if(nums.size()==0||nums.peek()>=Integer.valueOf(number.substring(i,i+1))) {
					nums.add(Integer.valueOf(number.substring(i,i+1)));					
				}
			}
			System.out.println(nums);
			if(k==0) {
				return num.toString();
			}
			System.out.println(nums);
		}
		return num.toString();
	}
}
	
	








//	void bfs(String number,int length) {
//		if(number.length()==length) {
//			find.add(number);
//			return;
//		}
//		if(number.length()<length) {
//			return;
//		}
//		for(int i = 0 ; i < number.length();i++) {
//			if(!number.substring(i, i+1).equals("9")) {
//				bfs(number.substring(0, i)+number.substring(i+1),length);				
//			}
//		}
//		
//		
//	}
	
	
	
	
//	
//	public String solution(String number, int k) {
//	        answer = "";
//	        int numb =0;
//			int index = -1;
//			for(int i = 0 ; i < k;i++) {
//				if(Integer.valueOf(number.substring(i, i+1))>numb) {
//					numb= Integer.valueOf(number.substring(i, i+1));
//					index=i;
//				}
//			}
//			number=number.substring(index);
//			k-=index;
//	        findNum("",number,k);
//	        
//	        return maxNum();
//	    }
//	    void findNum(String a, String b,int k) {
//			if(!a.equals("")&&a.length()==k) {
//				num.add(b);
//	            return;
//			}
//			
//			for(int i = 0 ; i < b.length();i++) {
//				if(b.charAt(i)!='9'||b.charAt(i)!='8') {
//					findNum(a+b.charAt(i), b.substring(0, i)+b.substring(i+1), k);	
//				}
//			}
//		}
//	    String maxNum() {
//			String max = ""+Integer.MIN_VALUE;
//			for(String n : num) {
//				if(Double.valueOf(n)>Double.valueOf(max)) {
//					max = n;
//				}
//			}
//			return max;
//		}
	

