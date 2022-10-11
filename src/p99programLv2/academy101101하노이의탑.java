package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class academy101101하노이의탑 {
	public static void main(String[] args) {
		academy101101하노이의탑 go = new academy101101하노이의탑();
		System.out.println(go.solution(2));
	}
	
	public List<int[]> solution(int n) {
		int[][] answer = {};
		List<int[]> ansFirst = new ArrayList<>();
		List<int[]> ans = new ArrayList<>();
		List<int[]> ansNext = new ArrayList<>();
		
		final int[] a = {1,3};
		if(n>=1) {
			answer = new int[][] {{1,3}};
			ans.add(answer[0]);
		}
		for(int i = 2 ; i <= n; i ++ ) {
			ansFirst=new ArrayList<int[]>();
			ansNext=new ArrayList<int[]>();
			for(int k = 0 ; k<ans.size();k++) {
				int[] z=ans.get(k);
				ansFirst.add(new int[] {z[0],z[1]});
				int[] x=ans.get(k);
				ansNext.add(new int[] {x[0],x[1]});
				System.out.println(Arrays.toString(ansFirst.get(0))+Arrays.toString(ansNext.get(0)));
				System.out.println();
			}
			ans.clear();
			for(int[] item :ansFirst)  {  // 2<->3 
				System.err.println("변경 전"+Arrays.toString(item));
				if(item[0]==2) {
					item[0]=3;
				} else if(item[0]==3) {
					item[0]=2;
				}
				if(item[1]==2) {
					item[1]=3;
				} else if(item[1]==3) {
					item[1]=2;
				}
				System.err.println("변경 후"+Arrays.toString(item));
				System.out.println();
			}
			System.err.println(Arrays.toString(ansNext.get(0)));
			for(int[] items :ansNext) {  // 1<->2 
				System.err.println("변경 전"+Arrays.toString(items));
				if(items[0]==2) {
					items[0]=1;
				} else if(items[0]==1) {
					items[0]=2;
				}
				if(items[1]==2) {
					items[1]=1;
				} else if(items[1]==1) {
					items[1]=2;
				}
				System.err.println("변경 후"+Arrays.toString(items));
				System.out.println();
			}
			for(int l = 0 ; l < ansFirst.size();l++) {
				ans.add(ansFirst.get(l));
			}
			ans.add(a);
			for(int j = 0 ; j < ansNext.size();j++) {
				ans.add(ansNext.get(j));
			}
		}
		System.err.println(Arrays.deepToString(ans.toArray()));
		for(int i = 0 ; i < ans.size();i++) {
			answer=new int[ans.size()][2];
			answer[i]= ans.get(i);
		}
		return ans;
	}
}
