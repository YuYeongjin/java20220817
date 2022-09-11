package p99Codingbat;

public class cafe091106 {
	public static void main(String[] args) {
		int n = (int)(Math.pow(2, 4));
		int a = 12;
		int b = 9;
		int length=0;
		int answer=0;
		for(int i =1;i<=20;i++) {
			if(n==(int)(Math.pow(2, i))){
				length=i;
			}			
		}
		int test = length;
		for(int i=0;i<test;i++) {
			if((n/2)>=a^(n/2)>=b) {
				System.out.println("전체 : "+ (Math.pow(2, test))+"강 중 현재"+(Math.pow(2, i+1))+"강에서 만남");
				answer = length;
				break;
			} else {
				System.out.println((Math.pow(2, i+1))+"강에서 안만남");
				if(n/2<a) {
					a-=(int)(n/2);
					System.out.println("변경 a = "+a);
				}				
				if(n/2<b) {
					b-=(int)(n/2);
					System.out.println("변경 b = "+b);

				}
				n/=2;
				System.out.println("변경 n = "+n);
				length--;
				continue;
			}
		}
		if(answer ==0) {
			answer=1;
		}
		System.out.println(answer);
	}
}
