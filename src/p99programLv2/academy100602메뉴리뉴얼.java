package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class academy100602메뉴리뉴얼 {
	String[] answer = {};
	Set<String> food = new HashSet<>();
	Map<String,Integer> menu = new HashMap<>();
	public static void main(String[] args) {
		academy100602메뉴리뉴얼 go = new academy100602메뉴리뉴얼();
		
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//		String[] orders = {"ABCFG", "AC", "ACB"};
		int[] course = {2,3,4};
		go.solution(orders, course);
		System.out.println(Arrays.toString(go.answer));
	}
	
	public String[] solution(String[] orders, int[] course) {
        for(int i = 0 ; i < orders.length;i++) {
        	food.clear();
        	for(int k = 0 ; k < course.length;k++) {
        		dfs("",orders[i],course[k]);      
        	}
        }
        food=menu.keySet();
        int[] max = new int[course.length];
        for(String k : food) {
        	for(int i = 0 ; i < course.length;i++) {
        		if(menu.get(k)>=max[i]&&k.length()==course[i]) {
        			max[i]=menu.get(k);
        			break;
        		}
        	}
        }
        List<String> ans = new ArrayList<>();
        for(String k : food) {
        	for(int i = 0 ; i < course.length;i++) {
        		if(menu.get(k)==max[i]&&k.length()==course[i]) {
        			ans.add(k);
        			break;
        		}
        	}
        }
        ans.sort((a,b)->a.compareTo(b));
        answer=new String[ans.size()];
        for(int i = 0 ; i < ans.size();i++) {
        	answer[i]=ans.get(i);
        }
        return answer;
	}
	
	void dfs(String a, String b,int c) {
		if(!a.equals("")&&a.length()==c) {
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
		for(int i = 0 ; i < b.length();i++) {
			dfs(a+b.substring(i, i+1),b.substring(0, i)+b.substring(i+1),c);
		}
	}
}
