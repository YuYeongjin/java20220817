package p99Codingbat;

import java.util.Arrays;

public class cafe091105 {
	public static void main(String[] args) {
//		int n = 3;
//		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive","effect"};
//		int n = 2;
//		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		String text = words[0];
		int[] answer = new int[2];
		int last = -1;
		for(int i=1;i<words.length;i++) {
			System.out.println("현재 단어 : " +words[i]);
			if(text.substring(text.length()-1, text.length()).equals(words[i].substring(0,1))) {
				text = words[i];
				for(int j = 0; j<i;j++) {
					if(text.equals(words[j])) {
						last= Arrays.asList(words).lastIndexOf(text);
						break;
					}
				}
			} else {
				answer[0]=(int)i%n+1;
				answer[1]=(int)i/n+1;
				break;
			}
		}
	if(last!=0) {
		answer[0]=(int)last%n+1;
		answer[1]=(int)last/n+1;
	}
	System.out.println(last);
	System.out.println(Arrays.toString(answer));
	}
}
