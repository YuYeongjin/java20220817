package ch04.book.exercise;

import java.util.Scanner;

public class E07 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		int balance = 0;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
			
			balance = scanner.nextInt();
			if (balance==1) {
				System.out.print("예금액 > ");
				money += scanner.nextInt();
			} else if (balance ==2) {
				System.out.print("출금액 > ");
				money -= scanner.nextInt();
			} else if (balance==3) {
				System.out.println("잔고 > "+money);
			} else if (balance==4){
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("항목을 확인하세요.");
			}
		}	
	}
}
