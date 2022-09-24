package p99Codingbat;

public class cafe092401 {
	public static void main(String[] args) {
//		int[][] land = {{4,3,2,1},{1002,2,2,1},{6,6,6,4},{8,7,6,5},{11,10,10,9},{0,15,5,0}};
//		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int[][] land = {{1,1,1,1},{2,2,2,3},{3,3,3,6},{4,4,4,7}};

		int answer = 0;
		int[][] newArr = new int[land.length][land[0].length];

		newArr[0]=land[0];
		
	}
	void fs(int index1, int index2, int[][] newArr, int[][] land) {
		if(index2 == land.length) {
			return;
		}
		for(int i = 0 ; i < land[0].length;i++) {
			for(int j = 0 ; j < land[0].length;j++) {
				if(newArr[index2][i]<land[index2][i]+newArr[index1][j]&&i!=j) {
					newArr[index2][i]=land[index2][i]+newArr[index1][j];
				}
			}
		}		
		fs(index1+1, index2+1,newArr,land);
	}
}
	
	