package p99programLv2;

import java.util.ArrayList;
import java.util.List;
public class academy100601괄호회전하기 {
	int answer = 0;
	public static void main(String[] args) {
		academy100601괄호회전하기 go = new academy100601괄호회전하기();
//		String s = "}]()[{";
		String s = "[(])";
		
		int[] check =new int[3];
		go.dfs(0,s,check);
		System.err.println(go.answer);
	}
	void dfs(int index, String s,int[] check) {
		System.err.println(s+ " 시작!!!!!!!!!!!!!");
		if(index==s.length()) {
			return;
		}
		List<String> find = new ArrayList<>();
		String a = "";
		for(int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals("}")&&a.equals("{")||s.substring(i, i+1).equals(")")&&a.equals("(")||s.substring(i, i+1).equals("]")&&a.equals("[")) {
				find.remove(find.size()-1);
				System.err.println("삭제됨" +a + s.substring(i, i+1));
				if(find.size()!=0) {
					a=find.get(find.size()-1);					
				} else {
					a="";
				}
				System.err.println(a+" 변 경됨");
				
			} else {
				find.add(s.substring(i, i+1));
				a=s.substring(i, i+1);
			}
			System.out.println(a + " 그리고 " + find);
		}
		if(find.size()==0) {
			answer++;
		}
		System.out.println("결과"+find);
		
		dfs(index+1,s.substring(1)+s.substring(0, 1),check);
		
	}
}








/*
 check =new int[3];
		for(int i = 0 ; i < s.length();i++) {
			switch (s.substring(i, i+1)) {
			case "{":	check[2]++;	break;
			case "[":	check[1]++;	break;
			case "(":	check[0]++;	break;
			case "}":
				if(check[2]<=0) {
					check[2]=-999;	
				} else {
					check[2]--;	
				}
				break;
			case "]":
				if(check[1]<=0) {
					check[1]=-999;	
				} else {
					check[1]--;	
				}
				break;
			case ")":
				if(check[0]<=0) {
					check[0]=-999;	
				} else {
					check[0]--;	
				}
				break;
				
			}
		}
		System.out.println(Arrays.toString(check));
		int cnt=0;
		for(int i =0;i<3;i++) {
			if(check[i]==0) {
				cnt++;
			}
		}
		if(cnt==3) {
			answer++;
		}
 
*/