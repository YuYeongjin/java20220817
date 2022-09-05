package ch10.book.exercise.e07;

public class NotExistIDException extends Exception {
	public NotExistIDException () {
		
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
