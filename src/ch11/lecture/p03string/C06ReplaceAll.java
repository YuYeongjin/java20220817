package ch11.lecture.p03string;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1 = "hashcode is a code of instance";
		String t1 = s1.replace("code", "코드");
	
		System.out.println(t1);
		
		//패턴을 나타내는 string 
		//api에서 regex 는 정규표현식이라는 뜻임.
		
		String t2 = s1.replaceAll(".{3}e","코드");
		
		System.out.println(t2);
	}
}
