package p99programLv2;

import java.util.Arrays;
import java.util.Stack;

public class academy101902NQueen {
	int answer = 0; int[][] ans;
	class Spot {Spot(int x, int y) {this.x = x;this.y = y;}int x, y;}
	Stack<Spot> point = new Stack<>();Spot now;

	public static void main(String[] args) {
		academy101902NQueen go = new academy101902NQueen();
		int n = 5;
		System.out.println(go.solution(n));
	}

	public int solution(int n) {
		for (int i = 0; i < n; i++) {
			ans = new int[n][n];
			int xx = 0;
			boolean[][] check = new boolean[n][n];
			boolean[] real = new boolean[n];
			now = new Spot(i, 0);
			int yy = 1;
			real[i]=true;
			addSpot(now, check);
			System.err.println((i + 1) + "번째 실행 > 시작 좌표 : (" + point.peek().x + ", " + point.peek().y + ")");
			while (point.size() != n&&point.size() != 0) {
				boolean find = false;
				for (; xx < check.length; xx++) {
					if (!check[yy][xx]&&!real[xx]) {
						now = new Spot(xx, yy);
						System.out.println((yy + 1) + "행 실행 > 성공: " + now.x + " , " + now.y  + " 당시 체크 /: " + Arrays.toString(real));
						real[xx] =true;
						addSpot(now, check);
						find = true;
						yy++;
						xx = 0;
						break;
					}
				}
				if (!find) {
//					System.out.println((yy + 1) + "행 실행 > 추적 실패!!!!!!!!!!!!!!!!!!!! ");
					Spot now = point.pop();
					real[now.x]=false;
					yy--;
					xx = now.x + 1;
					removeSpot(xx, yy, check);
				}
//				System.out.println("현재 스택 개수 : " + point.size());
			}
			if (point.size() == n)
				answer++;
			point.clear();
		}
		return answer;
	}
	void addSpot(Spot now, boolean[][] check) {
		point.add(now);
		int xl = Integer.valueOf(now.x);
		int xr = Integer.valueOf(now.x);
		for (int j = 0; j < ans.length; j++) {
			if(check[j][now.x]) {
				ans[j][now.x]++;
			}			
			check[j][now.x]=true;
		}
		for (int i = now.y + 1; i < check.length; i++) {
			if (xl != 0) {
				xl--;
				if(check[i][xl]) {
					ans[i][xl]++;
				}
				check[i][xl] = true;
			}
			if (xr != ans.length - 1) {
				xr++;
				if(check[i][xr]) {
					ans[i][xr]++;
				}
				check[i][xr] = true;
			}
		}
		System.out.println(Arrays.toString(check[0]));
		System.out.println(Arrays.toString(check[1]));
		System.out.println(Arrays.toString(check[2]));
		System.out.println(Arrays.toString(check[3]));
		System.out.println(Arrays.toString(check[4]));

		System.out.println(Arrays.toString(ans[0]));
		System.out.println(Arrays.toString(ans[1]));
		System.out.println(Arrays.toString(ans[2]));
		System.out.println(Arrays.toString(ans[3]));
		System.out.println(Arrays.toString(ans[4]));
	}
	void removeSpot(int yy, int xx, boolean[][] check) {
//		System.out.println(" 이전 좌표로 >>  " + xx + " , " + yy );
		int xl = Integer.valueOf(now.x);
		int xr = Integer.valueOf(now.x);
		for (int j = 0; j < ans.length; j++) {
			if(ans[j][now.x]==0) {
				check[j][now.x] = false;
			} else {
				ans[j][now.x]--;
			}			
		}
		for (int i = now.y + 1; i < check.length; i++) {
			if (xl != 0) {
				xl--;
				if(ans[i][xl]==0) {
					check[i][xl] = false;
				} else {
					ans[i][xl]--;
				}
			}
			if (xr != ans.length - 1) {
				xr++;
				if(ans[i][xr]==0) {
					check[i][xr] = false;
				} else {
					ans[i][xr]--;
				}
			}
		}
		System.out.println(Arrays.toString(check[0]));
		System.out.println(Arrays.toString(check[1]));
		System.out.println(Arrays.toString(check[2]));
		System.out.println(Arrays.toString(check[3]));
		System.out.println(Arrays.toString(check[4]));

		System.out.println(Arrays.toString(ans[0]));
		System.out.println(Arrays.toString(ans[1]));
		System.out.println(Arrays.toString(ans[2]));
		System.out.println(Arrays.toString(ans[3]));
		System.out.println(Arrays.toString(ans[4]));
	}
}
