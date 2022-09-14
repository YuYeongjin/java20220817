package p99Codingbat;

import java.util.Arrays;

public class academy091406 {
	public static void main(String[] args) {
        int brown=24;
        int yellow = 24;
        
        int height = brown/2;
        int[] answer = new int[2];
        
        for(int i = 0; i<height/2;i++) {
        	answer[0]=height-i;
        	answer[1]=(brown+yellow)/answer[0];
        	if(answer[0]*answer[1]==(brown+yellow)) {
        		break;
        	}
        }
        
        
		System.out.println(Arrays.toString(answer));
	}
}
/*
 int[] answer = new int[2];
        
		answer[1] = 3;
		if(brown==yellow*2+6) {
			answer[0]=(brown+yellow)/answer[1];
		} else {
			answer[1]=(int)(Math.sqrt(brown+yellow));
			for(int i =0;i<brown+yellow;i++) {
				answer[0]=(brown+yellow)/answer[1];
				if(answer[0]*answer[1]!=(brown+yellow)) {
					answer[1]--;
				}
			}
		}
        return answer;
    }
}
 */