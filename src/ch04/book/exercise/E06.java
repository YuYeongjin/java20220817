package ch04.book.exercise;

public class E06 {
	public static void main(String[] args) {
		System.out.println("sysout");
		System.out.println("hello");
		System.out.println("hi");
		System.out.print("엔터 없이"); // 끝에 엔터 없음
		System.out.println(" 정말?");
		System.out.println("또 다음줄");
		System.out.println(); // 새로운 줄 만 출력
		System.out.println();
		System.out.println("위에 새로운 줄 있니?");
		
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i>0; i--) {
			for (int j = 0 ; j<i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}
	}
}
