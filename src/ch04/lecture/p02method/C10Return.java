package ch04.lecture.p02method;

public class C10Return {
	public static void main(String[] args) {
		
	int a = max(3,5);
	System.out.println(a);
	
	int b = max(5,3);
	System.out.println(b);
	
	int c = max(-100,100);
	System.out.println(c);
	
	int d = max(100,200);
	System.out.println(d);	
	}
	
	public static int max(int x, int y) {
		int num = Math.max(x, y);
		return num;
	}
}
