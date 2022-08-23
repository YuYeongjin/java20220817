package ch04.lecture.p01control;

public class C10For {
	public static void main(String[] args) {
		System.out.println("============================");
		for (int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
