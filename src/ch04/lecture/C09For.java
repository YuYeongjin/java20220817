package ch04.lecture;

public class C09For {
	public static void main(String[] args) {
		for (int i = 0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============================");
		
		for (int i = 0; i<5; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 0; i<5; i++) {
			for(int j=5; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============================");

		for (int i = 0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============================");
	
		for (int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("============================");
		int k =0;
		for(int j = 0; j<4; j++) {
			for (int i = 0; i<=j; i++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println("============================");
		int x = 0;
		for (int i = 0; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((x++)%10);
			}			
			System.out.println();
		}
	}
	
}
