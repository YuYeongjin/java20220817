package p99Study.academy;

public class academy3 {
	public static void main(String[] args) {
		int[] numbers= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String answer = "";
		String hand = "right";
		int Lh=10;
		int Rh=12;
		int pickL =0;
		int pickR =0;
		int cnL=0;
		int cnR=0;
		
		
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
				Lh=numbers[i];
				answer +="L";
				continue;
			}
			if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
				Rh=numbers[i]-2;
				answer +="R";
				continue;
			}
			if(numbers[i]==2||numbers[i]==5||numbers[i]==8||numbers[i]==0) {
				System.out.println((i+1)+"번째 누를 키패드 = "+numbers[i]+"왼손위치는"+Lh+"오른손위치는"+Rh);
				cnL=0;
				cnR=0;
				if(numbers[i]!=0) {
					pickL=Math.abs(numbers[i]-Lh);					
					pickR=Math.abs(numbers[i]-Rh);					
				} else {
					pickL=Math.abs(11-Lh);					
					pickR=Math.abs(11-Rh);
				}
				System.out.println((i+1)+"번째 오른손 = "+pickR);
				hereL:for(int j=0;j<4;j++) {
					if(pickL>=3) {
						pickL-=3;
						cnL++;
					}
					if(pickL<3&&pickL>0) {
						pickL-=1;
						cnL++;
					}
					if(pickL<=0) {
						break hereL;
					}
				}
				hereR:for(int j=0;j<4;j++) {
					if(pickR>=3) {
						pickR-=3;
						cnR++;
					}
					if(pickR<3&&pickR>0) {
						pickR-=1;
						cnR++;
					}
					if(pickR<=0) {
						break hereR;
					}
				}
				if(cnR<cnL) {
					answer +="R";
					if(numbers[i]!=0) {
						Rh=numbers[i];						
					} else {
						Rh=11;
					}
					continue;
				} else if(cnR>cnL) {
					answer +="L";
					if(numbers[i]!=0) {
						Lh=numbers[i];						
					} else {
						Lh=11;
					}
					continue;
				} else {
					if(hand.equals("right")) {
						answer +="R";
						if(numbers[i]!=0) {
							Rh=numbers[i];						
						} else {
							Rh=11;
						}
					} else {
						answer +="L";
						if(numbers[i]!=0) {
							Lh=numbers[i];						
						} else {
							Lh=11;
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}
