package ch10.lecture.p06nessage;

public interface C01Message {
	public static void main(String[] args) {
		System.out.println("메인코드1");
		method1();
		System.out.println("메인실행 이어감");
	}

	public static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		} catch (Exception e) {
			// 캐치 코드에 공란으로 하면 에러를 찾기 힘듦
			// 로그 (메시지) 꼭 남기기
			System.out.println("익셉션 발생");
			System.out.println(e.getMessage());
			e.printStackTrace(); // 이거 냅두기
		}
		System.out.println("메소드1 실행 이어감");
	}

	public static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지?");
		
	}
	
	
}
