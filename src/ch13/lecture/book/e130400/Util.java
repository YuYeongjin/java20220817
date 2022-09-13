package ch13.lecture.book.e130400;

import ch13.lecture.book.Box;

public class Util {

	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return KeyCompare&&valueCompare;
	}		
}

