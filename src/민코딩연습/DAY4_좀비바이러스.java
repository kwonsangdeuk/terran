package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DAY4_좀비바이러스 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int col_size, row_size;
	static int[][] map;
	static int[][] visited;
	static int[] dr = { -1, 1, 0, 0 }; // 8방향 (상화좌우)
	static int[] dc = { 0, 0, -1, 1 };
	static String S;
	static int veccol, vecrow;
	static int jonbi;
	static int day;
	static int people = 1;
	static int flag;

	static class node {
		int row;
		int col;

		node(int row, int col) {
			this.row = row;
			this.col = col;

		}
	}

	static void BFS(int r, int c) {
		
		Queue<node> q = new LinkedList<>();
		q.add(new node(r, c));
		visited[r][c] = 3;
		day = visited[r][c];
		flag =0;
		
		
		while (!q.isEmpty()) {
			node now = q.poll();
			int now_row = now.row;
			int now_col = now.col;
			for (int i = 0; i < 4; i++) {
				int next_row = now_row + dr[i];
				int next_col = now_col + dc[i];
				if (next_row < 1 || next_col < 1 || next_row > row_size || next_col > col_size)
					continue;	
				if (map[next_row][next_col] == 0)
					continue; // 좀비가 없으면 무시
				if (visited[next_row][next_col] != 0)
					continue;
				visited[next_row][next_col] = visited[now_row][now_col] + 1;
				flag =1; 
				day = visited[next_row][next_col];
				q.add(new node(next_row, next_col));
				people++;
			}

		}
		

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(br.readLine());
		col_size = Integer.parseInt(st.nextToken());
		row_size = Integer.parseInt(st.nextToken());

		map = new int[row_size + 1][col_size + 1];
		visited = new int[row_size + 1][col_size + 1];
		for (int i = 0; i < row_size; i++) {
			S = br.readLine();
			for (int j = 0; j < col_size; j++) {
				map[i + 1][j + 1] = S.charAt(j)-'0';   // 연결된 숫자를 문자로 받고 그대로 저장하기 위해서
			}
		}

		st = new StringTokenizer(br.readLine());
		veccol = Integer.parseInt(st.nextToken());
		vecrow = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= row_size; i++) {
			for (int j = 1; j <= col_size; j++) {
				if (map[i][j] == 1)
					jonbi++;
			}
		}

		BFS(vecrow, veccol);

		System.out.println(day);
		
		
		System.out.println(jonbi - people);
	}

}
