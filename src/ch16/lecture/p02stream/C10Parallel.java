package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C10Parallel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		double avg1 = IntStream.range(1, Integer.MAX_VALUE)
				.filter((n) -> n % 2 == 0)
				.average()
				.getAsDouble();
		System.out.println(avg1);
		
		long end = System.currentTimeMillis();
		System.out.println("순차 스트림 걸린 시간 :"+(end-start)+"ms");
		
		start = System.currentTimeMillis();
		double avg2 = IntStream.range(1, Integer.MAX_VALUE)
				.parallel()
				.filter((e)->e%2==0)
				.average()
				.getAsDouble();
		System.out.println(avg2);
		end = System.currentTimeMillis();
		System.out.println("병렬 스트림 걸린 시간 :"+(end-start)+"ms");
	}
}
