package ch10.lecture.p03exceptions;

public class C03Exception {
	public static void main(String[] args) {
			Class a;
			try {
				a = Class.forName("java.lang.String");
				System.out.print(a.toString());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// api에서 ERROR는 어쩔수 없음. 수정 불가함 다른내용만 확인할 것.
			// runtime 상속이 안되어있다면 무조건 try catch블럭을 사용할것.
			

		
	}
}
