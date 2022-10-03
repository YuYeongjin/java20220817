package p99Study.cafe;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class cafe100301kakaosort {
	public static void main(String[] args) {
		cafe100301kakaosort go = new cafe100301kakaosort();
		String[] files={"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		System.out.println(Arrays.toString(go.solution(files)));
	}
	
	
	public String[] solution(String[] files) {
        String[] answer = {};
        Map<String,Integer> map = new HashMap<>();
        int[] head = new int[files.length];
        for(int i = 0; i < files.length;i++) {
        	for(int j = 0; j< files[i].length();j++) {
        		if(files[i].charAt(j)>48&&files[i].charAt(j)<58) {
        			head[i]=j;
        			map.put(files[i], j);
        			break;
        		}
        	}
        }
        Arrays.sort(files, (a,b)->a.compareToIgnoreCase(b));
        System.out.println(map);
        String word = "";
        for(int i = 0 ; i < files.length;i++) {
        	if(files[i].substring(0, head[i]).equalsIgnoreCase(word)) {
        		System.out.println(word + " 와 동일" + files[i-1].substring(map.get(files[i-1]))+"이랑 " + files[i].substring(map.get(files[i])));
        		Arrays.sort(files, i-1,i, (a,b)->Integer.valueOf(b.substring(map.get(b)))-Integer.valueOf(a.substring(map.get(a))));
        	}
        	
        	word = files[i].substring(0, head[i]);
        }
        
        
//        System.out.println(set);
        
        	
        
        System.out.println(Arrays.toString(files));
        
        
        
        
        return answer;
    }
}

