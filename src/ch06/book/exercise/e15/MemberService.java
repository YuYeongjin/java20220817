package ch06.book.exercise.e15;

public class MemberService {
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password) {
		return (id.equals(this.id)&&password.equals(this.password));
	}
	void logout(String id) {
		if(id.equals(this.id)) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
