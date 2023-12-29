package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2_N캐슬 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int cnt;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());

		visited = new int[N];
		func(0);

		System.out.println(cnt);
	}

	static void func(int row) {

		if (row == N) {

			cnt += 1;

			return;

		}

		for (int i = 0; i < N; i++) {
			if (visited[i] == 1)
				continue;
			visited[i] = 1;
			func(row + 1);
			visited[i] = 0;
		}
	}
}