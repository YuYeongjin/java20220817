package ch16.lecture.book.exercise.e05;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		list.stream()
		.filter(n->n.toLowerCase().contains("java".toLowerCase()))
		.forEach(a->System.out.println(a));
	}
}
