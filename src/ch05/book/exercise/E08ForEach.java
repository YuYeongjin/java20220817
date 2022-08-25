package ch05.book.exercise;

public class E08ForEach {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}				
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int[] x : array) {
			for (int y : x) {
				sum += y;
				count++;
			}
		}
		
		avg = (double)sum/count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}
}
