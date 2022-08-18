package ch02.lecture;

public class C08TypeConversion {
	public static void main(String[] args) {
		// 타입변환
		// 작은 타입에서 큰 타입으로는 자동 변환
		// 큰 타입에서 작은 타입으로는 강제 변환 (cast 연산, casting)
		
		// 자동 형 변환
		int a = 33;
		short b = 55;
		
		a=b; // 자동 형 변환
		
		char c = '가';
		a=c;
		
		long d = c;
		
//		short e = c; // 안됨 같은 2바이트이지만 형식이다름
		
		float f = 3.14F;
		double g = f;
		
		//정수형 -> 실수형
		int h = 999;
		float i = h;
		double j = h;
		long k = 99999L;
		float l = k;
		double m = k;
		
		boolean n = true;
//		int o = n ; // 안됨
		
		// 강제 형 변환 (큰 타입 -> 작은 타입)
		long q = 999999L;
//		int p = q; // x
		int r = (int) q; // 강제형변환 (cast, casting)
		System.out.println(r);
		q= 3000000000L;
		r = (int) q; // 값을 잃을 수 있다
		System.out.println(r);
		
		// 실수 -> 정수 (강제형변환)
		float s = 3.14F;
//		int t = s; //X
		int u = (int) s;
		System.out.println(u);
		
		double v = 3.14;
		u = (int) v ;
		System.out.println(u);
		
		
	}
}
