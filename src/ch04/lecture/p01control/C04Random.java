package ch04.lecture.p01control;

public class C04Random {
	public static void main(String[] args) {
		// Math.random() : 0 이상 1 미만의 double 값 리턴
		
		double a = Math.random();
		System.out.println(a);
		
		// Math.random() * 6 : 0.0 이상 6미만 double
		System.out.println(a*6);
		// (int)(Math.random()*6) : 0,1,2,3,4,5
		System.out.println((int)(a*6));
		// (int)(Math.random()*6)+1 : 1,2,3,4,5,6
		System.out.println((int)(a*6)+1);		
		// 주사위 (1~6);
		
		
 	}
}