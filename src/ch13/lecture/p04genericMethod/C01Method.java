package ch13.lecture.p04genericMethod;

public class C01Method {

	public static void main(String[] args) {
		C01Method.<String>method1("String");
		C01Method.<Integer>method1(33);

		// 메소드 타입 타라미터 생략 가능
		method1("str");
		
	}
	public static <T> void method1(T d) {
		
	}
	
	
	public static void method(Object o) {
		
	}
	public static void method(String o) {
		
	}
	public static void method(Integer o) {
		
	}
}
