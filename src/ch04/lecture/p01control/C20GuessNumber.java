package ch04.lecture.p01control;

import java.util.Scanner;

public class C20GuessNumber {
	public static void main(String[] args) {
		
		int user= 0;
		int com = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.print("(1~100) 입력 : ");
		user = scanner.nextInt();
		if (com==user) {
			System.out.println("정답");
		} else if (com> user) {
			System.out.println(user+"보다 큰 수 입력하세요");
		} else {
			System.out.println(user+"보다 작은 수 입력하세요");
		}
		} while(com != user );
	}
}
