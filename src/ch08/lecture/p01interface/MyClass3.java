package ch08.lecture.p01interface;


//추상클래스로 만들거나 추상메소드를 다 재정의 해야함
public class MyClass3 implements MyInterface3{

	@Override
	public void method1() {
		System.out.println("MyClass3 method1");
	}

	@Override
	public void method2() {
		System.out.println("MyClass3 method2");
	}

	@Override
	public void method3() {
		System.out.println("MyClass3 method3");
	}

	@Override
	public void method4() {
		System.out.println("MyClass3 method4");
	}
	
}
