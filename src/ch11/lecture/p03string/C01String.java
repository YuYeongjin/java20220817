package ch11.lecture.p03string;

public class C01String {
	public static void main(String[] args) {
		String s1="";
		
		//유니코드 = unicode.org
		//1바이트는 아스키 ascii 코드
		char[] arr1 = {'c','o','y','o','t','e','\u270d'};
		
		String s2 = new String(arr1);
		System.out.println(s2);
		
		String s3 = new String(arr1,2,2);
		System.out.println(s3);
	
		//아스키코드
		byte[] arr2= {106,97,118,97};
		String s4 = new String(arr2);
		System.out.println(s4);
	
	}
}
