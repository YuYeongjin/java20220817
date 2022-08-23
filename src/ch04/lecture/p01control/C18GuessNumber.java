package ch04.lecture.p01control;
import java.util.Scanner;
public class C18GuessNumber {
	public static void main(String[] args) {
		// 컴퓨터가 1~100 사이의 random 값을 가짐
		// 사용자가 입력값과 동일하면 종료
		// 일치하지 않으면 다른 값을 입력하라고 입력할 것.
		
		Scanner scanner = new Scanner(System.in);		

		System.out.print("1부터 100사이의 숫자를 입력하세요.");
		
		int num = (int)(Math.random()*100)+1;
		
		while(true) {
			int user = scanner.nextInt();
			// ctrl + shift + o : import 추가 하는 단축키
			
			if(user == num) {
				System.out.println("정답입니다. 프로그램종료!");
				break;
			} else if (user > num) {
				System.out.print(user+"보다 작은 수를 입력하세요.");
			} else {
				System.out.print(user + "보다 큰 수를 입력하세요.");
			}
		}		
	}
}
