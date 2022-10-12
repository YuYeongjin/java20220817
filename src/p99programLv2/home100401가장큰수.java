package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class home100401가장큰수 {
	int count ;
	
	public static void main(String[] args) {
		home100401가장큰수 go = new home100401가장큰수();
		StringBuilder answer=new StringBuilder();
		int[] numbers = {3,39,303,393,330,30,1,2,4,5,6,7,8};
		
		String[] num = new String[numbers.length];
		for(int i = 0 ; i < numbers.length;i++) {
			num[i]= ""+numbers[i];
		}
		Arrays.parallelSort(num, (a,b)->a.charAt(0)-b.charAt(0));
		System.out.println(go.start(num));
		System.out.println();

		int l =num.length-1;
		for(int i = 9; i >=1;i--) {
			List<String> n = new ArrayList<>();
			
			for(; l >=0;l--) {
				if(Integer.valueOf(num[l].substring(0, 1))==i) {
					n.add(num[l]);
				} else {
					break;
				}				
			}
			if(n.size()==0) continue;
			if(n.size()==1) answer.append(n.remove(0));
			if(n.size()>1) {
				String[] numS = new String[n.size()];
				go.count=n.size();
				for(int j=0;j<n.size();j++) {
					numS[j]=n.get(j);
				}
				for(int j=0;j<numS.length;j++) {
					go.start(numS);
					go.count--;
					answer.append(numS[numS.length-j-1]);
				}				
			}			
		}
		System.out.println("정답은 "+answer);
	}

	String[] start(String[] numbers) {
		StringBuilder numSum1 = new StringBuilder();
		StringBuilder numSum2 = new StringBuilder();
		for(int cnt = 1; cnt < count;cnt++) {
			numSum1 = new StringBuilder();numSum2 = new StringBuilder();
			numSum1.append(numbers[cnt-1]).append(numbers[cnt]);
			numSum2.append(numbers[cnt]).append(numbers[cnt-1]);
			if(Integer.valueOf(numSum1.toString())>Integer.valueOf(numSum2.toString())) {
				String change = numbers[cnt-1];
				numbers[cnt-1]= numbers[cnt];
				numbers[cnt]=change;
			}
		}
		return numbers;
	}

	
	
	
// A, B 를 확인해서 AB BA중에 더 큰 방향으로 정렬하기
//	
//	String start(List<String> n) {
//		StringBuilder answer=new StringBuilder();
//		List<Integer> numl = new ArrayList<>();
//		List<Integer> numberList = new ArrayList<>();
//		for(int i = 0; i < n.size();i++) {
//			numberList.add(Integer.valueOf(n.get(i))); 
//		}
//		StringBuilder numSum1 = new StringBuilder();
//		StringBuilder numSum2 = new StringBuilder();
//		while(numberList.size()!=1) {
//			for(int i = 1; i <numberList.size();i++) {
//				numSum1.append(numberList.get(i)).append(numberList.get(i-1));
//				numSum2.append(numberList.get(i-1)).append(numberList.get(i));
//				if(Integer.valueOf(numSum1.toString())>Integer.valueOf(numSum2.toString())) {
//					
//				}
//			}
//		}
//		numl.add(numberList.remove(0));
//		for(int i = 0 ; i < numl.size();i++) {
//			answer.append(numl.get(i).toString());
//		}
//		return answer.toString();
//	}
//
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
