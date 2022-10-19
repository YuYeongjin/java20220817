package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class academy100602메뉴리뉴얼 {
	Set<String> food = new HashSet<>();
	Map<String,Integer> menu = new HashMap<>();
	Map<Character,Integer> order = new HashMap<>();
	List<String> ans = new ArrayList<>();
	public static void main(String[] args) {
		academy100602메뉴리뉴얼 go = new academy100602메뉴리뉴얼();
		
//		String[] orders = {"ABCFG", "WQEWQEWQC", "CEQWEWQDE", "WEQRWQACDE", "BCFG", "ACWQEEDEH"};
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//		String[] orders = {"ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL","ABCFGHIGKL",};
		
		int[] course = {3,4,5};
		System.out.println(go.solution(orders, course));
	}
	public List<String> solution(String[] orders, int[] course) {
		int[] max = new int[11];
		char[] ch;
		for(int i = 0 ; i < orders.length;i++) {
			if(orders[i].length()<course[0]) continue;
			ch = orders[i].toCharArray();
			for(int l = 0 ; l <ch.length;l++) {
				if(!order.containsKey(ch[l])) {
    				order.put(ch[l], 1);
    			} else {
    				order.put(ch[l], order.get(ch[l])+1);
    			}
			}
		}
		System.out.println(order);
		for(int i = 0 ; i < orders.length;i++) {
//			if(orders[i].length()<course[0]) continue;
			String input = "";
//			for(int l = 0 ; l <orders[i].length();l++) {
//				if(order.get(orders[i].charAt(l))>=course[course.length-1]) {
//					input+=orders[i].substring(l, l+1);
//					orders[i]=orders[i].substring(0, l)+orders[i].substring(l);
//				}
//			}
			food.clear();
			int len = Math.min(orders[i].length(),course[course.length-1]);
			dfs(input,orders[i],course[0],len,max);
			for(String a : food) {
				if(!menu.containsKey(a)) {
    				menu.put(a, 1);
    			} else {
    				menu.put(a, menu.get(a)+1);
    				if(max[a.length()]<menu.get(a)) {
    					max[a.length()]=menu.get(a);
    				}
    			}
			}			
		}
		
		food=menu.keySet();
        for(String k : food) {
        	if(menu.get(k)!=max[k.length()])continue;
        	for(int i = 0 ; i < course.length;i++) {
        		if(k.length()==course[i]) {
        			ans.add(k);
        			break;
        		}
        	}
        }
        ans.sort((a,b)->a.compareTo(b));
        return ans;
	}
	
	void dfs(String a, String b,int min,int max,int[] result) {
		if(a.length()>=min&&a.length()<=max) {
//			System.out.println(a);
			char[] charA = a.toCharArray();
			Arrays.sort(charA);
			a=new String(charA);
			food.add(a);
//			if(food.add(a)) {
//    			if(!menu.containsKey(a)) {
//    				menu.put(a, 1);
//    			} else {
//    				menu.put(a, menu.get(a)+1);
//    				if(result[a.length()]<menu.get(a)) {
//    					result[a.length()]=menu.get(a);
//    				}
//    			}
    			return;
//    		}
		}
		for(int i = 0 ; i < b.length();i++) {
			dfs(a+b.substring(i, i+1),b.substring(0, i)+b.substring(i+1),min,max,result);
		}
	}
//	void dfs(String a, String b,int len,int[] max) {
//		if(a.length()==len) {
//			System.out.println(a);
//			char[] charA = a.toCharArray();
//			Arrays.sort(charA);
//			a=new String(charA);
//			if(food.add(a)) {
//    			if(!menu.containsKey(a)) {
//    				menu.put(a, 1);
//    			} else {
//    				menu.put(a, menu.get(a)+1);
//    				if(max[a.length()]<menu.get(a)) {
//    					max[a.length()]=menu.get(a);
//    				}
//    			}
//    		}
//			if(a.length()>=len)
//			return;
//		}
//		for(int i = 0 ; i < b.length();i++) {
//			dfs(a+b.substring(i, i+1),b.substring(0, i)+b.substring(i+1),len,max);
//		}
//	}

}


/***************************** 현재 답안
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    Set<String> food = new HashSet<>();
    Map<String,Integer> menu = new HashMap<>();    
    public List<String> solution(String[] orders, int[] course) {
        Map<Character,Integer> order = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int[] max = new int[11];
		char[] ch;
		for(int i = 0 ; i < orders.length;i++) {
			if(orders[i].length()<course[0]) continue;
			ch = orders[i].toCharArray();
			for(int l = 0 ; l <ch.length;l++) {
				if(!order.containsKey(ch[l])) {
    				order.put(ch[l], 1);
    			} else {
    				order.put(ch[l], order.get(ch[l])+1);
    			}
			}
		}
		for(int i = 0 ; i < orders.length;i++) {
			if(orders[i].length()<course[0]) continue;
			String input = "";
			for(int l = 0 ; l <orders[i].length();l++) {
				if(order.get(orders[i].charAt(l))>=course[course.length-1]) {
					input+=orders[i].substring(l, l+1);
					orders[i]=orders[i].substring(0, l)+orders[i].substring(l);
				}
			}
			food.clear();
            int len = Math.min(orders[i].length(),course[course.length-1]);
            dfs("",orders[i],course[0],len,max);
        }
        
        food=menu.keySet();        
        for(String k : food) {
        	if(menu.get(k)!=max[k.length()]) continue;
        		for(int i = 0 ; i < course.length;i++) {
        			if(k.length()==course[i]) {
        				ans.add(k);
        				break;
        			}
        		}        	
        }
        ans.sort((a,b)->a.compareTo(b));
        return ans;
	}
	
	void dfs(String a, String b,int min,int max,int[] result) {
		if(a.length()>=min&&a.length()<=max) {
			char[] charA = a.toCharArray();
			Arrays.sort(charA);
			a=new String(charA);
			if(food.add(a)) {
    			if(!menu.containsKey(a)) {
    				menu.put(a, 1);
    			} else {
    				menu.put(a, menu.get(a)+1);
    				if(result[a.length()]<menu.get(a)) {
    					result[a.length()]=menu.get(a);
    				}
    			}
                return;
    		}
		}
		for(int i = 0 ; i < b.length();i++) {
			dfs(a+b.substring(i, i+1),b.substring(0, i)+b.substring(i+1),min,max,result);
		}
	}
}
 
 
 ****************************/































/*
class Solution {
    Set<String> food = new HashSet<>();
    Map<String,Integer> menu = new HashMap<>();
    Map<Character,Integer> order = new HashMap<>();
    List<String> set = new ArrayList<>();
    public List<String> solution(String[] orders, int[] course) {
        char[] ch;
		for(int i = 0 ; i < orders.length;i++) {
            if(orders[i].length()<course[0]) continue;
			ch = orders[i].toCharArray();
			for(int l = 0 ; l <ch.length;l++) {
				if(!order.containsKey(ch[l])) {
    				order.put(ch[l], 1);
    			} else {
    				order.put(ch[l], order.get(ch[l])+1);
    			}
			}
		}
		for(int i = 0 ; i < orders.length;i++) {
            if(orders[i].length()<course[0]) continue;
			String x = "";
			for(int l = 0 ; l <orders[i].length();l++) {
				if(order.get(orders[i].charAt(l))!=1) {
					x+=orders[i].substring(l, l+1);
				}
			}
			orders[i]=x;
		}
        for(int i = 0 ; i < orders.length;i++) {
        	food.clear();
        	if(orders[i].length()>=course[0]) {
        		int len = Math.min(orders[i].length(),course[course.length-1]);
        		dfs("",orders[i],course[0],len);
        	}
        }
        food=menu.keySet();
        int[] max = new int[course.length];
        for(String k : food) {
        	if(menu.get(k)==1)continue;
        	for(int i = 0 ; i < course.length;i++) {
        		if(k.length()==course[i]&&menu.get(k)>=max[i]) {
                    max[i]=menu.get(k);
                    set.add(k);
        			break;
        		}
        	}
        }
        List<String> ans = new ArrayList<>();
        for(String k : set) {
        	for(int i = 0 ; i < course.length;i++) {
        		if(k.length()==course[i]&&menu.get(k)==max[i]) {
        			ans.add(k);
        			break;
        		}
        	}
        }
        ans.sort((a,b)->a.compareTo(b));
        return ans;
	}
	
	void dfs(String a, String b,int min,int max) {
		if(a.length()>=min&&a.length()<=max) {
			char[] charA = a.toCharArray();
			Arrays.sort(charA);
			a=new String(charA);
			if(food.add(a)) {
    			if(!menu.containsKey(a)) {
    				menu.put(a, 1);
    			} else {
    				menu.put(a, menu.get(a)+1);
    			}
    		}
			if(a.length()>=max)
			return;
		}
		for(int i = 0 ; i < b.length();i++) {
			dfs(a+b.substring(i, i+1),b.substring(0, i)+b.substring(i+1),min,max);
		}
	}
}
*/
