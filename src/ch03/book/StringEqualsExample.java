package ch03.book;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1= "유영진";
		String strVar2= "유영진";
		String strVar3= new String("유영진");
		
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);
		System.out.println();
		System.out.println(!strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}
