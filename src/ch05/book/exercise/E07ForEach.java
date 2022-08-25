package ch05.book.exercise;

public class E07ForEach {
	public static void main(String[] args) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		int[] array= {10,5,3,8,2};
		
		
		// 최대값
		for(int x : array) {
			if(max<x) {
				max = x;
			}
		}
		System.out.println("Max = " + max);
		
		// 최소값
		
		for (int x : array) {
			if(min>x) {
				min=x;
			}
		}
		System.out.println("Min = "+min);
	}
}
