package ch06.lecture.p04static;

public class MyClass1 {
	// non static
	// instance field
	String name;
	
	// static field
	// class field
	static String company;
	
	// 생성자 non static
	public MyClass1(String name) {
		this.name = name;
	}
	
	// non static
	void printName() {
		System.out.println(name);
	}
	
	// static method
	// class method
	// static 은 글씨가 기울어져있음
	static void printCompany() {
		System.out.println(company);
	}
}
