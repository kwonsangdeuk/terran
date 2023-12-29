package ���ڵ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DAY4�ȳ��Ϳ��� {

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
	// r1,r2���� ����ؼ� d_r, d_c���� �󸶳� �ɸ��°�?
	{
		// 1. �׷��� ����
		int visited[][] = new int[5][5];

		// 2. Queue����
		Queue<Node> q = new LinkedList<>();

		// 3. ������ ����
		visited[r1][c1] = 1;
		q.add(new Node(r1, c1));

		// 7. 4~6�ܰ踦 �ݺ�
		while (!q.isEmpty()) {
			// 4. now������
			Node now = q.poll();

			// 5. now -> next ã��
			int dr[] = { -1, 1, 0, 0 };
			int dc[] = { 0, 0, -1, 1 };
			
			for (int i = 0; i < 4; i++) {
				int next_row = now.row + dr[i];
				int next_col = now.col + dc[i];

				if (next_row < 0 || next_col < 0 || next_row >=5 || next_col >=5)
					continue; // ���� ����� ��ǥ�� ����
				if (visited[next_row][next_col] >= 1)
					continue; // ���� ã�� ��ǥ�� ����
				if (map[next_row][next_col] == '#')
					continue; // �ô��� ���Ͽ��ٶ�� ����

				// 6. next�� queue�� �߰�
				visited[next_row][next_col] = visited[now.row][now.col] + 1;
				q.add(new Node(next_row, next_col));
			}
		}
		return visited[r2][c2]; // ��Ȯ�� �Ÿ�X + 1
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