package p99programLv2;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;

public class academy101403연속부분수열합의개수 {
	Set<Integer> number = new HashSet<>();
	class spot{
		spot(int a, int b, int c, int len){
			this.a=a;this.b=b;this.c=c;this.len=len;
		}
		int a,b,c,len;
	}
	public static void main(String[] args) {
		academy101403연속부분수열합의개수 go = new academy101403연속부분수열합의개수();
		
		int[] elements = {7,9,1,1,4};
		
		
		for(int i = 0 ; i < elements.length; i++) {
			System.err.println("1바퀴");
			go.left(0,i,elements[i],elements);
//			go.right(0,i,elements[i],elements);
		}
		
		System.out.println(go.number.size());
	}
	void left(int len,int point,int sum, int[] elements ) {
		number.add(sum);
		if(point<=0) { 
			point=elements.length;
		}
		point--;
		if(len==elements.length-1) {
			return;
		}
		left(len+1,point,sum+elements[point],elements);
		
	}
//	void right(int len, int sum ,int[] elements) {
//		if(len>=elements.length) {
//			return;
//		}
//
//	
//	}
			
}
