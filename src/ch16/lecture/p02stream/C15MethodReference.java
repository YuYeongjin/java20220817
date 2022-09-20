package ch16.lecture.p02stream;

import java.util.Arrays;

public class C15MethodReference {
	public static void main(String[] args) {
		String[] arr1 = {"iron","cap","widow","hulk","panther"};
		System.out.println(Arrays.toString(arr1));
	
//		Arrays.sort(arr1,(a,b)->a.compareTo(b));
		Arrays.sort(arr1,String::compareTo); //method reference
		System.out.println(Arrays.toString(arr1));
		
				
		Arrays.sort(arr1,(a,b)->b.compareTo(a)); //사용 순서가 같을 경우에만 쓸수있음
		System.out.println(Arrays.toString(arr1));
		
		
	}
}
