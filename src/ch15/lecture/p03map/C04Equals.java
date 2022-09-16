package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C04Equals {
	public static void main(String[] args) {
		// Key는 equals 메소드 활용해서 같은지 다른지 확인
		Map<Book,Integer> map = new HashMap<>();
		map.put(new Book("java"),30000);
		map.put(new Book("spring"),50000);
		map.put(new Book("html"),70000);
		map.put(new Book("java"),80000);

		map.forEach((k,v)->System.out.println((k + " : " + v )));
	
	
	}
}
class Book{
	private String title;
	
	public Book(String title) {
		this.title=title;
	}
	
	@Override
	public String toString() {
		return title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
