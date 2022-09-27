package p99Study.academy;

public class academy092303_lv2 {
	public static void main(String[] args) {
		academy092303_lv2 a = new academy092303_lv2();
		a.answer = 0;
		a.dfs(0,0,7);
		System.out.println("정답은 " +a.answer);
	}
	int answer;
	
	void dfs(int i, int len, int n) {
		
		if(len == n) {
			answer++;
			return;
		}
		System.out.println(answer);
		System.out.println("실행");
		dfs(1,len+1,n);
		dfs(2,len+2,n);
	}
	
}
