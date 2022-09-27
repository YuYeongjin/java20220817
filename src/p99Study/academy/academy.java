package p99Study.academy;

import java.util.*;

public class academy {
	public static void main(String[] args) {
		String s = "one4seveneightzerotwothreeeight2";
		String[] text = new String[s.length()];
		String first = "";
		String count= "";		
		List<String> result = new ArrayList<>();
		int answer = 0;
		
		for(int i = 0; i<s.length(); i++) {
			first = s.substring(i, i+1);
			if(first.equals("z")) {
				text[i]="0";
				i+=3;
			}
			if(first.equals("o")) {
				text[i]="1";
				i+=2;
			}
			if(first.equals("t")) {
				if(s.substring(i+1, i+2).equals("w")) {
					text[i]="2";
					i+=2;
				} else {
					text[i]="3";
					i+=4;
				}
			}
			if(first.equals("f")) {
				if(s.substring(i+1, i+2).equals("o")) {
					text[i]="4";
					i+=3;
				} else {
					text[i]="5";
					i+=3;
				}
			}			
			if(first.equals("s")) {
				if(s.substring(i+1, i+2).equals("i")) {
					text[i]="6";
					i+=2;
				} else {
					text[i]="7";
					i+=4;
				}
			}			
			if(first.equals("e")) {
				text[i]="8";
				i+=4;
			}			
			if(first.equals("n")) {
				text[i]="9";
				i+=3;
			}
				text[i]=s.substring(i, i+1);								
		}
		System.out.println(Arrays.toString(text));
		for(int i=0;i<text.length;i++) {
			if(text[i]!=null) {
				if(text[i].charAt(0)>47&&text[i].charAt(0)<58) {
					result.add(text[i]);											
				}
			}			
		}
		System.out.println(result);
		for(int i = 0; i<result.size();i++) {
			count+=result.get(i);
		}
		System.out.println(count);
		answer = Integer.valueOf(count);
		System.out.println(answer);
	}
}
