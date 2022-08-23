package ch04.book.exercise;

public class E04 {
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		while ((a+b)!=5) {
		a =(int)(Math.random()*6)+1;
		b =(int)(Math.random()*6)+1;
		
		System.out.println("("+a+", "+b+")");
		}

		System.out.println("do while  ===================");
		
		int d1,d2;
		do {
			d1 = (int)(Math.random()*6)+1;
			d2 = (int)(Math.random()*6)+1;
			System.out.println("("+d1+", "+d2+")");
		}while ((d1+d2)!=5);
	}
}
