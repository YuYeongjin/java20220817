package p99Codingbat;

import java.util.*;

public class etc {
	public static void main(String[] args) {
		String s = "baabaa";
		int answer = -1;
        String b = "";
        List<String> a = new ArrayList<>();
        System.out.println("?");
        for(int i=0; i<s.length();i++){
        	if(!s.substring(i, i+1).equals(b)) {
        		a.add(s.substring(i,i+1));
        	} else {
        		a.remove(s.substring(i,i+1));
        		i=0;
        		if(a.size()<=1) {
        			break;
        		}
        	}
            b= s.substring(i,i+1);
        }
        System.out.println(a.size()==1? 1:0);
	}
}
