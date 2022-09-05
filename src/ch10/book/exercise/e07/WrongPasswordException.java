package ch10.book.exercise.e07;

public class WrongPasswordException extends Exception{
	public WrongPasswordException () {
		
	}
	public WrongPasswordException(String message) {
		super(message);
	}

}
