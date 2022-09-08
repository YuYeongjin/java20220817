package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression (regex)
		// 정규표현식, 정규식 표현
		// 문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		
		//하나의 문자
		// api에서 pattern<<
		String pattern1 = "a";
		
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b";
		System.out.println(s3.matches(p3));
		
		String s4 = "bbb";
		String p4 = "b+"; // + : 한개 이상
		
		System.out.println(s4.matches(p4));
		
		String p5 = "b*"; // * : 0개 이상
		System.out.println("bbb".matches(p5));
		System.out.println("b".matches(p5));
		System.out.println("".matches(p5));
		
		System.out.println("--------");
		String p6 = "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println("dog".matches(p7));
		System.out.println("doooooooooog".matches(p7));
		System.out.println("---------");
		String p8 = "[abcd]"; //[]:안에 문자들 중 하나
		System.out.println("a".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("e".matches(p8));
		System.out.println("A".matches(p8));
		System.out.println("---------");
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("---------");
		
		String p10 = "[a-cA-c]"; // [abcABC]
		System.out.println("a".matches(p10));
		System.out.println("d".matches(p10));
		System.out.println("A".matches(p10));
		System.out.println("abc".matches(p10));
		System.out.println("abc".matches("[a-c]+"));
		System.out.println("---------");
		
		String p11 = "[^abcdefghijkl]"; // [^] : 제외하고
		System.out.println("a".matches(p11));
		System.out.println("m".matches(p11));
		
		System.out.println("---------");
		
		String p12="[^a-z]";
		System.out.println("a".matches(p12));
		System.out.println("A".matches(p12));
		System.out.println("0".matches(p12));

		System.out.println("----------");
		
		String p13 = "d[^o]+g"; // o을 제외한 여러개
		System.out.println("dog".matches(p13));
		System.out.println("dag".matches(p13));
		System.out.println("dflkehgjksheg".matches(p13));
		System.out.println("----------");
		
		
		//수량
		// + : 1개이상
		// * : 0개이상
		// ? : 0개 또는 1개
		// {n} : n개
		// {n,} : n개 이상
		// {n,m} : n개 이상 m개 이하
		
		String p14 = "do+g";
		System.out.println("dog".matches(p14));
		System.out.println("doooooooog".matches(p14));
		System.out.println("----------");
		
		String p15 = "do*g";
		System.out.println("dg".matches(p15));
		System.out.println("dooooooog".matches(p15));
		System.out.println("----------");		
		
		String p16 = "do?g";
		System.out.println("dg".matches(p16));
		System.out.println("dog".matches(p16));
		System.out.println("doog".matches(p16));
		System.out.println("----------");
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17));
		System.out.println("dog".matches(p17));
		System.out.println("dooog".matches(p17));
		
		System.out.println("----------");
		//기호
		// . : 모든 글자
		// \d : [0~9] (digit)
		// \w : [a-zA-Z0-9_] (word character)
		// \s : 공백 (스페이스, 엔터, 탭)
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
		
		String p18 = ".";
		System.out.println("a".matches(p18));
		System.out.println(" ".matches(p18));
		System.out.println("0".matches(p18));
		System.out.println("".matches(p18)); //뭐든 글자가있어야함
		System.out.println("abc".matches(p18)); // 1글자여야함
		System.out.println("abc".matches(".{3}"));// true
		
		System.out.println("----------");
		String p19 = "\\d"; //자바에서는 \를 \\로 작성해야함
		System.out.println("0".matches(p19));
		System.out.println("5".matches(p19));
		System.out.println("a".matches(p19));
		System.out.println("".matches(p19));
		System.out.println("91".matches(p19));
		System.out.println("----------");
		String p20 = "\\d{8}";
		System.out.println("19950101".matches(p20));
		System.out.println("550101".matches(p20));
		System.out.println("----------");
		String p21 = "\\d{4}-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p21));
		System.out.println("1995-01-01".matches(p21));
		
		System.out.println("----------");
		// () : 그룹
		// | : or 또는
		
		String p22 = "(dog|cat)";
		System.out.println("dog".matches(p22));
		System.out.println("cat".matches(p22));
		
		System.out.println("----------");
		String p23 = "(\\d{4}|\\d{2})-?\\d{2}-?\\d{2}";
		System.out.println("1955-01-01".matches(p23));
		System.out.println("55-01-01".matches(p23));
		System.out.println("19550101".matches(p23));
		System.out.println("550101".matches(p23));
		System.out.println("----------");
		
		String p24 = "(dog)+";
		System.out.println("dog".matches(p24));
		System.out.println("dogdog".matches(p24));
		System.out.println("dogdo".matches(p24)); //false
		
		System.out.println("----------");
		// \. : . 글자 자체
		String p25 = "\\.";
		System.out.println("a".matches(p25));//false
		System.out.println(".".matches(p25));
		
		System.out.println("----------");
		
		String p26 = "www\\.[a-z]+\\.com";
		System.out.println("www.daum.com".matches(p26));
		System.out.println("daum.com".matches(p26));
		System.out.println("www.daumcom".matches(p26));
		
		System.out.println(p26.contains("w"));
		
		
		
		
		
	}
}
