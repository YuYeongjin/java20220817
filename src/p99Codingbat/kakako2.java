package p99Codingbat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	// 민종님 풀이
	  public static int[] solution2(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            String[] parsed = term.split(" ");
            termMap.put(parsed[0], Integer.valueOf(parsed[1]));
        }

        String[] todayParsed = today.split("\\.");
        LocalDate now = LocalDate.of(
                Integer.parseInt(todayParsed[0]),
                Integer.parseInt(todayParsed[1]),
                Integer.parseInt(todayParsed[2])
        );
        System.out.println(now);

        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] parsed = privacies[i].split(" ");
            String[] agreeDateParsed = parsed[0].split("\\.");
            LocalDate agreeDate = LocalDate.of(
                    Integer.parseInt(agreeDateParsed[0]),
                    Integer.parseInt(agreeDateParsed[1]),
                    Integer.parseInt(agreeDateParsed[2])
            );

            LocalDate expireDate = agreeDate.plusMonths(termMap.get(parsed[1]));
            System.out.println(expireDate);

            if (now.isEqual(expireDate) || now.isAfter(expireDate)) {
                answerList.add(i + 1);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
	
	
	
	
	
	
	
}
