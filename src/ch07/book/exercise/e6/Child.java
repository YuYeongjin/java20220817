package ch07.book.exercise.e6;

public class Child extends Parent {
	private String name;
	
	public Child() {
		// 다른 생성자 호출
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name) call");
	}
}