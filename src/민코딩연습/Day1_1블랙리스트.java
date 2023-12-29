package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day1_1블랙리스트 {

	static int[][] people;
	static int[][] black;
	static int x, y, x1, y1;
	static int cnt;
	static int[] DAT;
	static int[] visited;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());

		people = new int[y][x];

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				people[i][j] = 0;
			}
		}

		for (int i = 0; i < y; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j = 0; j < x; j++) {
				people[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		int DAT[] = new int[1000001];
		visited = new int[1000001];

		for (int i = 0; i < 1000000; i++) {
			DAT[i] = 0;
		}

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				DAT[people[i][j]] += 1;
			}
		}

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		y1 = Integer.parseInt(st2.nextToken());
		x1 = Integer.parseInt(st2.nextToken());
		black = new int[y1][x1];

		for (int i = 0; i < y1; i++) {

			for (int j = 0; j < x1; j++) {
				black[i][j] = 0;
			}
		}

		for (int i = 0; i < y1; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			for (int j = 0; j < x1; j++) {
				black[i][j] = Integer.parseInt(st3.nextToken());
			}
		}
		int total = x * y;
		cnt = 0;
		for (int i = 0; i < y1; i++) {
			for (int j = 0; j < x1; j++) {				
					cnt += DAT[black[i][j]];
					 DAT[black[i][j]]=0;
				
			}
		}
		System.out.println(cnt);
		System.out.println(total - cnt);
	}

}
