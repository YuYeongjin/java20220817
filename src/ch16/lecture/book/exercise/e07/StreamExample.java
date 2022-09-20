package ch16.lecture.book.exercise.e07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동","개발자"),
				new Member("김나리","디자이너"),
				new Member("신용권","개발자")
				);
		
		List<Member> developers = list.stream()
				.filter((e)->e.getJob().equals("개발자"))
				.collect(Collectors.toList());
		developers.stream().forEach((e)->System.out.println(e.getName()));
	}
	
	static class Member{
		private String name;
		private String job;
		
		public Member(String name, String job) {
			this.job=job;
			this.name=name;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}
}
