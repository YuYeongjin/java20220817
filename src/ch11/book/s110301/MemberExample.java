package ch11.book.s110301;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1번과 obj2번은 동등합니다.");
		} else {
			System.out.println("obj1번과 obj2번은 동등하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1번과 obj3번은 동등합니다.");
		} else {
			System.out.println("obj1번과 obj3번은 동등하지 않습니다.");
		}
	}
}
