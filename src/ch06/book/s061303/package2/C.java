package ch06.book.s061303.package2;

import ch06.book.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;	// default 접근 불가
//		a.field3 = 1;	// private 접근 불가
		
		a.method1();
//		a.method2();	// default 접근 불가
//		a.method3();	// private 접근 불가
	}
}
