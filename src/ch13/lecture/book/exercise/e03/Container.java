package ch13.lecture.book.exercise.e03;

public class Container<T, S> {
	private T key;
	private S value;

	public S getValue() {
		return value;
	}

	public T getKey() {		
		return key;
	}

	public void set(T t, S s) {
		this.key = t;
		this.value = s;
	}
}
