package ch06.book.exercise.e20;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);		
	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			} else if(selectNo==2) {
				accountList();
			} else if(selectNo==3) {
				deposit();
			} else if(selectNo==4) {
				withdraw();
			} else if(selectNo==5) {
				run=false;
				System.out.println("프로그램 종료");
			} else {
				System.out.print("선택 > ");
			}		
		}
	}
	//출금
	private static void withdraw() {
		int money = 0;
		int ownMoney = 0;
		while (true){
			System.out.print("계좌번호 > ");
			String num = scanner.next();			
			if(findAccount(num).getAno().equals(num)) {			
				ownMoney=findAccount(num).getBalance();
				System.out.print("출금액 > ");
				money = scanner.nextInt();
				findAccount(num).setBalance(ownMoney-money);
				System.out.println("결과 > 금액 "+money +"원이 출금 되었습니다.");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}		
	}
	//예금
	private static void deposit() {
		int money = 0;
		int ownMoney = 0;
		while (true){
			System.out.print("계좌번호 > ");
			String num = scanner.next();			
			if(findAccount(num).getAno().equals(num)) {			
				ownMoney=findAccount(num).getBalance();
				System.out.print("예금액 > ");
				money = scanner.nextInt();
				findAccount(num).setBalance(ownMoney+money);
				System.out.println("결과 > 금액 "+money +"원이 입금 되었습니다.");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}		
	}
	//계좌목록
	private static void accountList() {
	Account[] a = Arrays.copyOfRange(accountArray, 0, count);
		for (int i = 0; i<count; i++) {
			System.out.println(a[i].getAno()+"\t" +a[i].getOwner()+"   "+a[i].getBalance() );
		}
	}
	//계좌생성
	static int count =0;
	private static void createAccount() {		
		System.out.println("---------");
		System.out.println("계좌 생성");
		System.out.println("---------");		
		
		System.out.print("계좌 번호 > ");
		String ano = scanner.next();	
		
		System.out.print("계좌 주> ");
		String owner = scanner.next();		
		
		System.out.print("초기 입금액 > ");
		int balance = scanner.nextInt();		
		
		Account account = new Account(ano, owner, balance);
		accountArray[count]=account;
		System.out.println("결과 > 계좌가 생성되었습니다.");
		count++;
	}
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(int i = 0; i<=count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;
	}
}
