package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C02polymorphism {
	String s1 = "java";
	Object s2 = "hi";
	
	// Object 아래에 스트링, 스캐너가 있으므로 오브젝트는
	// 스트링, 스캐너는 될 수 없고
	// 스트링, 스캐너는 오브젝트가 될 수 있다.
//	String s3=s2; //x
	
	Scanner scanner = new Scanner("");
	Object s4 = scanner;
	Object s5 = new Scanner("hello");
}
