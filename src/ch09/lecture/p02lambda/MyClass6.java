package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () ->{
			int d = (int)(Math.random() * 6)+1;
			
			return d;
		};
		
		int n1 = o1.method();
		System.out.println(n1);
		
		//리턴타입이 있는 경우에 중괄호 {}를 생략할 경우 리턴도 생략해야함 이런 경우도 있다.
//		MyInterface6 o2 = () -> {
//		return (int)(Math.random()*6)+1;
//		};
		MyInterface6 o2 = () -> (int)(Math.random()*6)+1;
		
		
		System.out.println(o2.method());
	}
}

interface MyInterface6{
	int method();
}