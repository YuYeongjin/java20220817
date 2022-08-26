package ch06.lecture.p03method;

public class C04Return {
	public static void main(String[] args) {
		MyClass4 o1 = new MyClass4();
		
		o1.method1();
		int a = o1.method2();
		System.out.println(a);
		System.out.println(o1.method2());
		
		long b = o1.method2();
		float c = o1.method2();
		double d = o1.method2();
		}
}
