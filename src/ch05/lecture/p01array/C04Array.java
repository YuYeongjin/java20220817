package ch05.lecture.p01array;

public class C04Array {
	public static void main(String[] args) {
		// 참조타입은 거의 == 객체 그러므로 배열도 속성과 기능이 있다.
		int[] arr1 = {9,8,7};
		
		// length 속성 (attribute, field, property)
		System.out.println(arr1.length);
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2.length);
		
		int[] arr3 = {};
		System.out.println(arr3.length);
		
		// 배열의 마지막 값은 길이보다 1 작음
		System.out.println(arr1[arr1.length-1]);
		System.out.println(arr2[arr2.length-1]);
//		System.out.println(arr3[arr3.length-1]);
		
		System.out.println("프로그램 계속 실행");
	}
}
