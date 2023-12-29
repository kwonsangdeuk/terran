package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DAY3_인접행렬 {

	static int N, T;
	static int[][] arr;
	static int row, col;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());

		arr = new int[N + 1][N + 1];

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());

			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());

			arr[row][col] = 1;
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}