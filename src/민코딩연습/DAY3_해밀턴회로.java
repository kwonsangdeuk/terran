package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class DAY3_해밀턴회로 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int N;
	static int[][] map;
	static int[] visited;
	static int cnt;
	static int sum;
	static int start;
	static int min;
	static int x, y;

	static void DFS(int now) {

		if (cnt == N) {
			if (map[now][start] != 0) {
				sum += map[now][start];
				if (min > sum)
					min = sum;
			}
			sum -= map[now][start];
			return;
		}

		for (int i = 1; i <= N; i++) {
			int next = i;
			if (visited[next] == 0 && map[now][next] != 0) {
				visited[next] = 1;
				sum += map[now][next];
				cnt++;
				DFS(next);
				cnt--;
				visited[next] = 0;
				sum -= map[now][next];

			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());

		map = new int[N + 1][N + 1];
		visited = new int[N + 1];
		min = Integer.MAX_VALUE;

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		cnt = 1;
		sum = 0;
		start = 1;
		visited[1] = 1;
		DFS(start);
		System.out.println(min);

	}

}
