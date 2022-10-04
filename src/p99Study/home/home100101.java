package p99Study.home;

import java.util.*;
public class home100101 {
	int answer ;
	public static void main(String[] args) {
		
		home100101 go = new home100101();
		go.solution(new int[] {2,1,3,2}, 2);
		System.out.println(go.answer);
	}
	
	public int solution(int[] priorities, int location) {
		Queue<Integer> print = new LinkedList<>();
		List<String> newPrint = new ArrayList<>();
		for(int i =0;i<priorities.length;i++) {
			newPrint.add("출력"+i);
		}
		print.add(priorities[0]);
		int viNum =0;
		while(!print.isEmpty()) {
			viNum=print.remove();
			
			if(viNum<)
		
		
		}
		
		
		
		
        return answer;
    }
}
