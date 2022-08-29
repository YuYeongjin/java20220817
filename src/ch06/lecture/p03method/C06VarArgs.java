package ch06.lecture.p03method;

public class C06VarArgs {
	public static void main(String[] args) {
		method1();
		method1(3);
		method1(3,4,5);
	}
	
	static void method1() {
		System.out.println("파라미터 없는 메소드");
	}
	static void method1(int a) {
		System.out.println("파라미터 1개 메소드");
	}
	// 가변 인자 (variable argument)
	// 같은 타입을 여러개(몇개인지 모름) 받을 경우 사용가능
	// 메소드 내에서 배열로 사용
	static void method1(int... i) {
		System.out.println("파라미터 여러개 받는 메소드");
		System.out.println(i.length);
	}
	// 가변인자는 파라미터 목록 끝에만 작성 가능
	static void method2(String s, int... i) {
		
	}
	/*
	static void method3(int... i, String s) {
	}
	*/
}
