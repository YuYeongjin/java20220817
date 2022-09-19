package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		// IntStream : 기본타입 int가 요소인 Stream

		// 생성방법 1 : of static 메소드
		int r1 = IntStream.of(10, 9, 20, 2, 3, -1)
				.sum();
		System.out.println(r1);

		// 생성방법 2 : Arrays.stream
		int r2 = Arrays.stream(new int[] { 10, 9, 20, 2, 3, -1 })
				.sum();
		System.out.println(r2);

		// 생성방법 3 : IntStream.range static 메소드 끝부분은 포함하지 않음
		int r3 = IntStream.range(1, 11)
				.sum();

		int r4 = IntStream.rangeClosed(1, 10)
				.sum();
		System.out.println(r3);
		System.out.println(r4);

		// 생성방법 4 : IntStream.generate static 메소드
		IntStream.generate(() -> 1)
				.limit(5)
				.forEach(e -> System.out.println(e));

		IntStream.generate(() -> (int) (Math.random() * 45) + 1)
				.distinct()
				.limit(6)
				.forEach(e -> System.out.println(e));
	}
}
