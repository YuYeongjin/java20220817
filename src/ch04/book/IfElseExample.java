package ch04.book;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 89+1;
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90점보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}
}
