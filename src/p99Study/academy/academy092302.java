package p99Study.academy;

public class academy092302 {
	public static void main(String[] args) {
		academy092302 a = new academy092302();
		
		a.method(0,0,0,new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
		
		System.out.println(a.answer);
	}
	int[][] maps;
	int answer=-1;
	
	void method(int index1, int index2, int sum, int[][] map) {		
		if(index1 ==map.length&&index2==map[0].length) {
			System.out.println(sum);
			answer = sum;
			return;
		}
		if(map[index1][index2+1]==1&&index2!=4) {
			method(index1, index2+1, sum+map[index1][index2], map);
		} else if(map[index1+1][index2]==1&&index1!=4) {
			method(index1+1, index2, sum+map[index1][index2], map);
		}
		System.out.println(sum);
		System.out.println("실행");
	}
}