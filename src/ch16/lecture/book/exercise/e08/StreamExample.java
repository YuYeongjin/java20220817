package ch16.lecture.book.exercise.e08;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<String>> groupingMap = list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.collect(Collectors.groupingBy((m) -> m.getJob(), Collectors.mapping((m) -> m.getName(),
						Collectors.toList())));

		System.out.println("[개발자] ");
		groupingMap.get("개발자").stream().forEach((s) -> System.out.println(s+" "));
		
	}

	static class Member {
		private String name;
		private String job;

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}
	}
}
