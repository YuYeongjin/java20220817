package p99programlv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class academy100701숫자짝꿍 {
	String answer = "";
	List<String> num1 = new ArrayList<>();
	public static void main(String[] args) {
		academy100701숫자짝꿍 go = new academy100701숫자짝꿍();
//		System.out.println(go.solution("12321", "42531"));
//		System.out.println(go.solution("100", "2303045"));
		System.out.println(go.solution("100000000000421421300000000000000000000000000000000000000000000000000000", "234100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005"));		

	}
	public String solution(String X, String Y) {
		char[] xx = X.toCharArray();
		Arrays.sort(xx);
		char[] yy = Y.toCharArray();
		Arrays.sort(yy);
		
		for()
		
		List<Integer> partner = new ArrayList<>();
	    StringBuilder answer = new StringBuilder("-1");
	    List<String> num1 = new ArrayList<>();	
		for(int i =0 ; i < X.length();i++) {
			num1.add(X.substring(i, i+1));
		}
		for(int i = 0;i<Y.length();i++) {
            if(num1.size()==0) break;
			if(num1.contains(Y.substring(i, i+1))) {
				num1.remove(Y.substring(i, i+1));
				partner.add(Integer.valueOf(Y.substring(i, i+1)));
			}
		}
		partner.sort((a,b)->b-a);
        if(partner.size()!=0&&partner.get(0)==0) {
			return "0";
		}
		if(partner.size()!=0) { 
			answer=new StringBuilder("");
			for(int i =0;i<partner.size();i++) {
				answer.append(partner.get(i));
			}
		}
        return answer.toString();
	}
}

/*
 List<Integer> partner = new ArrayList<>();
	    StringBuilder answer = new StringBuilder("-1");
	    List<String> num1 = new ArrayList<>();	
		for(int i =0 ; i < X.length();i++) {
			num1.add(X.substring(i, i+1));
		}
		for(int i = 0;i<Y.length();i++) {
            if(num1.size()==0) break;
			if(num1.contains(Y.substring(i, i+1))) {
				num1.remove(Y.substring(i, i+1));
				partner.add(Integer.valueOf(Y.substring(i, i+1)));
			}
		}
		partner.sort((a,b)->b-a);
        if(partner.size()!=0&&partner.get(0)==0) {
			return "0";
		}
		if(partner.size()!=0) { 
			answer=new StringBuilder("");
			for(int i =0;i<partner.size();i++) {
				answer.append(partner.get(i));
			}
		}
        return answer.toString();
 */









/*
	public String solution(String X, String Y) {
		int[] numX = new int[10];
		int[] numY = new int[10];
		
		for(int i =0 ; i < X.length();i++) {
			numX[Integer.valueOf((X.substring(i, i+1)))]++;
		}
		System.out.println(Arrays.toString(numX));
		for(int i = 0;i<Y.length();i++) {
			if(numX[Integer.valueOf((Y.substring(i, i+1)))]>=1) {
				numY[Integer.valueOf((Y.substring(i, i+1)))]++;		
				numX[Integer.valueOf((Y.substring(i, i+1)))]--;
			}
		}
		for(int i = 9 ; i >=0 ; i--) {
			if(numY[i]>=1) {
				for(int l =0;l<numY[i];l++) {
					answer+=""+i;
				}
			}
		}
		if(answer.equals("")) {
			return "-1";
		}
		if(answer.substring(0, 1).equals("0")) {
			return "0";
		}
*/