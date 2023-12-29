package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DAY4_트리BFS {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] map;
	static int N;
	static int[] house;
 

	static void BFS(int now) {
		Queue<Integer> q = new LinkedList<>();

		int node;
		q.add(now);
		while (!q.isEmpty()) {
			node = q.poll();
			System.out.print(house[node] + " ");
			for (int i = 0; i < N; i++) {
				int next = i;
				if (map[node][next] != 0) {
					q.add(next);
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		house= new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			house[i] = Integer.parseInt(st.nextToken());
		}
			
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		BFS(0);

	}

}
