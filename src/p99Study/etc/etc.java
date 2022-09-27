package p99Study.etc;

import java.util.*;

import javax.swing.event.ListSelectionEvent;

public class etc {
	public static void main(String[] args) {
		String s = "baabaababbabcbbabbacc";
        String b = s.substring(0, 1);
        int answer = -1;
        List<String> a = new ArrayList<>();
        for(int i=1; i<s.length();i++){
        	if(b.equals(s.substring(i, i+1))) {
        		a.remove(s.substring(i-1, i));
        	} else {
        		a.add(b);
        		i=1;
        		b = s.substring(0, 1);
        		System.out.println(a);
        	}
        	b= s.substring(i,i+1);
        	System.out.println("실행중");
        }
        System.out.println(a);
        System.out.println(answer);
	}
}



/*
 for(int i=0; i<s.length();i++){
        	if(!s.substring(i, i+1).equals(b)) {
        		System.out.println("추가예정"+a);
        		a.add(s.substring(i,i+1));
        		System.out.println("추가완료"+a);
        	} else {
        		System.out.println("제거예정"+a);
        		a.remove(s.substring(i,i+1));
        		System.out.println("제거완료"+a);
        		i=0;
        		if(a.size()<=1) {
        			break;
        		}
        	}
            b= s.substring(i,i+1);
        }
 */