package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C20Collect {
	public static void main(String[] args) {
		String res = IntStream.of(9,7,1,0)
				.boxed()				
				.map(String::valueOf)
				.collect(Collectors.joining(", "));				
				
		System.out.println(res) ; // "9, 7, 1, 0"
	}
}
