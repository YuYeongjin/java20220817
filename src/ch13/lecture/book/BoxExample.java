package ch13.lecture.book;

public class BoxExample {
	public static void main(String[] args) {
		
		/* 656 페이지
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		*/
		// 658 페이지
		Box<String> box = new Box<String>();
		box.set("홍길동");
		String name = box.get();
		
		
	}
}
