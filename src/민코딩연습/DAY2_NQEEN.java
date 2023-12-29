package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAY2_NQEEN {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int cnt;
	static int[] queen;
	static int[][] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		N = Integer.parseInt(br.readLine());

		queen = new int[N];
		visited = new int[N][N];
		cnt = 0;
		func(0);

		System.out.println(cnt);
	}

	static void func(int row) {

		if (row == N) {
			cnt++;
			return;
		}

		for (int i = 0; i < N; i++) {
			if (position(row, i)) {
				queen[row] = i;
				func(row + 1);
			}
		}
	}

	static boolean position(int x, int y) {
		boolean flag = true;
		for (int i = 0; i < x; i++) {
			if (queen[i] == y || Math.abs(x - i) == Math.abs(y - queen[i]))
				return false;
		}
		return flag;

	}
}
