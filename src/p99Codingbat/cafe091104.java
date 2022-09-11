package p99Codingbat;

public class cafe091104 {
	public static void main(String[] args) {
		int n = 78;
		String num="";
		int count=0;
		String ansNum="";
		int ansCnt=0;
		
		num=Integer.toBinaryString(n);
		for(int i=0; i<num.length();i++) {
			if(num.substring(i, i+1).equals("1")) {
				count++;
			}
		}
		System.out.println("1의 갯수는 : "+count);
		while(true) {
			ansCnt = 0;
			n++;
			ansNum=Integer.toBinaryString(n);
			for(int i=0; i<ansNum.length();i++) {
				if(ansNum.substring(i, i+1).equals("1")) {
					ansCnt++;
				}
			}	
			if(count==ansCnt) {
				break;				
			}
		}
		System.out.println(n);
	}
}
