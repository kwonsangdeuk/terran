package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DAY4_BLOOM {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int row1, row2, col1, col2;
	static int row_size, col_size;
	static int[][] map;
	static int day;
	static int nr, nc;
	static int[][] visited1;

	static int[] dr = { -1, 1, 0, 0 }; // 8방향 (상화좌우)
	static int[] dc = { 0, 0, -1, 1 };

	static class node {
		int row;
		int col;

		node(int row, int col) {
			this.row = row;
			this.col = col;
		}

	}

	static void BFS(int r, int c, int r1, int c1) {

		Queue<node> q = new LinkedList<>();

		q.add(new node(r, c));
		visited1[r][c] = 1;
		q.add(new node(r1, c1));
		visited1[r1][c1] = 1;
		while (!q.isEmpty()) {

			node now = q.poll();
			int now_row = now.row;
			int now_col = now.col;
			for (int i = 0; i < 4; i++) {
				int next_row = now_row + dr[i];
				int next_col = now_col + dc[i];
				if (next_row < 0 || next_col < 0 || next_row >= row_size || next_col >= col_size)
					continue;

				if (visited1[next_row][next_col] != 0)
					continue;
				visited1[next_row][next_col] = visited1[now_row][now_col] + 1;
				q.add(new node(next_row, next_col));
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());
		row_size = Integer.parseInt(st.nextToken());
		col_size = Integer.parseInt(st.nextToken());

		map = new int[row_size][col_size];
		visited1 = new int[row_size][col_size];

		st = new StringTokenizer(br.readLine());
		row1 = Integer.parseInt(st.nextToken());
		col1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		row2 = Integer.parseInt(st.nextToken());
		col2 = Integer.parseInt(st.nextToken());
		BFS(row1, col1, row2, col2);

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				if (max < visited1[i][j])
					max = visited1[i][j];
			}

		}
		System.out.println(max);

	}

}
