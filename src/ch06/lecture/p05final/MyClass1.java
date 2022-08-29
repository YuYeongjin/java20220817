package ch06.lecture.p05final;

public class MyClass1 {
	// static final : 상수
	// 상수명 작성 관습 : Upper_SNAKE_CASE
	
	static final int ABC = 999;
	static final int MY_HOME_NUMBER = 333;
	static final int DEF;
	static {
		DEF = 10000;
	}
	final int a = 5;
	final int b;
	
	MyClass1(){
		b=9;
	}
	MyClass1(int b){
		this.b = b;
	}
	MyClass1(int c, int d){
		this.b = 999;
	}
}
