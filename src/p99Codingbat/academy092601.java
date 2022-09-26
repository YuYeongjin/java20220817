package p99Codingbat;

import java.util.HashSet;
import java.util.Set;

public class academy092601 {
	String answer ;
	Set<String> num = new HashSet<>();
	public static void main(String[] args) {
		academy092601 a = new academy092601();
		String number = "41772854";
		int k =4;
		a.findNum("",number,k);
		System.out.println(a.num);
		System.out.println(a.maxNum());
	}
	void findNum(String a, String b,int k) {
		if(!a.equals("")&&a.length()==k) {
			num.add(b);
		}
		// 탈출
		if(a.length()>k)return;
		
		//반복
		for(int i = 0 ; i < b.length();i++) {
			if(b.charAt(i)!='9') {
				findNum(a+b.charAt(i), b.substring(0, i)+b.substring(i+1), k);	
			}
		}
	}
	String maxNum() {
		String max = ""+Integer.MIN_VALUE;
		for(String n : num) {
			if(Double.valueOf(n)>Double.valueOf(max)) {
				max = n;
			}
		}
		answer =max;
		return answer;
	}
	
}
