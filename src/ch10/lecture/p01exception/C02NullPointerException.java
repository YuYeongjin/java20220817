package ch10.lecture.p01exception;

public class C02NullPointerException {
	public static void main(String[] args) {
		String a = "topgun";
		//가리키는 instance가 없는 경우
		String b = null;

		System.out.println(a.length());
		System.out.println(b.length()); //NullPointerException
		
		System.out.println("프로그램 종료");
	}
	
}
