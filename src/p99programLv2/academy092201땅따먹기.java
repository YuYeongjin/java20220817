package p99programLv2;

import java.util.Arrays;

public class academy092201땅따먹기 {
	public static void main(String[] args) {
//		int[][] land = {{4,3,2,1},{1002,2,2,1},{6,6,6,4},{8,7,6,5},{11,10,10,9},{0,15,5,0}};
//		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int[][] land = {{1,1,1,1},{2,2,2,3},{3,3,3,6},{4,4,4,7}};
		
		System.out.println(landEatGame(land));
	}
	
	public static int landEatGame(int[][] land) {
		int[] numStep = new int[land.length];
		int[] numMax = new int[land.length];
		
		int answer = 0;
		int step = -1;
		for(int i = 0 ; i<land.length;i++) {
			numStep[i]=maxNumIndex(land[i],maxNum(land[i],step));
			numMax[i]=maxNum(land[i],step);
		}
		System.out.println(Arrays.toString(numMax));
		System.out.println(Arrays.toString(numStep));
		int a = -1;
		for(int i = 0 ; i <land.length;i++) {
			if(a==numStep[i]) {
				int[] size = new int[2];
				step = numStep[i-1];
				size[0]=numMax[i-1]-maxNum(land[i-1],step);
				step = numStep[i];
				size[1]=numMax[i]-maxNum(land[i],step);
				System.out.println(Arrays.toString(size));
				if(size[0]>size[1]) {
					step = numStep[i];
					numMax[i]=maxNum(land[i],step);
					numStep[i]=maxNumIndex(land[i],maxNum(land[i],step));
				} else if(size[0]<size[1]) {
					step = numStep[i-1];
					numMax[i-1]=maxNum(land[i-1],step);
					numStep[i-1]=maxNumIndex(land[i-1],maxNum(land[i-1],step));
				} else {
					if(numMax[i]>numMax[i-1]) {
						step = numStep[i-1];
						numMax[i-1]=maxNum(land[i-1],step);
						numStep[i-1]=maxNumIndex(land[i-1],maxNum(land[i-1],step));
					} else {
						step = numStep[i];
						numMax[i]=maxNum(land[i],step);
						numStep[i]=maxNumIndex(land[i],maxNum(land[i],step));
					} 
				}
			}
			a = numStep[i];
		}
		
		for(int i = 0 ; i < numMax.length;i++) {
			answer+=numMax[i];
		}
		System.out.println(Arrays.toString(numMax));
		System.out.println(Arrays.toString(numStep));
		return answer;
	}
	public static int maxNum(int[] arr,int x) {
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i <arr.length;i++) {
			if(max<arr[i]&&i!=x) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int maxNumIndex(int[] arr,int num) {
		int index = -1;
		for(int i = 0 ; i <arr.length;i++) {
			if(num==arr[i]) {
				index = i;
			}
		}
		return index;
	}
}
