package ch09.lecture.p01nestedClass;

public class MyClass4 {
	public static void main(String[] args) {
		//추상메소드가 1개뿐이라면 = 재정의할 메소드가 1개라면 , default메소드는 많아도됌 메소드 이름을 안써도 ㄱㅊ
		//lambda expression 람다식  ->  람다 기호
		// 클래스, 메소드 시그니처 생략 가능 
		// 추상메소드가 하나인 경우만 사용가능
		MyInterface4 l = () -> {
			System.out.println("재정의한 메소드");
		};
	}
}


interface MyInterface4{
	void method();
}