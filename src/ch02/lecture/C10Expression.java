package ch02.lecture;

public class C10Expression {
	public static void main(String[] args) {
		// 작은 타입과 큰 타입을 피연산자로 두고 연산하면 결과는 큰 타입
		
		int a = 99;
		long b = 100;
		
//		int c = a + b ; // X
		long d = a+b; // ok
		
		float e = 3.14F;
		double f = 3.14;
		
//		float g = e+f ; // X
		double h = e+f ; // ok
		
		int i = 9;
		double j = 10;
		
//		int k = i+j ; // X
		double l = i+j; // ok
		
		// 정수타입 (byte, short, int) 끼리 연산은 결과가 int
		
		byte m = 3;
		byte n = 4;
//		byte o = m+n//X 
		int p = m+n; //ok
		
		char q = '가';
		char r = '나';
		
//		char s = q+r; //X
		int t = q+r;  //ok
	}
}
