package ch04.book;

public class ForMultplicationTableExample {
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("*** "+ m + "단 ***");
			for(int n = 1; n<=9; n++) {
				System.out.println(m+" x "+ n + " = " +(m*n));
			}
		}
	
		for (int i = 2; i <=9; i++) {
			
			for(int j = 1; j <=9; j++) {
				System.out.println("구구단"+ i + "단 : " +i+ " X " +j +" = "+ i*j);
			}
		}
	
	
	
	
	}
}
