package p99programLv2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class home100801할인행사 {
	public static void main(String[] args) {
		home100801할인행사 go= new home100801할인행사();
		System.out.println(go.solution(new String[] {"banana", "apple", "rice", "pork", "pot"},
				new int[] {3, 2, 2, 2, 1},
				new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
	
	}
	
	public int solution(String[] want, int[] number, String[] discount) {
        Map<String,Integer> needs = new HashMap<>();
        Map<String,Integer> need = new HashMap<>();
        int answer=0;
        for(int i = 0 ; i < want.length;i++) {
        	needs.put(want[i], number[i]);
        	need.put(want[i], number[i]);
        }
        
        Queue<String> shop = new LinkedList<>();
        
        for(int i = 0 ; i < discount.length;i++) {
        	System.out.println(i+"일차");
        	if(!needs.containsKey(discount[i])) {
        		shop.clear();
        		needs=need;
        		System.err.println("원하는목록 아님 패스");
        		continue;
        	} else {
        		shop.add(discount[i]);
       			needs.put(discount[i], needs.get(discount[i])-1);
        	}
        	if(shop.size()>10) {
        		needs.put(shop.peek(), needs.get(shop.poll())+1);
        		System.err.println("10개넘어서 뺌");
        	}
        	System.out.println(shop);
        	System.out.println(needs);
        	Set<String> menu = needs.keySet();
        	int cnt=0;
        	for(String goods : menu) {
        		if(needs.get(goods)==0) {
        			cnt++;
        		}
        		if(cnt==want.length) {
        			System.out.println(i);
        			answer=i-8;
        			return answer;
        		}
        	}
        }
        Set<String> menu = needs.keySet();
        for(String goods : menu) {
    		if(needs.get(goods)!=0) {
    			return 0;
    		}
        }
        return answer;
	}
}
