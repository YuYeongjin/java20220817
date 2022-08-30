package ch06.book.exercise.e15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		System.out.println((int)(Math.pow(2,4)));
		System.out.println(1+2+5+14+5*3);
	}
}
