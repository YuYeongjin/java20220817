package p99Study.home;

import java.util.HashSet;
import java.util.Set;
public class home091501 {
	public static void main(String[] args) {
		int[] arr= {100,99,19,3,7,8,10};
//		int[] arr = {2,6,8,14};
//		int[] arr = {3,100};
		int answer= 1;
		int count =0;
		int times = -1;
		int sqrt = -1;
		
		Set<Integer> find = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			count=0;
			here:for(int j=2;j<arr[i];j++) {				
				if(arr[i]%j==0) {
					find.add(j);
					find.add(arr[i]/j);
					count++;
					break here;
				}
			}
			if(count==0) {
				find.add(arr[i]);
			}
		}
		
		for(int i=0;)
		
		
//		List<Integer> list = new ArrayList<>();
//		for(int item : find) {
//			list.add(item);
//		}
//		list.sort((a,b)->a-b);
//		System.out.println(list);
//		for(int i = 0;i<list.size();i++) {
//			for(int j=i+1;j<list.size();j++) {
//				times=list.indexOf(list.get(i)*list.get(j));
//				try {
//					list.remove(times);					
//				} catch(Exception e) {
//					continue;
//				}
//			}
//		}
		
//		for(int i=list.size()-1;i>=0;i--) {
//			sqrt=list.get(i)*list.get(i);
//			if(list.contains(sqrt)) {
//				list.remove(i);
//			}
//		}
		for(int num : list) {
			answer*=num;
		}
		System.out.println(list);
		
		
		System.out.println(answer);
		}
}
