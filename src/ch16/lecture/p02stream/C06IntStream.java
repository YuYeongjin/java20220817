package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C06IntStream {
	public static void main(String[] args) {
		// 1~10 까지 출력
		IntStream.rangeClosed(1, 10)
				.forEach(e -> System.out.println(e));
		// 1~100까지 합 출력
		int a = IntStream.rangeClosed(1, 100)
				.reduce((x, y) -> x + y)
				.getAsInt();
		System.out.println(a);
		// 1~100까지의 수 중 홀수의 합 출력
		int b = IntStream.rangeClosed(1, 100)
				.filter(x -> x % 2 == 1)
				.reduce((x, y) -> x + y)
				.getAsInt();
		System.out.println(b);
		// [5,10,20,1,6]의 평균구하기
		int c = (int) IntStream.of(5, 10, 20, 1, 6)
				.average().getAsDouble();
		System.out.println(c);
		// 주사위(1~6) 5번 던진 결과 출력
		IntStream.generate(() -> (int) (Math.random() * 6) + 1)
				.limit(5)
				.forEach(e -> System.out.println(e));

		// 로또번호 6개 결과 출력 (작은수부터,중복없이)
		IntStream.generate(() -> (int) (Math.random() * 45) + 1)
				.distinct()
				.limit(6)
				.forEach(e -> System.out.println(e));

	}
}
