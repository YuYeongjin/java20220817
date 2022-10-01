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
	public static void main(String[] args) {
//		String[][] tickets={{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[][] tickets={{"ICN", "AOO"}, {"AOO", "BOO"}, {"BOO", "COO"}, {"COO", "DOO"}, {"DOO", "EOO"}, {"EOO", "DOO"}, {"DOO", "COO"}, {"COO", "BOO"}, {"BOO", "AOO"}};
		cafe100101여행경로 go = new cafe100101여행경로();
		Arrays.parallelSort(tickets, (x,y)->x[1].compareTo(y[1]));
		System.out.println(Arrays.deepToString(tickets));
		
//		go.bfs(tickets);
//		System.out.println(go.answer);
		
		boolean[] check = new boolean[tickets.length];
		String now = "";
		int j =0;
		for(; j < tickets.length;j++) {
			if(tickets[j][0].equals("ICN")) {
				System.out.println("스타트 = " +j+ Arrays.toString(tickets[j]));
				now = tickets[j][1];
				go.answerDfs.add(now);
				break;
			}
		}
		check[j]=true;
		go.dfs(0,now,tickets[j],tickets,check);
		System.out.println(go.answerDfs);
	}
	
//	void bfs(String[][] tickets) {
//		Queue<spot> run = new LinkedList<>();
//		boolean[] check = new boolean[tickets.length];
//		int j =0;
//		for(; j < tickets.length;j++) {
//			if(tickets[j][0].equals("ICN")) {
//				System.out.println("스타트 = " +j+ Arrays.toString(tickets[j]));
//				run.add(new spot(tickets[j][0],tickets[j][1],0));
//				answer.add(tickets[j][0]);
//				break;
//			}
//		}
//		check[j]=true;
//		
//		while(!run.isEmpty()) {
//			spot now = run.remove();
//			answer.add(now.next);
//			System.out.println("현재 상황 : "+answer);
//			
//			System.out.println("현재 공항" + now.next);
//			
//			if(now.count+1==tickets.length) {
//				System.err.println("최종도착");
//				return;
//			}
//			for(int i =0;i<tickets.length;i++) {
//				if(!tickets[i][0].equals(now.next)) continue;
//				if(check[i]) continue;
//				System.out.println(i+"ㄱㄱ"+Arrays.toString(tickets[i]));
//				check[i]=true;
//				run.add(new spot(tickets[i][0],tickets[i][1],now.count+1));
//				
//			}
//		}
//	}
	/*
	void bfs(String[][] tickets) {
		Queue<String> run = new LinkedList<>();
		boolean[] check = new boolean[tickets.length];
		String now = "";
		int j =0;
		for(; j < tickets.length;j++) {
			if(tickets[j][0].equals("ICN")) {
				System.out.println("스타트 = " +j+ Arrays.toString(tickets[j]));
				answer.add(tickets[j][0]);
				run.add(tickets[j][1]);
				break;
			}
		}
		check[j]=true;
		
		while(!run.isEmpty()) {
			System.out.println("현재 상황 : "+answer);
			now=run.remove();
			answer.add(now);
			
			System.out.println("현재 공항" + now);
			
			if(answer.size()==tickets.length) {
				System.err.println("최종도착");
				answer.add(now);
				return;
			}
			for(int i =0;i<tickets.length;i++) {
				
				if(check[i]) continue;
				if(!tickets[i][0].equals(now)) continue;
				System.out.println(i+"ㄱㄱ"+Arrays.toString(tickets[i]));
				check[i]=true;
				run.add(tickets[i][1]);
			}
		}
	}
	*/
	
	
	
	void dfs(int index,String now,String[] path,String[][] tickets, boolean[] check) {
		System.out.println("현재 공항" + now);
		now = path[0];
		answerDfs.add(now);
		if(answerDfs.size()==tickets.length) {
			System.err.println("최종도착");
			answerDfs.add(now);
			return;
		}
		
		for(int i =0;i<tickets.length;i++) {
			Arrays.parallelSort(tickets, (x,y)->y[1].compareTo(x[1]));
			if(tickets[i][0].equals(now)&&!check[i]) {
			System.out.println(i+"ㄱㄱ"+Arrays.toString(tickets[i]));
			check[i]=true;
			path=tickets[i];
			dfs(i,tickets[i][1],tickets[i],tickets,check);
			}
		}
		
	
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
