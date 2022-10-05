package p99programLv2;

import java.util.*;
public class home100101프린터 {
	int answer ;
	public static void main(String[] args) {
		
		home100101프린터 go = new home100101프린터();
		go.solution(new int[] {2,1,3,2,4,5,1}, 4);
		System.out.println(go.answer);
	}
	
	public int solution(int[] priorities, int location) {
		Queue<Integer> print = new LinkedList<>();
		List<String> newPrint = new ArrayList<>();
		List<Integer> printP = new ArrayList<>();
		int myP=0;
		for(int i =0;i<priorities.length;i++) {
			newPrint.add("출력"+i);
			print.add(priorities[i]);
			printP.add(priorities[i]);
		}
		
		System.out.println(print);
		System.out.println(newPrint);
		System.out.println(printP);	
		
		
//		System.out.println("시작하자");
		while(location!=Integer.valueOf(newPrint.get(0).substring(2))) {
			int j = print.peek();
			int maxP =-1;
			for(int i =0;i<printP.size();i++) {
				if(j<printP.get(i)) {
					j=printP.get(i);
					maxP=i;
				}
			}
//			System.out.println("최대값의 index위치"+maxP);
			for(int i=0;i<maxP;i++) {
				print.offer(print.poll());
				newPrint.add(newPrint.remove(0));
				printP.add(printP.remove(0));
			}
//			System.err.println("출력직전");
//			System.out.println(print);
//			System.out.println(newPrint);
//			System.out.println(printP);			
			answer++;
			print.remove();
			printP.remove(0);
			myP=Integer.valueOf(newPrint.get(0).substring(2));
			if(myP==location) {
				return answer;
			}
			newPrint.remove(0);
			System.err.println("출력직후");

			System.out.println(print);
			System.out.println(newPrint);
			System.out.println(printP);
		}
		System.out.println("나옴");
        return answer;
    }
}
