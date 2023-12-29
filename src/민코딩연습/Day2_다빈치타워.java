package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day2_다빈치타워 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int N, M;
	static int[][] arr;
	static int[] path;
	static long max;
	static long mul;

	static long point() {
		mul = 1;
		for (int col = 0; col < M; col++) {
			int sum = 0;
			for (int row = 0; row < N; row++) {
				int temp = arr[row][(col + path[row]) % M];
				sum += temp;
			}
			mul *= sum;
		}
		return mul;

	}

	static boolean is_ok(int now) {

		for (int col = 0; col < M; col++) {
			int dat[] = new int[220];
			for (int row = 0; row <= now; row++) {
				int temp = arr[row][(col + path[row]) % M] + 100;
				if (dat[temp] == 1)
					return false;
				dat[temp] = 1;
			}

		}

		return true;

	}

	static void func(int now) {

		if (now == N) {

			long a = point();
			if (max < a)
				max = a;
			return;
		}

		for (int i = 0; i < M; i++) {
			path[now] = i;
			if (is_ok(now))
				func(now + 1);
			path[now] = 0;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		max = Integer.MIN_VALUE;
		path = new int[N];
		arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = 0;
			}
		}

		for (int i = 0; i < N; i++) {

			path[i] = 0;
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		func(1);
		System.out.println(max);
	}

}