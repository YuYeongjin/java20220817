package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
//		MyInterface1 o1 = new MyInterface1();
//		MyInterface o2 = new MyClass1();
	
		//인터페이스 구현과 객체 생성을 한번에 실행
		MyInterface1 o3 = new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("재정의한 메소드");
			}
		};
		
		o3.method1();
	
	}
}

//class MyClass1 implements MyInterface1{
//
//	@Override
//	public void method1() {
//		
//	}
//}

interface MyInterface1{
	void method1();
}