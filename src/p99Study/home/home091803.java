package p99Study.home;

public class home091803 {
	public static void main(String[] args) {
		int n = 1;
		int nVal=n;
		int answer=0;
		for(int i = 0; i<nVal;i++) {
			if(n%2!=0) {
				answer++;
				n--;
			} else {
				n/=2;
			}			
			if(n<=1) {
				break;
			}
		}
		System.out.println(++answer);
	}
}
