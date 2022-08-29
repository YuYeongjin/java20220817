package ch06.lecture.p04static;

public class MyClass2 {
	
	// (instance) field
	String name;
	
	// static field
	static String company = "topgun";
	static int rank;
	
	
	// static field 초기화 시 많은 식이 필요하면 코드블럭에~
	static {
		int a = 30;
		int b = 90;
		rank = a*b;
	}
	
	public MyClass2(String name) {
		this.name = name;
	}
}
