package p99Study.cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cafe100101여행경로 {
	List<String> answer=new ArrayList<>();
	List<String> answerDfs=new ArrayList<>();
	static class spot {
		spot(String a, String b,int count){
			pre = a; next=b; this.count = count;
		}
		String pre, next;
		int count;
	}
	List<String> loot=new ArrayList<>();
	public static void main(String[] args) {
		String[][] tickets={{"ICN", "A"}, {"ICN", "B"}, {"B", "ICN"}};
//		String[][] tickets={{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
//		String[][] tickets={{"ICN", "AOO"}, {"AOO", "BOO"}, {"BOO", "COO"}, {"COO", "DOO"}, {"DOO", "EOO"}, {"EOO", "DOO"}, {"DOO", "COO"}, {"COO", "BOO"}, {"BOO", "AOO"}};
		cafe100101여행경로 go = new cafe100101여행경로();
		Arrays.parallelSort(tickets, (x,y)->x[1].compareTo(y[1]));
		System.out.println(Arrays.deepToString(tickets));
		
		
		go.findLoot(tickets);
		go.bfs(tickets);
		System.err.println("bfs입니다 "+go.answer);
		
		boolean[] check = new boolean[tickets.length];
		String now = "";
		int j =0;
		for(; j < tickets.length;j++) {
			if(tickets[j][0].equals("ICN")) {
				System.out.println("스타트 = " +j+ Arrays.toString(tickets[j]));
				now = tickets[j][1];
				go.answerDfs.add(tickets[j][0]);
				break;
			}
		}
		check[j]=true;
		go.dfs(0,now,tickets[j],tickets,check);
		System.err.println("dfs입니다"+go.answerDfs);
	}
	
	
	
	
	void bfs(String[][] tickets) {
		Queue<spot> run = new LinkedList<>();
		boolean[] check = new boolean[tickets.length];
		int j =0;
		for(; j < tickets.length;j++) {
			if(tickets[j][0].equals("ICN")) {
				System.out.println("스타트 = " +j+ Arrays.toString(tickets[j]));
				run.add(new spot(tickets[j][0],tickets[j][1],0));
				answer.add(tickets[j][0]);
				check[j]=true;
			}
		}
		
		while(!run.isEmpty()) {
			spot now = run.remove();
			answer.add(now.next);
			System.out.println("현재 공항" + now.next+"현재 상황 : "+answer);
			
			if(now.count+1==tickets.length) {
				System.err.println("최종도착경로찾기");
				return;
			}
			for(int i =0;i<tickets.length;i++) {
				if(tickets[i][0].equals(now.next)&&!check[i]) {
					System.out.println(i+"ㄱㄱ"+Arrays.toString(tickets[i]));
					check[i]=true;
					run.add(new spot(tickets[i][0],tickets[i][1],now.count+1));					
				}				
			}
		}
	}
	void findLoot(String[][] tickets) {
		Queue<spot> run = new LinkedList<>();
		boolean[] check = new boolean[tickets.length];
		List<String> where = new ArrayList<>();
		int j =0;
		for(; j < tickets.length;j++) {
			if(tickets[j][0].equals("ICN")) {
				where.add(tickets[j][1]);
			}
		}
		System.out.println("findLoot"+where);
//		while(!run.isEmpty()) {
//			spot now = run.remove();
//			answer.add(now.next);
//			System.out.println("현재 공항" + now.next+"현재 상황 : "+answer);
//			
//			if(now.count+1==tickets.length) {
//				System.err.println("최종도착경로찾기");
//				return;
//			}
//			for(int i =0;i<tickets.length;i++) {
//				if(tickets[i][0].equals(now.next)&&!check[i]) {
//					System.out.println(i+"ㄱㄱ"+Arrays.toString(tickets[i]));
//					check[i]=true;
//					run.add(new spot(tickets[i][0],tickets[i][1],now.count+1));					
//				}				
//			}
//		}
	}
	
	void dfs(int index,String now,String[] path,String[][] tickets, boolean[] check) {
		System.out.println("현재 공항" + now);
		now = path[1];
		answerDfs.add(now);
		if(answerDfs.size()-1==tickets.length) {
			System.err.println("최종도착");
			return;
		}
		for(int i = 0 ; i <tickets.length;i++) {
			if(tickets[i][0].equals(now)&&!check[i]) {
				index = i;
			}
		}
		System.out.println(index+"ㄱㄱ"+Arrays.toString(tickets[index]));
		check[index]=true;
		path=tickets[index];
		dfs(index,tickets[index][1],tickets[index],tickets,check);	
	}
}



/*

 void bfs(String[][] tickets,List<String> answer) {
	Queue<String> run = new LinkedList<>();
	boolean[] check = new boolean[tickets.length];
	String now = "";
	int j =0;
	for(; j < tickets.length;j++) {
		if(tickets[j][0].equals("ICN")) {
			answer.add(tickets[j][0]);
			run.add(tickets[j][1]);
			break;
		}
	}
	check[j]=true;
	
	while(!run.isEmpty()) {
		now=run.remove();
		if(answer.size()==tickets.length) {
			answer.add(now);
			return;
		}
		for(int i =0;i<tickets.length;i++) {
			if(check[i]==true) continue;
			if(!tickets[i][0].equals(now)) continue;
			check[i]=true;
			answer.add(tickets[i][0]);
			run.add(tickets[i][1]);
		}
	}
	}




*/
