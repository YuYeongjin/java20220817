package p99Study.academy;

import java.util.HashSet;
import java.util.Set;

public class academy092601 {
	String answer ;
	HashSet<String> num = new HashSet<>();
	public static void main(String[] args) {
		academy092601 a = new academy092601();
		String number = "4177252841";
		int k =4;
		int numb =0;
		int index = -1;
		for(int i = 0 ; i < k;i++) {
			if(Integer.valueOf(number.substring(i, i+1))>numb) {
				numb= Integer.valueOf(number.substring(i, i+1));
				index=i;
			}
		}
		number=number.substring(index);
		k-=index;
		System.out.println(number+" 그리고 "+k);
		
		a.findNum("",number,k);
		System.out.println(a.num);
		System.out.println(a.maxNum());
	}
	
	
	
	void findNum(String a, String b,int k) {
		if(!a.equals("")&&a.length()==k) {
			num.add(b);
			return;
		}
		
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
