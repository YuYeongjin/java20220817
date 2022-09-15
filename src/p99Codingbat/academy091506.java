package p99Codingbat;

import java.util.*;

public class academy091506 {
	public static void main(String[] args) {
		
	int brown = 24;
	int yellow = 24;
	
	int height=0;
	int width=0;
	int[] answer = new int[2];
	
	for(int i=1;i<yellow;i++) {
		if((int)(Math.pow(i, 2))+((2-(brown/2))*i)+yellow==0) {
			height=i+2;
		}
	}
	width=(brown+yellow)/height;
	
	System.out.println("세로"+height);
	System.out.println("가로"+width);	
	}
}
