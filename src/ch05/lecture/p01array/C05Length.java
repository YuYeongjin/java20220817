package ch05.lecture.p01array;

public class C05Length {
	public static void main(String[] args) {
		int[] arr1 = {100, 200, 300};
		
		int[] arr2 = {9,8};
		
		int[] arr3 = {2};
		
		int[] arr4 = {};
		
		printLength(arr1) ; // 출력 : 3
		printLength(arr2) ; // 출력 : 2
		printLength(arr3) ; // 출력 : 1
		printLength(arr4) ; // 출력 : 0
		printLength(new int[] {9,8,7,6,5}); // 5	
	}
	public static void printLength(int[] num) {
		System.out.println(num.length);
	}
}
