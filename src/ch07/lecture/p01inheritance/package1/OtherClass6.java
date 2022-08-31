package ch07.lecture.p01inheritance.package1;

public class OtherClass6 {
	public void someMethod() {
		SuperClass6 o1= new SuperClass6();
//		o1.privateMethod(); //X
		o1.packageprivateMethod();
		o1.protectedMethod();
		o1.publicMethod();
	}
}
