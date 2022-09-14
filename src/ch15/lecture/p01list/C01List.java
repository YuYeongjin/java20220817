package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		//List : 순서 있음
		
		List<String> list1 = new ArrayList<>();
		
		// add : element 추가
		list1.add("coyote");
		list1.add("phoenix");
		list1.add("goose");
		
		System.out.println(list1);
		// get : index로 element 얻기
		list1.get(0);
		list1.get(1);
		list1.get(2);
		
		//ArrayIndexOutOfBoundsException 주의
		
//		list1.get(3);//X
		
		// size : List의 길이(item의 갯수)
		
		int len = list1.size();
		System.out.println(len);
		System.out.println("마지막 아이템 : " + list1.get(list1.size()-1));
		
		
		
		
		
		
		
	}
}
