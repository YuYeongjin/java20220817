package ch09.lecture.p02lambda;

public class MyClass4 {
	public static void main(String[] args) {
		MyInterface4 o1 = (String s, int a) -> System.out.println(s.repeat(a));
		MyInterface4 o2 = (s, a) -> System.out.println(s.repeat(a));
		//파라미터가 2개 이상일 경우 둥근 괄호는 생략 불가
		
//		MyInterface4 o3 = s,a -> System.out.println(s.repeat(a));
		
		o1.method("top", 2);
		o2.method("java", 3);
		
	}
}

interface MyInterface4{
	void method(String s, int b);
}
