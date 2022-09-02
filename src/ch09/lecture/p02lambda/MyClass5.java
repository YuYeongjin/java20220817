package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = a -> System.out.println(a*a); 
		
		
		o1.accept(3); //  9
		
		o1.accept(4); // 16
		
		o1.accept(10);//100		
		
		DoubleConsumer o2 = a -> System.out.println(a/2);
		
		o2.accept(5); //  2.5출력
		o2.accept(10); // 5.0출력
		o2.accept(7); //  3.5출력
	}	
}
