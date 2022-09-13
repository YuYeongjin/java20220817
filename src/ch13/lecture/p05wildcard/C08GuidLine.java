package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C08GuidLine {
	public static void main(String[] args) {
		// PECS 
		// Produce => extends
		// Consume => super
		//슈퍼 넣는거
		//익스텐스 꺼내는거
		
		// g"e"t => "e"xtends
		// p"u"t => s"uper
		
		// in => extends
		// out => super
	}
	public static void method1(ArrayList<? extends Number> list) {
		Number n1 = list.get(0); //in , get, produce
//		list.add(3); // put // XX
	}
	
	public static void method2(ArrayList<? super Number> list) {
//		Number n1 = list.get(0); //X 
		list.add(3); //put, out, consume 
	}
}
