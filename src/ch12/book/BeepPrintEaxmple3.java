package ch12.book;

public class BeepPrintEaxmple3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
