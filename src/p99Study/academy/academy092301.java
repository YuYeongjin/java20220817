package p99Study.academy;

public class academy092301 {
	public static void main(String[] args) {
		academy092301 d = new academy092301();
		d.dfs(0, 0, new int[] {1,1,1,1,1}, 3);
//		d.dfs(0, 0, new int[] {4,1,2,1}, 4);
		
		System.out.println(d.answer);
	
	}		       
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int answer;
		
	void dfs(int index, int sum, int[] numbers, int target) {
		   if(index==numbers.length) {
			   if(target==sum) answer++;
			   return;
		   }
		   dfs(index+1,sum+numbers[index], numbers, target);
		   dfs(index+1,sum-numbers[index], numbers, target);
	   }
}
