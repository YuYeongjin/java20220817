package ch10.lecture.p01exception;

public class C05Catch {
	public static void main(String[] args) {
		String[] arr = {"100", "200", "삼백"};
		
		try {
			int a = Integer.parseInt(arr[2]);
			System.out.println(a*2);
			// 여러 캐치블럭이 동시에 실행은 되지않음
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 잘 못 작성");
		} catch (NumberFormatException e ) {
			System.out.println("수의 형식이 잘 못됨");
		}
		System.out.println("실행 흐름 이어감");
		
	}
}
