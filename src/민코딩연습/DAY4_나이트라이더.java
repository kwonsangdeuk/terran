package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DAY4_나이트라이더 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] map;
	static int[][] visited;
	static int row1, col1, row2, col2;
	static int row_size, col_size;
	static int[] dr = { -2, -2, 2, 2, -1, -1, 1, 1 };
	static int[] dc = { -1, 1, -1, 1, -2, 2, -2, 2 };
	static int length;

	static class node {
		int row;
		int col;
		int level;

		node(int row, int col, int level ) {
			this.row = row;
			this.col = col;
			this.level = level;
		}
	}

	static void BFS(int r1, int c1, int r2, int c2) {
		Queue<node> q = new LinkedList<>();
		visited[r1][c1] = 1;
		q.add(new node(r1, c1,0));

		while (!q.isEmpty()) {
			
			node now = q.poll();			
			int now_row = now.row;
			int now_col = now.col;
			if (now_row == r2 && now_col == c2)
				break;

			for (int i = 0; i < 8; i++) {
				int next_row = now_row + dr[i];
				int next_col = now_col + dc[i];
				if (next_row < 0 || next_col < 0 || next_row > row_size || next_col > col_size)
					continue;

				if (visited[next_row][next_col] != 0)
					continue;
				visited[next_row][next_col] = visited[now_row][now_col] + 1;

				q.add(new node(next_row, next_col,now.level+1));
				length = now.level;

			}
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());

		row_size = Integer.parseInt(st.nextToken());
		col_size = Integer.parseInt(st.nextToken());

		map = new int[row_size + 1][col_size + 1];
		visited = new int[row_size + 1][col_size + 1];

		st = new StringTokenizer(br.readLine());

		row1 = Integer.parseInt(st.nextToken());
		col1 = Integer.parseInt(st.nextToken());

		row2 = Integer.parseInt(st.nextToken());
		col2 = Integer.parseInt(st.nextToken());

		
		BFS(row1, col1, row2, col2);
		System.out.println(length);
	}
}
