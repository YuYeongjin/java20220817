package ch13.lecture.p01generic;

public class C07Generic {
	public static void main(String[] args) {
		//타입 파라미터는 여러개 작성 가능
	}
}
		//타입 파라미터 작성 관습
		//대문자 1글자
		// E , K , N , T , V

		// E = element
		// K = key
		// N = number
		// T = type
		// V = value
		// S,U,V 2nd, 3nd, 4nd ...
class MyClass<T,U>{
	private T val1;
	private U val2;
	
	public void method1(T v){
		
	}
	
	public void method2(U v){
		
	}
	
	public T method3() {
		return val1;
	}
	
	public U method4() {
		return val2;
	}
	
}
