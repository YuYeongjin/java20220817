package p99Codingbat;

import java.util.*;

public class academy091505 {
	public static void main(String[] args) {
		String s = "fbaabbbfcbbc";
		
		String b = "";        
		List<String> a = new ArrayList<>();
		int answer = -1;
        for(int i = 0; i<s.length();i++){
        	if(b.equals(s.substring(i, i+1))){
        		a.remove(a.size()-1);
        		if(a.size()!=0){
        		    b=a.get(a.size()-1);
                }
        		continue;
        	} else {
        		a.add(s.substring(i,i+1));
        		b= s.substring(i,i+1);
        	}
        }
        if(a.size()==0) {
        	answer = 1;
        } else {
        	answer=0;
        }
        System.out.println(a);
        
        System.out.println(answer);
	}
}
