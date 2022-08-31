package ch07.book.exercise.e5;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //부모 오버클래스 호출
		this.studentNo = studentNo;
	}
}
