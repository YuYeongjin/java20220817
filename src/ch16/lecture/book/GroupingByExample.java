package ch16.lecture.book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE,Student.City.Seoul),
				new Student("김수애",6,Student.Sex.FEMALE,Student.City.Pusan),
				new Student("신용권",10,Student.Sex.MALE,Student.City.Pusan),
				new Student("박수미",6,Student.Sex.FEMALE,Student.City.Seoul)				
				);
		
		Map<Student.Sex,List<Student>> mapBySex = totalList.stream()
				.coll
	}
}

