package p99Codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kakako2 {
	public static void main(String[] args) {
		String today = "2020.01.01";
		String[] terms = {"Z 3","D 5"};
		String[] privacies = {"2019.01.01 D","2019.11.15 Z","2019.08.02 D","2019.07.01 D", "2018.12.28 Z"};
		List<Integer> ans = new ArrayList<>();
		int[][] dayI = new int[privacies.length][3];
		String[] dayS = new String[privacies.length];
		String[][] plusDay = new String[terms.length][2];		
		int[] tod = new int[3];
		
		tod[0]=Integer.valueOf(today.substring(0, 4));
		tod[1]=Integer.valueOf(today.substring(5, 7));
		tod[2]=Integer.valueOf(today.substring(8, 10));
		
		for(int i=0; i<privacies.length;i++) {
			dayI[i][0]=Integer.valueOf(privacies[i].substring(0, 4));
			dayI[i][1]=Integer.valueOf(privacies[i].substring(5, 7));
			dayI[i][2]=Integer.valueOf(privacies[i].substring(8, 10));
			dayS[i]=privacies[i].substring(11, 12);
		}
		
		System.out.println(Arrays.deepToString(dayI));
		System.out.println(Arrays.toString(dayS));
		
		for(int l = 0 ; l < terms.length;l++) {
			plusDay[l]=terms[l].split(" ");
		}

		for(int i = 0 ; i < privacies.length;i++) {
			for(int l = 0 ; l<terms.length;l++) {
				if(dayS[i].equals(plusDay[l][0])) {
					dayI[i][1]+=Integer.valueOf(plusDay[l][1]);
				}
			}
		}
		dayI = daySet(dayI);
		for(int i = 0 ;i<dayI.length;i++) {
			if(dayI[i][0]<tod[0]) {
				ans.add(i+1);
			} else if(dayI[i][0]==tod[0]&&dayI[i][1]<tod[1]) {
				ans.add(i+1);
			} else if(dayI[i][0]==tod[0]&&dayI[i][1]==tod[1]&&dayI[i][2]<=tod[2]) {
				ans.add(i+1);
			}			
		}
		int[] answer = ans.stream().mapToInt(x->x).toArray();
		System.out.println(Arrays.toString(answer));
	}
	static int[][] daySet(int[][] dayy) {
		for(int i = 0 ; i < dayy.length;i++) {
			if(dayy[i][1]>12) {
				while(dayy[i][1]>12) {
					dayy[i][0]++;
					dayy[i][1]-=12;
				}
			}
		}
		return dayy;
	}
	
	
}
