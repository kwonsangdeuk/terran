package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DAY4안나와엘사 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static char[][] map;
	static int[][] visited;
	static int r1, r2, c1, c2;

	static class Node {
		int row;
		int col;

		Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int bfs(int r1, int c1, int r2, int c2)
	// r1,r2에서 출발해서 d_r, d_c까지 얼마나 걸리는가?
	{
		// 1. 그래프 구성
		int visited[][] = new int[5][5];

		// 2. Queue생성
		Queue<Node> q = new LinkedList<>();

		// 3. 시작점 세팅
		visited[r1][c1] = 1;
		q.add(new Node(r1, c1));

		// 7. 4~6단계를 반복
		while (!q.isEmpty()) {
			// 4. now꺼내기
			Node now = q.poll();

			// 5. now -> next 찾기
			int dr[] = { -1, 1, 0, 0 };
			int dc[] = { 0, 0, -1, 1 };
			
			for (int i = 0; i < 4; i++) {
				int next_row = now.row + dr[i];
				int next_col = now.col + dc[i];

				if (next_row < 0 || next_col < 0 || next_row >=5 || next_col >=5)
					continue; // 맵을 벗어나는 좌표면 무시
				if (visited[next_row][next_col] >= 1)
					continue; // 전에 찾은 좌표면 무시
				if (map[next_row][next_col] == '#')
					continue; // 봤더니 빙하였다라면 무시

				// 6. next를 queue에 추가
				visited[next_row][next_col] = visited[now.row][now.col] + 1;
				q.add(new Node(next_row, next_col));
			}
		}
		return visited[r2][c2]; // 정확한 거리X + 1
	}

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());
		map = new char[N+1][N+1];
		
		
		for (int i = 0; i < N; i++) {
			String S = br.readLine();	
			for (int j = 0; j < N; j++) {
				map[i][j] = S.charAt(j);
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		r1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		r2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());
		int d = -1;
		System.out.print(bfs(r1, c1, r2, c2)/2);
	}
}