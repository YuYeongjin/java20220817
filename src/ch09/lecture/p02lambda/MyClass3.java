package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> System.out.println(s);
		
		o1.method("hello");
		o1.method("java");
		
		//파라미터 목록만 쓰면 된다
		MyInterface3 o2 = (s) -> System.out.println(s.repeat(2));
		
		o2.method("top");
		o2.method("gun");
		
		//파라미터 1개일때만 둥근괄호 ()도 생략 가능
		MyInterface3 o3 = s -> System.out.println(s.repeat(3));
		
		o3.method("coyote");
		o3.method("bob");
	}
}

interface MyInterface3{
	void method(String s);
}
