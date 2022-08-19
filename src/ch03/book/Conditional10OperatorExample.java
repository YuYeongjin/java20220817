package ch03.book;

public class Conditional10OperatorExample {
	public static void main(String[] args) {
		int score = 90;
		char grade = (score>90)? 'A' : ((score>80)? 'B' : 'C' );
		System.out.println(score +" 점은 " + grade + " 등급입니다.");
	}
}
