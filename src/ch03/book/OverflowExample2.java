package ch03.book;

public class OverflowExample2 {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x*y;
		System.out.println(z);
	}
}
