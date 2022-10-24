package ch16.lecture.book;

public class Student {
	private String name;
	private int age;
	private String sex;
	private String live;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public String getLive() {
		return live;
	}
	public Student(String name, int age, String sex, String live) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.live = live;
	}
	

}
