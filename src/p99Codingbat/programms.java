package p99Codingbat;

import java.util.Arrays;

public class programms {
	public static void main(String[] args) {

		long n = 125213;
		long answer = 0;
		String c = "";
		String a = "" + n;
		int[] b = new int[a.length()];
		for (int i = 0; i < a.length(); i++) {
			b[i] = Character.getNumericValue(a.charAt(i));
		}
//        System.out.println(Arrays.toString(b));

		Arrays.parallelSort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
		for (int j = b.length - 1; j > 0; j--) {
			c += b[j];
		}
		answer = Long.valueOf(c);
		System.out.println(answer);
	}
}