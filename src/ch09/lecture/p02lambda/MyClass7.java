package ch09.lecture.p02lambda;

public class MyClass7 {
	public static void main(String[] args) {
		MyInterface7 o1 = i -> i*2;
		int a = o1.method(9);
		System.out.println(a);
		
		MyInterface7 o2 = i -> i*i;
		int b = o2.method(10);
		System.out.println(b);
	}
}
@FunctionalInterface
// 펑션인터페이스면 추상메소드가 1개여야하므로 잡아주는 코드
interface MyInterface7{
	int method(int i);
//	int try(); //안됌
}