package ch06.book.s061002;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
		// static 필드를 만들면 바로 클래스 이름을 사용가능함.
		
	}
}
