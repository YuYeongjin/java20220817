package p99programLv2;

import java.util.Arrays;
import java.util.Stack;

public class academy101902NQueen {
	int answer = 0;
	int[][] ans;

	class Spot {
		Spot(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int x, y;
	}

	Stack<Spot> point = new Stack<>();
	Spot now;

	public static void main(String[] args) {
		academy101902NQueen go = new academy101902NQueen();
		int n = 4;
		System.out.println(go.solution(n));
	}

	public int solution(int n) {
		boolean[][] check = new boolean[n][n];
		ans = new int[n][n];
		int xx = 0;
		for (int i = 0; i < n; i++) {
			now = new Spot(i, 0);
			int yy = 1;
			addSpot(now, check);
			System.err.println((i + 1) + "번째 실행 > 시작 좌표 : (" + point.peek().x + ", " + point.peek().y + ")");
			while (point.size() != n) {
				boolean find = false;
				for (; xx < check.length; xx++) {
					if (!check[yy][xx]) {
						now = new Spot(xx, yy);
						System.out.println((yy + 1) + "행 실행 > 추적 성공: " + now.x + " , " + now.y);
						addSpot(now, check);
						find = true;
						yy++;
						xx = 0;
						break;
					}
				}
				if (!find) {
					System.out.println((yy + 1) + "행 실행 > 추적 실패: " + xx + " , " + yy);
					Spot now = point.pop();
					yy = now.y;
					xx = now.x + 1;
					removeSpot(xx, yy, check);
				}
				System.out.println("현재 스택 내에 개수는 ? : " + point.size());
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
//			check[now.y][j]=true;
		}
		for (int i = now.y + 1; i < check.length; i++) {
			check[i][now.x] = true;
			if (xl != 0) {
				xl--;
				check[i][xl] = true;
			}
			if (xr != ans.length - 1) {
				xr++;
				check[i][xr] = true;
			}
		}
		System.out.println(Arrays.deepToString(check));
	}
	void removeSpot(int yy, int xx, boolean[][] check) {
//		System.out.println(" 이전 좌표로 >>  " + xx + " , " + yy );
		int xl = Integer.valueOf(now.x);
		int xr = Integer.valueOf(now.x);
		for (int j = 0; j < ans.length; j++) {
			check[now.y][j] = false;
		}
		for (int i = now.y + 1; i < check.length; i++) {
			check[i][now.x] = false;
			if (xl != 0) {
				xl--;
				check[i][xl] = false;
			}
			if (xr != ans.length - 1) {
				xr++;
				check[i][xr] = false;
			}
		}
		System.out.println(Arrays.deepToString(check));
	}
}
