package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DAY3_그래프순회 {

	static int[][] arr;

	static int N, K;
	static int A, B;
	static int start;
	static int[] visited;
	static int[] temp;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[N + 1][N + 1];
		visited = new int[N + 1];
		temp = new int[N + 1];
		start = Integer.parseInt(br.readLine());

		for (int i = 1; i <= K; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			arr[A][B] = 1;
		}
		visited[start] = 1;
		dfs1(start);
		System.out.println(" ");

		for (int i = 0; i <= N; i++) {
			visited[i] = 0;
		}
		visited[start] =1;
		dfs2(start);

	}

	static void dfs1(int num) {

		System.out.print(num + " ");
		for (int i = N; i >= 1; i--) {
			if (visited[i] == 0 && arr[num][i] == 1) {
				visited[i] = 1;
				dfs1(i);

			}
		}
	}

	static void dfs2(int num) {
        
 
		for (int i = N; i >=1; i--) {
			if (visited[i] == 0 && arr[num][i] == 1) {
				visited[i] = 1;
				dfs2(i);

			}
		}
		
		System.out.print(num + " ");
	}
}
