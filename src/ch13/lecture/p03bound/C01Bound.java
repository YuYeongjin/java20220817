package ch13.lecture.p03bound;

public class C01Bound {
	public static void main(String[] args) {
		MyClass1<Object> o1 = new MyClass1<>();
		MyClass1<String> o2 = new MyClass1<>();
		MyClass1<Number> o3 = new MyClass1<>();
		MyClass1<Integer> o4 = new MyClass1<>();
		
		MyClass2<Number> o5 = new MyClass2<>();
		MyClass2<Integer> o6 = new MyClass2<>();
		MyClass2<Double> o7 = new MyClass2<>();
		
//		MyClass2<String> o8 = new MyClass2<>();
		
		
		
	}
}
//T 상관 없이 Object가 갖고있는 메소드전부사용 가능
class MyClass1<T>{
	public void method1(T p) {
		p.toString();
		p.equals(null);
		p.hashCode();
	}
}
// 제한된 타입 파라미터  bounded type parameter
//T를 쓰긴할건데 Number타입의 하위타입만 사용할 경우
class MyClass2<T extends Number>{
	public void method(T p) {
		p.doubleValue();
		p.intValue();
		p.byteValue();
	}
	
}