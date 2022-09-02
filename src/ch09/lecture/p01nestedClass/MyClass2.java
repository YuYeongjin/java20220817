package ch09.lecture.p01nestedClass;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface2{
			@Override
			public void method() {
			System.out.println("재정의한 메소드");
			}			
		}
		//인스턴스생성
		MyInterface2 i = new LocalClass();
		i.method();
	}
}

interface MyInterface2{
	void method();
}
