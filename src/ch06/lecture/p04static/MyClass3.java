package ch06.lecture.p04static;

public class MyClass3 {
	// instance field
	String name;
	
	// static field
	static String company = "topgun";
	
	// static method
	static void printCompany() {
		// static member는 instance member에 접근할 수 없음
//		System.out.println(this.company); // static한 방법이 아니므로 안됌
		System.out.println(company);
	}
	
	public MyClass3(String name) {
		this.name=name;
	}
	
	// instance method
	void printName() {
		System.out.println(this.name);
	}
	
	void showCompany() {
		// instance member에서 static member 접근 가능
		System.out.println(company);
	}
	void someInstanceMethod() {
		// this 는 instance member 접근시 사용 가능
		System.out.println(this.name);
		this.printName();
		printName();
	}
}
