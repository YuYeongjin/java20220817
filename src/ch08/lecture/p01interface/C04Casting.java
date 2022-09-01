package ch08.lecture.p01interface;

import java.io.Serializable;

public class C04Casting {
	public static void main(String[] args) {
		CharSequence o1 = "topgun";
		int len = o1.length();
		char c = o1.charAt(3);
		
		// 강제 형 변환
		String o2 = (String) o1;
		byte[] bytes = o2.getBytes();
		
		//캐스팅은 프로그램을 종료시킬 수 있는 위험한 코드다.
		
		Object o3 = (Object) o1;
		Serializable o4 = (Serializable) o1;
		Comparable<String> o5 = (Comparable<String>) o1;
	}
}
