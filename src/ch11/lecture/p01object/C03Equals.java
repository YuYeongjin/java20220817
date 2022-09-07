package ch11.lecture.p01object;

// extends Object 생략가능 항상 되어있음
public class C03Equals extends Object {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b1));
		System.out.println(b2.equals(b2));
		System.out.println(b2.equals(b1));
		
		Object b3 = new Book(333);
		Object b4 = new Book(333);
		
		System.out.println("Book equals()");
		System.out.println(b3.equals(b4));
		System.out.println(b4.equals(b3));
		
	}
}

class Book	extends Object {
	private int code;
	Book(){
		
	}
	
	Book(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book o = (Book) obj;
			
			if(obj != null) {
				return this.code == o.code;				
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return code*31;
	}
}