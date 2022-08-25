package ch05.book.exercise;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("* 학생 수를 입력하세요 > ");
				int selectStudent = scanner.nextInt();
				studentNum = selectStudent;
				scores = new int[studentNum];
				System.out.println("* 학생은 총 " + studentNum + "명 입니다.");
			} else if (selectNo == 2) {
				System.out.println("* 학생들의 점수를 입력하세요.");
				for (int i=0; i<scores.length; i++) {
					System.out.print("* "+(i+1) +"번째 학생의 점수 입력 > ");
					int studentScores = scanner.nextInt();
					scores[i] = studentScores;
					System.out.println("* "+(i+1)+"번째 학생의 점수는 "+studentScores +"점 입니다.");
				}
			} else if (selectNo==3) {
				for(int i= 0; i<scores.length; i++) {
					System.out.println("* " +(i+1)+"번째 학생의 점수는 "+scores[i]+"점 입니다.");
				}
			} else if (selectNo==4) {
				int maxScores=0;
				double avgScores=0;
				for(int i = 0; i<scores.length; i++) {
					if(maxScores<scores[i]) {
						maxScores = scores[i];
					}
				}
				System.out.println("* "+"학생 최고 점수 = "+maxScores+ "점 입니다.");
				for(int j=0; j<scores.length; j++) {
					avgScores+=scores[j];
				}
				System.out.println("* "+"학생 점수 평균 = "+ avgScores/(double)scores.length+"점 입니다.");
			} else {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}
