package p99programLv2;

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
		System.out.println("정답" + go.ggg(number, k));
		
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
///////////////////////정답//////////////////////////////////
	public String ggg(String number, int k) {
		 	StringBuilder num = new StringBuilder();
	        Stack<Integer> nums = new Stack<>();
	        int x = 0;
			while(k!=0) {
				if(nums.size()==0||nums.peek()==9||nums.peek()>=Integer.valueOf(number.substring(x, x+1))) {
					nums.push(Integer.valueOf(number.substring(x, x+1)));
					x++;
					if(number.length()==x) {
						break;
					}
				} else {
					k--;
					nums.pop();
				}
				System.err.println(nums);
			}
			if(k>0) {
				for(int i = 0 ; i < k;i++) {
					nums.pop();
				}
			}
			for(int i = 0 ; i < nums.size();i++) {
				num.append(nums.get(i));
			}
			if(k==0&&number.length()>x) {
				for(int i =x; i<number.length();i++) {
					num.append(number.substring(i, i+1));
				}
			}
			return num.toString();
	}
}
/*
	 StringBuilder num = new StringBuilder();
        Stack<Integer> nums = new Stack<>();
		List<Integer> numList = new ArrayList<>();
		for(int i =0;i<number.length();i++) {
			numList.add(Integer.valueOf(number.substring(i, i+1)));
		}
		while(k!=0) {
			if(nums.size()==0) {
				nums.push(numList.remove(0));
			}
			if(nums.peek()>=numList.get(0)) {
				nums.push(numList.remove(0));
			} else {
				k--;
				nums.pop();
			}
			if(numList.size()==0) {
				nums.pop();
				k--;
			}
		}
		for(int i = 0 ; i < nums.size();i++) {
			num.append(nums.get(i));
		}
		if(k==0&&numList.size()>0) {
			for(int i =0; i<numList.size();i++) {
				num.append(numList.get(i));
			}
		}
		return num.toString();






*/





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
	

