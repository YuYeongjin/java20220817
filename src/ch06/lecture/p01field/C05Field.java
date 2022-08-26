package ch06.lecture.p01field;

public class C05Field {
	public static void main(String[] args) {
		MyClass4 o1 = new MyClass4();
		o1.model="avante";
		o1.color="black";
		o1.age=99;
		
		MyClass4 o2 = new MyClass4();
		o2.model="sonata";
		o2.color="white";
		o2.age=88;
		
		// 생성자는 필드를 초기화하는 일을 함.
		
//		MyClass o3 = new MyClass4("tesla", "red", 77);
//		MyClass o4 = new MyClass4("kia", "blue", 66);
		
	}
}
