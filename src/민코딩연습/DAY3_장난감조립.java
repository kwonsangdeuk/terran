package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DAY3_장난감조립 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] map;
	static int[] visited;
	static int sum;
	static int N, T;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int start, end;
	static int cnt;
	static int cost;
	static int[] level;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());
		T = Integer.parseInt(br.readLine());
		map = new int[N + 1][N + 1];
		level = new int[N + 1];

		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			end = Integer.parseInt(st.nextToken());
			start = Integer.parseInt(st.nextToken());
			cnt = Integer.parseInt(st.nextToken());
			map[start][end] = cnt;
			level[end] = 1;

		}

		for (int i = 1; i <= N; i++) {
			cost = 1;
			sum = 0;
			if (level[i] == 1)
				continue;
			dfs(i);

			System.out.println(i + " " + sum);
		}

	}

	static void dfs(int now) {

		if (now == N) {
			sum += cost;
			return;
		}

		for (int to = 1; to <= N; to++) {
			int next = to;
			if (map[now][next] == 0)
				continue;
			cost = cost * map[now][next];

			dfs(next);
			cost = cost / map[now][next];

		}
	}

}
