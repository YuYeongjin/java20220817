package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b = a;
		
		System.out.println(b[2]);
		
		a = new int[] {9,8,7};
		
		System.out.println(b[2]);
	}
}
