package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "maverick";
		System.out.println(a.length());
		
		Object b = "coyote";
		//참조변수 타입에 따라서 메소드를 사용하는게 달라짐.
		//실제 메소드에 사용되는 것은 참조값활용됨.
//		System.out.println(b.length); // X
		
		String c =(String)b;
		System.out.println(c.length());
	}
}
