package p99programlv1;

import java.util.Arrays;

public class academy100701숫자짝꿍 {
	
    StringBuilder answer = new StringBuilder();
	public static void main(String[] args) {
		academy100701숫자짝꿍 go = new academy100701숫자짝꿍();
//		System.out.println(go.solution("12321", "42531"));
//		System.out.println(go.solution("100", "2303045"));
		System.err.println(go.solution("19807650512","74805060213"));
	}
	public String solution(String X, String Y) {
		char[] xx = X.toCharArray();
		Arrays.sort(xx);
		X= new String(xx);
		
		char[] yy = Y.toCharArray();
		Arrays.sort(yy);
		Y= new String(yy);
		
		int cnt=0;
		while(cnt!=10) {
			int x1=0;
			int y1=0;
			for(int i= 0 ; i< X.length();i++) {
				if(Integer.valueOf(X.substring(i, i+1))==cnt) {
					x1++;
				} else {
					break;
				}
			}
			for(int i =0;i<Y.length();i++) {
				if(Integer.valueOf(Y.substring(i, i+1))==cnt){
					y1++;
				} else {
					break;
				}
			}
			X=X.substring(x1);				
			System.out.println("현재 인덱스는 " + cnt +"삭제할 길이 : " + x1 + "삭제 후 X는 : " + X);
			Y=Y.substring(y1);
			System.out.println("현재 인덱스는 " + cnt +"삭제할 길이 : " + y1 +  "삭제 후 Y는 : " + Y);				
			int len = Math.min(x1, y1);
			if(len>0) {
				for(int i =0;i<len;i++) {
					answer.append(cnt);		
					System.err.println(answer.toString());
				}
			}
			cnt++;
		}
		if(answer.toString().equals("")) {
			return "-1";
		}
		answer=answer.reverse();
        return answer.toString().substring(0, 1).equals("0")? "0": answer.toString();
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