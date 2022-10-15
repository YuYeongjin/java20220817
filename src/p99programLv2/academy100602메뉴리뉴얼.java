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
	List<String> set = new ArrayList<>();
	List<String> ans = new ArrayList<>();
	public static void main(String[] args) {
		academy100602메뉴리뉴얼 go = new academy100602메뉴리뉴얼();
		
		String[] orders = {"ABCFG", "WQEWQEWQC", "CEQWEWQDE", "WEQRWQACDE", "BCFG", "ACWQEEDEH"};
//		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,5};
		System.out.println(go.solution(orders, course));

	}

	
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
//		System.out.println(Arrays.toString(orders));
        for(int i = 0 ; i < orders.length;i++) {
        	food.clear();
        	if(orders[i].length()>=course[0]) {
        		int max = orders[i].length();
        		dfs("",orders[i],course[0],course[course.length-1]);
        	}
        }
        
        food=menu.keySet();
//        System.out.println(menu);
        int[] max = new int[course.length];
        for(String k : food) {
        	if(menu.get(k)==1)continue;
        	for(int i = 0 ; i < course.length;i++) {
        		if(k.length()==course[i]&&menu.get(k)>=max[i]) {
        			set.add(k);
        			max[i]=menu.get(k);
        			break;
        		}
        	}
        }
        
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
			System.out.println(a);
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





/*
class Solution {
    Set<String> food = new HashSet<>();
    Map<String,Integer> menu = new HashMap<>();
    Map<Character,Integer> order = new HashMap<>();
    public List<String> solution(String[] orders, int[] course) {
        char[] ch;
		for(int i = 0 ; i < orders.length;i++) {
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
        	for(int k = 0 ; k < course.length;k++) {
        		if(orders[i].length()>=course[k]) {
        			dfs("",orders[i],course[k]);
        		}
        	}
        }
        food=menu.keySet();
        int[] max = new int[course.length];
        for(String k : food) {
        	if(menu.get(k)==1)continue;
        	for(int i = 0 ; i < course.length;i++) {
        		if(k.length()==course[i]&&menu.get(k)>=max[i]) {
        			max[i]=menu.get(k);
        			break;
        		}
        	}
        }
        List<String> ans = new ArrayList<>();
        for(String k : food) {
        	if(menu.get(k)==1)continue;
        	for(int i = 0 ; i < course.length;i++) {
        		if(menu.get(k)==max[i]&&k.length()==course[i]) {
        			ans.add(k);
        			break;
        		}
        	}
        }
        ans.sort((a,b)->a.compareTo(b));
        return ans;
	}
	
	void dfs(String a, String b,int c) {
		if(a.length()==c) {
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
			return;
		}
		if(a.length()>c) {
			return;
		}
		for(int i = 0 ; i < b.length();i++) {
			dfs(a+b.substring(i, i+1),b.substring(0, i)+b.substring(i+1),c);
		}
	}
}
*/
