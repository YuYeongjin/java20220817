package ch07.lecture.p02polymorphism;

public class C01PolyMorphism {
	public static void main(String[] args) {
		SubClass1 o1 = new SubClass1();
		//자동 형변환
		
		//표범 o2 는 새로운 흑표범;
		// subclass 는 superclass 이다.
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		SuperClass1 o4 = o1;
		
		//거꾸로는 안됨
		
		SuperClass1 o5 = new SuperClass1();
		// 표범은 얼룩무늬표범이 아님
//		SubClass1 o6 = new SuperClass1(); 
//		SubClass2 o7 = new SuperClass1();
		
//		SubClass1 o8= o4; // X > 강제로는 가능
		
	}
}
