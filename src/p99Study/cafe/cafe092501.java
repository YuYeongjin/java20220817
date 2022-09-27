package p99Study.cafe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class cafe092501 {
	Set<String> text = new HashSet<>();
	
	public static void main(String[] args) {
		
	cafe092501 a = new cafe092501();
//	System.out.println(a.firstSolution("4177252841",4));
//	System.out.println(a.secondSolution("1924",2));
	System.out.println(a.secondSolution("4177252841",4));
	
	}
/*
	public String firstSolution(String number, int k) {
        String answer = "";
        List<Integer> num = new ArrayList<>();
		for(int i = 0; i<number.length();i++) {
			num.add(Integer.valueOf(number.substring(i, i+1)));
		}
	
		
		for(int ans : num) {
			answer +=ans;
		}
        return answer;
    }
	*/
	public String secondSolution(String number, int k) {
        String answer = "";
        List<Integer> num = new ArrayList<>();
		for(int i = 0; i<number.length();i++) {
			num.add(Integer.valueOf(number.substring(i, i+1)));
		}

		delNum(0,0,k,answer,num);
		System.out.println(text);
        return answer;
    }
	void delNum(int index, int cnt,int k ,String word ,List<Integer> num) {
		
		if(cnt == k) {
			for(int ans : num) {
				word +=ans;
			}
			text.add(word);	
			return;
		}
		System.out.println(num);
		num.remove(index);
		cnt++;
		// 수행
		delNum(index+1,cnt,k,word,num);
	}
}
