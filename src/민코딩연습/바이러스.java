package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바이러스 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int T;
	static int com;
	static int[][] map;
	static int[][] visited;
	static int start, end;
	static int cnt;

	static void DFS(int now) {

		if (now == T) {
			return;
		}

		for (int i = 1; i <= T; i++) {
			int next = i;
			if (map[now][next] == 1 && visited[now][next] == 0) {
				visited[now][next] = 1;
				cnt++;
				DFS(next);
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		T = Integer.parseInt(br.readLine());
		com = Integer.parseInt(br.readLine());

		map = new int[T + 1][T + 1];
		visited = new int[T + 1][T + 1];

		for (int i = 1; i <= com; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			map[start][end] = 1;
		}

		cnt = 0;
		DFS(1);

		System.out.println(cnt-1);

	}
}

//7
//6
//1 2
//2 3
//1 5
//5 2
//5 6
//4 7

