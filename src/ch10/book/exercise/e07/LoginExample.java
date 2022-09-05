package ch10.book.exercise.e07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
			if (!id.equals("blue")) {
				throw new NotExistIDException("id가 존재하지않습니다.");
			}
			
			if(!password.equals("12345")) {
				throw new WrongPasswordException("password가 다릅니다.");
			}
		}
}

