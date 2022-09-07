package ch11.lecture.p02wrapper;

public class C03AutuUnBoxing {
	public static void main(String[] args) {
		Integer a = 99;
		
		//참조타입을 기본타입으로 변경(unboxing)
		int b = a.intValue();
		
		//참조타입을 기본타입으로 자동변경(auto boxing)
		int c = a; //ok
		
		Object d = 99;
//		Integer e = d; //XX
		
		int g = (Integer)d;
		Object[] arr = {"java",3,3.14};
		String h = (String) arr[0];
		Integer i = (Integer) arr[1];
		double j = (Double) arr[2];
		double k = (double) arr[2];
		
		System.out.println("실행 이어감");
	}
}
