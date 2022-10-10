package p99programLv2;

import java.util.*;
public class home100401가장큰수 {
	String answer="";
	TreeSet<String> set = new TreeSet<>((a,b)->b.compareTo(a));
	public static void main(String[] args) {
		home100401가장큰수 go = new home100401가장큰수();
		int[] numbers = {3, 319,30, 34, 380,32,300,309,39, 54,5, 9,91,330};
//		int[] numbers = {70,0,0,0,0,0};
		String[] num = new String[numbers.length];
		for(int i = 0 ; i < numbers.length;i++) {
			num[i]= ""+numbers[i];
			go.set.add(""+numbers[i]);
		}
		System.err.println(go.set);
		Arrays.parallelSort(num, (a,b)->b.compareTo(a));
		System.out.println(Arrays.toString(num));
		for(int i = 9; i >=1;i--) {
			List<String> n = new ArrayList<>();
			int len = 0;
			
			for(int l = 0 ; l < num.length;l++) {
				if(Integer.valueOf(num[l].substring(0, 1))==i) {
					n.add(num[l]);
				}
			}
			System.out.println(n);
	
			boolean[] check = new boolean[n.size()];
			
			
			
			for(int j=0;j<n.size();j++) {
				len+=n.get(j).length();
			}
			if(len!=0) {
				go.dfs("",len,n,check);	
			}
			System.out.println(go.set);
		}


		
		
		
		
		System.out.println(go.answer);
	}
	
	
	
	
	
	
	void dfs(String s,int length, List<String> num,boolean[] check) {
		
		if(s.length()==length) {
			set.add(s);
			return;
		}
		
		for(int next = 0;next<num.size();next++) {
			dfs(s+num.remove(next),length,num,check);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	void bfs(int index, String[] num) {
//		TreeSet<String> put = new TreeSet<>();
//		Queue<Integer> q = new LinkedList<>();
//		boolean[] check = new boolean[num.length];
//		String numberS="";
//		q.add(Integer.valueOf(num[0]));
//		check[0]=true;
//		
//		
//		while(!q.isEmpty()) {
//			numberS+=q.remove();
//			
//			
//			for(int next=0;next<num.length;next++) {
//				if(check[next])continue;
//				check[next]=true;
//				q.add(Integer.valueOf(num[next]));
//			}
//		}
//		if(put.add(numberS)) {
//			System.out.println(put);
//			return;
//		} 
//	}
	
}
