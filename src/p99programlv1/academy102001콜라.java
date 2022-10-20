package p99programlv1;

public class academy102001콜라 {
	public static void main(String[] args) {
		academy102001콜라 go = new academy102001콜라();
		int a=2;
		int b=2;
		int n =20;
		
		System.out.println(go.solution(a, b, n));
		
				
	}
	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a) {
        	int x = (int)n/a;
        	n-=(a*((int)(n/a)))-x*b;
        	answer+=x*b;
        	System.out.println("n = "+n + "// answer = " + answer);
        }       
        
        return answer;
    }
}
