package ch05.book.exercise;

public class E07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array= {10,5,3,8,2};
		/*
		// 내 풀이 ( 0번 인덱스가 관여를 안함 )
		for(int i = 1; i<array.length; i++) {
			max = array[i];
			if(array[i]<array[i-1]) {
				max = array[i-1];
			}
		}
		*/		
		// 강사님 풀이
		for(int i = 0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		// 최소값
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("max : "+ max);
		System.out.println("min : "+ min);
	}
}
